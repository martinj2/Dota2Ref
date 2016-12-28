package com.example.jenniemartin.dota2ref;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    private Button resetButton;

    private static final String SETTINGS_RESET_CLICKED = "com.example.jenniemartin.dota2ref.settings_reset_clicked";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        resetButton = (Button) findViewById(R.id.resetButton);

        Intent i2 = getIntent();

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                Intent boolIntent = new Intent(SettingsActivity.this, BestGameActivity.class);
                boolIntent.putExtra(SETTINGS_RESET_CLICKED, true);
                setResult(RESULT_OK, boolIntent);

            }
        });


    }

    public static boolean wasSettingsResetClicked(Intent result){
        return result.getBooleanExtra(SETTINGS_RESET_CLICKED, false);
    }

}
