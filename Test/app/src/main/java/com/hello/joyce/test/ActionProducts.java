package com.hello.joyce.test;

/**
 * Created by Joyce on 2016/8/12.
 */
public class ActionProducts {

    private int _id;
    private String _actiondate;
    private String _aciotnname;
    private String _actiontime;

    public ActionProducts() {
    }

    public ActionProducts(String _actionname) {
        this._aciotnname = _actionname;
    }

    public ActionProducts(String _actiondate,String _actionname,String _aciotntime) {
        this._aciotnname = _actionname;
        this._actiondate = _actiondate;
        this._actiontime = _aciotntime;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_aciotnname() {
        return _aciotnname;
    }

    public void set_aciotnname(String _aciotnname) {
        this._aciotnname = _aciotnname;
    }

    public String get_actiondate() {
        return _actiondate;
    }

    public void set_actiondate(String _actiondate) {
        this._actiondate = _actiondate;
    }

    public String get_actiontime() {
        return _actiontime;
    }

    public void set_actiontime(String _actiontime) {
        this._actiontime = _actiontime;
    }



}
