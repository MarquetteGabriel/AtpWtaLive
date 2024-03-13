package fr.gmarquette.aptwtalive.model;

import androidx.room.Dao;
import androidx.room.Insert;

import fr.gmarquette.aptwtalive.model.player.Profile;

@Dao
public interface ProfileDAO
{
    @Insert
    void addProfile(Profile profile);

}

