package com.example.cellfin_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;

    int[][] icon= {{R.drawable.first1,
            R.drawable.first2,
            R.drawable.first3,
            R.drawable.first4},
            {       R.drawable.first5,
                    R.drawable.first6,
                    R.drawable.first7,
                    R.drawable.first8},
            {
                    R.drawable.first9,
                    R.drawable.first10,
                    R.drawable.first11,
                    R.drawable.first12}
    };
    String[][] text={{"Profile","View","Assignment","Upload"},{"Skill","Method","Presentaion","Attendence"},{"Quiz","Software","Camera","Nothing"}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle=(RecyclerView) findViewById(R.id.rec1);

       recycle.setLayoutManager(new LinearLayoutManager(this));
       MyAdapter adapt = new MyAdapter(icon,text,this);
       recycle.setAdapter(adapt);

    }
}