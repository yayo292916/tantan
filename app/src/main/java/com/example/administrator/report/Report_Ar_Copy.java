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
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/5/16.
 */

public class Report_Ar_Copy extends AppCompatActivity{
    private Button rp_bt_co_tijiao;
    private EditText rp_ar_co_edit,rp_ar_co_editlink;
    private TextView whatGetLink,rp_ar_co_ednum;
    private ImageView rp_ar_co_back;
    private Boolean rp_co_isCheck=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rp_article_copy);
        ActivityStack.getInstance().addActivity(this);
        initView();
        viewListener();
        editeListener();
    }
    private void viewListener() {

        whatGetLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Report_Ar_Copy.this,Report_Ar_Copy_Link.class);
                startActivity(intent);
            }
        });
        rp_ar_co_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        rp_bt_co_tijiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rp_co_isCheck==false){
                    Toast.makeText(Report_Ar_Copy.this,"请先输入原文链接！",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent=new Intent(Report_Ar_Copy.this,Report_Ar_Dispose.class);
                    startActivity(intent);
                }
            }
        });

    }

    private void initView() {
        rp_ar_co_editlink= (EditText) findViewById(R.id.rp_ar_co_editlink);
        rp_bt_co_tijiao= (Button) findViewById(R.id.rp_bt_co_tijiao);
        whatGetLink= (TextView) findViewById(R.id.whatgetlink);
        rp_ar_co_back= (ImageView) findViewById(R.id.rp_ar_co_back);
        rp_ar_co_edit= (EditText) findViewById(R.id.rp_ar_co_edit);
        rp_ar_co_ednum= (TextView) findViewById(R.id.rp_ar_co_ednum);

    }
    //判断提交按钮是否应该可以被点击
    private void isButton(int s){
        if (s==0){
            rp_co_isCheck=false;
            rp_bt_co_tijiao.setBackgroundResource(R.drawable.rp_button_false);
        }else{
            rp_co_isCheck=true;
            rp_bt_co_tijiao.setBackgroundResource(R.drawable.rp_button_true);
        }
    }
    private void editeListener(){
        rp_ar_co_edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                rp_ar_co_ednum.setText(s.length()+"/500");

            }
        });
        rp_ar_co_editlink.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                isButton(s.length());
            }
        });
    }
}
