package fr.gmarquette.aptwtalive.model.player;

import java.util.Date;
import java.util.HashMap;

public class Rank
{
    public int currentRank;
    public int bestRank;
    public int points;
    public int liveRank;
    public HashMap<Date, Integer> rankByWeek;
}
