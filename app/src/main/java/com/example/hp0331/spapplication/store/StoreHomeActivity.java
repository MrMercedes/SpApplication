package com.example.hp0331.spapplication.store;


import android.app.Activity;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;


import com.example.hp0331.spapplication.R;
import com.example.hp0331.spapplication.store.adapter.ViewPagerAdapter;
import com.example.hp0331.spapplication.store.fragment.StoreAllClassificationFragment;
import com.example.hp0331.spapplication.store.fragment.StoreHomeFragment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Administrator on 2017/3/6.
 */

public class StoreHomeActivity extends FragmentActivity {
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_home);
        viewPager= (ViewPager) findViewById(R.id.viewPager);
        final CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(
                R.id.collapse_toolbar);

        collapsingToolbar.setTitleEnabled(false);
        List<Fragment> fragments=new ArrayList<>();
        fragments.add(new StoreHomeFragment());
        fragments.add(new StoreAllClassificationFragment());
//        fragments.add(new StoreHotSoldFragment());
//        fragments.add(new StoreDynamicsFragment());
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPagerAdapter=new ViewPagerAdapter(fragmentManager,fragments);
        viewPager.setAdapter(viewPagerAdapter);
    }
}
