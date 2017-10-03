package fr.intech.vutuantrung.android.busstop;


public class Bus
{
    ArretTime premierAller;
    ArretTime premierRetour;

    public Bus() {
        premierAller = null;
        premierRetour = null;
    }

    public void InsererAllArretTime(String[] inforBusArretTime, int direction){
        if(direction == 1)
        {
            ArretTime iterator = premierAller;
            if(iterator == null)
            {
                premierAller = new ArretTime(inforBusArretTime[1], inforBusArretTime[2], null);
            }
            else
            {
                while(iterator.suivant != null)
                    iterator = iterator.suivant;
                iterator.suivant = new ArretTime(inforBusArretTime[1],inforBusArretTime[2], null);
            }
        }
        else
        {
            ArretTime iterator = premierRetour;
            if(iterator == null)
            {
                premierRetour = new ArretTime(inforBusArretTime[1], inforBusArretTime[2], null);
            }
            else
            {
                while(iterator.suivant != null)
                    iterator = iterator.suivant;
                iterator.suivant = new ArretTime(inforBusArretTime[1],inforBusArretTime[2], null);
            }
        }
    }

    public ArretTime SearchNameArret(String name, int direction) {
        if(direction == 1)
        {
            ArretTime iterator = premierAller;
            while(iterator.suivant != null)
            {
                if(iterator.getName().equals(name))
                    return iterator;
                iterator = iterator.suivant;
            }
        }
        else
        {
            ArretTime iterator = premierRetour;
            while(iterator.suivant != null)
            {
                if(iterator.getName().equals(name))
                    return iterator;
                iterator = iterator.suivant;
            }
        }
        return null;
    }

    public void ChangeTimeArret(String nameArret, String timeArret, int direction) {
        ArretTime iterator = null;
        if(direction == 1)
            iterator = premierAller;
        else
            iterator = premierRetour;
        while (!iterator.getName().equals(nameArret))
            iterator = iterator.suivant;
        iterator.setTimeString(timeArret);
    }

    public ArretTime GetAller()
    {
        return premierAller;
    }
    public ArretTime GetRetour()
    {
        return premierRetour;
    }
}
