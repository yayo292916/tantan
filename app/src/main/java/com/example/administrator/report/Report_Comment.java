package com.example.administrator.report;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/5/16.
 */

public class Report_Comment extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout prlp_gg;
    private ImageView plrp_gg_iv;
    private RelativeLayout plrp_hd_bt;
    private ImageView plrp_hd_iv;
    private RelativeLayout plrp_fd_bt;
    private ImageView plrp_fd_iv;
    private RelativeLayout plrp_mm_bt;
    private ImageView plrp_mm_iv;
    private RelativeLayout plrp_qz_bt;
    private ImageView plrp_qz_iv;
    private RelativeLayout plrp_yy_bt;
    private ImageView plrp_yy_iv;
    private ImageView plrp_back;
    private Button git;
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_commet_main);
        ActivityStack.getInstance().addActivity(this);
        viewFind();
    }

    private void viewFind() {
        plrp_gg_iv = (ImageView) findViewById(R.id.plrp_guanggao_img);
        plrp_hd_bt = (RelativeLayout) findViewById(R.id.plrp_hd_bt);
        plrp_hd_iv = (ImageView) findViewById(R.id.plrp_hd_img);
        plrp_fd_bt = (RelativeLayout) findViewById(R.id.plrp_fd_bt);
        plrp_fd_iv = (ImageView) findViewById(R.id.plrp_fd_img);
        plrp_mm_bt = (RelativeLayout) findViewById(R.id.plrp_mm_bt);
        plrp_mm_iv = (ImageView) findViewById(R.id.plrp_mm_img);
        plrp_qz_bt = (RelativeLayout) findViewById(R.id.plrp_qz_bt);
        plrp_qz_iv = (ImageView) findViewById(R.id.plrp_qz_img);
        plrp_yy_bt = (RelativeLayout) findViewById(R.id.plrp_yy_bt);
        plrp_yy_iv = (ImageView) findViewById(R.id.plrp_yy_img);
        plrp_back = (ImageView) findViewById(R.id.back_iv);
        git = (Button) findViewById(R.id.plrp_githup);
        prlp_gg = ((RelativeLayout) findViewById(R.id.plrp_guanggao_bt));
        prlp_gg.setOnClickListener(this);
        plrp_hd_bt.setOnClickListener(this);
        plrp_fd_bt.setOnClickListener(this);
        plrp_mm_bt.setOnClickListener(this);
        plrp_qz_bt.setOnClickListener(this);
        plrp_yy_bt.setOnClickListener(this);
        plrp_back.setOnClickListener(this);
        git.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.plrp_guanggao_bt:
                replaceBtn(plrp_gg_iv);
                break;
            case R.id.plrp_hd_bt:
                replaceBtn(plrp_hd_iv);
                break;
            case R.id.plrp_fd_bt:
                replaceBtn(plrp_fd_iv);
                break;
            case R.id.plrp_mm_bt:
                replaceBtn(plrp_mm_iv);
                break;
            case R.id.plrp_qz_bt:
                replaceBtn(plrp_qz_iv);
                break;
            case R.id.plrp_yy_bt:
                replaceBtn(plrp_yy_iv);
                break;
            case R.id.back_iv:
                finish();
                break;
            case R.id.plrp_githup:
                if (i>0) {
                    Intent intent=new Intent(Report_Comment.this,Report_Ar_Dispose.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(this, "请至少选择一项！", Toast.LENGTH_SHORT).show();
                }
                break;


        }
    }
    private void changeBtn(){
        if (i==0) {
            git.setBackgroundResource(R.drawable.rp_button_false);
        }else{
            git.setBackgroundResource(R.drawable.rp_button_true);
        }
    }
    private void replaceBtn(ImageView iv){
        if (iv.getVisibility()== View.VISIBLE) {
            iv.setVisibility(View.GONE);
            i=i-1;
            changeBtn();
        } else{
            iv.setVisibility(View.VISIBLE);
            i=i+1;
            changeBtn();
        }
    }
}
