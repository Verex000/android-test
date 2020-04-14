package edu.tacoma.uw.team6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SeanSmith extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sean_smith);
        Log.d(this.getClass().getSimpleName(), "Kevin Edited Sean Smiths activity");
    }
}
