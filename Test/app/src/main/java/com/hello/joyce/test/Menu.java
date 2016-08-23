package com.hello.joyce.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.KeyEvent;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Menu extends AppCompatActivity {
    public boolean onKeyDown(int keyCode,KeyEvent event){
        if(keyCode== KeyEvent.KEYCODE_BACK && event.getRepeatCount()==0){   //確定按下退出鍵and防止重複按下退出鍵
            dialog();
        }
        return false;
    }

    private void dialog(){
         AlertDialog.Builder builder = new AlertDialog.Builder(Menu.this); //創建訊息方塊
         builder.setMessage("確定要離開？");
         builder.setTitle("離開");
         builder.setPositiveButton("確認", new DialogInterface.OnClickListener()  {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 //dismiss為關閉dialog,Activity還會保留dialog的狀態
                 dialog.dismiss();
                 //關閉activity
                 Menu.this.finish();
             }
         });
         builder.setNegativeButton("取消", new DialogInterface.OnClickListener()  {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 dialog.dismiss();
             }
         });
         builder.create().show();
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("cureplan");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        EditText et_name = (EditText) findViewById(R.id.et_name);
        final Editable name = et_name.getText();
        EditText et_password = (EditText) findViewById(R.id.et_password);
        final Editable password = et_password.getText();

        //email按鈕
        TextView cureplan = (TextView) findViewById(R.id.textView2);
        cureplan.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/BRUSHSCI.TTF"));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //登入按鈕
        Button signin = (Button) findViewById(R.id.btn_signin);
        signin.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(name.length() == 0 || password.length() == 0){
                    Toast.makeText(getApplicationContext(), "請再次確認，並重新輸入", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent();
                    intent.setClass(Menu.this, Choose.class);
                    startActivity(intent);
                    finish();
                }

            }


        });

    }

}
