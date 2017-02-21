package com.example.administrator.lechengone.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.lechengone.R;

import java.util.List;

/**
 * Created by Administrator on 2017/2/20.
 */

public class CommentAdapter extends BaseAdapter {

    private Context context;
    private List<CommentBean> list;

    public CommentAdapter(Context context, List<CommentBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            convertView=View.inflate(context, R.layout.item_lv_comment,null);
            holder=new ViewHolder();
            holder.tv_name= (TextView) convertView.findViewById(R.id.tv_comment_name);
            holder.tv_time= (TextView) convertView.findViewById(R.id.tv_comment_time);
            holder.tv_content= (TextView) convertView.findViewById(R.id.tv_comment_content);
            convertView.setTag(holder);
        }else{
            holder= (ViewHolder) convertView.getTag();
        }

        CommentBean bean=list.get(position);

        holder.tv_name.setText(bean.getName());
        holder.tv_time.setText(bean.getTime());
        holder.tv_content.setText(bean.getContent());


        return convertView;
    }
    class ViewHolder{
        TextView tv_name;
        TextView tv_time;
        TextView tv_content;
        ImageView iv_icon;
    }
}
