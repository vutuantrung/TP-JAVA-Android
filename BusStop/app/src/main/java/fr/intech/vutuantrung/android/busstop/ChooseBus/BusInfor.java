package fr.intech.vutuantrung.android.busstop.ChooseBus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import fr.intech.vutuantrung.android.busstop.R;

public class BusInfor extends AppCompatActivity
{
    TextView scrollingText;

    String firstBus = null;
    String lastBus = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_businfor);

        Calendar calendar = Calendar.getInstance();
        int dayOfTheWeek2 = calendar.get(Calendar.DAY_OF_WEEK);
        String dayReturn = null;
        switch (dayOfTheWeek2)
        {
            case Calendar.MONDAY:
                dayReturn = "Lundi";
                break;
            case Calendar.TUESDAY:
                dayReturn = "Mardi";
                break;
            case Calendar.WEDNESDAY:
                dayReturn = "Mercredi";
                break;
            case Calendar.THURSDAY:
                dayReturn = "Jeudi";
                break;
            case Calendar.FRIDAY:
                dayReturn = "Vendredi";
                break;
            case Calendar.SATURDAY:
                dayReturn = "Samedi";
                break;
            case Calendar.SUNDAY:
                dayReturn = "Dimanche";
                break;
        }

        Intent callerIntent = getIntent();
        Bundle packageFromCaller = callerIntent.getBundleExtra("BusInfor");
        String busStopName = packageFromCaller.getString("BusStopName");
        String busTimeString = packageFromCaller.getString("BusTimeString");
        String busCorrespondances = packageFromCaller.getString("BusCorrespondances");

        List<TimeArretInformation> listBusStopTime = getListDataTime(busTimeString);
        List<CorrespendancesInformation> listCorrespondances = getListDataCorrespendaces(busCorrespondances);

        final ListView listViewTime = (ListView) findViewById(R.id.listViewTime);
        final ListView listViewCorrespondances = (ListView) findViewById(R.id.listViewCorrespondances);

        listViewTime.setAdapter(new CustomListViewTime(this, listBusStopTime));
        listViewCorrespondances.setAdapter(new CustomListViewCorrespendances(this, listCorrespondances));

        TextView txtBusStopName = (TextView)findViewById(R.id.txtStopName);
        TextView txtFirstBus = (TextView)findViewById(R.id.txtFirstBus);
        TextView txtLastBus = (TextView)findViewById(R.id.txtLastBus);
        TextView txtWeekDay = (TextView)findViewById(R.id.txtWeekDay);

        txtBusStopName.setText(busStopName);
        txtFirstBus.setText(firstBus);
        txtLastBus.setText(lastBus);
        txtWeekDay.setText(dayReturn);

        scrollingText = (TextView)findViewById(R.id.txtAttention);
        scrollingText.setSelected(true);
    }

    private List<TimeArretInformation> getListDataTime(String data) {

        List<TimeArretInformation> list = new ArrayList<TimeArretInformation>();

        char[] firstBusChar = {data.charAt(0),data.charAt(1),data.charAt(2),data.charAt(3),data.charAt(4)};
        firstBus = new String(firstBusChar);
        char[] lastBusChar = {data.charAt(data.length() - 5),
                data.charAt(data.length() - 4),
                data.charAt(data.length() - 3),
                data.charAt(data.length() - 2),
                data.charAt(data.length() - 1)};
        lastBus = new String(lastBusChar);

        int i = 0;
        while (i <= data.length() - 5)
        {
            if(data.charAt(i) == '|' || data.charAt(i) == ' ' || data.charAt(i) == '\t')
                i++;
            else
            {
                char[] checkingTime = {data.charAt(i),data.charAt(i+1),data.charAt(i+2),data.charAt(i+3),data.charAt(i+4)};
                String timeCourrant = new String(checkingTime);

                TimeArretInformation newTimeArretInformation = new TimeArretInformation(timeCourrant);
                list.add(newTimeArretInformation);
                i = i+5;
            }
        }
        return list;
    }

    private List<CorrespendancesInformation> getListDataCorrespendaces(String data){

        List<CorrespendancesInformation> list = new ArrayList<CorrespendancesInformation>();
        int i = 0;
        while (i <= data.length()-1)
        {
            if(data.charAt(i) == ' ')
                i++;
            else
            {
                CorrespendancesInformation newCorr = null;
                switch (data.charAt(i))
                {
                    case '1':
                        newCorr = new CorrespendancesInformation("Bus 1", "bus1");
                        break;
                    case '2':
                        newCorr = new CorrespendancesInformation("Bus 2", "bus2");
                        break;
                    case '3':
                        newCorr = new CorrespendancesInformation("Bus 3", "bus3");
                        break;
                    case '4':
                        newCorr = new CorrespendancesInformation("Bus 4", "bus4");
                        break;
                    case '5':
                        newCorr = new CorrespendancesInformation("Bus 5", "bus5");
                        break;
                    case '6':
                        newCorr = new CorrespendancesInformation("Bus 5", "bus5");
                        break;
                    case '7':
                        newCorr = new CorrespendancesInformation("Pas Bus", "dau");
                        break;
                }
                list.add(newCorr);
                i++;
            }
        }
        return list;
    }
}
