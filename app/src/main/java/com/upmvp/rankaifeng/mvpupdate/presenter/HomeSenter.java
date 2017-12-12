package com.upmvp.rankaifeng.mvpupdate.presenter;

import com.upmvp.rankaifeng.mvpupdate.base.BasePresenter;
import com.upmvp.rankaifeng.mvpupdate.model.HomeModelInterface;
import com.upmvp.rankaifeng.mvpupdate.model.imp.HomeModelImp;
import com.upmvp.rankaifeng.mvpupdate.view.HomeView.HomeViewInterface;

/**
 * Created by rankaifeng on 2017/12/12.
 */

public class HomeSenter extends BasePresenter<HomeViewInterface> {
    private HomeModelInterface homeInterface;
    private HomeViewInterface homeViewInterface;

    public HomeSenter(HomeViewInterface homeViewInterface) {
        homeInterface = new HomeModelImp();
        this.homeViewInterface = homeViewInterface;
    }

    public void getMvpStr() {
        homeViewInterface.showMvpStr(homeInterface.returnMvpStr());
    }

}
