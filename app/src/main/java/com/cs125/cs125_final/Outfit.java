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

public class Outfit extends AppCompatActivity {
    public Button outfitMainMenu;
    public TextView outfitDisplay;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outfit);
        Log.e("View is on", "outfit xml");
        outfitDisplay = findViewById(R.id.outfitDisplay);
        outfitDisplay.setText("");


        if (CreateOutfit.jacketIsTrue && NewPiece.jacketsList.size() != 0) {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.jacketsList.size());
            Log.e("Index is", ((Integer) index).toString());
            outfitDisplay.append("JACKET:  " + NewPiece.jacketsList.get(index) + "\n");
        }

        if (CreateOutfit.sweaterIsTrue && NewPiece.sweatersList.size() != 0) {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.sweatersList.size());
            outfitDisplay.append("SWEATER:  " + NewPiece.sweatersList.get(index) + "\n");
        }

        if (CreateOutfit.shirtIsTrue && NewPiece.shirtsList.size() != 0) {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.shirtsList.size());
            outfitDisplay.append("SHIRT:  " + NewPiece.shirtsList.get(index) + "\n");
        }

        if (CreateOutfit.pantsIsTrue && NewPiece.pantsList.size() != 0) {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.pantsList.size());
            outfitDisplay.append("PANTS:  " + NewPiece.pantsList.get(index) + "\n");
        }

        if (CreateOutfit.shortsIsTrue && NewPiece.shortsList.size() != 0) {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.shortsList.size());
            outfitDisplay.append("SHORTS:  " + NewPiece.shortsList.get(index) + "\n");
        }

        if (CreateOutfit.socksIsTrue && NewPiece.socksList.size() != 0) {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.socksList.size());
            outfitDisplay.append("SOCKS:  " + NewPiece.socksList.get(index) + "\n");
        }

        if (CreateOutfit.accessoriesIsTrue && NewPiece.accessoriesList.size() != 0) {
            Random rand = new Random();
            int index = rand.nextInt(NewPiece.accessoriesList.size());
            outfitDisplay.append("ACCESSORY:  " + NewPiece.accessoriesList.get(index) + "\n");
        }

        outfitMainMenu = findViewById(R.id.outfitMainMenu);
        outfitMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setContentView(R.layout.outfit);
                //status = "outfit";
                Intent intent = new Intent(Outfit.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
