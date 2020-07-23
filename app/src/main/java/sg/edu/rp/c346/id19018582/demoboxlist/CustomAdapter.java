package sg.edu.rp.c346.id19018582.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;

    public CustomAdapter(Context context, int resource, ArrayList<Box> objects){
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        ImageView ivColour = rowView.findViewById(R.id.imageViewColour);
        // Obtain the Android Version information based on the position
        Box currentItem = boxList.get(position);




        if (currentItem.getColour()== "blue") {
            ivColour.setImageResource(R.drawable.blue_box);
        } else if (currentItem.getColour() == "orange" ||
                currentItem.getColour() == "Orange") {
            ivColour.setImageResource((R.drawable.orange_box));
        } else if (currentItem.getColour() == "brown" ||
                currentItem.getColour() == "Brown") {
            ivColour.setImageResource((R.drawable.brown_box));
        } else {
            ivColour.setImageResource(R.drawable.ic_launcher_foreground);
        }

        return rowView;
    }
}
