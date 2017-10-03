package fr.intech.vutuantrung.android.busstop;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import fr.intech.vutuantrung.android.busstop.Data.PeriodScholarlyZoneB;


public class CalculateHelpers
{
    public long CalculRemainTime(String checkingTime_string, String timeOrigine_string, String formatType){
        SimpleDateFormat format = new SimpleDateFormat(formatType);
        java.util.Date checkingTime;
        java.util.Date timeOrigine;
        try
        {
            checkingTime = format.parse(checkingTime_string);
            timeOrigine = format.parse(timeOrigine_string);
            long diffInMillies = checkingTime.getTime() - timeOrigine.getTime();
            long diffence_in_minute = TimeUnit.MINUTES.convert(diffInMillies,TimeUnit.MILLISECONDS);
            return diffence_in_minute;
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return -1;
    }

    public boolean IsInPeriod(Date dateStart, Date dateEnd){
        Date toDay = null;
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = df.format(c.getTime());
        try
        {
            toDay = df.parse(formattedDate);
        }
        catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return !(toDay.before(dateStart) || toDay.after(dateEnd));
    }

    public Date ToDate(String dateString){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dateReturn = null;
        try {
            dateReturn = df.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateReturn;
    }

    public String GetCurrentTime(String formatTime){
        SimpleDateFormat format = new SimpleDateFormat(formatTime);
        Calendar current = Calendar.getInstance();
        String current_date = format.format(current.getTime());
        return current_date;
    }
}

