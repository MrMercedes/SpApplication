package com.example.hp0331.spapplication.store.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import com.example.hp0331.spapplication.R;
import com.example.hp0331.spapplication.observablescrollview.ObservableScrollView;
import com.example.hp0331.spapplication.observablescrollview.ScrollViewListener;
import com.example.hp0331.spapplication.store.adapter.StoreHomeGoodsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/8.
 */

public class StoreHomeFragment extends Fragment {
    private RecyclerView recyclerView;
    private StoreHomeGoodsAdapter homeGoodsAdapter;
    private List goodsList;
    private ObservableScrollView observableScrollView;
    protected int firstScrollY;
    protected float mTopLayoutY;
    private LinearLayout ll_top_layout;
    private LinearLayout ll_bar,ll_bar2;
    private int[] mBarLocation = new int[2];
    private int[] mScrollViewLocation = new int[2];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_store_home,container,false);;
        observableScrollView= (ObservableScrollView) view.findViewById(R.id.observableScrollView);
        ll_top_layout= (LinearLayout) view.findViewById(R.id.ll_top_layout);
        ll_bar= (LinearLayout) view.findViewById(R.id.ll_bar);
        ll_bar2= (LinearLayout) view.findViewById(R.id.ll_bar2);

        recyclerView= (RecyclerView) view.findViewById(R.id.recyclerView);
        setRecyclerView();
        setObservableScrollView();
        return view;
    }



    private void setRecyclerView(){
        goodsList=new ArrayList();
        for (int i=0;i<=50;i++){
            goodsList.add("云南白药");
        }

        homeGoodsAdapter=new StoreHomeGoodsAdapter(getActivity(),goodsList,R.layout.item_store_goods);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setAdapter(homeGoodsAdapter);

    }
    private void setObservableScrollView(){
        observableScrollView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        getOriginPostion();
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
        observableScrollView.setScrollViewListener(new ScrollViewListener() {
            @Override
            public void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldx, int oldy) {
                showTopBar(scrollView);
                int offset = y - firstScrollY;

            }
        });
    }
    private void getOriginPostion() {
        firstScrollY = observableScrollView.getScrollY();

        mTopLayoutY = ll_top_layout.getY();
    }
    private void showTopBar(ObservableScrollView scrollView) {
        if (mScrollViewLocation[1] == 0) {
            // 第一次获取scrollview在屏幕的高度
            scrollView.getLocationInWindow(mScrollViewLocation);
        }
        ll_bar.getLocationInWindow(mBarLocation);
        if (mBarLocation[1] <= mScrollViewLocation[1]) {
            // 如果栏1超出scrollview顶部则隐藏的栏2显示出来，反之栏2隐藏、栏1显示
            ll_bar.setVisibility(View.INVISIBLE);
            ll_bar2.setVisibility(View.VISIBLE);
        } else {
            ll_bar.setVisibility(View.VISIBLE);
            ll_bar2.setVisibility(View.INVISIBLE);
        }
    }

}
