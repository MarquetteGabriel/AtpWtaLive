package fr.gmarquette.aptwtalive.model.season;

import java.util.HashMap;

public class Level
{
    private TournamentCategory level;
    private HashMap<TournamentCategory, HashMap<Rounds, Integer>> pointsByRank;

    public Level()
    {
        pointsByRank = new HashMap<>();
        pointsByRank();
    }

    Integer getPointsByRank(TournamentCategory tournamentLevel, Rounds round)
    {
        if(pointsByRank.containsKey(tournamentLevel) && pointsByRank.get(tournamentLevel).containsKey(round))
        {
            return pointsByRank.get(tournamentLevel).get(round);
        }

        return 0;
    }

    void pointsByRank()
    {
        for (TournamentCategory tournamentCategory : TournamentCategory.values())
        {
            HashMap<Rounds, Integer> pointsByRounds = new HashMap<>();
            switch (tournamentCategory)
            {
                case JO:
                case ATP_250:
                    pointsByRounds.put(Rounds.QUALIFIER, 0);
                    pointsByRounds.put(Rounds.R128, 0);
                    pointsByRounds.put(Rounds.R64, 0);
                    pointsByRounds.put(Rounds.R32, 0);
                    pointsByRounds.put(Rounds.R16, 25);
                    pointsByRounds.put(Rounds.QUARTER_FINALS, 50);
                    pointsByRounds.put(Rounds.SEMI_FINALS, 100);
                    pointsByRounds.put(Rounds.FINALS, 165);
                    pointsByRounds.put(Rounds.WINNER, 250);
                    pointsByRank.put(tournamentCategory, pointsByRounds);
                case ATP_500:
                    pointsByRounds.put(Rounds.QUALIFIER, 0);
                    pointsByRounds.put(Rounds.R128, 0);
                    pointsByRounds.put(Rounds.R64, 0);
                    pointsByRounds.put(Rounds.R32, 0);
                    pointsByRounds.put(Rounds.R16, 50);
                    pointsByRounds.put(Rounds.QUARTER_FINALS, 100);
                    pointsByRounds.put(Rounds.SEMI_FINALS, 200);
                    pointsByRounds.put(Rounds.FINALS, 330);
                    pointsByRounds.put(Rounds.WINNER, 500);
                    pointsByRank.put(tournamentCategory, pointsByRounds);
                case ATP_1000:
                    pointsByRounds.put(Rounds.QUALIFIER, 0);
                    pointsByRounds.put(Rounds.R128, 0);
                    pointsByRounds.put(Rounds.R64, 10);
                    pointsByRounds.put(Rounds.R32, 50);
                    pointsByRounds.put(Rounds.R16, 100);
                    pointsByRounds.put(Rounds.QUARTER_FINALS, 200);
                    pointsByRounds.put(Rounds.SEMI_FINALS, 400);
                    pointsByRounds.put(Rounds.FINALS, 650);
                    pointsByRounds.put(Rounds.WINNER, 1000);
                    pointsByRank.put(tournamentCategory, pointsByRounds);
                case ATP_GRAND_CHELEM:
                    pointsByRounds.put(Rounds.QUALIFIER, 30);
                    pointsByRounds.put(Rounds.R128, 10);
                    pointsByRounds.put(Rounds.R64, 50);
                    pointsByRounds.put(Rounds.R32, 100);
                    pointsByRounds.put(Rounds.R16, 200);
                    pointsByRounds.put(Rounds.QUARTER_FINALS, 400);
                    pointsByRounds.put(Rounds.SEMI_FINALS, 800);
                    pointsByRounds.put(Rounds.FINALS, 1300);
                    pointsByRounds.put(Rounds.WINNER, 2000);
                    pointsByRank.put(tournamentCategory, pointsByRounds);
                case ATP_FINALS:
                case DAVIS_CUP:
                case WTA_125:
                case WTA_250:
                case WTA_500:
                case WTA_1000:
                case WTA_GRAND_CHELEM:
                case WTA_FINALS:
                default:
            }
        }
    }
}
