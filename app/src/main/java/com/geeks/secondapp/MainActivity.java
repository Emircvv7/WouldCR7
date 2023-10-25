package com.geeks.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView = findViewById(R.id.card_view);
        cardView.setBackgroundResource(R.drawable.bg_card_view);

        Button buttonOne = findViewById(R.id.btn_one);

        buttonOne.setOnClickListener(view -> {
            //обработка клика
            if (cardView.getAlpha() == 0) {
                cardView.animate().alpha(1);
            } else {
                cardView.animate().alpha(0);
            }
        });

        View view = findViewById(R.id.view_triangle);

        LinearLayout container = findViewById(R.id.container);


        view.setOnClickListener(view1 -> {
            if (container.getVisibility() == View.VISIBLE){
                container.setVisibility(View.GONE);
            }else {
                container.setVisibility(View.VISIBLE);
            }
        });

        Button buttonCircle =findViewById(R.id.btn_circle);

        EditText editText= findViewById(R.id.edit_text);


        buttonCircle.setOnClickListener(view12 -> {
            Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}