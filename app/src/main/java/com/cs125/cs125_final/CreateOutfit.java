package com.cs125.cs125_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class CreateOutfit extends AppCompatActivity {
    public Button createOutfitGen;
    public CheckBox cbJacket, cbSweater, cbShirt, cbPants, cbShorts, cbSocks, cbAccessories;
    public static boolean jacketIsTrue, sweaterIsTrue, shirtIsTrue, pantsIsTrue, shortsIsTrue, socksIsTrue, accessoriesIsTrue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_outfit);
        Log.e("View is on", "create outfit xml");
        jacketIsTrue = false;
        sweaterIsTrue = false;
        shirtIsTrue = false;
        pantsIsTrue = false;
        shortsIsTrue = false;
        socksIsTrue = false;
        accessoriesIsTrue = false;



        cbJacket = findViewById(R.id.cbJacket);
        cbJacket.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (cbJacket.isChecked()) {
                    Log.e("Jacket Checked", "Jacket checkbox");
                    jacketIsTrue = true;
                } else {
                    jacketIsTrue = false;
                }
            }
        });

        cbSweater = findViewById(R.id.cbSweater);
        cbSweater.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (cbSweater.isChecked()) {
                    Log.e("Sweater Checked", "Sweater checkbox");
                    sweaterIsTrue = true;
                } else {
                    sweaterIsTrue = false;
                }
            }
        });

        cbShirt = findViewById(R.id.cbShirt);
        cbShirt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (cbShirt.isChecked()) {
                    Log.e("Shirt Checked", "shirt checkbox");
                    shirtIsTrue = true;
                } else {
                    shirtIsTrue = false;
                }
            }
        });

        cbPants = findViewById(R.id.cbPants);
        cbPants.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (cbPants.isChecked()) {
                    Log.e("Pants Checked", "Pants checkbox");
                    pantsIsTrue = true;
                } else {
                    pantsIsTrue = false;
                }
            }
        });

        cbShorts = findViewById(R.id.cbShorts);
        cbShorts.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (cbShorts.isChecked()) {
                    Log.e("Shorts Checked", "Shorts checkbox");
                    shortsIsTrue = true;
                } else {
                    shortsIsTrue = false;
                }
            }
        });

        cbSocks = findViewById(R.id.cbSocks);
        cbSocks.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (cbSocks.isChecked()) {
                    Log.e("Socks Checked", "Socks checkbox");
                    socksIsTrue = true;
                } else {
                    socksIsTrue = false;
                }
            }
        });

        cbAccessories = findViewById(R.id.cbAccessories);
        cbAccessories.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (cbAccessories.isChecked()) {
                    Log.e("Accessories Checked", "accessories checkbox");
                    accessoriesIsTrue = true;
                } else {
                    accessoriesIsTrue = false;
                }
            }
        });

        createOutfitGen = findViewById(R.id.createOutfitGen);
        createOutfitGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //setContentView(R.layout.outfit);
                //status = "outfit";

                Intent intent = new Intent(CreateOutfit.this,
                        Outfit.class);
                startActivity(intent);
            }
        });
    }
}
