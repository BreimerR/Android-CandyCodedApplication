package com.pluralsight.candycoded;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    public String MAP_URL = "geo:0,0?q=618 E South St Orlando, FL 32801";
    public String MAP_PACKAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Uri uri = Uri
                .parse("android.resource://com.codeschool.candycoded/" + R.drawable.store_front);
        ImageView candyStoreImageView = (ImageView) findViewById(R.id.image_view_candy_store);
        Picasso.with(this).
                load(uri).
                       into(candyStoreImageView);


    }

    // ***
    // TODO - Task 2 - Launch the Google Maps Activity
    // ***

    void createMapIntent(View view) {
        // create uri

        Uri uri = Uri.parse(MAP_URL);

        Intent intent = new Intent();
        intent.setPackage(MAP_PACKAGE);

        if (intent.resolveActivity(getPackageManager()) != null) {

        }
    }

    // ***
    // TODO - Task 3 - Launch the Phone Activity
    // ***
}
