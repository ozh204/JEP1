package service;

import java.util.ArrayList;
import java.util.List;

import domain.Waffle;

public class WaffleTypes
{
    private final List<Waffle> types = initialize();// = new ArrayList<Waffle>();
    Waffle newWaffle;

    public List<Waffle> initialize()
    {
    	List<Waffle> db = new ArrayList<Waffle>();
    	
        newWaffle = new Waffle("Suchy", 3.5);
        db.add(newWaffle);
        newWaffle = new Waffle("Z cukrem pudrem", 4);
        db.add(newWaffle);
        newWaffle = new Waffle("Z polewą", 5);
        db.add(newWaffle);
        newWaffle = new Waffle("Z owocami/śmietaną", 6);
        db.add(newWaffle);
        newWaffle = new Waffle("Ze śmietaną/owocami + polewą", 7.5);
        db.add(newWaffle);
        newWaffle = new Waffle("Ze śmietaną + owocami", 8.5);
        db.add(newWaffle);
        newWaffle = new Waffle("Ze śmietaną + owocami + polewą", 10);
        db.add(newWaffle);
        
        return db;
    }

    public List<Waffle> getAllWaffles()
    {
        return types;
    }
}