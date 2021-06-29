package ucucite.edu.betterballers;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Basketball_Variants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball__variants);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Basketball Variant");
    }
    public void nextpage(View view) {
        Intent intent = new Intent(this,Basketball_common_terms.class);
        startActivity(intent);
    }
}