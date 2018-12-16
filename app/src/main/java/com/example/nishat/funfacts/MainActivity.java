package com.example.nishat.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView fact;
    private Button showAnotherFact;
    private FactBook factBook = new FactBook();
    private ColorChooser colorChooser = new ColorChooser();
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fact = (TextView) findViewById(R.id.fact);
        showAnotherFact = (Button) findViewById(R.id.showAnotherFact);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);

        showAnotherFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = colorChooser.getColor();
                fact.setText(factBook.getFact());
                relativeLayout.setBackgroundColor(color);
                showAnotherFact.setTextColor(color);
            }
        });
    }
}
