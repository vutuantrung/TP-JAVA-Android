package fr.intech.vutuantrung.android.busstop.ChooseBus;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.SimpleDateFormat;

import fr.intech.vutuantrung.android.busstop.CalculateHelpers;
import fr.intech.vutuantrung.android.busstop.R;
import fr.intech.vutuantrung.android.busstop.ShowBusTime;


public class ChooseTime extends AppCompatActivity
{
    private TimePicker timePicker;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosetime);

        Intent callerIntent = getIntent();
        Bundle packageFromCaller = callerIntent.getBundleExtra("BusInfor");
        String busStopName = packageFromCaller.getString("BusStopName");
        int busDirection = packageFromCaller.getInt("BusDirection");
        int busNumber = packageFromCaller.getInt("BusNumber");

        final Bundle bundle = new Bundle();
        bundle.putString("BusStopName", busStopName);
        bundle.putInt("BusDirection", busDirection);
        bundle.putInt("BusNumber", busNumber);

        Button btnDepart1 = (Button)findViewById(R.id.btnDepart1);
        btnDepart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseTime.this, ShowBusTime.class);
                bundle.putInt("caseCalculTime", 1);
                CalculateHelpers calculateHelpers = new CalculateHelpers();
                bundle.putString("Time", calculateHelpers.GetCurrentTime("HH:mm"));
                intent.putExtra("BusStopInfo",bundle);
                ChooseTime.this.startActivity(intent);
            }
        });

        Button btnDepart2 = (Button)findViewById(R.id.btnDepart2);
        btnDepart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseTime.this, ShowBusTime.class);
                timePicker = (TimePicker)findViewById(R.id.timePicker);
                String hour = Integer.toString(timePicker.getCurrentHour());
                String min = Integer.toString(timePicker.getCurrentMinute());
                bundle.putInt("caseCalculTime", 2);
                bundle.putString("Time", new String (hour+":"+min));
                intent.putExtra("BusStopInfo",bundle);
                ChooseTime.this.startActivity(intent);
            }
        });
    }
}
