package com.example.administrator.text000.adapter.edu;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.text000.R;
import com.example.administrator.text000.entity.edu.Person;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/9/27 0027.
 */
public class TestAdapter extends  MyBaseAdpter<Person> {


    public TestAdapter(Context mContext, ArrayList mList, int mLayoutId) {
        super(mContext, mList, mLayoutId);

    }
//渲染
    @Override
    public void putView(Holder holider, View convertView, int position, Person person) {

        TextView tvName= (TextView) convertView.findViewById(R.id.tv_name);
        TextView tvAge= (TextView) convertView.findViewById(R.id.tv_age);

        tvAge.setText(person.age+"");
        tvName.setText(person.name);
    }
}
