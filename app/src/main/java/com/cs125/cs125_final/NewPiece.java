package com.cs125.cs125_final;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewPiece extends AppCompatActivity {
    public Button newPieceSave;

    public RadioButton jacketRadioButton;
    public RadioButton sweaterRadioButton;
    public RadioButton shirtRadioButton;
    public RadioButton pantsRadioButton;
    public RadioButton shortsRadioButton;
    public RadioButton socksRadioButton;
    public RadioButton accessoriesRadioButton;

    public RadioGroup radioCategories;
    public String description;
    public String category;

    public static List<String> jacketsList = new ArrayList<String>() {{
        add("Denim Jacket");
        add("Black Bomber Jacket");
    }};
    public static List<String> sweatersList = new ArrayList<String>() {{
        add("Red Knit Sweater");
        add("White Turtle Neck Sweater");
    }};
    public static List<String> shirtsList = new ArrayList<String>() {{
        add("Tommy Hilfiger Polo");
        add("Supreme Logo T-Shirt");
    }};
    public static List<String> pantsList = new ArrayList<String>() {{
        add("Black Levi's Jeans");
        add("Dark Blue Skinny Jeans");
    }};
    public static List<String> shortsList = new ArrayList<String>() {{
        add("White Shorts");
        add("Denim Blue Shorts");
    }};
    public static List<String> socksList = new ArrayList<String>() {{
        add("Basketball Elite Socks");
        add("Supreme Logo Socks");
    }};
    public static List<String> accessoriesList = new ArrayList<String>() {{
        add("Gucci Sunglasses");
        add("Tommy Hilfiger Scarf");
    }};



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_piece);
        Log.e("View is on", "newPiece xml");

        description = "Bad Input";
        category = "";


        //get the category
        radioCategories = findViewById(R.id.radioCategories);

        jacketRadioButton = findViewById(R.id.jacketRadioButton);
        sweaterRadioButton = findViewById(R.id.sweaterRadioButton);
        shirtRadioButton = findViewById(R.id.shirtRadioButton);
        pantsRadioButton = findViewById(R.id.pantsRadioButton);
        shortsRadioButton = findViewById(R.id.shortsRadioButton);
        socksRadioButton = findViewById(R.id.socksRadioButton);
        accessoriesRadioButton = findViewById(R.id.accessoriesRadioButton);

        jacketRadioButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (jacketRadioButton.isChecked()) {
                    Log.e("Radio Button Checked", "jacket button");
                    category = "jacket";
                }
            }
        });

        sweaterRadioButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (sweaterRadioButton.isChecked()) {
                    Log.e("Radio Button Checked", "sweater button");
                    category = "sweater";
                }
            }
        });

        shirtRadioButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (shirtRadioButton.isChecked()) {
                    Log.e("Radio Button Checked", "shirt button");
                    category = "shirt";
                }
            }
        });

        pantsRadioButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (pantsRadioButton.isChecked()) {
                    Log.e("Radio Button Checked", "pants button");
                    category = "pants";
                }
            }
        });

        shortsRadioButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (shortsRadioButton.isChecked()) {
                    Log.e("Radio Button Checked", "shorts button");
                    category = "shorts";
                }
            }
        });

        socksRadioButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (socksRadioButton.isChecked()) {
                    Log.e("Radio Button Checked", "socks button");
                    category = "socks";
                }
            }
        });

        accessoriesRadioButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (accessoriesRadioButton.isChecked()) {
                    Log.e("Radio Button Checked", "accessories button");
                    category = "accessories";
                }
            }
        });


        newPieceSave = findViewById(R.id.newPieceSave);
        newPieceSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get the text that the user entered
                description = ((TextView) findViewById(R.id.editDescription)).getText().toString();
                if (description.length() == 0) {
                    description = "Bad Input";
                }

                Log.e("User input is", description);

                if (category.equals("jacket")) {
                    jacketsList.add(description);
                }

                if (category.equals("sweater")) {
                    sweatersList.add(description);
                }

                if (category.equals("shirt")) {
                    shirtsList.add(description);
                }

                if (category.equals("pants")) {
                    pantsList.add(description);
                }

                if (category.equals("shorts")) {
                    shortsList.add(description);
                }

                if (category.equals("socks")) {
                    socksList.add(description);
                }

                if (category.equals("accessories")) {
                    accessoriesList.add(description);
                }

                //go back to main activity
                Intent intent = new Intent(NewPiece.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
