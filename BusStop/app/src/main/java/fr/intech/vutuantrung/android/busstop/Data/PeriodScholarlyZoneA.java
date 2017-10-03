package fr.intech.vutuantrung.android.busstop.Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import fr.intech.vutuantrung.android.busstop.CalculateHelpers;

public class PeriodScholarlyZoneA
{
    CalculateHelpers calculateHelpers= new CalculateHelpers();

    String[] VacancesToussaint = new String[]{"2016-10-19","2016-11-03"};
    String[] VacancesNoel      = new String[]{"2016-12-17","2017-01-03"};
    String[] VacancesHiver     = new String[]{"2017-02-18","2017-03-06"};
    String[] VacancesPrintemps = new String[]{"2017-04-15","2017-05-02"};
    String[] Pont              = new String[]{"2017-05-24","2017-05-29"};
    String[] GrandesVacances   = new String[]{"2017-07-08","2018-09-03"};

    public boolean InVacances(String[] vacances) {
        if(calculateHelpers.IsInPeriod(
                calculateHelpers.ToDate(vacances[0]),
                calculateHelpers.ToDate(vacances[1]))
                )
            return true;
        return false;
    }
    public boolean InTousVacances(){
        if((InVacances(VacancesToussaint)||
                InVacances(VacancesNoel)||
                InVacances(VacancesHiver)||
                InVacances(VacancesPrintemps)||
                InVacances(Pont)||
                InVacances(GrandesVacances)))
            return false;
        return true;
    }
}
