package com.example.administrator.text000.netProject.edu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/26 0026.
 */

public class MainActivity extends AppCompatActivity {

    ImageView mIv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mIv=new ImageView(this);
        setContentView(mIv);


    /* 适用于 访问接口频繁 数据量小的请求访问

    1 请求网络   创建一个请求队列
                 RequestQueue
                 Volley.newRequestQueue(this);
   2.Json请求
                 1 传递和接收的参数都是Json类
                 String StringStringRequest
                 json请求
    3.图片请求


                 3.将请求放入请求队列
     */
    RequestQueue requestQueue = Volley.newRequestQueue(this);

    StringRequest request = new StringRequest(Request.Method.POST,
                    "https://www.baidu.com/",
                    new Response.Listener<String>() {

                @Override
                public void onResponse(String s) {
                    Log.e("aac","onResponse+++++"+s);
                    //取消弹框

                }
            }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError volleyError) {
            Log.e("aac","onResponse+失败");

        }
    }) {

        @Override
        protected Map<String, String> getParams() throws
                AuthFailureError {
            Map<String, String> params = new HashMap<>();
            params.put("name", "zs");
            params.put("pwd", "123456");
            return params;
        }
    };
    requestQueue.add(request);
}
}


