package com.example.appmaos;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class egg extends AppCompatActivity {
    private int index;
    ImageView imageView33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg);
        imageView33 = findViewById(R.id.imageView33);


        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggbasic);
        imageView33.setImageURI(uri);
        index=0;
        setTitle(R.string.eggT);
    }

    public void prox(View view) {
        index++;
        if(index>=7){
            index=0;
        }
        if(index==0){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggbasic);
            imageView33.setImageURI(uri);
        }else if (index==1){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggdemonblackflare);
            imageView33.setImageURI(uri);
        }else if (index==2){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggdragonflame);
            imageView33.setImageURI(uri);
        }else if (index==3){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggearthflash);
            imageView33.setImageURI(uri);
        }else if (index==4){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggicewhale);
            imageView33.setImageURI(uri);
        }else if (index==5){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggfireball);
            imageView33.setImageURI(uri);
        }else if (index==6){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggtwindragon);
            imageView33.setImageURI(uri);
        }else{
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggchidori);
            imageView33.setImageURI(uri);
        }

    }
    public void ant(View view) {
        index--;
        if(index<=-1){
            index=7;
        }
        if(index==0){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggbasic);
            imageView33.setImageURI(uri);
        }else if (index==1){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggdemonblackflare);
            imageView33.setImageURI(uri);
        }else if (index==2){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggdragonflame);
            imageView33.setImageURI(uri);
        }else if (index==3){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggearthflash);
            imageView33.setImageURI(uri);
        }else if (index==4){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggicewhale);
            imageView33.setImageURI(uri);
        }else if (index==5){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggfireball);
            imageView33.setImageURI(uri);
        }else if (index==6){
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggtwindragon);
            imageView33.setImageURI(uri);
        }else{
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.eggchidori);
            imageView33.setImageURI(uri);
        }
    }
}
