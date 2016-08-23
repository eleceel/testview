package com.hello.joyce.test;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Knowledge_text extends Fragment {

    public Knowledge_text() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        int knowledge_veiw= bundle.getInt("layout");
        return inflater.inflate(knowledge_veiw, container, false);
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
                    Knowledge knowledge = new Knowledge();
                    FragmentManager manager = getActivity().getSupportFragmentManager();
                    manager.beginTransaction().replace(
                            R.id.Relative_fragment,
                            knowledge
                    ).commit();
                    return true;
                }
                return false;
            }
        });
    }

}
