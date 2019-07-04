package com.hy.application.base;

import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

import com.hy.application.utils.ToastUtils;

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
public abstract class BaseActivity<T extends MvpBasePresenter> extends AppCompatActivity implements MvpBaseView<T> {

    private ToastUtils toastUtils;

    @Override
    public void toast(String str) {
        toast(str, null);
    }

    @Override
    public void toast(int strRes) {
        toast(getString(strRes), null);
    }

    @Override
    public void toast(int strRes, String tag) {
        toast(getString(strRes), tag);
    }

    @Override
    public void toast(String str, String tag) {
        this.runOnUiThread(() -> {
            if (!TextUtils.isEmpty(str)) {
                if (toastUtils == null) {
                    toastUtils = new ToastUtils(getApplicationContext(), Toast.LENGTH_LONG);
                }
                if (!TextUtils.isEmpty(tag))
                    toastUtils.setText(str + ":(" + tag + ")").show();
                else
                    toastUtils.setText(str).show();
            }
        });
    }

}
