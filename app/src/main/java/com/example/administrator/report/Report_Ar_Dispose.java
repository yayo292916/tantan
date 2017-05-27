package com.example.administrator.report;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


/**
 * Created by Administrator on 2017/5/16.
 */

public class Report_Ar_Dispose extends AppCompatActivity {
    private ImageView rp_ar_di_back;
    private Button rp_sure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rp_article_dispose);
        ActivityStack.getInstance().addActivity(this);
        initView();
        viewListener();

    }

    private void viewListener() {
        rp_ar_di_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rp_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityStack.getInstance().finishAllActivity();
            }
        });

    }

    private void initView() {
        rp_sure= (Button) findViewById(R.id.rp_sure);
        rp_ar_di_back= (ImageView) findViewById(R.id.rp_ar_di_back);
    }


}