package edu.tacoma.uw.team6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MinhNguyen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minh_nguyen);

        TextView textView = findViewById(R.id.textView);
        textView.setText("This is Minh's Activity");
        Log.d(this.getClass().getSimpleName(), "Added a Log statement to Minh's Activity");
    }
}
