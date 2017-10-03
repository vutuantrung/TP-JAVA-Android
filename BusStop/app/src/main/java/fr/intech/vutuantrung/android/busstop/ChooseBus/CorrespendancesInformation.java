package fr.intech.vutuantrung.android.busstop.ChooseBus;


public class CorrespendancesInformation
{

    private String BusNumber;
    private String iconName;

    public CorrespendancesInformation(String BusNumber, String iconName) {
        this.BusNumber = BusNumber;
        this.iconName = iconName;
    }

    public String getBusNumber() {
        return BusNumber;
    }
    public void setBusNumber(String busNumber) {
        BusNumber = busNumber;
    }
    public String getIconName() {
        return iconName;
    }
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

}
