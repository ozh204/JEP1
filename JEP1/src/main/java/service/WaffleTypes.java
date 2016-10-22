package service;

import java.util.ArrayList;
import java.util.List;

import domain.Waffle;

public class WaffleTypes
{
    private List<Waffle> types = new ArrayList<Waffle>();
    Waffle newWaffle;

    public void initialize()
    {
        newWaffle = new Waffle("Suchy", 3.5);
        types.add(newWaffle);
        newWaffle = new Waffle("Z cukrem pudrem", 4);
        types.add(newWaffle);
        newWaffle = new Waffle("Z polewą", 5);
        types.add(newWaffle);
        newWaffle = new Waffle("Z owocami/śmietaną", 6);
        types.add(newWaffle);
        newWaffle = new Waffle("Ze śmietaną/owocami + polewą", 7.5);
        types.add(newWaffle);
        newWaffle = new Waffle("Ze śmietaną + owocami", 8.5);
        types.add(newWaffle);
        newWaffle = new Waffle("Ze śmietaną + owocami + polewą", 10);
        types.add(newWaffle);
    }

    public List<Waffle> getAllWaffles()
    {
        return types;
    }
}