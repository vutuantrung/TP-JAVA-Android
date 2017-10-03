package fr.intech.vutuantrung.android.busstop.ChooseBus;


public class BusStopInformation
{
    private String BusStopName;
    private String iconName;
    private String timePlusProche;
    private String timeString;
    private String corr;

    public BusStopInformation(String BusStopName, String flagName, String timePlusProche, String timeString, String corr) {
        this.BusStopName = BusStopName;
        this.iconName = flagName;
        this.timePlusProche = timePlusProche;
        this.timeString = timeString;
        this.corr = corr;
    }

    public String getGetTimePlusProche()
    {
        return timePlusProche;
    }
    public String getBusStopName() {
        return BusStopName;
    }
    public void setBusStopName(String countryName) {
        this.BusStopName = countryName;
    }
    public String getIconName() {
        return iconName;
    }
    public void setIconName(String flagName) {
        this.iconName = flagName;
    }
    public String getTimeString() { return timeString; }
    public void setTimeString(String timeString) { this.timeString = timeString; }
    public String getCorrespondances() {
        return corr;
    }
    public void setCorrespondances(String correspondances) {
        this.corr = correspondances;
    }
}
