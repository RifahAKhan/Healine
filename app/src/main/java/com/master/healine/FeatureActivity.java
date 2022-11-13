
package com.master.healine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FeatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        // Data
        FeatureModel[] myListData = new FeatureModel[]{
                new FeatureModel("Food Good", "Let's start our diet journey..",R.raw.dietfood),
                new FeatureModel("Recipe", "Our app helps to have \n healthy and tasty food",R.raw.recipe),
                new FeatureModel("Be Choosy", "We assist to clear all \n your doubts",R.raw.choose),
                new FeatureModel("Stay Fit", "Our expert clear \n all your hurdles",R.raw.nutrition)

        };

        // Adapter

        fAdapter adapter = new fAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }


    }
