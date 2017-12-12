package com.upmvp.rankaifeng.mvpupdate.model.imp;

import com.upmvp.rankaifeng.mvpupdate.model.HomeModelInterface;

/**
 * Created by rankaifeng on 2017/12/12.
 */

public class HomeModelImp implements HomeModelInterface {
    @Override
    public String returnMvpStr() {
        return "我是MVP传过来的值";
    }
}
