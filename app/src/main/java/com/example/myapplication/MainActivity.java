package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView surname_name = findViewById(R.id.surname_name);
        final TextView group = findViewById(R.id.group);
        final ImageButton ok_button = findViewById(R.id.ok_button);

        ok_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                surname_name.setText("Кирилюк Ольга Олександрівна");
                group.setText("Група - ІПЗс-19-1");
            }
        });
    }
}