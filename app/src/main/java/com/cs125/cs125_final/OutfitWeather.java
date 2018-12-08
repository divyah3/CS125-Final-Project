package com.cs125.cs125_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class OutfitWeather extends AppCompatActivity {
    public Button outfitMainMenu2;
    public TextView outfitDisplay2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outfit_weather);
        Log.e("View is on", "outfit_weather xml");
        outfitDisplay2 = findViewById(R.id.outfitDisplay2);
        outfitDisplay2.setText("");

        int nowTemp;
        switch (MainActivity.city){
            case 1:
                nowTemp = MainActivity.chicagoTemp;
                break;
            case 2:
                nowTemp = MainActivity.sfTemp;
                break;
            default:
                nowTemp = MainActivity.australiaTemp;
                break;
        }

        if (nowTemp < 40) {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.jacketsList.size());
            Log.e("Index is", ((Integer) index).toString());
            outfitDisplay2.append("JACKET:  " + NewPiece.jacketsList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.sweatersList.size());
            outfitDisplay2.append("SWEATER:  " + NewPiece.sweatersList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.shirtsList.size());
            outfitDisplay2.append("SHIRT:  " + NewPiece.shirtsList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.pantsList.size());
            outfitDisplay2.append("PANTS:  " + NewPiece.pantsList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.socksList.size());
            outfitDisplay2.append("SOCKS:  " + NewPiece.socksList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.accessoriesList.size());
            outfitDisplay2.append("ACCESSORY:  " + NewPiece.accessoriesList.get(index) + "\n");
        } else if (nowTemp < 50) {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.sweatersList.size());
            outfitDisplay2.append("SWEATER:  " + NewPiece.sweatersList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.shirtsList.size());
            outfitDisplay2.append("SHIRTS:  " + NewPiece.shirtsList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.pantsList.size());
            outfitDisplay2.append("PANTS:  " + NewPiece.pantsList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.socksList.size());
            outfitDisplay2.append("SOCKS:  " + NewPiece.socksList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.accessoriesList.size());
            outfitDisplay2.append("ACCESSORY:  " + NewPiece.accessoriesList.get(index) + "\n");
        } else {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.shirtsList.size());
            outfitDisplay2.append("SHIRT:  " + NewPiece.shirtsList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.shortsList.size());
            outfitDisplay2.append("SHORTS:  " + NewPiece.shortsList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.socksList.size());
            outfitDisplay2.append("SOCKS:  " + NewPiece.socksList.get(index) + "\n");

            rand = new Random();
            index = rand.nextInt(NewPiece.accessoriesList.size());
            outfitDisplay2.append("ACCESSORY:  " + NewPiece.accessoriesList.get(index) + "\n");
        }

        outfitMainMenu2 = findViewById(R.id.outfitMainMenu2);
        outfitMainMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setContentView(R.layout.outfit);
                //status = "outfit";
                Intent intent = new Intent(OutfitWeather.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
