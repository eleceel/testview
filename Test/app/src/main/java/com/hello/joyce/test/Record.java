package com.hello.joyce.test;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Record extends Fragment {

    private ListView listView = null;
    private DBHelper dbHelper;
    private SQLiteDatabase db;
    private SimpleCursorAdapter adapter;
    private Cursor maincursor;

    public Record() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_record, container, false);

        dbHelper = new DBHelper(getActivity());
        db = dbHelper.getWritableDatabase();

        listView = (ListView) view.findViewById(R.id.lv_product);
        listView.setEmptyView(view.findViewById(R.id.emptyView));
       // listView.setOnItemClickListener(new MyOnItemClickListener());
        refreshListView();
        return view;
    }
    private void refreshListView() {
        if (maincursor == null) {
            // 1.取得查詢所有資料的cursor
            maincursor = db.rawQuery(
                    "SELECT *  FROM cureplan", null);
            // 2.設定ListAdapter適配器(使用SimpleCursorAdapter)
            adapter = new SimpleCursorAdapter(getActivity(), R.layout.row,
                    maincursor,
                    new String[] { "_id", "actionname","actiontime", "actiondate" },
                    new int[] { R.id.action_id, R.id.action_name, R.id.action_time, R.id.action_date},
                    CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
            // 3.注入適配器
            listView.setAdapter(adapter);
        } else {
            if (maincursor.isClosed()) { // 彌補requery()不會檢查cursor closed的問題
                maincursor = null;
                refreshListView();
            } else {
                maincursor.requery(); // 若資料龐大不建議使用此法（應改用 CursorLoader）
                adapter.changeCursor(maincursor);
                adapter.notifyDataSetChanged();
            }
        }
    }
    /*private class MyOnItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long id) {
            // 取得 Cursor
            Cursor cursor = (Cursor) parent.getItemAtPosition(position);
            lookdata(cursor);
        }
    }*/

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
                    intent.setClass(getActivity().getApplication(), Choose.class);
                    startActivity(intent);
                    getActivity().finish();
                    return true;
                }
                return false;
            }
        });
    }
}
