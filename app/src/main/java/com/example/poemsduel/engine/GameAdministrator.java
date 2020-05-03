package com.example.poemsduel.engine;

import com.example.poemsduel.plainObjects.Game;
import com.example.poemsduel.plainObjects.Player;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.ArrayList;



/**
 *looks of two players for a game can be found. If players are found, a game will be started
 *
 *
 *
 * Database structure
 * user
 *  - isFightReady
 *  - isFriendlyReady
 *  - uid
 *  - strength
 * - is playing
 *  is spectating
 *  isActive

 *
 *  getAllUsers where isFightReady, is not playing, is not spectating, islogged.
 *  pick Users randomly on the client
 *

 * game
 * - gamieID
 *  - user1
 *  - user 2
 *  - spectators???
 *  - actualtextcontent
 *  - TextID
 *  - actual rating
 *  - score user 1
 *  - score user 2
 *  - isFight
 *  - isFriendly
 *  - isdone
 *
 *
 *  text
 *      - user1
 *      - user 2
 *   - score
 *   - textid
 *   - textcontent
 *
 *   SEARCH
 *
 *   REQUEST
 *   show profile/history player
 *   get the best texts **
 *   get the best players **
 *   update running game
 *   get games from players**
 *   pick players **
 *
 *   spectator increases actual rating -> DB -> push on clients. Is actual rating enough high. line is closeable-> push to user
 *   actual rating enough -> user accept line -> reset actual score in DB
 *   Time is over -> delete line in DB -> push Text on spectators and users -> change User
 FirebaseDatabase.getInstance().getReference().child("games")
 .child(gameId)
 .child(row + "_" + col)
 .setValue(MY_SHAPE);

 Player set itself as fight ready
 *
 */
public class GameAdministrator {

    void pushFightGameIsStarted(Game game){
        updateGame(game);
    }
    void pushTextFromGame(Game game){
        updateGame(game);
    }
    void pushRating(Game game){
        updateGame(game);
    }
    void updateGame(Game game){
    }






}
