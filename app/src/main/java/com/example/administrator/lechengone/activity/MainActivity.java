package com.example.administrator.lechengone.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.lechengone.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private List<String> dataList=new ArrayList<>();
    private ArrayAdapter<String> adapter;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initAdapter();
        lv.setAdapter(adapter);
    }

    private void initAdapter() {
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,dataList);
    }

    private void initData() {

        for (int i = 0; i < 100; i++) {
            dataList.add("第"+i+"个条目");
        }
    }

    private void initView() {
        lv= (ListView) findViewById(R.id.lv);
    }
}
