package fr.gmarquette.aptwtalive.model.season;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;
import java.util.List;

@Entity
public class Tournament
{
    @PrimaryKey(autoGenerate = true)
    public int id;
    public Level level;
    public Date date;
    public Surfaces surface;
    public int prize;
    public String location;
    public List<Matches> draws;
    public int yearOfCreation;
    public List<String> pastChampions;
    

}
