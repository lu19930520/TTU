package com.example.administrator.text000.activity.edu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.administrator.text000.R;
import com.example.administrator.text000.adapter.edu.TestAdapter;
import com.example.administrator.text000.entity.edu.Person;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/27 0027.
 */
public class mainActivity extends Activity{

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mListView=new ListView(this);
        setContentView(mListView);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        //数据源
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("ZS",15));
        list.add(new Person("ZII",13));
        list.add(new Person("ZAA",21));


        TestAdapter adapter =new TestAdapter(this,list, R.layout.activity_main);
        mListView.setAdapter(adapter);
    }
}
