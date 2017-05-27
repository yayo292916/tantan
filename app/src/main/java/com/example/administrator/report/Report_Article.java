package com.example.administrator.report;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/5/16.
 */

public class Report_Article extends AppCompatActivity{
    private Button rp_bt_tijiao;
    private int rp_Checked;
    private ImageView rp_ar_back;
    private EditText rp_ar_edit;
    private TextView rp_ar_ednum;
    private ImageView rp_xujia_img,rp_baoli_img,rp_bufu_img,rp_zhiliang_img,rp_mingan_img;
    private RelativeLayout rp_xujia_bt,rp_baoli_bt,rp_bufu_bt,rp_zhiliang_bt,rp_mingan_bt,rp_chaoxi_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_article_main);
        ActivityStack.getInstance().addActivity(this);
        initView();
        initChecked();
        rp_Listener();
        editeListener();
    }
    //edit字数监听
    private void editeListener(){
        rp_ar_edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                rp_ar_ednum.setText(s.length()+"/500");
            }
        });
    }
    //判断提交按钮是否应该可以被点击
    private void isButton(){
        if (rp_Checked==0){
            rp_bt_tijiao.setBackgroundResource(R.drawable.rp_button_false);
        }else{
            rp_bt_tijiao.setBackgroundResource(R.drawable.rp_button_true);
        }
    }

    private void rp_Listener() {
        rp_ar_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rp_mingan_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rp_mingan_img.getVisibility()==View.INVISIBLE) {
                    rp_mingan_img.setVisibility(View.VISIBLE);
                    rp_Checked += 1;
                    isButton();
                }
                else {
                    rp_mingan_img.setVisibility(View.INVISIBLE);
                    rp_Checked -=1;
                    isButton();
                }
            }
        });
        rp_baoli_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rp_baoli_img.getVisibility()==View.INVISIBLE) {
                    rp_baoli_img.setVisibility(View.VISIBLE);
                    rp_Checked += 1;
                    isButton();
                }
                else {
                    rp_baoli_img.setVisibility(View.INVISIBLE);
                    rp_Checked -=1;
                    isButton();
                }
            }
        });
        rp_zhiliang_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rp_zhiliang_img.getVisibility()==View.INVISIBLE) {
                    rp_zhiliang_img.setVisibility(View.VISIBLE);
                    rp_Checked += 1;
                    isButton();
                }
                else {
                    rp_zhiliang_img.setVisibility(View.INVISIBLE);
                    rp_Checked -=1;
                    isButton();
                }
            }
        });
        rp_xujia_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rp_xujia_img.getVisibility()==View.INVISIBLE) {
                    rp_xujia_img.setVisibility(View.VISIBLE);
                    rp_Checked += 1;
                    isButton();
                }
                else {
                    rp_xujia_img.setVisibility(View.INVISIBLE);
                    rp_Checked -=1;
                    isButton();
                }
            }
        });
        rp_bufu_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rp_bufu_img.getVisibility()==View.INVISIBLE) {
                    rp_bufu_img.setVisibility(View.VISIBLE);
                    rp_Checked += 1;
                    isButton();
                }
                else {
                    rp_bufu_img.setVisibility(View.INVISIBLE);
                    rp_Checked -=1;
                    isButton();
                }
            }
        });
        rp_chaoxi_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Report_Article.this,Report_Ar_Copy.class);
                startActivity(intent);
            }
        });
        rp_bt_tijiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rp_Checked==0){
                    Toast.makeText(Report_Article.this,"请至少选择一项！",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent=new Intent(Report_Article.this,Report_Ar_Dispose.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initChecked() {
        rp_mingan_img.setVisibility(View.INVISIBLE);
        rp_baoli_img.setVisibility(View.INVISIBLE);
        rp_xujia_img.setVisibility(View.INVISIBLE);
        rp_zhiliang_img.setVisibility(View.INVISIBLE);
        rp_bufu_img.setVisibility(View.INVISIBLE);
    }
    public void initView(){
        rp_ar_back= (ImageView) findViewById(R.id.rp_ar_back);
        rp_ar_edit= (EditText) findViewById(R.id.rp_ar_edit);
        rp_ar_ednum= (TextView) findViewById(R.id.rp_ar_ednum);
        rp_bt_tijiao= (Button) findViewById(R.id.rp_bt_tijiao);
        rp_baoli_bt= (RelativeLayout) findViewById(R.id.rp_baoli_bt);
        rp_xujia_bt= (RelativeLayout) findViewById(R.id.rp_xujia_bt);
        rp_zhiliang_bt= (RelativeLayout) findViewById(R.id.rp_zhiliang_bt);
        rp_bufu_bt= (RelativeLayout) findViewById(R.id.rp_bufu_bt);
        rp_mingan_bt= (RelativeLayout) findViewById(R.id.rp_mingan_bt);
        rp_chaoxi_bt= (RelativeLayout) findViewById(R.id.rp_chaoxi_bt);
        rp_baoli_img= (ImageView) findViewById(R.id.rp_baoli_img);
        rp_bufu_img= (ImageView) findViewById(R.id.rp_bufu_img);
        rp_xujia_img= (ImageView) findViewById(R.id.rp_xujia_img);
        rp_zhiliang_img= (ImageView) findViewById(R.id.rp_zhiliang_img);
        rp_mingan_img= (ImageView) findViewById(R.id.rp_mingan_img);
    }
}
