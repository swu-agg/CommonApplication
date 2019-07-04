package com.agg.application.contract;

import com.agg.application.base.MvpBasePresenter;
import com.agg.application.base.MvpBaseView;

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
