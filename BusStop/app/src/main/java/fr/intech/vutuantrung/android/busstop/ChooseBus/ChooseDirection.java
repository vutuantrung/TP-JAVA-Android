package fr.intech.vutuantrung.android.busstop.ChooseBus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import fr.intech.vutuantrung.android.busstop.R;


public class ChooseDirection extends AppCompatActivity
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosedirection);

        Intent callerIntent = getIntent();
        Bundle packageFromCaller = callerIntent.getBundleExtra("Command");
        final int busNumber = packageFromCaller.getInt("BusNumber");

        final Bundle bundle = new Bundle();

        Button btnAller = (Button)findViewById(R.id.btnAller);
        btnAller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAller = new Intent(ChooseDirection.this, BusStopName.class);
                bundle.putInt("chooseDirection", 1);
                bundle.putInt("BusNumber", busNumber);
                intentAller.putExtra("Command",bundle);
                ChooseDirection.this.startActivity(intentAller);
            }
        });

        Button btnRetour = (Button)findViewById(R.id.btnRetour);
        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRetour = new Intent(ChooseDirection.this, BusStopName.class);
                bundle.putInt("chooseDirection", 2);
                bundle.putInt("BusNumber", busNumber);
                intentRetour.putExtra("Command",bundle);
                ChooseDirection.this.startActivity(intentRetour);
            }
        });

    }
}
