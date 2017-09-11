package com.doghat.emu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    @Bind(R.id.addNewEmulatorButton) Button addNewEmulatorButton;
    String[] emulators = new String[]{"gba","nes","psp", "genesis"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        gridView = (GridView) findViewById(R.id.baseGridView);
        gridView.setAdapter(new EmulatorGridAdapter(this, emulators));

        addNewEmulatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewEmulator.class);
                startActivity(intent);
            }
        });
    }
}
