package fr.intech.vutuantrung.android.busstop;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fr.intech.vutuantrung.android.busstop.About.Activity_About;
import fr.intech.vutuantrung.android.busstop.ChooseBus.Activity_choose_bus;
import fr.intech.vutuantrung.android.busstop.ChooseBus.BusStopName;
import fr.intech.vutuantrung.android.busstop.Data.Ligne1;
import fr.intech.vutuantrung.android.busstop.Data.Ligne2;
import fr.intech.vutuantrung.android.busstop.Data.Ligne2E;
import fr.intech.vutuantrung.android.busstop.Data.Ligne3;
import fr.intech.vutuantrung.android.busstop.Data.Ligne4;
import fr.intech.vutuantrung.android.busstop.Data.Ligne5;
import fr.intech.vutuantrung.android.busstop.Favoris.Activity_Favoris;
import fr.intech.vutuantrung.android.busstop.Map.Activity_Map;
import fr.intech.vutuantrung.android.busstop.Route.Activity_Route;
import fr.intech.vutuantrung.android.busstop.Schedule.Activity_Schedule;

public class MainActivity extends AppCompatActivity
{
    static Ligne1 Line1 = new Ligne1();
    static Ligne2 Line2 = new Ligne2();
    static Ligne2E Line2E = new Ligne2E();
    static Ligne3 Line3 = new Ligne3();
    static Ligne4 Line4 = new Ligne4();
    static Ligne5 Line5 = new Ligne5();

    public static Ligne1 GetLigne1()
    {
        return Line1;
    }
    public static Ligne2 GetLigne2()
    {
        return Line2;
    }
    public static Ligne2E GetLigne2E()
    {
        return Line2E;
    }
    public static Ligne3 GetLigne3()
    {
        return Line3;
    }
    public static Ligne4 GetLigne4()
    {
        return Line4;
    }
    public static Ligne5 GetLigne5()
    {
        return Line5;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Khởi tạo Data
        Line1.AddListStringAllerNormal();
        Line1.AddListStringRetourNormal();
        Line1.AddListExceptionPeriodeRetour();
        Line1.CreateBus();

        Line2.AddListStringAllerNormal();
        Line2.AddListStringRetourNormal();
        Line2.AddListExceptionPeriodeAller();
        Line2.AddListExceptionPeriodeRetour();
        Line2.CreateBus();

        Line2E.AddListStringAller();
        Line2E.AddListStringRetour();
        Line2E.CreateBus();

        Line3.AddListStringAller();
        Line3.AddListStringRetour();
        Line3.CreateBus();

        Line4.AddListStringAller();
        Line4.AddListStringRetour();
        Line4.CreateBus();

        Line5.AddListStringAller();
        Line5.AddListStringRetour();
        Line5.CreateBus();


        Button btnAbout = (Button)findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAbout = new Intent(MainActivity.this, Activity_About.class);
                MainActivity.this.startActivity(intentAbout);
            }
        });


        Button btnChooseBus = (Button)findViewById(R.id.btnChooseBus);
        btnChooseBus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChooseBus = new Intent(MainActivity.this, Activity_choose_bus.class);
                MainActivity.this.startActivity(intentChooseBus);
            }
        });

        Button btnFavoris = (Button)findViewById(R.id.btnFavoris);
        btnFavoris.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFavoris = new Intent(MainActivity.this, Activity_Favoris.class);
                MainActivity.this.startActivity(intentFavoris);
            }
        });

        Button btnMap = (Button)findViewById(R.id.btnMap);
        btnMap.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMap = new Intent(MainActivity.this, Activity_Map.class);
                MainActivity.this.startActivity(intentMap);
            }
        });

        Button btnRoute = (Button)findViewById(R.id.btnRoute);
        btnRoute.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRoute = new Intent(MainActivity.this, Activity_Route.class);
                MainActivity.this.startActivity(intentRoute);
            }
        });

        Button btnSchedule = (Button)findViewById(R.id.btnSchedule);
        btnSchedule.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSchedule = new Intent(MainActivity.this, Activity_Schedule.class);

                MainActivity.this.startActivity(intentSchedule);
            }
        });

    }

}
