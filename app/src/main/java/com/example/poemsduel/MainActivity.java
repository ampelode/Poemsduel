package com.example.poemsduel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

//import com.example.poemsduel.db.user.userDao;
import com.example.poemsduel.db.user.userDaoInf;
import com.example.poemsduel.login.RegisterActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    userDaoInf userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        ((MainApplication) getApplication()).getApplicationComponent().inject(this);

      if (userDao.isUserExisting()){
          startActivity(new Intent(this, RegisterActivity.class));
      }
    }

    public void showActionFromButton(View view) {

    }

    public void setFightReady(View view) {

    }
}
