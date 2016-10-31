package com.example.administrator.text000.adapter.edu;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;



import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Administrator on 2016/9/27 0027.
 */
public abstract class MyBaseAdpter<T> extends BaseAdapter {

    Context mContext;
    ArrayList<T> mList;
    int mLayoutId;
    LayoutInflater mInflate;

    public   MyBaseAdpter(Context mContext, ArrayList<T> mList, int mLayoutId){
        this.mContext=mContext;
        this.mList=mList;
        this.mLayoutId=mLayoutId;
        mInflate= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return mList!=null?mList.size():0;
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {
        return position;
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */

    @Override
    public long getItemId(int position) {

        return position;
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link LayoutInflater#inflate(int, ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
     Holder holider;
        if (convertView==null){
            convertView=mInflate.inflate(mLayoutId,null);
            holider=new Holder();
            convertView.setTag(holider);
        }else{
            holider= (Holder) convertView.getTag();
        }

        putView(holider,convertView,position,mList.get(position));

        return convertView;
    }




public abstract  void putView(Holder holider, View convertView, int position,T t);

    class Holder{

  }

}