package com.java.log_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

        private Button bottom;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            bottom = findViewById(R.id.bottom);
            bottom.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    link();
                }
            });

        }
            public void link() {
            Intent intent = new Intent(this, link.class);
            startActivity(intent);
            }
        }

