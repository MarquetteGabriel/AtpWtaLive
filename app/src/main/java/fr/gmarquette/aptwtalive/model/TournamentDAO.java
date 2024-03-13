package fr.gmarquette.aptwtalive.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import fr.gmarquette.aptwtalive.model.season.Tournament;

@Dao
public interface TournamentDAO
{
    @Insert
    void addTournament(Tournament tournament);

    @Update
    void updateTournament(Tournament tournament);

    @Delete
    void deleteTournament(Tournament tournament);

    @Query("SELECT * FROM Tournament")
    List<Tournament> getAllTournaments();
}
