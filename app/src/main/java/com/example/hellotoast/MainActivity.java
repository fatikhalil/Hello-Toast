package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Variable pour garder la valeur du compteur
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lier les éléments UI avec leurs IDs
        Button btnToast = findViewById(R.id.btn_toast);
        Button btnIncrement = findViewById(R.id.btn_increment);
        TextView tvCounter = findViewById(R.id.tv_counter);

        // Action pour le bouton 'Show Toast'
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Afficher un toast
                Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
            }
        });

        // Action pour le bouton 'Increment'
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Incrémenter la variable et afficher la nouvelle valeur dans le TextView
                counter++;
                tvCounter.setText(String.valueOf(counter));
            }
        });
    }
}