package sg.edu.rp.c346.id19018582.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvColour;
    ArrayList<Box> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvColour = findViewById(R.id.listViewColour);
        alBoxList = new ArrayList<>();

        //add to ArrayList
        Box item1 = new Box("blue");
        alBoxList.add(item1);

        Box item2= new Box("orange");
        alBoxList.add(item2);

        alBoxList.add(new Box("brown"));

        //initialize CustomAdapter to connect it to ListView
        caBox = new CustomAdapter(this, R.layout.row, alBoxList);
        lvColour.setAdapter(caBox);
    }
}
