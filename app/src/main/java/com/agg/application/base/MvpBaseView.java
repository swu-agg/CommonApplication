package com.agg.application.base;

import android.support.annotation.StringRes;

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
public interface MvpBaseView<T> {
    void toast(String str);

    void toast(@StringRes int strRes);

    void toast(@StringRes int strRes, String tag);

    void toast(String str, String tag);

}
