package com.example.poemsduel.db.user;

import com.google.firebase.auth.FirebaseAuth;

import dagger.Module;
import dagger.Provides;

@Module
public class userDIModule {
    @Provides
    userDaoInf providesUserDao(){
        return new userDaoImplFirebase(FirebaseAuth.getInstance());

        // what if no connection?
    }

}
