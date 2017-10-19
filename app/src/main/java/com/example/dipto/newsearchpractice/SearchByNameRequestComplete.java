package com.example.dipto.newsearchpractice;

/**
 * Created by Dipto on 10/18/2017.
 */

public interface SearchByNameRequestComplete {

    public void onRequestComplete(SearchByNameRoot searchByNameRoot) ;

    public void onRequestError(String msg) ;
}
