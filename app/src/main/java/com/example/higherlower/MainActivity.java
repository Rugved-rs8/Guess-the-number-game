package com.example.higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    public void gererateRandomNo(){
        Random rand = new Random();
        n=rand.nextInt(20)+1;
    }
    public void func1(View view){

        EditText editText=(EditText) findViewById(R.id.editText);
        Log.i("ENTERED",editText.getText().toString());
        Log.i("RANDOM",Integer.toString(n));
        int en=Integer.parseInt(editText.getText().toString());
        if(en==n){
            Toast.makeText(this,"YOU GOT IT BITCH!!\nTRY AGAIN.",Toast.LENGTH_SHORT).show();
            gererateRandomNo();
        }
        else if(en<n){
            Toast.makeText(this," GO HIGHER",Toast.LENGTH_SHORT).show();
        }
        else if(en>n){
            Toast.makeText(this,"GO LOWER",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gererateRandomNo();
    }
}
