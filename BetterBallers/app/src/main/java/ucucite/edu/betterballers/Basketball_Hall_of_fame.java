package ucucite.edu.betterballers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Basketball_Hall_of_fame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball__hall_of_fame);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Basketball Hall of Fame");
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, R.anim.nothing);
        Intent intent = new Intent(this, BetterBallersList.class);
        startActivity(intent);
    }
}