package com.hello.joyce.test;


import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hello.joyce.test.DBHelper;

/**
 * A simple {@link Fragment} subclass.
 */
public class Train extends Fragment {

    String ActionData ="2016/08/23";
    String ActionName="touch_ear";
    String ActionTime="five_time";
    private DBHelper dbhelper;


    public Train() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        init();
        SQLiteDatabase db= dbhelper.getWritableDatabase();
        //ContentValues cv=new ContentValues();
       // cv.put("actionname",ActionName);
       // cv.put("actiondate",ActionData);
       // cv.put("actiontime",ActionTime);
       // long id = db.insert("actions", null, cv);
        //Toast.makeText(getActivity(), "_id：" + id, Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_train, container, false);
    }

    public void init() {
        dbhelper = new DBHelper(getActivity());
        //db = dbhelper.getWritableDatabase();
    }
    public void onResume() {
        super.onResume();
        getFocus();
    }
    //主界面获取焦点
    private void getFocus() {
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //返回鑑
                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    dialog();
                }
                return false;
            }
        });
    }
    private void dialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()); //創建訊息方塊
        builder.setMessage("確定要離開？");
        builder.setTitle("離開");
        builder.setPositiveButton("確認", new DialogInterface.OnClickListener()  {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //dismiss為關閉dialog,Activity還會保留dialog的狀態
                dialog.dismiss();
                //關閉activity
                getActivity().finish();
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
}
