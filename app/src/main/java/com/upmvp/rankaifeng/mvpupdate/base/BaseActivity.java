package com.upmvp.rankaifeng.mvpupdate.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by rankaifeng on 2017/12/12.
 */

public abstract class BaseActivity<V extends IbaseView, P extends BasePresenter<V>> extends Activity {
    protected P mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        if (mPresenter == null) {
            mPresenter = createPresenter();
        }
        mPresenter.attachMV((V) this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachMv();
        }
    }

    protected abstract int getLayout();

    protected abstract void initView();

    protected abstract P createPresenter();
}
