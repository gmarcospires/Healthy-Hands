package com.example.appmaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_image extends AppCompatActivity {

    private int index;
    ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image2);
    imageView3 = findViewById(R.id.imageView3);


        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.basico);
       imageView3.setImageURI(uri);
       index=0;
    }

    public void prox(View view) {
            index++;
            if(index>=5){
                index=0;
            }
            if(index==0){
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.basico);
                imageView3.setImageURI(uri);
            }else if (index==1){
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.mobilidade);
                imageView3.setImageURI(uri);
            }else if (index==2){
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.pressao);
                imageView3.setImageURI(uri);
            }else if (index==3){
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.tendoes);
                imageView3.setImageURI(uri);
            }else{
                Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.pulso);
                imageView3.setImageURI(uri);
            }

    }
    public void ant(View view) {
        index--;
        if(index<=-1){
            index=4;
        }
        if(index==0){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.basico);
            imageView3.setImageURI(uri);
        }else if (index==1){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.mobilidade);
            imageView3.setImageURI(uri);
        }else if (index==2){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.pressao);
            imageView3.setImageURI(uri);
        }else if (index==3){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.tendoes);
            imageView3.setImageURI(uri);
        }else{
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.pulso);
            imageView3.setImageURI(uri);
        }
    }
    public void egg(View view) {
        Intent intent = new Intent(this, egg.class);
        startActivity(intent);
    }
}