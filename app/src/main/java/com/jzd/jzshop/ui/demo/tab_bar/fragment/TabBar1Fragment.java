package com.jzd.jzshop.ui.demo.tab_bar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jzd.jzshop.BR;
import com.jzd.jzshop.R;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * Created by jzd on 2018/7/18.
 */

public class TabBar1Fragment extends BaseFragment {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_tab_bar_1;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
