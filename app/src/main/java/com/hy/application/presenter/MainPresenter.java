package com.hy.application.presenter;

import com.hy.application.contract.MainContract;

/**
 * <pre>
 *     author    : Agg
 *     blog      : https://blog.csdn.net/Agg_bin
 *     time      : 2019/04/24
 *     desc      :
 *     reference :
 *     remark    :
 * </pre>
 */
public class MainPresenter implements MainContract.P {

    private MainContract.V v;

    public MainPresenter(MainContract.V v) {
        this.v = v;
    }

    @Override
    public void onSubscribe() {
        if (v != null) {
            // 初始化view
        }
    }

    @Override
    public void onUnSubscribe() {
        v = null;
    }
}
