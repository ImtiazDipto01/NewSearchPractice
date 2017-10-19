package com.example.dipto.newsearchpractice;

/**
 * Created by Dipto on 10/18/2017.
 */

public class SearchByNamePresenter {

    SearchByNameView searchByNameView ;
    String key_value, end_point ;

    public SearchByNamePresenter(SearchByNameView view){
        this.searchByNameView = view ;

    }

    public void getSearchResult(String end_point, String token, String name){

        new InvokeSearchByName(searchByNameView.getAppContext(), end_point, token, name, new SearchByNameRequestComplete() {

            @Override
            public void onRequestComplete(SearchByNameRoot searchByNameRoot) {
                searchByNameView.showSearchResult(searchByNameRoot);
            }

            @Override
            public void onRequestError(String msg) {

            }
        });

    }
}
