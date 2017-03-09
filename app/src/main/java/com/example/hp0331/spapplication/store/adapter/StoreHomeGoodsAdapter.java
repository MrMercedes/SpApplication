package com.example.hp0331.spapplication.store.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




import java.util.List;

/**
 * Created by Administrator on 2017/3/8.
 */

public class StoreHomeGoodsAdapter extends BaseRecyclerAdapter {
    public StoreHomeGoodsAdapter(Context context, List datas, int layoutId) {
        super(context, datas, layoutId);
    }

    @Override
    public void convert(RecyclerView.ViewHolder holder, Object o) {

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }
}
class BaseRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private List list;
    private  int Id;

    public BaseRecyclerAdapter(Context context, List list, int id) {
        mContext = context;
        this.list = list;
        Id = id;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    public void convert(RecyclerView.ViewHolder viewHolder,Object o){

    }
    @Override
    public int getItemCount() {
        return 0;
    }


}