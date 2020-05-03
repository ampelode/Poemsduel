package com.example.poemsduel.login;

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import static android.text.TextUtils.isEmpty;
import android.util.Patterns;
import android.widget.Toast;
import static android.widget.Toast.LENGTH_SHORT;
import android.util.Log;


import com.example.poemsduel.MainActivity;
import com.example.poemsduel.MainApplication;
import com.example.poemsduel.R;
import com.example.poemsduel.databinding.ActivityRegisterBinding;
import com.example.poemsduel.db.user.userDaoInf;
import com.example.poemsduel.plainObjects.Player;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Inject;

public class RegisterActivity extends AppCompatActivity {

    private static final String LOG_TAG = "RegisterActivity";
    @Inject
    userDaoInf userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        ActivityRegisterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_register);

        ((MainApplication) getApplication()).getApplicationComponent().inject(this);



        String email = binding.editTextMail.getText().toString();
        String password = binding.textViewPassword.getText().toString();
        if (isEmpty(email) || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Enter correct email", LENGTH_SHORT).show();
            return;
        }
        if (password.length() < 6) {
            Toast.makeText(this, "Password should have at least 6 characters", LENGTH_SHORT).show();
            return;
        }

     /*  auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Log.d(LOG_TAG, "loginWithEmail: ");
                            String uid = auth.getCurrentUser().getUid();
                            Player user = new Player(false, false, auth.getCurrentUser().getUid(), 0,
                                    false, false, true);
                            FirebaseDatabase.getInstance().getReference().child("users").child(uid)
                                    .setValue(user);
                            Toast.makeText(this, "you have been corrected registered", LENGTH_SHORT).show();
                            startActivity(new Intent(this, MainActivity.class));

                        }


                    });*/


        }

    }



