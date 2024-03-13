package fr.gmarquette.aptwtalive.model.season;

import java.util.Date;
import java.util.List;

public class Tournament
{
    public Level level;
    public Date date;
    public Surfaces surface;
    public int prize;
    public String location;
    public List<Matches> draws;
    public int yearOfCreation;
    public List<String> pastChampions;
    

}
