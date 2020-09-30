package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {
    int colors[];


    Context context;
    ArrayList<String> Colors;

    public  ColorAdapter(Context context, ArrayList<String> Colors){
            this.context = context;
            this.Colors = Colors    ;
        colors =  new int[11];
        colors[0] = Color.WHITE;
        colors[1] = Color.BLUE;
        colors[2] = Color.MAGENTA;
        colors[3] = Color.RED;
        colors[4] = Color.YELLOW;
        colors[5] = Color.GREEN;
        colors[6] = Color.BLACK;
        colors[7] = Color.LTGRAY;
        colors[8] = Color.CYAN;
        colors[9] = Color.DKGRAY;
        colors[10] = Color.GRAY;




    }

    @Override
    public int getCount() {
        return Colors.size();
    }

    @Override
    public Object getItem(int i) {
        return Colors.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        TextView textView;
        if(view ==null){
          textView = new TextView(context);
          textView.setTextSize(20);
          textView.setPadding(8,8,8,8);
        }else
            textView = (TextView) view;


        textView.setText(getItem(i).toString());
        textView.setBackgroundColor(colors[i % colors.length]);
        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);


    }
}
