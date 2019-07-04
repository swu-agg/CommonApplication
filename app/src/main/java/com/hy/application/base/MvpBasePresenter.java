package com.hy.application.base;

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
public interface MvpBasePresenter {
    /**
     * View层订阅Presenter层
     */
    void onSubscribe();

    /**
     * View层解除订阅
     */
    void onUnSubscribe();
}
