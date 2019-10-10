package com.mokhamadwijaya.android_tugaskedua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    public static final String TAG_IMAGE = "tag_image";
    public static final String TAG_TITLE = "tag_title";
    public static final String TAG_DESCRIPTION = "tag_description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        ImageView img = findViewById(R.id.imgContainer);
        img.setImageResource(Data.image[getIntent().getIntExtra(TAG_IMAGE,0)]);
        TextView title = findViewById(R.id.nama);
        title.setText(Data.title[getIntent().getIntExtra(TAG_TITLE, 0)]);
        TextView description = findViewById(R.id.penjelasan);
        description.setText(Data.description[getIntent().getIntExtra(TAG_DESCRIPTION, 0)]);

    }


}
