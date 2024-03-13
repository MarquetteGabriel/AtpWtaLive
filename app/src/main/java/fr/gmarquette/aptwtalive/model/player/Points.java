package fr.gmarquette.aptwtalive.model.player;

import java.util.Date;

import fr.gmarquette.aptwtalive.model.season.Level;
import fr.gmarquette.aptwtalive.model.season.Rounds;
import fr.gmarquette.aptwtalive.model.season.Tournament;

public class Points
{
    public Date date;
    public Tournament tournament;
    public Rounds round; // Surement possible via le tournoi lui-même
    public Level pts;
    public Date dropDate;
}
