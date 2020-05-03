package com.example.poemsduel;

import android.app.Application;

import com.example.poemsduel.db.user.userDIModule;
import com.example.poemsduel.di.ApplicationComponent;
import com.example.poemsduel.di.DaggerApplicationComponent;


public class MainApplication extends Application {
    private ApplicationComponent component;
    @Override public void onCreate() {
        super.onCreate();
        inject();
    }
    private void inject(){
        component = DaggerApplicationComponent.builder()
                .userDIModule(new userDIModule())
                .build();
      component.inject(this);


    }
    public ApplicationComponent getApplicationComponent(){
        return component;
    }

}