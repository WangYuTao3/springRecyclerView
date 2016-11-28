package me.springRecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wangyt on 2016/11/23.
 * : demo适配器
 */

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.ItemViewHolder> {

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();

        View item = LayoutInflater.from(context).inflate(R.layout.item, null, false);
        return new ItemViewHolder(item);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.mmPosition.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return 100;
    }


    static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView mmPosition;

        ItemViewHolder(View itemView) {
            super(itemView);
            mmPosition = (TextView) itemView.findViewById(R.id.tvPos);
        }
    }
}
