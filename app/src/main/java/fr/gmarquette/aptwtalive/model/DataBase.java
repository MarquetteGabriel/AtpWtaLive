package fr.gmarquette.aptwtalive.model;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import fr.gmarquette.aptwtalive.model.player.Profile;
import fr.gmarquette.aptwtalive.model.season.Tournament;

@Database(entities = {Profile.class, Tournament.class}, version = 1)
public abstract class DataBase extends RoomDatabase {
    public abstract ProfileDAO profileDao();
    public abstract TournamentDAO tournamentDAO();
}
