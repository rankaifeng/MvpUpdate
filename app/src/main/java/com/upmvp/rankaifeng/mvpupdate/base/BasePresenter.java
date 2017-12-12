package com.upmvp.rankaifeng.mvpupdate.base;

import android.support.annotation.NonNull;

/**
 * Created by rankaifeng on 2017/12/12.
 */

public abstract class BasePresenter<V> {
    public V mIview;


    /**
     * 绑定model跟view
     *
     * @param v
     */
    public void attachMV(@NonNull V v) {
        this.mIview = v;
    }

    public void detachMv() {
        mIview = null;
    }
}
