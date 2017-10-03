package fr.intech.vutuantrung.android.busstop.Data;

import java.util.ArrayList;
import java.util.List;

import fr.intech.vutuantrung.android.busstop.Bus;

public class Ligne4
{
    int idLine = 4;

    static Bus busInfor;

    static List<String[]> listStringAllerNormal = new ArrayList<String[]>();
    static List<String[]> listStringRetourNormal = new ArrayList<String[]>();

    public void CreateBus() {
        busInfor = new Bus();
        for(String[] s : listStringAllerNormal)
        {
            busInfor.InsererAllArretTime(s,1);
        }
        for (String[] s: listStringRetourNormal)
        {
            busInfor.InsererAllArretTime(s,2);
        }
    }

    public void AddListStringAller() {
        listStringAllerNormal.add(new String[]{"b4","Palais",  "09:39 11:12 11:47 12:21 13:32 14:07 15:17 15:52 16:28","7"});
        listStringAllerNormal.add(new String[]{"m4","Saint Jacques"," 09:41 11:14 11:49 12:23 13:34 14:09 15:19 15:54 16:30","7"});
        listStringAllerNormal.add(new String[]{"m4","Solférino",     "09:43 11:16 11:51 12:25 13:36 14:11 15:21 15:56 16:33","7"});
        listStringAllerNormal.add(new String[]{"m4","Gare arrivée",  "09:46 11:19 11:54 12:28 13:39 14:14 15:24 15:59 16:36","7"});
        listStringAllerNormal.add(new String[]{"m4","Gare départ",   "06:30 06:58 07:33 07:54 08:32 09:04 09:50 10:10 10:45 11:20 12:03 12:30 13:05 13:40 14:15 14:50 15:25 16:00 16:37 16:54 17:33 18:05 18:32 19:04 19:33 20:05 20:33 20:55 22:03","7"});
        listStringAllerNormal.add(new String[]{"m4","Rue d'Amiens",  "06:33 07:01 07:36 07:57 08:35 09:07 09:53 10:13 10:48 11:23 12:06 12:33 13:08 13:43 14:18 14:53 15:28 16:03 16:40 16:57 17:37 18:09 18:36 19:08 19:36 20:08 20:36 20:58 22:06","7"});
        listStringAllerNormal.add(new String[]{"m4","Mairie de Margny",   " 06:34 07:02 07:37 07:58 08:36 09:08 09:54 10:14 10:49 11:24 12:07 12:34 13:09 13:44 14:19 14:54 15:29 16:04 16:41 16:58 17:39 18:11 18:38 19:10 19:37 20:09 20:37 20:59 22:07","7"});
        listStringAllerNormal.add(new String[]{"m4","Octave Butin","  06:36 07:04 07:39 08:00 08:38 09:10 09:56 10:16 10:51 11:26 12:09 12:36 13:11 13:46 14:21 14:56 15:31 16:06 16:43 17:00 17:41 18:13 18:40 19:12 19:39 20:11 20:39 21:01 22:09","7"});
        listStringAllerNormal.add(new String[]{"m4","Barthou"," 06:37 07:05 07:40 08:01 08:39 09:11 09:57 10:17 10:52 11:27 12:10 12:37 13:12 13:47 14:22 14:57 15:32 16:07 16:44 17:01 17:42 18:14 18:41 19:13 19:40 20:12 20:40 21:02 22:10","7"});
        listStringAllerNormal.add(new String[]{"m4","Margny de Gaulle","    06:38 07:06 07:41 08:02 08:40 09:12 09:58 10:18 10:53 11:28 12:11 12:38 13:13 13:48 14:23 14:58 15:33 16:08 16:45 17:02 17:43 18:15 18:42 19:14 19:41 20:13 20:41 21:03 22:11","7"});
        listStringAllerNormal.add(new String[]{"m4","Gymnase"," 06:39 07:07 07:42 08:03 08:41 09:13 09:59 10:19 10:54 11:29 12:12 12:39 13:14 13:49 14:24 14:59 15:34 16:09 16:46 17:03 17:44 18:16 18:43 19:15 19:42 20:14 20:42 21:04 22:12","7"});
        listStringAllerNormal.add(new String[]{"m4","Prairie"," 06:40 07:08 07:43 08:04 08:42 09:14 10:00 10:20 10:55 11:30 12:13 12:40 13:15 13:50 14:25 15:00 15:35 16:10 16:47 17:04 17:45 18:17 18:44 19:16 19:43 20:15 20:43 21:05 22:13","7"});
        listStringAllerNormal.add(new String[]{"m4","Castors"," 06:41 07:09 07:44 08:05 08:43 09:15 10:01 10:21 10:56 11:31 12:14 12:41 13:16 13:51 14:26 15:01 15:36 16:11 16:48 17:05 17:46 18:18 18:45 19:17 19:44 20:16 20:44 21:06 22:14","7"});
        listStringAllerNormal.add(new String[]{"m4","Château de Venette","  06:43 07:11 07:46 08:07 08:45 09:17 10:03 10:23 10:58 11:33 12:16 12:43 13:18 13:53 14:28 15:03 15:38 16:13 16:50 17:07 17:48 18:20 18:47 19:19 19:46 20:18 20:46 21:08 22:16","7"});
        listStringAllerNormal.add(new String[]{"m4","Square Nolet","  06:45 07:48 08:47 10:05 11:00 12:18 13:20 14:30 15:40 16:52 17:50 18:49 19:48 20:48 22:18","7"});
        listStringAllerNormal.add(new String[]{"m4","Cimetière de Venette","06:47 07:50 08:49 10:07 11:02 12:20 13:22 14:32 15:42 16:54 17:52 18:51 19:50 20:50 22:20","7"});
        listStringAllerNormal.add(new String[]{"m4","Mairie de Venette","   07:13 08:09 09:19 10:25 11:35 12:45 13:55 15:05 16:15 17:09 18:22 19:21 20:20 21:10","7"});
        listStringAllerNormal.add(new String[]{"m4","Hauts de Venette","    07:15 08:11 09:21 10:27 11:37 12:47 13:57 15:07 16:17 17:11 18:24 19:23 20:22 21:12","7"});
        listStringAllerNormal.add(new String[]{"m4","Bois de Plaisance","   07:19 08:15 08:55 09:25 10:31 11:41 12:51 14:01 15:11 16:21 17:15 18:28 19:27 20:26 21:16","7"});
        listStringAllerNormal.add(new String[]{"m4","Europe","  06:51 07:54 10:11 11:06 12:24 13:26 14:36 15:46 16:58 17:56 18:55 19:54 20:54 22:24","7"});
        listStringAllerNormal.add(new String[]{"m4","Monnet","  06:53 07:23 07:56 08:19 09:00 09:29 10:13 10:35 11:08 11:45 12:26 12:55 13:28 14:05 14:38 15:15 15:48 16:25 17:00 17:19 17:58 18:32 18:57 19:31 19:56 20:30 20:56 21:20 22:26","7"});
        listStringAllerNormal.add(new String[]{"m4","Centre commercial Jaux-Venette","  20:57 21:21 22:27","7"});
        listStringAllerNormal.add(new String[]{"m4","Camp du Roy","   20:59 21:23 22:29","7"});
        listStringAllerNormal.add(new String[]{"d4","Multiplexe - Jaux","   21:01 21:25 22:31","7"});
    }
    public void AddListStringRetour() {
        listStringRetourNormal.add(new String[]{"b4","Bois de Plaisance"," 07:19 08:15 08:55 09:25 10:31 11:41 12:51 14:01 15:11 16:21 17:15 18:28 19:27 20:26 21:16","7"});
        listStringRetourNormal.add(new String[]{"m4","Multiplexe - Jaux"," 21:04 21:38 22:35","7"});
        listStringRetourNormal.add(new String[]{"m4","Monnet","06:05 06:30 06:55 07:25 07:58 08:27 09:03 09:31 10:16 10:36 11:11 11:46 12:29 12:56 13:31 14:06 14:41 15:16 15:51 16:26 17:03 17:21 17:58 18:32 19:00 19:34 19:59 20:30","7"});
        listStringRetourNormal.add(new String[]{"m4","Centre commercial Jaux-Venette","06:07 06:32 06:57 07:27 08:00 08:29 09:05 09:33 10:18 10:38 11:13 11:48 12:31 12:58 13:33 14:08 14:43 15:18 15:53 16:28 17:05 17:23 18:00 18:34 19:02 19:36 20:01 20:32","7"});
        listStringRetourNormal.add(new String[]{"m4","Camp du Roy"," 06:10 06:35 07:00 07:30 08:03 08:32 09:08 09:36 10:21 10:41 11:16 11:51 12:34 13:01 13:36 14:11 14:46 15:21 15:56 16:31 17:08 17:26 18:03 18:37 19:05 19:39 20:04 20:35","7"});
        listStringRetourNormal.add(new String[]{"m4","Cailloux",    "06:11 06:36 07:01 07:31 08:04 08:33 09:09 09:37 10:22 10:42 11:17 11:52 12:35 13:02 13:37 14:12 14:47 15:22 15:57 16:32 17:09 17:27 18:04 18:38 19:06 19:40 20:05 20:36 21:06 21:40 22:37","7"});
        listStringRetourNormal.add(new String[]{"m4","Cimetière de Venette",    "06:39 07:34 08:36 09:40 10:45 11:55 13:05 14:15 15:25 16:35 17:30 18:41 19:43 20:39 21:42","7"});
        listStringRetourNormal.add(new String[]{"m4","Square Nolet","06:40 07:35 08:37 09:41 10:46 11:56 13:06 14:16 15:26 16:36 17:31 18:42 19:44 20:40 21:44","7"});
        listStringRetourNormal.add(new String[]{"m4","Hauts de Venette",  "06:14 07:04 08:07 09:12 10:25 11:20 12:38 13:40 14:50 16:00 17:12 18:07 19:09 20:08 21:08 22:39","7"});
        listStringRetourNormal.add(new String[]{"m4","Mairie de Venette"," 06:16 07:06 08:09 09:14 10:27 11:22 12:40 13:42 14:52 16:02 17:14 18:09 19:11 20:10 21:09 22:40","7"});
        listStringRetourNormal.add(new String[]{"m4","Château de Venette","06:18 06:42 07:08 07:37 08:11 08:39 09:16 09:43 10:29 10:48 11:24 11:58 12:42 13:08 13:44 14:18 14:54 15:28 16:04 16:38 17:16 17:33 18:11 18:44 19:13 19:46 20:12 20:42 21:11 21:46 22:42","7"});
        listStringRetourNormal.add(new String[]{"m4","Castors",     "06:19 06:43 07:09 07:38 08:12 08:40 09:17 09:44 10:30 10:49 11:25 11:59 12:43 13:09 13:45 14:19 14:55 15:29 16:05 16:39 17:17 17:34 18:12 18:45 19:14 19:47 20:13 20:43 21:12 21:47 22:43","7"});
        listStringRetourNormal.add(new String[]{"m4","Prairie","     06:20 06:44 07:10 07:39 08:13 08:41 09:18 09:45 10:31 10:50 11:26 12:00 12:44 13:10 13:46 14:20 14:56 15:30 16:06 16:40 17:18 17:35 18:13 18:46 19:15 19:48 20:14 20:44 21:13 21:48 22:44","7"});
        listStringRetourNormal.add(new String[]{"m4","Gymnase","     06:21 06:45 07:11 07:40 08:14 08:42 09:19 09:46 10:32 10:51 11:27 12:01 12:45 13:11 13:47 14:21 14:57 15:31 16:07 16:41 17:19 17:36 18:14 18:47 19:16 19:49 20:15 20:45 21:14 21:49 22:45","7"});
        listStringRetourNormal.add(new String[]{"m4","Margny de Gaulle","  06:22 06:46 07:12 07:41 08:15 08:43 09:20 09:47 10:33 10:52 11:28 12:02 12:46 13:12 13:48 14:22 14:58 15:32 16:08 16:42 17:20 17:37 18:15 18:48 19:17 19:50 20:16 20:46 21:15 21:50 22:46","7"});
        listStringRetourNormal.add(new String[]{"m4","Barthou",     "06:23 06:47 07:13 07:42 08:16 08:44 09:21 09:48 10:34 10:53 11:29 12:03 12:47 13:13 13:49 14:23 14:59 15:33 16:09 16:43 17:21 17:38 18:16 18:49 19:18 19:51 20:17 20:47 21:16 21:51 22:47","7"});
        listStringRetourNormal.add(new String[]{"m4","Octave Butin","06:24 06:48 07:14 07:43 08:17 08:45 09:22 09:49 10:35 10:54 11:30 12:04 12:48 13:14 13:50 14:24 15:00 15:34 16:10 16:44 17:22 17:39 18:17 18:50 19:19 19:52 20:18 20:48 21:17 21:52 22:48","7"});
        listStringRetourNormal.add(new String[]{"m4","Mairie de Margny","  06:26 06:50 07:16 07:45 08:19 08:47 09:24 09:51 10:37 10:56 11:32 12:06 12:50 13:16 13:52 14:26 15:02 15:36 16:12 16:46 17:24 17:41 18:19 18:52 19:21 19:54 20:20 20:50 21:19 21:54 22:50","7"});
        listStringRetourNormal.add(new String[]{"m4","Rue d'Amiens","06:27 06:51 07:17 07:47 08:21 08:48 09:25 09:52 10:38 10:57 11:33 12:07 12:51 13:17 13:53 14:27 15:03 15:37 16:13 16:47 17:25 17:42 18:20 18:53 19:22 19:55 20:21 20:51 21:20 21:55 22:51","7"});
        listStringRetourNormal.add(new String[]{"m4","Gare arrivée","06:30 06:54 07:20 07:51 08:25 08:51 09:28 09:55 10:41 11:00 11:36 12:10 12:54 13:20 13:56 14:30 15:06 15:40 16:16 16:50 17:28 17:45 18:23 18:56 19:25 19:58 20:24 20:54 21:23 21:58 22:54","7"});
        listStringRetourNormal.add(new String[]{"m4","Gare départ"," 09:30 11:03 11:38 12:12 13:23 13:58 15:08 15:43 16:18","7"});
        listStringRetourNormal.add(new String[]{"m4","Solférino","   09:33 11:06 11:41 12:15 13:26 14:01 15:11 15:46 16:2","7"});
        listStringRetourNormal.add(new String[]{"m4","Magenta","     09:36 11:09 11:44 12:18 13:29 14:04 15:14 15:49 16:25","7"});
        listStringRetourNormal.add(new String[]{"m4","Victor Hugo"," 09:38 11:11 11:46 12:20 13:31 14:06 15:16 15:51 16:27","7"});
        listStringRetourNormal.add(new String[]{"d4","Palais","09:39 11:12 11:47 12:21 13:32 14:07 15:17 15:52 16:28","7"});
    }

    public static List<String[]> GetListAller()
    {
        return listStringAllerNormal;
    }
    public static List<String[]> GetListRetour()
    {
        return listStringRetourNormal;
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