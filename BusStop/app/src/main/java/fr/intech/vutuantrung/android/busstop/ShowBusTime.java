package fr.intech.vutuantrung.android.busstop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import fr.intech.vutuantrung.android.busstop.Data.Ligne1;
import fr.intech.vutuantrung.android.busstop.Data.Ligne2;
import fr.intech.vutuantrung.android.busstop.Data.Ligne2E;
import fr.intech.vutuantrung.android.busstop.Data.Ligne3;
import fr.intech.vutuantrung.android.busstop.Data.Ligne4;
import fr.intech.vutuantrung.android.busstop.Data.Ligne5;


public class ShowBusTime extends AppCompatActivity
{
    ArretTime arretTime = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showbustime);

        Intent callerIntent = getIntent();
        Bundle packageFromCaller = callerIntent.getBundleExtra("BusStopInfo");
        //Get Information
        String busStopName = packageFromCaller.getString("BusStopName");
        String time = packageFromCaller.getString("Time");
        int busDirection = packageFromCaller.getInt("BusDirection");
        int busNumber = packageFromCaller.getInt("BusNumber");
        int caseCalculTime = packageFromCaller.getInt("caseCalculTime");

        switch (busNumber)
        {
            case 1:
                Ligne1 line1 = MainActivity.GetLigne1();
                arretTime = line1.GetBusInfor().SearchNameArret(busStopName,busDirection);
                break;
            case 2:
                Ligne2 line2 = MainActivity.GetLigne2();
                arretTime = line2.GetBusInfor().SearchNameArret(busStopName,busDirection);
                break;
            case 3:
                Ligne3 line3 = MainActivity.GetLigne3();
                arretTime = line3.GetBusInfor().SearchNameArret(busStopName,busDirection);
                break;
            case 4:
                Ligne4 line4 = MainActivity.GetLigne4();
                arretTime = line4.GetBusInfor().SearchNameArret(busStopName,busDirection);
                break;
            case 5:
                Ligne5 line5 = MainActivity.GetLigne5();
                arretTime = line5.GetBusInfor().SearchNameArret(busStopName,busDirection);
                break;
            case 6:
                Ligne2E line2E = MainActivity.GetLigne2E();
                arretTime = line2E.GetBusInfor().SearchNameArret(busStopName,busDirection);
                break;
        }

        TextView textBusStopName = (TextView)findViewById(R.id.txtBusNumber);
        TextView textBusStopProchainTime = (TextView)findViewById(R.id.txtTimeProchain);

        textBusStopName.setText(busStopName);
        textBusStopProchainTime.setText(arretTime.getTimeString());

        String calculTime = arretTime.RemainTime(time);
        if(calculTime != null)
            textBusStopProchainTime.setText(calculTime);
        else
            textBusStopProchainTime.setText("Le dernier bus est parti!");

    }
}
