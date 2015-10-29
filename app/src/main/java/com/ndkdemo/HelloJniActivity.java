package com.ndkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by sunwei on 2015/10/29.
 * Email: lx_sunwei@163.com.
 * Description:
 */
public class HelloJniActivity extends AppCompatActivity {

    private TextView mTvHelloJni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_jni);

        mTvHelloJni = (TextView) findViewById(R.id.tv_hellJni);
        mTvHelloJni.setText(stringFromJNI());
    }

    public native String stringFromJNI();

    static {
        System.loadLibrary("hello-jni");
    }
}
