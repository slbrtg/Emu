package com.doghat.emu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] emulators = new String[]{"SNES","PSX","GBA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.baseGridView);
        gridView.setAdapter(new EmulatorGridAdapter(this, emulators));
    }
}
