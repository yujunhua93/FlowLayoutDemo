package com.example.flowlayoutdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.flowlayout.TagAdapter;

import java.util.List;

public class MainActivity1Adapter extends TagAdapter<String> {


    private List<String> datas;

    private Context mContext;

    public interface OnDeleteListener{
        void onDelete(int position);
    }

    private OnDeleteListener mOnDeleteListener;

    public void setOnDeleteListener(OnDeleteListener onDeleteListener){
        this.mOnDeleteListener = onDeleteListener;
    }


    public MainActivity1Adapter(Context context,List<String> list) {
        this.mContext = context;
        this.datas = list;
    }

    @Override
    public View onCreateView(ViewGroup parent,int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.default_tag_item,parent,false);
        return view;
    }

    @Override
    public void onBindView(View view, final int position) {
        TextView textView = view.findViewById(R.id.tag);
        textView.setText(datas.get(position));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, datas.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }


    @Override
    public void setDatas(List<String> datas) {
        this.datas = datas;
    }
}
