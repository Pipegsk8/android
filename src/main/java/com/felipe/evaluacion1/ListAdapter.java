package com.felipe.evaluacion1;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElements> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<ListElements> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() {return mData.size();}

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_elements, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.BindData(mData.get(position));
    }

    public void setItems(List<ListElements> items) {mData = items;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView inconImage;
        TextView name,pais,status;

        ViewHolder(View itemView){
            super(itemView);
            inconImage = itemView.findViewById(R.id.icon_profile);
            name = itemView.findViewById(R.id.name_tv);
            pais = itemView.findViewById(R.id.city_tv);
            status = itemView.findViewById(R.id.status_tv);
        }

        void BindData(final ListElements item){
            inconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            pais.setText(item.getCiudad());
            status.setText(item.getStatus());
        }

    }
}

