package com.oktydeniz.flyingfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        TextView score = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button);

        score.setText("Score : " + FlyingFishView.score);
        button.setOnClickListener(v -> {
            startActivity(new Intent(GameOverActivity.this, MainActivity.class));
            finish();
        });
    }
}