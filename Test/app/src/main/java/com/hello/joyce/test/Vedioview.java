package com.hello.joyce.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.VideoView;

public class Vedioview extends AppCompatActivity {
    boolean fullscreen = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //delete title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_vedioview);
        //extends value
        Bundle bundle = getIntent().getExtras();
        int  action_view = bundle.getInt("id");
        //load vedio and set the mediacontroller
        final VideoView view = (VideoView) findViewById(R.id.videoView);
        android.widget.MediaController mc = new android.widget.MediaController(this);
        view.setMediaController(mc);
        //choose the path with right vedio
        switch (action_view){
            case R.id.btn_activity1:
                String path1 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path1));
                break;
            case R.id.btn_activity2:
                String path2 = "android.resource://" + this.getPackageName() + "/" + R.raw.lower_correct;
                view.setVideoURI(Uri.parse(path2));
                break;
            case R.id.btn_activity3:
                String path3 = "android.resource://" + this.getPackageName() + "/" + R.raw.ear_correct;
                view.setVideoURI(Uri.parse(path3));
                break;
            case R.id.btn_activity4:
                String path4 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path4));
                break;
            case R.id.btn_activity5:
                String path5 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path5));
                break;
            case R.id.btn_activity6:
                String path6 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path6));
                break;
            case R.id.btn_activity7:
                String path7 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path7));
                break;
            case R.id.btn_activity8:
                String path8 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path8));
                break;
            case R.id.btn_activity9:
                String path9 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_incorrect;
                view.setVideoURI(Uri.parse(path9));
                break;
            case R.id.btn_activity10:
                String path10 = "android.resource://" + this.getPackageName() + "/" + R.raw.lower_incorrect;
                view.setVideoURI(Uri.parse(path10));
                break;
            case R.id.btn_activity11:
                String path11 = "android.resource://" + this.getPackageName() + "/" + R.raw.ear_incorrect;
                view.setVideoURI(Uri.parse(path11));
                break;
            case R.id.btn_activity12:
                String path12 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path12));
                break;
            case R.id.btn_activity13:
                String path13 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path13));
                break;
            case R.id.btn_activity14:
                String path14 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path14));
                break;
            case R.id.btn_activity15:
                String path15 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path15));
                break;
            case R.id.btn_activity16:
                String path16 = "android.resource://" + this.getPackageName() + "/" + R.raw.raise_correct;
                view.setVideoURI(Uri.parse(path16));
                break;
        }
        //play vedio
        view.start();
        view.requestFocus();
        if(!fullscreen){
            //全螢幕畫面
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
            getWindow().setAttributes(params);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            //设置RelativeLayout的全屏模式
            RelativeLayout.LayoutParams layoutParams=
                    new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.FILL_PARENT, RelativeLayout.LayoutParams.FILL_PARENT);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            view.setLayoutParams(layoutParams);
            fullscreen = true;//改变全屏/窗口的标记

        }else{//设置RelativeLayout的窗口模式
            RelativeLayout.LayoutParams lp=new  RelativeLayout.LayoutParams(320,240);
            lp.addRule(RelativeLayout.CENTER_IN_PARENT);
            view.setLayoutParams(lp);
            fullscreen = false;//改变全屏/窗口的标记
        }
    }
    public boolean onKeyDown(int keyCode,KeyEvent event){
        //確定按下退出鍵and防止重複按下退出鍵
        if(keyCode== KeyEvent.KEYCODE_BACK && event.getRepeatCount()==0){
            finish();
            //退出全螢幕
            WindowManager.LayoutParams params = this.getWindow().getAttributes();
            params.flags &= (~WindowManager.LayoutParams.FLAG_FULLSCREEN);
            this.getWindow().setAttributes(params);
            this.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        }
        return false;
    }

}

