package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;



import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

import android.widget.Spinner;


import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {
     View Layout;
     Spinner Spinner;
     ArrayList<String> itemColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Layout = findViewById(R.id.layout_id);
        Spinner  = findViewById(R.id.ColorSpainner);
        itemColor = new ArrayList<String>();


        itemColor.add("Pick a color");
        itemColor.add("BLUE");
        itemColor.add("MAGENTA");
        itemColor.add("RED");
        itemColor.add("YELLOW");
        itemColor.add("GREEN");
        itemColor.add("BLACK");
        itemColor.add("LIGHTGREY");
        itemColor.add("CYAN");
        itemColor.add("DRAKGREY");
        itemColor.add("GRAY");




        final BaseAdapter adapter = new ColorAdapter(this, itemColor);

        Spinner.setAdapter(adapter);



        Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                view.setBackgroundColor(Color.WHITE);

                if (Spinner.getSelectedItem().toString().equals("BLUE")){ // where chosenColor is a string
                    Layout.setBackgroundColor(Color.BLUE);
                } else if(Spinner.getSelectedItem().toString().equals("MAGENTA")){
                    Layout.setBackgroundColor(Color.MAGENTA);
                }else if(Spinner.getSelectedItem().toString().equals("RED")){
                    Layout.setBackgroundColor(Color.RED);
                }else if(Spinner.getSelectedItem().toString().equals("YELLOW")){
                    Layout.setBackgroundColor(Color.YELLOW);
                }else if(Spinner.getSelectedItem().toString().equals("GREEN")){
                    Layout.setBackgroundColor(Color.GREEN);
                }else if(Spinner.getSelectedItem().toString().equals("BLACK")){
                    Layout.setBackgroundColor(Color.BLACK);
                }else if(Spinner.getSelectedItem().toString().equals("LIGHTGREY")){
                    Layout.setBackgroundColor(Color.LTGRAY);
                }else if(Spinner.getSelectedItem().toString().equals("CYAN")){
                    Layout.setBackgroundColor(Color.CYAN);
                }else if(Spinner.getSelectedItem().toString().equals("DRAKGREY")){
                    Layout.setBackgroundColor(Color.DKGRAY);
                }else if(Spinner.getSelectedItem().toString().equals("GRAY")){
                    Layout.setBackgroundColor(Color.GRAY);
                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

}


