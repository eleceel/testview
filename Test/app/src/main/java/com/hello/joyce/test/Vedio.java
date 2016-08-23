package com.hello.joyce.test;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Vedio extends Fragment {

    public Vedio() {
        // Required empty public constructor
    }
    private View.OnClickListener myButton = new View.OnClickListener() {
        public void onClick(View v) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", v.getId());
            Intent intent = new Intent(getActivity(), Vedioview.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_vedio, container, false);
        Button correct1 = (Button) v.findViewById(R.id.btn_activity1);
        correct1.setOnClickListener(myButton);
        Button correct2 = (Button) v.findViewById(R.id.btn_activity2);
        correct2.setOnClickListener(myButton);
        Button correct3 = (Button) v.findViewById(R.id.btn_activity3);
        correct3.setOnClickListener(myButton);
        Button correct4 = (Button) v.findViewById(R.id.btn_activity4);
        correct4.setOnClickListener(myButton);
        Button correct5 = (Button) v.findViewById(R.id.btn_activity5);
        correct5.setOnClickListener(myButton);
        Button correct6 = (Button) v.findViewById(R.id.btn_activity6);
        correct6.setOnClickListener(myButton);
        Button correct7 = (Button) v.findViewById(R.id.btn_activity7);
        correct7.setOnClickListener(myButton);
        Button correct8 = (Button) v.findViewById(R.id.btn_activity8);
        correct8.setOnClickListener(myButton);
        Button wrong1 = (Button) v.findViewById(R.id.btn_activity9);
        wrong1.setOnClickListener(myButton);
        Button wrong2 = (Button) v.findViewById(R.id.btn_activity10);
        wrong2.setOnClickListener(myButton);
        Button wrong3 = (Button) v.findViewById(R.id.btn_activity11);
        wrong3.setOnClickListener(myButton);
        Button wrong4 = (Button) v.findViewById(R.id.btn_activity12);
        wrong4.setOnClickListener(myButton);
        Button wrong5 = (Button) v.findViewById(R.id.btn_activity13);
        wrong5.setOnClickListener(myButton);
        Button wrong6 = (Button) v.findViewById(R.id.btn_activity14);
        wrong6.setOnClickListener(myButton);
        Button wrong7 = (Button) v.findViewById(R.id.btn_activity15);
        wrong7.setOnClickListener(myButton);
        Button wrong8 = (Button) v.findViewById(R.id.btn_activity16);
        wrong8.setOnClickListener(myButton);
        return v;
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
                   Intent intent = new Intent();
                   intent.setClass(getActivity(), Choose.class);
                   startActivity(intent);
                   getActivity().finish();
                   return true;
               }
               return false;
           }
       });
   }
}
