package com.example.administrator.report;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button report_Article,report_Comment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        intentPage();
    }



    public void initView(){
        report_Article= (Button) findViewById(R.id.report_article);
        report_Comment= (Button) findViewById(R.id.report_comment);
    }
    public void intentPage(){
        report_Article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Report_Article.class);
                startActivity(intent);
            }
        });
        report_Comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Report_Comment.class);
                startActivity(intent);
            }
        });
    }

}
