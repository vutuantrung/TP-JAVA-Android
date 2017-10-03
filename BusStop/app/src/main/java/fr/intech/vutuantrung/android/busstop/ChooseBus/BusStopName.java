package fr.intech.vutuantrung.android.busstop.ChooseBus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

import fr.intech.vutuantrung.android.busstop.ArretTime;
import fr.intech.vutuantrung.android.busstop.Bus;
import fr.intech.vutuantrung.android.busstop.CalculateHelpers;
import fr.intech.vutuantrung.android.busstop.Data.Ligne1;
import fr.intech.vutuantrung.android.busstop.Data.Ligne2;
import fr.intech.vutuantrung.android.busstop.Data.Ligne2E;
import fr.intech.vutuantrung.android.busstop.Data.Ligne3;
import fr.intech.vutuantrung.android.busstop.Data.Ligne4;
import fr.intech.vutuantrung.android.busstop.Data.Ligne5;
import fr.intech.vutuantrung.android.busstop.Data.PeriodScholarlyZoneB;
import fr.intech.vutuantrung.android.busstop.R;

public class BusStopName extends AppCompatActivity
{
    List<String[]> listBusAller  = null;
    List<String[]> listBusRetour = null;
    List<String[]> listbus       = null;

    CalculateHelpers calculateHelpers = new CalculateHelpers();

    Bus bus = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopbus);

        Intent callerIntent = getIntent();
        Bundle packageFromCaller = callerIntent.getBundleExtra("Command");
        final int chooseDirection = packageFromCaller.getInt("chooseDirection");
        final int busNumber = packageFromCaller.getInt("BusNumber");

        PeriodScholarlyZoneB periodScholarlyZoneB = new PeriodScholarlyZoneB();

        switch (busNumber)
        {
            case 1:
                bus = Ligne1.GetBusInfor();
                listBusAller = Ligne1.GetListAllerNormal();
                if(!periodScholarlyZoneB.InTousVacances())
                    listBusRetour = Ligne1.GetListRetourNormal();
                else
                    listBusRetour = Ligne1.GetListExceptionRetour();
                break;
            case 2:
                bus = Ligne2.GetBusInfor();
                listBusAller = Ligne2.GetListAllerNormal();
                listBusRetour = Ligne2.GetListRetourNormal();
                break;
            case 3:
                bus = Ligne3.GetBusInfor();
                listBusAller = Ligne3.GetListAller();
                listBusRetour = Ligne3.GetListRetour();
                break;
            case 4:
                bus = Ligne4.GetBusInfor();
                listBusAller = Ligne4.GetListAller();
                listBusRetour = Ligne4.GetListRetour();
                break;
            case 5:
                bus = Ligne5.GetBusInfor();
                listBusAller = Ligne5.GetListAller();
                listBusRetour = Ligne5.GetListRetour();
                break;
            case 6:
                bus = Ligne2E.GetBusInfor();
                listBusAller = Ligne2E.GetListAller();
                listBusRetour = Ligne2E.GetListRetour();
                break;
        }

        if(chooseDirection == 1)
            listbus = listBusAller;
        else
            listbus = listBusRetour;

        List<BusStopInformation> listBusStopInformation = getListData(listbus);
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListViewBusStop(this, listBusStopInformation));

        // Khi người dùng click vào các ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                BusStopInformation busStopInformation = (BusStopInformation) o;

                Bundle bundleBusInfor = new Bundle();
                bundleBusInfor.putString("BusStopName", busStopInformation.getBusStopName());
                bundleBusInfor.putString("BusTimeString", busStopInformation.getTimeString());
                bundleBusInfor.putString("BusCorrespondances", busStopInformation.getCorrespondances());
                bundleBusInfor.putInt("BusDirection", chooseDirection);
                bundleBusInfor.putInt("BusNumber", busNumber);

                Intent intent = new Intent(BusStopName.this, BusInfor.class);
                intent.putExtra("BusInfor", bundleBusInfor);
                BusStopName.this.startActivity(intent);
            }
        });
    }

    private  List<BusStopInformation> getListData(List<String[]> data) {

        List<BusStopInformation> list = new ArrayList<BusStopInformation>();
        for (String[] s : data)
        {
            ArretTime newArretTime = new ArretTime(s[0], s[1], s[2], null);
            String timePlusProchain = newArretTime.RemainTime(calculateHelpers.GetCurrentTime("HH:mm"));
            String response;
            if (timePlusProchain != null)
                response = timePlusProchain;
            else
                response = "!!";

            BusStopInformation newBusStopInformation = new BusStopInformation(s[1], s[0], response, s[2], s[3]);
            list.add(newBusStopInformation);
        }
        return list;
    }
}
