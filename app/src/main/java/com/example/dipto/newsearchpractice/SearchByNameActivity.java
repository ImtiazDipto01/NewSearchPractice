package com.example.dipto.newsearchpractice;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchByNameActivity extends AppCompatActivity implements SearchByNameView {

    @BindView(R.id.searchview)
    SearchView searchview;
    @BindView(R.id.search_by_name_recyler)
    RecyclerView searchByNameRecyler;
    List<SearchByNameProfile> list ;
    SearchByNamePresenter presenter ;
    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjExMCwiaXNzIjoiaHR0cDovLzE4Mi4xNjAuMTA5LjEzMi9hcGkvbG9naW4iLCJpYXQiOjE1MDgzNDgwMzgsImV4cCI6MTUzOTg4NDAzOCwibmJmIjoxNTA4MzQ4MDM4LCJqdGkiOiJ3WHdla1pwUmFOQUdSbEZVIn0.z63vfwYk7ze3kemZoPw8HnbQq1ijOK5EBcPEY8oZzgs";
    String end_point = "api/doctor/search_by_name" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_name);
        ButterKnife.bind(this);
        list = new ArrayList<>() ;
        presenter = new SearchByNamePresenter(this) ;
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                if(newText.length() >= 1){
                    presenter.getSearchResult(end_point, token, newText);
                }
                return false;
            }
        });
    }

    @Override
    public void showSearchResult(SearchByNameRoot searchByNameRoot) {
        list = searchByNameRoot.getData() ;
        if(list != null){
            for (SearchByNameProfile searchByNameProfile : list){
                Log.d("++name++", searchByNameProfile.getFirstName()) ;
            }
        }
    }

    @Override
    public void startLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showMessage(String msg) {

    }

    @Override
    public Context getAppContext() {
        return getApplicationContext();
    }
}
