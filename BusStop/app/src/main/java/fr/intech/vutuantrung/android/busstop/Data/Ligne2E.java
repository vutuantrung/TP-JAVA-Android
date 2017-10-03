package fr.intech.vutuantrung.android.busstop.Data;

import java.util.ArrayList;
import java.util.List;

import fr.intech.vutuantrung.android.busstop.Bus;


public class Ligne2E
{
    int idLine = 6;

    static Bus busInfor;

    static List<String[]> listStringAller = new ArrayList<String[]>();
    static List<String[]> listStringRetour = new ArrayList<String[]>();

    public void CreateBus() {
        busInfor = new Bus();
        for(String[] s : listStringAller)
        {
            busInfor.InsererAllArretTime(s,1);
        }
        for (String[] s: listStringRetour)
        {
            busInfor.InsererAllArretTime(s,2);
        }
    }

    public void AddListStringAller() {
        listStringAller.add(new String[]{"b2e","Gare","    07:05 08:05 12:05 13:05 16:10 17:10 18:10","7"});
        listStringAller.add(new String[]{"m2e","Magenta"," 07:10 08:10 12:10 13:10 16:15 17:15 18:15","7"});
        listStringAller.add(new String[]{"m2e","La Vènerie","    07:15 08:15 12:15 13:15 16:20 17:20 18:20","7"});
        listStringAller.add(new String[]{"m2e","De Lattre de Tassigny","     07:19 08:19 12:19 13:19 16:24 17:24 18:24","7"});
        listStringAller.add(new String[]{"m2e","Weygand"," 07:21 08:21 12:21 13:21 16:26 17:26 18:26","7"});
        listStringAller.add(new String[]{"m2e","Clos des Roses","07:23 08:23 12:23 13:23 16:28 17:28 18:28","7"});
        listStringAller.add(new String[]{"m2e","Denielou","07:26 08:26 12:26 13:26 16:31 17:31 18:31","7"});
        listStringAller.add(new String[]{"m2e","Blaise Pascal"," 07:28 08:28 12:28 13:28 16:33 17:33 18:33","7"});
        listStringAller.add(new String[]{"d2e","CC Jaux-Venette","     07:32 08:32 12:32 13:32 16:37 17:37 18:37","7"});
    }
    public void AddListStringRetour() {
        listStringRetour.add(new String[]{"b2e"," Jaux-Venette"," 07:35 08:40 12:35 13:35 16:40 17:40 18:40","7"});
        listStringRetour.add(new String[]{"m2e","Blaise Pascal"," 07:40 08:45 12:40 13:40 16:45 17:45 18:45","7"});
        listStringRetour.add(new String[]{"m2e","Denielou","07:43 08:48 12:43 13:43 16:48 17:48 18:48","7"});
        listStringRetour.add(new String[]{"m2e","Clos des Roses","07:46 08:51 12:46 13:46 16:51 17:51 18:51","7"});
        listStringRetour.add(new String[]{"m2e","Weygand"," 07:47 08:52 12:47 13:47 16:52 17:52 18:52","7"});
        listStringRetour.add(new String[]{"m2e","De Lattre de Tassigny","     07:49 08:54 12:49 13:49 16:54 17:54 18:54","7"});
        listStringRetour.add(new String[]{"m2e","La Vènerie","    07:53 08:58 12:53 13:53 16:58 17:58 18:58","7"});
        listStringRetour.add(new String[]{"m2e","Saint Jacques"," 07:57 09:02 12:57 13:57 17:02 18:02 19:02","7"});
        listStringRetour.add(new String[]{"d2e","Gare","    08:03 09:08 13:03 14:03 17:08 18:08 19:08","7"});
    }

    public static List<String[]> GetListAller()
    {
        return listStringAller;
    }
    public static List<String[]> GetListRetour()
    {
        return listStringRetour;
    }

    public static Bus GetBusInfor()
    {
        return busInfor;
    }
    public int GetNumeroLine()
    {
        return idLine;
    }
}
