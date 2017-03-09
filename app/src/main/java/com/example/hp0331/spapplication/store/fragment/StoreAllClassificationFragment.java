package com.example.hp0331.spapplication.store.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.hp0331.spapplication.R;


/**
 * Created by Administrator on 2017/3/8.
 */

public class StoreAllClassificationFragment extends Fragment implements View.OnClickListener{
    private LinearLayout ll_recommand,ll_sold,ll_new,ll_price;
    private TextView tv_recommand,tv_sold,tv_new,tv_price;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_store_all_classification,container,false);
        ll_recommand= (LinearLayout) view.findViewById(R.id.ll_recommand);
        ll_sold= (LinearLayout) view.findViewById(R.id.ll_sold);
        ll_new= (LinearLayout) view.findViewById(R.id.ll_new);
        ll_price= (LinearLayout) view.findViewById(R.id.ll_price);
        tv_recommand= (TextView) view.findViewById(R.id.tv_recommand);
        tv_sold= (TextView) view.findViewById(R.id.tv_sold);
        tv_new= (TextView) view.findViewById(R.id.tv_new);
        tv_price= (TextView) view.findViewById(R.id.tv_price);
        ll_recommand.setOnClickListener(this);
        ll_sold.setOnClickListener(this);
        ll_new.setOnClickListener(this);
        ll_price.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_recommand:
                break;
            case R.id.ll_sold:
                break;
            case R.id.ll_new:
                break;
            case R.id.ll_price:
                break;
        }
    }
}
