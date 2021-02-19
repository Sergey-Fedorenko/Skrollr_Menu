package com.example.lessons_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView plList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       plList = findViewById(R.id.tv_pl_names);

       String[] names = {"Java", "C++", "C#", "JavaScript", "Ruby", "Rust", "Swift", "Haskell", "Matlab", "Objective C", "C", "Pyton", "ABC"};

       //Убирает надпись "Список_будет_сдесь"
       plList.setText("");

       for(String name : names) {
           plList.append(name + "\n");
       }
    }
}