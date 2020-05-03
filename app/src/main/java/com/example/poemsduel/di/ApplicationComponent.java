package com.example.poemsduel.di;


import com.example.poemsduel.MainActivity;
import com.example.poemsduel.MainApplication;
import com.example.poemsduel.db.user.userDIModule;
import com.example.poemsduel.db.user.userDaoInf;
import com.example.poemsduel.login.RegisterActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                userDIModule.class,
        }
)

public interface ApplicationComponent  {
        void inject(RegisterActivity registerActivity);
        void inject(MainApplication mainApplication);
        void inject(MainActivity mainActivity);
}
