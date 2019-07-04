package com.hy.application.view.activity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.hy.application.R;
import com.hy.application.base.BaseActivity;
import com.hy.application.contract.MainContract;
import com.hy.application.presenter.MainPresenter;
import com.hy.application.view.recyclerview.DateListAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

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
public class MainActivity extends BaseActivity<MainContract.P> implements MainContract.V {

    private MainPresenter mainPresenter;
    private DateListAdapter dateListAdapter;
    @BindView(R.id.rv_date)
    RecyclerView rvDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainPresenter = new MainPresenter(this);
        mainPresenter.onSubscribe();

//        dateListAdapter = new DateListAdapter();
//        rvDate.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
//        rvDate.setAdapter(dateListAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.onUnSubscribe();
    }


}
