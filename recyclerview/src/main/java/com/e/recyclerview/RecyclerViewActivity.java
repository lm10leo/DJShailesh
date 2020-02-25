package com.e.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    int[] images;
    String[] names;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView=findViewById(R.id.recyclerView);
        images= new int[]{R.drawable.android,R.drawable.andy,
                R.drawable.adyp,
        R.drawable.andru};

        names= new String[]{"1","2","3","4"};
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(RecyclerViewActivity.this);
        VersionsAdapter adapter=new VersionsAdapter(RecyclerViewActivity.this,getList(images,names));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
    private List<AndroidVersion> getList(int[] images, String[] names)
    {
        List<AndroidVersion> list=new ArrayList<>();
                for(int i=0;i<images.length;i++){
                    AndroidVersion version=new AndroidVersion();
                    version.setImage(images[i]);
                    version.setName(names[i]);
                    list.add(version);
                }
                return list;
    }
}
