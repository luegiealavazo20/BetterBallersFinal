package ucucite.edu.betterballers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Basketball_Tournaments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball__tournaments);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Basketball Tourments");
    }
    public void nextpage(View view) {
        Intent intent = new Intent(this,Basketball_Hall_of_fame.class);
        startActivity(intent);
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