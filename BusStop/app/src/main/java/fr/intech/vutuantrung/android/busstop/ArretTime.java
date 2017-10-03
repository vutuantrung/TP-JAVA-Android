package fr.intech.vutuantrung.android.busstop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

//Những công việc của Class:
//1.ShowTimeBusStop
//2.SearchTimeInRange
//3.calculateRemainTime
//
//

public class ArretTime
{
    CalculateHelpers calculateHelpers = new CalculateHelpers();

    ArretTime suivant;

    String icon;
    String name;
    String timeString;

    public ArretTime(String icon, String name, String timeString, ArretTime suivant)
    {
        this.icon = icon;
        this.name = name;
        this.timeString = timeString;
        this.suivant = suivant;
    }

    public ArretTime(String name, String timeString, ArretTime suivant)
    {
        this.name = name;
        this.timeString = timeString;
        this.suivant = suivant;
    }

    public void ShowTimeBusStop() {
        int i = 0;
        while(i < timeString.length())
        {
            if(timeString.charAt(i) == '|' || timeString.charAt(i) == ' ' || timeString.charAt(i) == '\t')
                i++;
            else
            {
                char[] charHeure = {timeString.charAt(i), timeString.charAt(i+1)};
                int heureNow = ChangeToInt(charHeure);
                char[] charMinute = {timeString.charAt(i+3), timeString.charAt(i+4)};
                int minuteNow = ChangeToInt(charMinute);

                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

                Calendar now = Calendar.getInstance();
                now.set(Calendar.HOUR_OF_DAY, heureNow);
                now.set(Calendar.MINUTE, minuteNow);
                System.out.println(sdf.format(now.getTime()));

                i = i+5;
            }
        }
    }

    public String ShowNextBusTimeFrom(String heureDebut, String minDebut) {
        int i = 0;
        //Debut String to Int
        char[] debutHeure = {heureDebut.charAt(0),heureDebut.charAt(1)};
        int debutHeureInt = ChangeToInt(debutHeure);
        char[] debutMin = {minDebut.charAt(0),minDebut.charAt(1)};
        int debutMinInt = ChangeToInt(debutMin);


        while(i < timeString.length())
        {
            if(timeString.charAt(i) == '|' || timeString.charAt(i) == ' ' || timeString.charAt(i) == '\t')
                i++;
            else
            {
                char[] charHeure = {timeString.charAt(i), timeString.charAt(i+1)};
                int heureNow = ChangeToInt(charHeure);
                char[] charMinute = {timeString.charAt(i+3), timeString.charAt(i+4)};
                int minuteNow = ChangeToInt(charMinute);

                if(heureNow >= debutHeureInt /*&& minuteNow >= debutMinInt*/)
                {
                    char[] timeRetourChar = {timeString.charAt(i),timeString.charAt(i+1),':',timeString.charAt(i+3),timeString.charAt(i+4)};
                    String timeRetourString = new String(timeRetourChar);
                    return timeRetourString;
                }
                i = i+5;
            }
        }
        return null;
    }

    //RemainTime, đưa vào cách tính và thời gian mình đặt và install 1 list có sẵn.
    //1: Từ thời điểm hiện tại => tính thời gian còn lại so với thời gian gần nhất trong list
    //2: Đưa vào thời gian thay thế cho thời gian hiện tại => ...(như trên)

    public String RemainTime(String timeCalcul) {
        int j = 0;
        String timeRetour = null;
        //Search Time gần nhất
        while(j < timeString.length() - 5)
        {
            if(timeString.charAt(j) == '|' || timeString.charAt(j) == ' ' || timeString.charAt(j) == '\t')
                j++;
            else
            {
                char[] checkingTime = {timeString.charAt(j),timeString.charAt(j+1),timeString.charAt(j+2),timeString.charAt(j+3),timeString.charAt(j+4)};
                String checkingTime_String = new String(checkingTime);
                long testTime_long = 0;

                testTime_long = CalculRemainTime(checkingTime_String, timeCalcul);

                if(testTime_long >= 0)
                {
                    long heure = testTime_long/60;
                    long min = testTime_long - heure*60;
                    if(heure == 0)
                        timeRetour = Long.toString(testTime_long) + "'";
                    else
                        timeRetour = Long.toString(heure) +'"' + Long.toString(min) + "'";
                    return timeRetour;
                }
                j = j+5;
            }
        }
        return null;
    }
    public long CalculRemainTime(String checkingTime_string, String timeOrigine_string) {
        // date format
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        // two dates
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

    public int ChangeToInt(char[] charTime) {
        String timeString = String.valueOf(charTime);
        return Integer.parseInt(timeString);
    }

    public String getTimeString()
    {
        return timeString;
    }
    public void setTimeString(String timeString)
    {
        this.timeString = timeString;
    }

    public ArretTime getSuivant() {
        return suivant;
    }
    public void setSuivant(ArretTime suivant) {
        this.suivant = suivant;
    }

    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name){ this.name = name; }


}
