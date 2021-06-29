package ucucite.edu.betterballers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BasketBall_Overview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket_ball__overview);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Overview");
    }

    public void nextpage(View view) {
        Intent intent = new Intent(this,Basketball_Equipment.class);
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