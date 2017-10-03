package fr.intech.vutuantrung.android.busstop.Data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import fr.intech.vutuantrung.android.busstop.CalculateHelpers;


public class PeriodScholarlyZoneB
{
    CalculateHelpers calculateHelpers= new CalculateHelpers();

    String[] VacancesToussaint = new String[]{"2016-10-19", "2016-11-03"};
    String[] VacancesNoel      = new String[]{"2016-12-17", "2017-01-03"};
    String[] VacancesHiver     = new String[]{"2017-02-11", "2017-02-27"};
    String[] VacancesPrintemps = new String[]{"2017-04-08", "2017-04-24"};
    String[] Pont              = new String[]{"2017-05-24", "2017-05-29"};
    String[] GrandesVacances   = new String[]{"2017-07-08", "2018-09-03"};

    public boolean InVacances(String[] vacances){
        if(calculateHelpers.IsInPeriod(
                calculateHelpers.ToDate(vacances[0]),
                calculateHelpers.ToDate(vacances[1]))
                )
            return true;
        return false;
    }
    public boolean InTousVacances(){
        if((InVacances(VacancesToussaint) ||
            InVacances(VacancesNoel) ||
            InVacances(VacancesHiver) ||
            InVacances(VacancesPrintemps) ||
            InVacances(Pont) ||
            InVacances(GrandesVacances)))
            return true;
        return false;
    }
}
