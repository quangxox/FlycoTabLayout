package com.flyco.tablayout.listener;

import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;

public interface CustomLayoutTabEntity {

    @LayoutRes
    int getTabLayout();

    @IdRes
    int getTabIconId();

    @DrawableRes
    int getTabSelectedIcon();

    @DrawableRes
    int getTabUnselectedIcon();

}