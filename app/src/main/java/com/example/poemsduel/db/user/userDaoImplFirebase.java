package com.example.poemsduel.db.user;

import com.example.poemsduel.plainObjects.Player;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

/* todo dependency injection */

public class userDaoImplFirebase implements userDaoInf {

    private FirebaseAuth auth;
    public userDaoImplFirebase(FirebaseAuth auth){
        this.auth= FirebaseAuth.getInstance();
    }
    public Boolean isUserExisting(){
        return (auth.getCurrentUser()!= null);
    }
    public void updatePlayer (Player player){

    }
   /* FirebaseDatabase.getInstance().getReference().child("games")
 .child(gameId)
 .child(row + "_" + col)
 .setValue(MY_SHAPE);
        FirebaseDatabase.getInstance().getReference().child("users").child(uid)
                                    .setValue(user);

                                     */
}
