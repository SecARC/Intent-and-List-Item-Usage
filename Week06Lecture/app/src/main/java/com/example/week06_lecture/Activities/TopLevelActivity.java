package com.example.week06_lecture.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.week06_lecture.R;

public class TopLevelActivity extends AppCompatActivity {

    ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        init_UI();
    }

    private void init_UI() {
        listView1 = (ListView) findViewById(R.id.listView1);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object clickedItem = listView1.getItemAtPosition(position);
                switch (position){
                    case 0: // Food
                        break;
                    case 1: // Drink
                        Intent i = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                        startActivity(i);
                        break;
                    case 2: // Store
                        break;
                    default:
                        break;
                }
            }
        });
    }
}