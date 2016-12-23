package ru.razumovsky.profunion.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vadim on 09/11/16.
 */

public abstract class BaseListViewAdapter<T> extends BaseAdapter {

    protected List<T> items;
    protected Context context;
    protected LayoutInflater lInflater;


    public BaseListViewAdapter(Context context, List<T> objects) {
        this.context = context;
        items = new ArrayList<>(objects);
        lInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public T getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addAll(List<T> newItems) {
        items.addAll(newItems);
        notifyDataSetChanged();
    }
}