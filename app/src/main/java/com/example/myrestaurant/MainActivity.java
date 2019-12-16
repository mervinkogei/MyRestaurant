package com.example.myrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.myrestaurant.R.id.findRestaurantsButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView (R.id.locationEditText) EditText mLocationEditText;
    @BindView (R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        mFindRestaurantButton = (Button)findViewById(R.id.findRestaurantsButton);
//        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
//
        mFindRestaurantsButton.setOnClickListener(this);

        }
            @Override
            public void onClick(View v) {
                if (v == mFindRestaurantsButton) {
                    String location = mLocationEditText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                    intent.putExtra("location", location);
                    startActivity(intent);
                }
            }
}
