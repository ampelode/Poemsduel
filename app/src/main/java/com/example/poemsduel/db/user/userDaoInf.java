package com.example.poemsduel.db.user;

import com.example.poemsduel.plainObjects.Player;

public interface userDaoInf {

     Boolean isUserExisting();

     void updatePlayer (Player player);
}
