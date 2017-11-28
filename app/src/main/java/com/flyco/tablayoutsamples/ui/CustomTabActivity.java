package com.flyco.tablayoutsamples.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.flyco.tablayout.CustomTabLayout;
import com.flyco.tablayout.listener.CustomLayoutTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.flyco.tablayoutsamples.R;
import com.flyco.tablayoutsamples.entity.CTabEntity;
import com.flyco.tablayoutsamples.utils.ViewFindUtils;

import java.util.ArrayList;

public class CustomTabActivity extends AppCompatActivity {
    private ArrayList<Fragment> mFragments2 = new ArrayList<>();
    private String[] mTitles = {"1", "2", "3", "4"};
    private int[] mIconUnselectIds = {
            R.mipmap.tab_home_unselect, R.mipmap.tab_speech_unselect,
            R.mipmap.tab_contact_unselect, R.mipmap.tab_more_unselect};
    private int[] mIconSelectIds = {
            R.mipmap.tab_home_select, R.mipmap.tab_speech_select,
            R.mipmap.tab_contact_select, R.mipmap.tab_more_select};
    private int[] mLayoutTab = {
            R.layout.item_tab_image, R.layout.item_tab_image,
            R.layout.item_tab_image, R.layout.item_tab_image};

    private ArrayList<CustomLayoutTabEntity> mTabEntities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tab);

        for (String title : mTitles) {
            mFragments2.add(SimpleCardFragment.getInstance("Switch Fragment " + title));
        }

        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new CTabEntity(mLayoutTab[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }

        View mDecorView = getWindow().getDecorView();
        /** with Fragments */
        CustomTabLayout mTabLayout_3 = ViewFindUtils.find(mDecorView, R.id.tl_3);
        mTabLayout_3.setTabData(mTabEntities, this, R.id.fl_change, mFragments2);
        mTabLayout_3.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {

            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        mTabLayout_3.setCurrentTab(1);
    }

}
