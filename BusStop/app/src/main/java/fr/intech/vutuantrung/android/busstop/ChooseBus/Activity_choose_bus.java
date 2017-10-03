package fr.intech.vutuantrung.android.busstop.ChooseBus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fr.intech.vutuantrung.android.busstop.R;


public class Activity_choose_bus extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosebus);

        final Bundle bundle = new Bundle();

        Button btnLine1 = (Button)findViewById(R.id.btnLigne1);
        btnLine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intentLine = new Intent(Activity_choose_bus.this, ChooseDirection.class);
                bundle.putInt("BusNumber", 1);
                intentLine.putExtra("Command", bundle);
                Activity_choose_bus.this.startActivity(intentLine);
            }
        });

        Button btnLine2 = (Button)findViewById(R.id.btnLigne2);
        btnLine2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intentLine = new Intent(Activity_choose_bus.this, ChooseDirection.class);
                bundle.putInt("BusNumber", 2);
                intentLine.putExtra("Command", bundle);
                Activity_choose_bus.this.startActivity(intentLine);
            }
        });

        Button btnLine2E = (Button)findViewById(R.id.btnLigne2Ex);
        btnLine2E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intentLine = new Intent(Activity_choose_bus.this, ChooseDirection.class);
                bundle.putInt("BusNumber", 6);
                intentLine.putExtra("Command", bundle);
                Activity_choose_bus.this.startActivity(intentLine);
            }
        });

        Button btnLine3 = (Button)findViewById(R.id.btnLigne3);
        btnLine3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intentLine = new Intent(Activity_choose_bus.this, ChooseDirection.class);
                bundle.putInt("BusNumber", 3);
                intentLine.putExtra("Command", bundle);
                Activity_choose_bus.this.startActivity(intentLine);
            }
        });

        Button btnLine4 = (Button)findViewById(R.id.btnLigne4);
        btnLine4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intentLine = new Intent(Activity_choose_bus.this, ChooseDirection.class);
                bundle.putInt("BusNumber", 4);
                intentLine.putExtra("Command", bundle);
                Activity_choose_bus.this.startActivity(intentLine);
            }
        });

        Button btnLine5 = (Button)findViewById(R.id.btnLigne5);
        btnLine5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intentLine = new Intent(Activity_choose_bus.this, ChooseDirection.class);
                bundle.putInt("BusNumber", 5);
                intentLine.putExtra("Command", bundle);
                Activity_choose_bus.this.startActivity(intentLine);
            }
        });

    }
}
