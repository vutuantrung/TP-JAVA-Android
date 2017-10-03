package fr.intech.vutuantrung.android.busstop.Data;

import java.util.ArrayList;
import java.util.List;

import fr.intech.vutuantrung.android.busstop.Bus;

public class Ligne1
{
    PeriodScholarlyZoneB periodScholarlyZoneB = new PeriodScholarlyZoneB();

    int idLine = 1;

    static Bus busInfor;

    static List<String[]> listStringRetourExcept = new ArrayList<String[]>();
    static List<String[]> listStringAllerNormal  = new ArrayList<String[]>();
    static List<String[]> listStringRetourNormal = new ArrayList<String[]>();

    public void CreateBus(){
        busInfor = new Bus();
        for(String[] s : listStringAllerNormal)
            busInfor.InsererAllArretTime(s,1);

        if(periodScholarlyZoneB.InTousVacances())
        {
            for (String[] s: listStringRetourNormal)
                busInfor.InsererAllArretTime(s,2);
        }
        else
        {
            for (String[] s: listStringRetourExcept)
                busInfor.InsererAllArretTime(s,2);
        }
    }

    public void AddListStringAllerNormal(){
        listStringAllerNormal.add(new String[]{"b1","Gare routière","06:00 06:32 07:04 07:31 08:05 08:33 09:06 09:33 09:55 10:28 11:02 11:30 12:08 12:32 13:00 13:33 14:05 14:32 15:01 15:30 16:01 16:27 17:00 17:33 18:05 18:33 19:05 19:33 20:05 20:33 21:33","2 3 4 5"});
        listStringAllerNormal.add(new String[]{"m1","Solférino",    "06:02 06:34 07:06 07:34 08:08 08:36 09:09 09:36 09:58 10:31 11:05 11:33 12:11 12:35 13:03 13:36 14:08 14:35 15:04 15:33 16:04 16:30 17:03 17:36 18:08 18:36 19:07 19:35 20:07 20:35 21:35","2 4"});
        listStringAllerNormal.add(new String[]{"m1","Magenta","06:05 06:37 07:09 07:38 08:12 08:39 09:12 09:39 10:01 10:34 11:08 11:36 12:14 12:38 13:06 13:39 14:11 14:38 15:07 15:36 16:08 16:34 17:07 17:40 18:12 18:40 19:10 19:38 20:10 20:38 21:38","2 4"});
        listStringAllerNormal.add(new String[]{"m1","Sous-Préfecture",    "10:03 11:38 15:38 16:36","7"});
        listStringAllerNormal.add(new String[]{"m1","Rond Royal",   "10:04 11:39 15:39 16:37","7"});
        listStringAllerNormal.add(new String[]{"m1","Grande-Bretagne",    "10:05 11:40 15:40 16:38","7"});
        listStringAllerNormal.add(new String[]{"m1","Jacques Monod","06:07 06:39 07:11 07:40 08:14 08:41 09:14 09:41 10:36 11:10 12:16 12:40 13:08 13:41 14:13 14:40 15:09 16:10 17:09 17:42 18:14 18:42 19:12 19:40 20:12 20:40 21:40","2"});
        listStringAllerNormal.add(new String[]{"m1","Saint-Lazare", "06:08 06:40 07:12 07:41 08:15 08:42 09:15 09:42 10:37 11:11 12:17 12:41 13:09 13:42 14:14 14:41 15:10 16:11 17:10 17:43 18:15 18:43 19:13 19:41 20:13 20:41 21:41","7"});
        listStringAllerNormal.add(new String[]{"m1","Bournonville", "06:08 06:40 07:12 07:41 08:15 08:42 09:15 09:42 10:37 11:11 12:17 12:41 13:09 13:42 14:14 14:41 15:10 16:11 17:10 17:43 18:15 18:43 19:13 19:41 20:13 20:41 21:41","7"});
        listStringAllerNormal.add(new String[]{"m1","Bournonville 2",     "06:09 06:41 07:13 07:42 08:16 08:43 09:16 09:43 10:38 11:12 12:18 12:42 13:10 13:43 14:15 14:42 15:11 16:12 17:11 17:44 18:16 18:44 19:14 19:42 20:14 20:42 21:42","7"});
        listStringAllerNormal.add(new String[]{"m1","Carrefour Napoléon", "06:10 06:42 07:14 07:43 08:17 08:44 09:17 09:44 10:39 11:13 12:19 12:43 13:11 13:44 14:16 14:43 15:12 16:13 17:12 17:45 18:17 18:45 19:15 19:43 20:15 20:43 21:43","7"});
        listStringAllerNormal.add(new String[]{"m1","Lotissement du Moulin", "10:08 11:43 15:43 16:41 19:46","7"});
        listStringAllerNormal.add(new String[]{"m1","Verdun",    "10:11 11:46 15:46 16:44","7"});
        listStringAllerNormal.add(new String[]{"m1","Libération","10:12 11:47 15:47 16:45","7"});
        listStringAllerNormal.add(new String[]{"m1","Lycée Pierre d'Ailly",  "06:11 06:43 07:15 07:44 08:18 08:45 09:18 09:45 10:40 11:14 12:20 12:44 13:12 13:45 14:17 14:44 15:13 16:14 17:13 17:46 18:18 18:46 19:16 19:49 20:16 20:44 21:44","7"});
        listStringAllerNormal.add(new String[]{"m1","La Venerie","06:12 06:44 07:16 07:45 08:19 08:46 09:19 09:46 10:41 11:15 12:21 12:45 13:13 13:46 14:18 14:45 15:14 16:15 17:14 17:47 18:19 18:47 19:17 19:50 20:17 20:45 21:45","2"});
        listStringAllerNormal.add(new String[]{"m1","Carnot",    "06:13 06:45 07:17 07:46 08:20 08:47 09:20 09:47 10:42 11:16 12:22 12:46 13:14 13:47 14:19 14:46 15:15 16:16 17:15 17:48 18:20 18:48 19:18 19:51 20:18 20:46 21:46","7"});
        listStringAllerNormal.add(new String[]{"m1","Réservoirs","06:14 06:46 07:18 07:47 08:21 08:48 09:21 09:48 10:43 11:17 12:23 12:47 13:15 13:48 14:20 14:47 15:16 16:17 17:16 17:49 18:21 18:49 19:19 19:52 20:19 20:47 21:47","7"});
        listStringAllerNormal.add(new String[]{"m1","Victoire",  "06:16 06:48 07:20 07:49 08:23 08:50 09:23 09:50 10:13 10:45 11:19 11:48 12:25 12:49 13:17 13:50 14:22 14:49 15:18 15:48 16:19 16:46 17:18 17:51 18:23 18:51 19:21 19:54 20:21 20:49 21:49","7"});
        listStringAllerNormal.add(new String[]{"m1","Piscine",   "06:17 06:49 07:21 07:50 08:24 08:51 09:24 09:51 10:14 10:46 11:20 11:49 12:26 12:50 13:18 13:51 14:23 14:50 15:19 15:49 16:20 16:47 17:19 17:52 18:24 18:52 19:22 19:55 20:22 20:50 21:50","7"});
        listStringAllerNormal.add(new String[]{"m1","Jean l'Huillier",  "06:18 06:50 07:22 07:51 08:25 08:52 09:25 09:52 10:15 10:47 11:21 11:50 12:27 12:51 13:19 13:52 14:24 14:51 15:20 15:50 16:21 16:48 17:20 17:53 18:25 18:53 19:23 19:56 20:23 20:51 21:51","7"});
        listStringAllerNormal.add(new String[]{"m1","Picardie",  "06:20 06:52 07:24 07:53 08:27 08:54 09:27 09:54 10:16 10:49 11:23 11:51 12:29 12:53 13:21 13:54 14:26 14:53 15:22 15:51 16:23 16:49 17:22 17:55 18:27 18:55 19:25 19:58 20:25 20:53 21:53","7"});
        listStringAllerNormal.add(new String[]{"m1","Mémorial",  "10:18 11:53 15:53 16:51","7"});
        listStringAllerNormal.add(new String[]{"m1","Abbaye",    "06:21 06:53 07:25 07:54 08:28 08:55 09:28 09:55 10:19 10:50 11:24 11:54 12:30 12:54 13:22 13:55 14:27 14:54 15:23 15:54 16:24 16:52 17:23 17:56 18:28 18:56 19:26 19:59 20:26 20:54 21:54","7"});
        listStringAllerNormal.add(new String[]{"m1","Royallieu", "06:22 06:54 07:26 07:55 08:29 08:56 09:29 09:56 10:20 10:51 11:25 11:55 12:31 12:55 13:23 13:56 14:28 14:55 15:24 15:55 16:25 16:53 17:24 17:57 18:29 18:57 19:27 20:00 20:27 20:55 21:55","7"});
        listStringAllerNormal.add(new String[]{"m1","Stalingrad","06:25 06:57 07:29 07:58 08:32 08:59 09:32 09:59 10:23 10:54 11:28 11:58 12:34 12:58 13:26 13:59 14:31 14:58 15:27 15:58 16:28 16:56 17:27 18:00 18:32 19:00 19:30 20:03 20:30 20:58 21:58","7"});
        listStringAllerNormal.add(new String[]{"m1","Vivier Corax",    "06:26 06:58 07:30 07:59 08:33 09:00 09:33 10:00 10:24 10:55 11:29 11:59 12:35 12:59 13:27 14:00 14:32 14:59 15:28 15:59 16:29 16:57 17:28 18:01 18:33 19:01 19:31 20:04 20:31 20:59 21:59","7"});
        listStringAllerNormal.add(new String[]{"m1","Centre commercial Royallieu", "06:27 06:59 07:31 08:00 08:34 09:01 09:34 10:01 10:25 10:56 11:30 12:00 12:36 13:00 13:28 14:01 14:33 15:00 15:29 16:00 16:30 16:58 17:29 18:02 18:34 19:02 19:32 20:05 20:32 21:00 22:00","7"});
        listStringAllerNormal.add(new String[]{"m1","Guy Denielou",    "06:29 07:01 07:33 08:02 08:36 09:03 09:36 10:03 10:27 10:58 11:32 12:02 12:38 13:02 13:30 14:03 14:35 15:02 15:31 16:02 16:32 17:00 17:31 18:04 18:36 19:04 19:34 20:07 20:34 21:02 22:02","2 3 5"});
        listStringAllerNormal.add(new String[]{"m1","A. Malraux",      "06:30 07:02 07:34 08:03 08:37 09:04 09:37 10:04 10:28 10:59 11:33 12:03 12:39 13:03 13:31 14:04 14:36 15:03 15:32 16:03 16:33 17:01 17:32 18:05 18:37 19:05 19:35 20:08 20:35 21:03 22:03","2 5"});
        listStringAllerNormal.add(new String[]{"m1","Blaise Pascal",   "06:31 07:03 07:35 08:04 08:38 09:05 09:38 10:05 10:29 11:00 11:34 12:04 12:40 13:04 13:32 14:05 14:37 15:04 15:33 16:04 16:34 17:02 17:33 18:06 18:38 19:06 19:36 20:09 20:36 21:04 22:04","6 2 5"});
        listStringAllerNormal.add(new String[]{"m1","Mercières", "06:33 07:05 07:37 08:06 08:40 09:07 09:40 10:07 10:31 11:02 11:36 12:06 12:42 13:06 13:34 14:07 14:39 15:06 15:35 16:06 16:36 17:04 17:35 18:08 18:40 19:08 19:38 20:11 20:38 21:06 22:06","7"});
        listStringAllerNormal.add(new String[]{"m1","Chemin d'Armancourt",   "06:34 07:06 07:38 08:07 08:41 09:08 09:41 10:08 10:32 11:03 11:37 12:07 12:43 13:07 13:35 14:08 14:40 15:07 15:36 16:07 16:37 17:05 17:36 18:09 18:41 19:09 19:39 20:12 20:39 21:07 22:07","7"});
        listStringAllerNormal.add(new String[]{"m1","Hôpital",   "06:35 07:07 07:39 08:08 08:42 09:09 09:42 10:09 10:33 11:04 11:38 12:08 12:44 13:08 13:36 14:09 14:41 15:08 15:37 16:08 16:38 17:06 17:37 18:10 18:42 19:10 19:40 20:13 20:40 21:08 22:08","3 5"});
        listStringAllerNormal.add(new String[]{"m1","Parc de Loisirs","08:10 12:46 17:39","3 5"});
        listStringAllerNormal.add(new String[]{"d1","Lycée Charles de Gaulle", "08:12 12:48 17:41","3 5"});
    }
    public void AddListStringRetourNormal(){
        listStringRetourNormal.add(new String[]{"b1","Lycée Charles de Gaulle","08:12 12:48 17:41","3 5"});
        listStringRetourNormal.add(new String[]{"m1","Jean Monnet",      "08:13 12:49 17:42","3 5"});
        listStringRetourNormal.add(new String[]{"m1","Mercure",    "08:14 12:50 17:44","3 5"});
        listStringRetourNormal.add(new String[]{"m1","CIMA", "08:15 12:51 17:45","3 5"});
        listStringRetourNormal.add(new String[]{"m1","Hôpital",   "05:28 06:15 06:45 07:15 07:45 08:18 08:44 09:12 09:44 10:13 10:35 11:07 11:40 12:15 12:54 13:09 13:38 14:13 14:45 15:13 15:39 16:10 16:39 17:07 17:48 18:13 18:45 19:20 19:50 20:13 20:40","3 5"});
        listStringRetourNormal.add(new String[]{"m1","Mercières", "05:30 06:17 06:47 07:17 07:47 08:20 08:46 09:14 09:46 10:15 10:37 11:09 11:42 12:17 12:56 13:11 13:40 14:15 14:47 15:15 15:41 16:13 16:43 17:11 17:52 18:17 18:48 19:22 19:52 20:15 20:42","5"});
        listStringRetourNormal.add(new String[]{"m1","Blaise Pascal",   "05:32 06:19 06:49 07:19 07:49 08:22 08:48 09:16 09:48 10:17 10:39 11:11 11:44 12:19 12:58 13:13 13:42 14:17 14:49 15:17 15:43 16:15 16:46 17:14 17:54 18:19 18:50 19:24 19:54 20:17 20:44","6 2 5"});
        listStringRetourNormal.add(new String[]{"m1","A. Malraux","05:33 06:20 06:50 07:20 07:50 08:23 08:49 09:17 09:49 10:18 10:40 11:12 11:45 12:20 12:59 13:14 13:43 14:18 14:50 15:18 15:44 16:16 16:47 17:15 17:55 18:20 18:51 19:25 19:55 20:18 20:45","2 5"});
        listStringRetourNormal.add(new String[]{"m1","Guy Denielou",    "05:34 06:21 06:51 07:21 07:51 08:24 08:50 09:18 09:50 10:19 10:41 11:13 11:46 12:21 13:00 13:15 13:44 14:19 14:51 15:19 15:45 16:17 16:48 17:16 17:56 18:21 18:52 19:26 19:56 20:19 20:46","2 3 5"});
        listStringRetourNormal.add(new String[]{"m1","Centre commercial Royallieu", "05:36 06:23 06:53 07:23 07:53 08:26 08:52 09:20 09:52 10:21 10:43 11:15 11:48 12:23 13:02 13:17 13:46 14:21 14:53 15:21 15:47 16:19 16:50 17:18 17:58 18:23 18:54 19:28 19:58 20:21 20:48","7"});
        listStringRetourNormal.add(new String[]{"m1","Vivier Corax",    "05:37 06:24 06:54 07:24 07:54 08:27 08:53 09:21 09:53 10:22 10:44 11:16 11:49 12:24 13:03 13:18 13:47 14:22 14:54 15:22 15:48 16:20 16:51 17:19 17:59 18:24 18:55 19:29 19:59 20:22 20:49","7"});
        listStringRetourNormal.add(new String[]{"m1","Stalingrad","05:38 06:25 06:55 07:25 07:55 08:28 08:54 09:22 09:54 10:23 10:45 11:17 11:50 12:25 13:04 13:19 13:48 14:23 14:55 15:23 15:49 16:21 16:52 17:20 18:00 18:25 18:56 19:30 20:00 20:23 20:50","7"});
        listStringRetourNormal.add(new String[]{"m1","Huy - Senlis",    "05:41 06:28 06:58 07:28 07:58 08:31 08:57 09:25 09:57 10:26 10:48 11:20 11:53 12:28 13:07 13:22 13:51 14:26 14:58 15:26 15:52 16:24 16:55 17:23 18:03 18:28 18:59 19:33 20:03 20:26 20:53","7"});
        listStringRetourNormal.add(new String[]{"m1","Pillet Will",     "05:42 06:29 06:59 07:29 07:59 08:32 08:58 09:26 09:58 10:27 10:49 11:21 11:54 12:29 13:08 13:23 13:52 14:27 14:59 15:27 15:53 16:25 16:56 17:24 18:04 18:29 19:00 19:34 20:04 20:27 20:54","7"});
        listStringRetourNormal.add(new String[]{"m1","Abbaye",    "05:43 06:30 07:00 07:30 08:00 08:33 08:59 09:27 09:59 10:28 10:50 11:22 11:55 12:30 13:09 13:24 13:53 14:28 15:00 15:28 15:54 16:26 16:57 17:25 18:05 18:30 19:01 19:35 20:05 20:28 20:55","7"});
        listStringRetourNormal.add(new String[]{"m1","Mémorial",  "09:29 10:52 15:02 15:56","7"});
        listStringRetourNormal.add(new String[]{"m1","Picardie",  "05:44 06:31 07:01 07:31 08:01 08:34 09:00 09:30 10:00 10:29 10:53 11:23 11:56 12:31 13:10 13:25 13:54 14:29 15:03 15:29 15:57 16:27 16:58 17:26 18:06 18:31 19:02 19:36 20:06 20:29 20:56","7"});
        listStringRetourNormal.add(new String[]{"m1","Jean l'Huillier", "05:45 06:32 07:02 07:32 08:02 08:35 09:01 09:31 10:01 10:30 10:54 11:24 11:57 12:32 13:11 13:26 13:55 14:30 15:04 15:30 15:58 16:28 16:59 17:27 18:07 18:32 19:03 19:37 20:07 20:30 20:57","7"});
        listStringRetourNormal.add(new String[]{"m1","Piscine",   "05:46 06:33 07:03 07:33 08:03 08:36 09:02 09:32 10:02 10:31 10:55 11:25 11:58 12:33 13:12 13:27 13:56 14:31 15:05 15:31 15:59 16:29 17:00 17:28 18:08 18:33 19:04 19:38 20:08 20:31 20:58","7"});
        listStringRetourNormal.add(new String[]{"m1","Libération","09:34 10:57 15:07 16:01","7"});
        listStringRetourNormal.add(new String[]{"m1","Verdun",    "09:35 10:58 15:08 16:02","7"});
        listStringRetourNormal.add(new String[]{"m1","Lotissement du Moulin", "09:38 11:01 15:11 16:05","7"});
        listStringRetourNormal.add(new String[]{"m1","Grande-Bretagne","09:41 11:04 15:14 16:08","7"});
        listStringRetourNormal.add(new String[]{"m1","Rond Royal",     "09:42 11:05 15:15 16:09","7"});
        listStringRetourNormal.add(new String[]{"m1","Sous-Préfecture","09:43 11:06 15:16 16:10","7"});
        listStringRetourNormal.add(new String[]{"m1","Victoire", "05:48 06:35 07:05 07:35 08:05 08:38 09:04 10:04 10:33 11:27 12:00 12:35 13:14 13:29 13:58 14:33 15:33 16:3 17:02 17:30 18:10 18:35 19:06 19:40 20:10 20:33 21:00","7"});
        listStringRetourNormal.add(new String[]{"m1","Réservoirs",     "05:49 06:36 07:06 07:36 08:06 08:39 09:05 10:05 10:34 11:28 12:01 12:36 13:15 13:30 13:59 14:34 15:34 16:32 17:03 17:3 18:11 18:36 19:07 19:4 20:11 20:34 21:01","7"});
        listStringRetourNormal.add(new String[]{"m1","Carnot",   "05:50 06:37 07:07 07:37 08:07 08:40 09:06 10:06 10:35 11:29 12:02 12:37 13:16 13:3 14:00 14:35 15:35 16:33 17:04 17:32 18:12 18:37 19:08 19:42 20:12 20:35 21:02","7"});
        listStringRetourNormal.add(new String[]{"m1","La Venerie",     "05:51 06:38 07:08 07:38 08:08 08:41 09:07 10:07 10:36 11:30 12:03 12:38 13:17 13:32 14:01 14:36 15:36 16:34 17:05 17:33 18:13 18:38 19:09 19:43 20:13 20:36 21:03","2"});
        listStringRetourNormal.add(new String[]{"m1","Lycée Pierre d'Ailly", "05:52 06:39 07:09 07:39 08:09 08:42 09:08 10:08 10:37 11:3 12:04 12:39 13:18 13:33 14:02 14:37 15:37 16:36 17:07 17:35 18:15 18:39 19:10 19:44 20:14 20:37 21:04","7"});
        listStringRetourNormal.add(new String[]{"m1","Maison de l'Europe",      "05:53 06:40 07:10 07:40 08:10 08:43 09:09 10:09 10:38 11:32 12:05 12:40 13:19 13:34 14:03 14:38 15:38 16:37 17:08 17:36 18:16 18:40 19:11 19:45 20:15 20:38 21:05","7"});
        listStringRetourNormal.add(new String[]{"m1","Bournonville",      "05:53 06:40 07:10 07:40 08:10 08:43 09:09 10:09 10:38 11:32 12:05 12:40 13:19 13:34 14:03 14:38 15:38 16:37 17:08 17:36 18:16 18:40 19:11 19:45 20:15 20:38 21:05","7"});
        listStringRetourNormal.add(new String[]{"m1","Bournonville 2",    "05:54 06:41 07:11 07:41 08:11 08:44 09:10 10:10 10:39 11:33 12:06 12:41 13:20 13:35 14:04 14:39 15:39 16:38 17:09 17:37 18:17 18:41 19:12 19:46 20:16 20:39 21:06","7"});
        listStringRetourNormal.add(new String[]{"m1","Saint-Lazare",      "05:55 06:42 07:12 07:42 08:12 08:45 09:11 10:11 10:40 11:34 12:07 12:42 13:21 13:36 14:05 14:40 15:40 16:39 17:10 17:38 18:18 18:42 19:13 19:47 20:17 20:40 21:07","7"});
        listStringRetourNormal.add(new String[]{"m1","Jacques Monod",     "05:56 06:43 07:13 07:43 08:13 08:46 09:12 10:12 10:41 11:35 12:08 12:43 13:22 13:37 14:06 14:41 15:41 16:40 17:11 17:39 18:19 18:43 19:14 19:48 20:18 20:41 21:08","2"});
        listStringRetourNormal.add(new String[]{"m1","Victor Hugo",       "05:57 06:44 07:14 07:44 08:14 08:47 09:13 10:13 10:42 11:36 12:09 12:44 13:23 13:38 14:07 14:42 15:42 16:41 17:12 17:40 18:20 18:44 19:15 19:49 20:19 20:42 21:09","2 4"});
        listStringRetourNormal.add(new String[]{"m1","Palais",      "05:59 06:46 07:16 07:46 08:16 08:49 09:15 09:45 10:15 10:44 11:08 11:38 12:11 12:46 13:25 13:40 14:09 14:44 15:18 15:44 16:12 16:43 17:14 17:42 18:22 18:46 19:17 19:51 20:21 20:44 21:11","2 4"});
        listStringRetourNormal.add(new String[]{"m1","Saint", "06:00 06:47 07:17 07:48 08:18 08:51 09:17 09:47 10:17 10:46 11:10 11:40 12:13 12:48 13:27 13:42 14:11 14:46 15:20 15:46 16:14 16:45 17:16 17:44 18:24 18:48 19:18 19:52 20:22 20:45 21:12","6 2 4"});
        listStringRetourNormal.add(new String[]{"m1","Solférino",   "06:02 06:49 07:19 07:50 08:20 08:53 09:19 09:49 10:19 10:48 11:12 11:42 12:15 12:50 13:29 13:44 14:13 14:48 15:22 15:48 16:17 16:48 17:19 17:47 18:27 18:51 19:20 19:54 20:24 20:47 21:14","2 3 4 5"});
        listStringRetourNormal.add(new String[]{"d1","Gare routière",     "06:05 06:52 07:22 07:53 08:23 08:56 09:22 09:52 10:22 10:51 11:15 11:45 12:18 12:53 13:32 13:47 14:16 14:51 15:25 15:51 16:20 16:51 17:22 17:50 18:30 18:54 19:23 19:57 20:27 20:50 21:17","2 3 4 5 6"});
    }
    public void AddListExceptionPeriodeRetour(){
        listStringRetourExcept.add(new String[]{"b1","Lycée Charles de Gaulle","08:12 12:48 17:41","3 5"});
        listStringRetourExcept.add(new String[]{"m1","Jean Monnet",     "08:13 12:49 17:42","3 5"});
        listStringRetourExcept.add(new String[]{"m1","Mercure",   "08:14 12:50 17:44","3 5"});
        listStringRetourExcept.add(new String[]{"m1","CIMA","08:15 12:51 17:45","3 5"});
        listStringRetourExcept.add(new String[]{"m1","Hôpital",   "05:28 06:15 06:45 07:15 07:45 08:18 08:44 09:12 09:44 10:13 10:35 11:07 11:40 12:15 12:54 13:09 13:38 14:13 14:45 15:13 15:39 16:10 16:39 17:07 17:48 18:13 18:45 19:20 19:50 20:13 20:40","3 5"});
        listStringRetourExcept.add(new String[]{"m1","Mercières", "05:30 06:17 06:47 07:17 07:47 08:20 08:46 09:14 09:46 10:15 10:37 11:09 11:42 12:17 12:56 13:11 13:40 14:15 14:47 15:15 15:41 16:13 16:43 17:11 17:52 18:17 18:48 19:22 19:52 20:15 20:42","3 5"});
        listStringRetourExcept.add(new String[]{"m1","Blaise Pascal",   "05:32 06:19 06:49 07:19 07:35 07:49 08:22 08:48 09:16 09:48 10:17 10:39 11:11 11:44 12:19 12:58 13:13 13:42 14:17 14:49 15:17 15:43 16:15 16:46 17:14 17:54 18:19 18:50 19:24 19:54 20:17 20:44","5"});
        listStringRetourExcept.add(new String[]{"m1","A. Malraux","05:33 06:20 06:50 07:20 07:36 07:50 08:23 08:49 09:17 09:49 10:18 10:40 11:12 11:45 12:20 12:59 13:14 13:43 14:18 14:50 15:18 15:44 16:16 16:47 17:15 17:55 18:20 18:51 19:25 19:55 20:18 20:45","6 2 5"});
        listStringRetourExcept.add(new String[]{"m1","Guy Denielou",    "05:34 06:21 06:51 07:21 07:37 07:51 08:24 08:50 09:18 09:50 10:19 10:41 11:13 11:46 12:21 13:00 13:15 13:44 14:19 14:51 15:19 15:45 16:17 16:48 17:16 17:56 18:21 18:52 19:26 19:56 20:19 20:46","2 5"});
        listStringRetourExcept.add(new String[]{"m1","Centre commercial Royallieu", "05:36 06:23 06:53 07:23 07:39 07:53 08:26 08:52 09:20 09:52 10:21 10:43 11:15 11:48 12:23 13:02 13:17 13:46 14:21 14:53 15:21 15:47 16:19 16:50 17:18 17:58 18:23 18:54 19:28 19:58 20:21 20:48","2 3 5"});
        listStringRetourExcept.add(new String[]{"m1","Vivier Corax",    "05:37 06:24 06:54 07:24 07:40 07:54 08:27 08:53 09:21 09:53 10:22 10:44 11:16 11:49 12:24 13:03 13:18 13:47 14:22 14:54 15:22 15:48 16:20 16:51 17:19 17:59 18:24 18:55 19:29 19:59 20:22 20:49","7"});
        listStringRetourExcept.add(new String[]{"m1","Stalingrad","05:38 06:25 06:55 07:25 07:55 08:28 08:54 09:22 09:54 10:23 10:45 11:17 11:50 12:25 13:04 13:19 13:48 14:23 14:55 15:23 15:49 16:21 16:52 17:20 18:00 18:25 18:56 19:30 20:00 20:23 20:50","7"});
        listStringRetourExcept.add(new String[]{"m1","Huy - Senlis",    "05:41 06:28 06:58 07:28 07:42 07:58 08:31 08:57 09:25 09:57 10:26 10:48 11:20 11:53 12:28 13:07 13:22 13:51 14:26 14:58 15:26 15:52 16:24 16:55 17:23 18:03 18:28 18:59 19:33 20:03 20:26 20:53","7"});
        listStringRetourExcept.add(new String[]{"m1","Pillet Will",     "05:42 06:29 06:59 07:29 07:43 07:59 08:32 08:58 09:26 09:58 10:27 10:49 11:21 11:54 12:29 13:08 13:23 13:52 14:27 14:59 15:27 15:53 16:25 16:56 17:24 18:04 18:29 19:00 19:34 20:04 20:27 20:54","7"});
        listStringRetourExcept.add(new String[]{"m1","Abbaye",    "05:43 06:30 07:00 07:30 07:44 08:00 08:33 08:59 09:27 09:59 10:28 10:50 11:22 11:55 12:30 13:09 13:24 13:53 14:28 15:00 15:28 15:54 16:26 16:57 17:25 18:05 18:30 19:01 19:35 20:05 20:28 20:55","7"});
        listStringRetourExcept.add(new String[]{"m1","Mémorial",  "09:29 10:52 15:02 15:56","7"});
        listStringRetourExcept.add(new String[]{"m1","Picardie",  "05:44 06:31 07:01 07:31 07:45 08:01 08:34 09:00 09:30 10:00 10:29 10:53 11:23 11:56 12:31 13:10 13:25 13:54 14:29 15:03 15:29 15:57 16:27 16:58 17:26 18:06 18:31 19:02 19:36 20:06 20:29 20:56","7"});
        listStringRetourExcept.add(new String[]{"m1","Jean l'Huillier", "05:45 06:32 07:02 07:32 07:47 08:02 08:35 09:01 09:31 10:01 10:30 10:54 11:24 11:57 12:32 13:11 13:26 13:55 14:30 15:04 15:30 15:58 16:28 16:59 17:27 18:07 18:32 19:03 19:37 20:07 20:30 20:57","7"});
        listStringRetourExcept.add(new String[]{"m1","Piscine",   "05:46 06:33 07:03 07:33 07:48 08:03 08:36 09:02 09:32 10:02 10:31 10:55 11:25 11:58 12:33 13:12 13:27 13:56 14:31 15:05 15:31 15:59 16:29 17:00 17:28 18:08 18:33 19:04 19:38 20:08 20:31 20:58","7"});
        listStringRetourExcept.add(new String[]{"m1","Libération","09:34 10:57 15:07 16:01","7"});
        listStringRetourExcept.add(new String[]{"m1","Verdun",    "09:35 10:58 15:08 16:02","7"});
        listStringRetourExcept.add(new String[]{"m1","Lotissement du Moulin", "09:38 11:01 15:11 16:05","7"});
        listStringRetourExcept.add(new String[]{"m1","Grande-Bretagne", "09:41 11:04 15:14 16:08","7"});
        listStringRetourExcept.add(new String[]{"m1","Rond Royal","09:42 11:05 15:15 16:09","7"});
        listStringRetourExcept.add(new String[]{"m1","Sous-Préfecture", "09:43 11:06 15:16 16:10","7"});
        listStringRetourExcept.add(new String[]{"m1","Victoire",  "05:48 06:35 07:05 07:35 07:50 08:05 08:38 09:04 10:04 10:33 11:27 12:00 12:35 13:14 13:29 13:58 14:33 15:33 16:3 17:02 17:30 18:10 18:35 19:06 19:40 20:10 20:33 21:00","7"});
        listStringRetourExcept.add(new String[]{"m1","Réservoirs","05:49 06:36 07:06 07:36 07:51 08:06 08:39 09:05 10:05 10:34 11:28 12:01 12:36 13:15 13:30 13:59 14:34 15:34 16:32 17:03 17:3 18:11 18:36 19:07 19:4 20:11 20:34 21:01","7"});
        listStringRetourExcept.add(new String[]{"m1","Carnot",    "05:50 06:37 07:07 07:37 07:52 08:07 08:40 09:06 10:06 10:35 11:29 12:02 12:37 13:16 13:3 14:00 14:35 15:35 16:33 17:04 17:32 18:12 18:37 19:08 19:42 20:12 20:35 21:02","7"});
        listStringRetourExcept.add(new String[]{"m1","La Venerie","05:51 06:38 07:08 07:38 07:54 08:08 08:41 09:07 10:07 10:36 11:30 12:03 12:38 13:17 13:32 14:01 14:36 15:36 16:34 17:05 17:33 18:13 18:38 19:09 19:43 20:13 20:36 21:03","2"});
        listStringRetourExcept.add(new String[]{"m1","Lycée Pierre d'Ailly",  "05:52 06:39 07:09 07:39 07:56 08:09 08:42 09:08 10:08 10:37 11:3 12:04 12:39 13:18 13:33 14:02 14:37 15:37 16:36 17:07 17:35 18:15 18:39 19:10 19:44 20:14 20:37 21:04","7"});
        listStringRetourExcept.add(new String[]{"m1","Lotissement du Moulin", "08:00","7"});
        listStringRetourExcept.add(new String[]{"m1","Maison de l'Europe",    "05:53 06:40 07:10 07:40 08:02 08:10 08:43 09:09 10:09 10:38 11:32 12:05 12:40 13:19 13:34 14:03 14:38 15:38 16:37 17:08 17:36 18:16 18:40 19:11 19:45 20:15 20:38 21:05","7"});
        listStringRetourExcept.add(new String[]{"m1","Bournonville",    "05:53 06:40 07:10 07:40 08:03 08:10 08:43 09:09 10:09 10:38 11:32 12:05 12:40 13:19 13:34 14:03 14:38 15:38 16:37 17:08 17:36 18:16 18:40 19:11 19:45 20:15 20:38 21:05","7"});
        listStringRetourExcept.add(new String[]{"m1","Bournonville 2",  "05:54 06:41 07:11 07:41 08:04 08:11 08:44 09:10 10:10 10:39 11:33 12:06 12:41 13:20 13:35 14:04 14:39 15:39 16:38 17:09 17:37 18:17 18:41 19:12 19:46 20:16 20:39 21:06","7"});
        listStringRetourExcept.add(new String[]{"m1","Saint-Lazare",    "05:55 06:42 07:12 07:42 08:05 08:12 08:45 09:11 10:11 10:40 11:34 12:07 12:42 13:21 13:36 14:05 14:40 15:40 16:39 17:10 17:38 18:18 18:42 19:13 19:47 20:17 20:40 21:07","7"});
        listStringRetourExcept.add(new String[]{"m1","Jacques Monod",   "05:56 06:43 07:13 07:43 08:06 08:13 08:46 09:12 10:12 10:41 11:35 12:08 12:43 13:22 13:37 14:06 14:41 15:41 16:40 17:11 17:39 18:19 18:43 19:14 19:48 20:18 20:41 21:08","2"});
        listStringRetourExcept.add(new String[]{"m1","Victor Hugo",     "05:57 06:44 07:14 07:44 08:14 08:47 09:13 10:13 10:42 11:36 12:09 12:44 13:23 13:38 14:07 14:42 15:42 16:41 17:12 17:40 18:20 18:44 19:15 19:49 20:19 20:42 21:09","2 4"});
        listStringRetourExcept.add(new String[]{"m1","Palais",    "05:59 06:46 07:16 07:46 08:16 08:49 09:15 09:45 10:15 10:44 11:08 11:38 12:11 12:46 13:25 13:40 14:09 14:44 15:18 15:44 16:12 16:43 17:14 17:42 18:22 18:46 19:17 19:51 20:21 20:44 21:11","2 4"});
        listStringRetourExcept.add(new String[]{"m1","Saint",     "06:00 06:47 07:17 07:48 08:18 08:51 09:17 09:47 10:17 10:46 11:10 11:40 12:13 12:48 13:27 13:42 14:11 14:46 15:20 15:46 16:14 16:45 17:16 17:44 18:24 18:48 19:18 19:52 20:22 20:45 21:12","6 2 4"});
        listStringRetourExcept.add(new String[]{"m1","Solférino", "06:02 06:49 07:19 07:50 08:20 08:53 09:19 09:49 10:19 10:48 11:12 11:42 12:15 12:50 13:29 13:44 14:13 14:48 15:22 15:48 16:17 16:48 17:19 17:47 18:27 18:51 19:20 19:54 20:24 20:47 21:14","2 3 4 5"});
        listStringRetourExcept.add(new String[]{"d1","Gare routière",   "06:05 06:52 07:22 07:53 08:23 08:56 09:22 09:52 10:22 10:51 11:15 11:45 12:18 12:53 13:32 13:47 14:16 14:51 15:25 15:51 16:20 16:51 17:22 17:50 18:30 18:54 19:23 19:57 20:27 20:50 21:17","2 3 4 5 6"});
    }

    public static List<String[]> GetListAllerNormal()
    {
        return listStringAllerNormal;
    }
    public static List<String[]> GetListRetourNormal()
    {
        return listStringRetourNormal;
    }
    public static List<String[]> GetListExceptionRetour()
    {
        return listStringRetourExcept;
    }

    public static Bus GetBusInfor()
    {
        return busInfor;
    }
}


