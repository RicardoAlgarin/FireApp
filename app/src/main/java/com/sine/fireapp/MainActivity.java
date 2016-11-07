package com.sine.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button mSendData;
    private Firebase mRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(this);
        mRef = new Firebase("https://fireapp-e711d.firebaseio.com/");

        mSendData = (Button) findViewById(R.id.mSendData);

        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Firebase mRefChild = mRef.child("Name");
                    mRef.setValue("Hola");
            }
        });




    }
}
