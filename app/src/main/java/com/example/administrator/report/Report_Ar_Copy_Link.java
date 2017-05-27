package com.example.administrator.report;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


/**
 * Created by Administrator on 2017/5/18.
 */

public class Report_Ar_Copy_Link extends AppCompatActivity {
    private ImageView rp_ar_co_backlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rp_ar_copy_link);
        ActivityStack.getInstance().addActivity(this);
        initView();
        viewListener();
    }
    private void viewListener() {
        rp_ar_co_backlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void initView() {
        rp_ar_co_backlink= (ImageView) findViewById(R.id.rp_co_backlink);

    }
}