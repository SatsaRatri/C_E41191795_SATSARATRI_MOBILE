package com.example.minggu6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonPindahActivity, buttonKirimData, buttonPindahMaps, buttonCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPindahActivity = findViewById(R.id.buttonPindahActivity);
        buttonPindahActivity.setOnClickListener(this);

        buttonKirimData = findViewById(R.id.buttonKirimData);
        buttonKirimData.setOnClickListener(this);

        buttonPindahMaps = findViewById(R.id.buttonPindahMaps);
        buttonPindahMaps.setOnClickListener(this);

        buttonCall = findViewById(R.id.buttonCall);
        buttonPindahMaps.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonPindahActivity:
                Intent intentPindahActivity = new Intent(this, PindahActivity.class);
                startActivity(intentPindahActivity);
                break;

            case R.id.buttonKirimData:
                Intent intentKirimData= new Intent(this,ForResultActivity.class);
                intentKirimData.putExtra("extra_name", "Politeknik Negeri Jember");
                intentKirimData.putExtra("extra_umur", 40);
                startActivity(intentKirimData);
                break;

            case R.id.buttonPindahMaps:
                Intent intentPindahMaps= new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-8.2755701,113.6407981"));
                startActivity(intentPindahMaps);
                break;

            case R.id.buttonCall:
                Intent intentCall= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081339011430"));
                startActivity(intentCall);
                break;

        }


}
}