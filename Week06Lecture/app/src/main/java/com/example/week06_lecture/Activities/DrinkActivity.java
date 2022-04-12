package com.example.week06_lecture.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.week06_lecture.Model.Drink;
import com.example.week06_lecture.R;
import com.example.week06_lecture.Service.DrinkService;

public class DrinkActivity extends AppCompatActivity {

    ImageView imgDrink;
    TextView tvDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        Intent i = getIntent();
        Drink item = (Drink) i.getSerializableExtra(DrinkService.EXTRA_DRINK);

        init_UI();

        imgDrink.setImageDrawable(getDrawable(item.getImageResourceID()));
        tvDescription.setText(item.getDescription());
    }

    private void init_UI() {
        imgDrink = (ImageView) findViewById(R.id.imgDrink);
        tvDescription = (TextView) findViewById(R.id.tvDescription);
    }
}