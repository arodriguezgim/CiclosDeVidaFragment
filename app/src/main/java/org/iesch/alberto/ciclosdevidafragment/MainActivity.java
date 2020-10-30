package org.iesch.alberto.ciclosdevidafragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("CICLODEVIDA", "Fragment en Activity");

        Toast.makeText(MainActivity.this,"Mensaje desde MainActivity", Toast.LENGTH_LONG ).show();
    }
}