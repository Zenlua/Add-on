package com.tool.pif;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button updateButton = findViewById(R.id.btn_update_data);

        updateButton.setOnClickListener(v -> {
            Toast.makeText(
                    MainActivity.this,
                    "Updating data...",
                    Toast.LENGTH_SHORT
            ).show();

            Intent intent = new Intent("com.tool.pif.MANUAL_TRIGGER");
            intent.setPackage(getPackageName());

            try {
                sendBroadcast(intent);
            } catch (Exception e) {
                Toast.makeText(
                        MainActivity.this,
                        "Broadcast sending error: " + e.getMessage(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}