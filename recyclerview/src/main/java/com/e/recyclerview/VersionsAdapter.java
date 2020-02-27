package com.e.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VersionsAdapter extends RecyclerView.Adapter<VersionsAdapter.VersionsHolder>
{
    private Context context;
    private List<AndroidVersion> list;
    public VersionsAdapter(Context context, List<AndroidVersion> List)
    {
        this.context=context;
        this.list=List;
    }
    @NonNull
    @Override
    public VersionsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.single_card,parent,false);
        return new VersionsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionsHolder holder, final int position) {

        holder.getName().setText(list.get(position).getName());
        holder.getImage().setImageResource(list.get(position).getImage());
        holder.getName().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "position : " +position+
                                "Name : " + list.get(position).getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class VersionsHolder extends RecyclerView.ViewHolder {
        public VersionsHolder(@NonNull View itemView) {
            super(itemView);
        }
        TextView getName()
        {
            return itemView.findViewById(R.id.textView4);
        }
        ImageView getImage()
        {
            return itemView.findViewById(R.id.imageView2);
        }
    }
}


