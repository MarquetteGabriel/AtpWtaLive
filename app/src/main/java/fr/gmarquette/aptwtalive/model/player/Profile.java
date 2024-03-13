package fr.gmarquette.aptwtalive.model.player;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Profile
{
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String name;
    public String firstName;
    public int profilePicture;
    public float age;
    public Date birthDate;
    public String birthPlace;
    public String nationality;
    public int height;
    public int weight;
    public Plays plays;
    public String coach;
    public Career career;

}
