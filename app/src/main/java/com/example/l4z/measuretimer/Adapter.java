package com.example.l4z.measuretimer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by l4z on 25.09.2017.
 */

public class Adapter extends ArrayAdapter<Item>{

    public Adapter(Activity context, ArrayList<Item> items) {

        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Item currentItem = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_view);
        nameTextView.setText(currentItem.getName());
        return listItemView;
    }
}
