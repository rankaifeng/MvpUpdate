package com.upmvp.rankaifeng.mvpupdate.view;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.upmvp.rankaifeng.mvpupdate.R;
import com.upmvp.rankaifeng.mvpupdate.base.BaseActivity;
import com.upmvp.rankaifeng.mvpupdate.presenter.HomeSenter;
import com.upmvp.rankaifeng.mvpupdate.view.HomeView.HomeViewInterface;

public class MainActivity extends BaseActivity<HomeViewInterface, HomeSenter> implements HomeViewInterface {
    private EditText mEditeMvp;
    private Button mBtnGetMvp;
    private HomeSenter homeSenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mEditeMvp = findViewById(R.id.edit_show_mvp);
        mBtnGetMvp = findViewById(R.id.btn_get_mvp);
        homeSenter = new HomeSenter(this);

        mBtnGetMvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeSenter.getMvpStr();
            }
        });
    }

    @Override
    protected HomeSenter createPresenter() {
        return new HomeSenter(this);
    }

    @Override
    public void showMvpStr(String mvpStr) {
        mEditeMvp.setText(mvpStr);
    }
}
