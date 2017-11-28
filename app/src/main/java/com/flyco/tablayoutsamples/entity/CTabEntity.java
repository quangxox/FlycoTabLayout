package com.flyco.tablayoutsamples.entity;

import com.flyco.tablayout.listener.CustomLayoutTabEntity;
import com.flyco.tablayoutsamples.R;

public class CTabEntity implements CustomLayoutTabEntity {

    private int tabLayout;
    private int selectedIcon;
    private int unSelectedIcon;

    public CTabEntity(int tabLayout, int selectedIcon, int unSelectedIcon) {
        this.tabLayout = tabLayout;
        this.selectedIcon = selectedIcon;
        this.unSelectedIcon = unSelectedIcon;
    }

    @Override
    public int getTabLayout() {
        return tabLayout;
    }

    @Override
    public int getTabIconId() {
        return R.id.iv_tab_icon;
    }

    @Override
    public int getTabSelectedIcon() {
        return selectedIcon;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unSelectedIcon;
    }
}
