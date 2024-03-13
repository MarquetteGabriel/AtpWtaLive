package fr.gmarquette.aptwtalive.model.season;

import java.time.LocalDateTime;

import fr.gmarquette.aptwtalive.model.player.Profile;
import fr.gmarquette.aptwtalive.model.statistics.Stats;

public class Matches
{
    public Profile playerOne;
    public Profile playerTwo;
    public String arbitre;
    public Rounds round;
    public String stadium;
    public LocalDateTime date;
    public boolean alreadyPlayed;
    public int duration; // in minutes
    public Score score;
    public Stats statistics;

    public Matches(Profile playerOne, Profile playerTwo, String arbitre, Rounds round, String stadium, LocalDateTime date)
    {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.arbitre = arbitre;
        this.round = round;
        this.stadium = stadium;
        this.date = date;
        if(isAlreadyPlayed(date))
        {
            this.duration = 0;
            this.score = new Score();
            this.statistics = new Stats();
        }
    }

    boolean isAlreadyPlayed(LocalDateTime date)
    {
        return date.isAfter((LocalDateTime.now()));
    }



}



