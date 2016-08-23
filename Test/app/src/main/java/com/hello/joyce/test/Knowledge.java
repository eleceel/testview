package com.hello.joyce.test;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Knowledge extends Fragment  {


    public Knowledge() {
        // Required empty public constructor
    }

    private View.OnClickListener myButton = new View.OnClickListener() {
        public void onClick(View v) {
            Knowledge_text knowledge_text = new Knowledge_text();
            Bundle bundle = new Bundle();
            switch (v.getId()){
                case R.id.btn_1_1:
                    bundle.putInt("layout", R.layout.fragment_text1_1);
                    break;
                case R.id.btn_1_2:
                    bundle.putInt("layout", R.layout.fragment_text1_2);
                    break;
                case R.id.btn_1_3:
                    bundle.putInt("layout", R.layout.fragment_text1_3);
                    break;
                case R.id.btn_1_4:
                    bundle.putInt("layout", R.layout.fragment_text1_4);
                    break;
                case R.id.btn_1_5:
                    bundle.putInt("layout", R.layout.fragment_text1_5);
                    break;
                case R.id.btn_1_6:
                    bundle.putInt("layout", R.layout.fragment_text1_6);
                    break;
                case R.id.btn_1_7:
                    bundle.putInt("layout", R.layout.fragment_text1_7);
                    break;
                case R.id.btn_2_1:
                    bundle.putInt("layout", R.layout.fragment_text2_1);
                    break;
                case R.id.btn_2_2:
                    bundle.putInt("layout", R.layout.fragment_text2_2);
                    break;
                case R.id.btn_2_3:
                    bundle.putInt("layout", R.layout.fragment_text2_3);
                    break;
                case R.id.btn_2_4:
                    bundle.putInt("layout", R.layout.fragment_text2_4);
                    break;
                case R.id.btn_3_1:
                    bundle.putInt("layout", R.layout.fragment_text3_1);
                    break;
                case R.id.btn_3_2:
                    bundle.putInt("layout", R.layout.fragment_text3_2);
                    break;
                case R.id.btn_3_3:
                    bundle.putInt("layout", R.layout.fragment_text3_3);
                    break;
                case R.id.btn_3_4:
                    bundle.putInt("layout", R.layout.fragment_text3_4);
                    break;
                case R.id.btn_3_5:
                    bundle.putInt("layout", R.layout.fragment_text3_5);
                    break;
                case R.id.btn_3_6:
                    bundle.putInt("layout", R.layout.fragment_text3_6);
                    break;
                case R.id.btn_3_7:
                    bundle.putInt("layout", R.layout.fragment_text3_7);
                    break;
                case R.id.btn_4_1:
                    bundle.putInt("layout", R.layout.fragment_text4_1);
                    break;
                case R.id.btn_4_2:
                    bundle.putInt("layout", R.layout.fragment_text4_2);
                    break;
                case R.id.btn_4_3:
                    bundle.putInt("layout", R.layout.fragment_text4_3);
                    break;
                case R.id.btn_4_4:
                    bundle.putInt("layout", R.layout.fragment_text4_4);
                    break;
            }
            knowledge_text.setArguments(bundle);
            FragmentManager manager = getActivity().getSupportFragmentManager() ;
            manager.beginTransaction().replace(
                    R.id.Relative_fragment,
                    knowledge_text
            ).commit();
        }
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.fragment_knowledge, container, false);
        Button text1_1 = (Button) v.findViewById(R.id.btn_1_1);
        text1_1.setOnClickListener(myButton);
        Button text1_2 = (Button) v.findViewById(R.id.btn_1_2);
        text1_2.setOnClickListener(myButton);
        Button text1_3 = (Button) v.findViewById(R.id.btn_1_3);
        text1_3.setOnClickListener(myButton);
        Button text1_4 = (Button) v.findViewById(R.id.btn_1_4);
        text1_4.setOnClickListener(myButton);
        Button text1_5 = (Button) v.findViewById(R.id.btn_1_5);
        text1_5.setOnClickListener(myButton);
        Button text1_6 = (Button) v.findViewById(R.id.btn_1_6);
        text1_6.setOnClickListener(myButton);
        Button text1_7 = (Button) v.findViewById(R.id.btn_1_7);
        text1_7.setOnClickListener(myButton);
        Button text2_1 = (Button) v.findViewById(R.id.btn_2_1);
        text2_1.setOnClickListener(myButton);
        Button text2_2 = (Button) v.findViewById(R.id.btn_2_2);
        text2_2.setOnClickListener(myButton);
        Button text2_3 = (Button) v.findViewById(R.id.btn_2_3);
        text2_3.setOnClickListener(myButton);
        Button text2_4 = (Button) v.findViewById(R.id.btn_2_4);
        text2_4.setOnClickListener(myButton);
        Button text3_1 = (Button) v.findViewById(R.id.btn_3_1);
        text3_1.setOnClickListener(myButton);
        Button text3_2 = (Button) v.findViewById(R.id.btn_3_2);
        text3_2.setOnClickListener(myButton);
        Button text3_3 = (Button) v.findViewById(R.id.btn_3_3);
        text3_3.setOnClickListener(myButton);
        Button text3_4 = (Button) v.findViewById(R.id.btn_3_4);
        text3_4.setOnClickListener(myButton);
        Button text3_5 = (Button) v.findViewById(R.id.btn_3_5);
        text3_5.setOnClickListener(myButton);
        Button text3_6 = (Button) v.findViewById(R.id.btn_3_6);
        text3_6.setOnClickListener(myButton);
        Button text3_7 = (Button) v.findViewById(R.id.btn_3_7);
        text3_7.setOnClickListener(myButton);
        Button text4_1 = (Button) v.findViewById(R.id.btn_4_1);
        text4_1.setOnClickListener(myButton);
        Button text4_2 = (Button) v.findViewById(R.id.btn_4_2);
        text4_2.setOnClickListener(myButton);
        Button text4_3 = (Button) v.findViewById(R.id.btn_4_3);
        text4_3.setOnClickListener(myButton);
        Button text4_4 = (Button) v.findViewById(R.id.btn_4_4);
        text4_4.setOnClickListener(myButton);
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
