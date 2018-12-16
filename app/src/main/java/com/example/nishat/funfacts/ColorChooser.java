package com.example.nishat.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Nishat on 3/11/2017.
 */

public class ColorChooser {
    String[] colors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };
    public int getColor(){
        Random random = new Random();
        int randomNumber = random.nextInt(colors.length);
        return Color.parseColor(colors[randomNumber]);
    }
}