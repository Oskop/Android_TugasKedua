package com.mokhamadwijaya.android_tugaskedua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView gbr1 = findViewById(R.id.gbr1);
        gbr1.setOnClickListener(this);
        ImageView gbr2 = findViewById(R.id.gbr2);
        gbr2.setOnClickListener(this);
        ImageView gbr3 = findViewById(R.id.gbr3);
        gbr3.setOnClickListener(this);
        ImageView gbr4 = findViewById(R.id.gbr4);
        gbr4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gbr1:
//                Toast.makeText(getApplicationContext(), "pilihan awal", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, IntentActivity.class);
                intent.putExtra(IntentActivity.TAG_IMAGE, 0);
                intent.putExtra(IntentActivity.TAG_TITLE, 0);
                intent.putExtra(IntentActivity.TAG_DESCRIPTION, 0);
                startActivity(intent);
                break;
            case R.id.gbr2:
                Toast.makeText(getApplicationContext(), "pilihan kedua", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(this, IntentActivity.class);
                intent1.putExtra(IntentActivity.TAG_IMAGE, 1);
                intent1.putExtra(IntentActivity.TAG_TITLE, 1);
                intent1.putExtra(IntentActivity.TAG_DESCRIPTION, 1);
                startActivity(intent1);
                break;
            case R.id.gbr3:
                Toast.makeText(getApplicationContext(), "pilihan ketiga", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, IntentActivity.class);
                intent2.putExtra(IntentActivity.TAG_IMAGE, 2);
                intent2.putExtra(IntentActivity.TAG_TITLE, 2);
                intent2.putExtra(IntentActivity.TAG_DESCRIPTION, 2);
                startActivity(intent2);
                break;
            case R.id.gbr4:
                Toast.makeText(getApplicationContext(), "pilihan keempat", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(this, IntentActivity.class);
                intent3.putExtra(IntentActivity.TAG_IMAGE, 3);
                intent3.putExtra(IntentActivity.TAG_TITLE, 3);
                intent3.putExtra(IntentActivity.TAG_DESCRIPTION, 3);
                startActivity(intent3);
                break;
        }
    }
}
