package com.slinph.ihelmet.savelisttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");

        spUtils.putStrListValue(this,"list",strings);
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<String> list = spUtils.getStrListValue(this, "list");
        //String s = list.toString();
        Log.e("打印list[0]",list.get(0));
        Log.e("打印list[1]",list.get(1));
    }
}
