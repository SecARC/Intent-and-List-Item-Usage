package com.example.week06_lecture.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.week06_lecture.Model.Drink;
import com.example.week06_lecture.R;
import com.example.week06_lecture.Service.DrinkService;

public class DrinkCategoryActivity extends AppCompatActivity {

    ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        init_UI();

        ArrayAdapter<Drink> adapter = new ArrayAdapter<Drink>(this,R.layout.drink_list_item, R.id.textView, DrinkService.getDrinks());
        listView1.setAdapter(adapter);
    }

    private void init_UI() {
        listView1 = (ListView) findViewById(R.id.listView1);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drink clickedItem = (Drink) listView1.getItemAtPosition(position);

                Intent i = new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
                i.putExtra(DrinkService.EXTRA_DRINK, clickedItem);

                startActivity(i);
            }
        });
    }
}