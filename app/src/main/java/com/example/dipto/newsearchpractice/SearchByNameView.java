package com.example.dipto.newsearchpractice;

import android.content.Context;

/**
 * Created by Dipto on 10/18/2017.
 */

public interface SearchByNameView {

    public void showSearchResult(SearchByNameRoot searchByNameRoot) ;

    public void startLoading() ;

    public void stopLoading() ;

    public void showMessage(String msg) ;

    Context getAppContext() ;
}
