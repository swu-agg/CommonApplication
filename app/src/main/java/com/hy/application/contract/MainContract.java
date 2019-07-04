package com.hy.application.contract;

import com.hy.application.base.MvpBasePresenter;
import com.hy.application.base.MvpBaseView;

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
public interface MainContract {
    interface P extends MvpBasePresenter {
    }

    interface V extends MvpBaseView<P> {
    }
}
