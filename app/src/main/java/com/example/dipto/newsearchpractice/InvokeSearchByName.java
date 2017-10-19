package com.example.dipto.newsearchpractice;

import android.content.Context;
import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by Dipto on 10/18/2017.
 */

public class InvokeSearchByName {

    SearchByNameRequestComplete requestComplete ;
    RetrofitInterface retrofitInterface ;
    PublishSubject publishSubject ;
    String url = "" ;
    String url_new = "" ;

    public InvokeSearchByName(final Context context, final String end_point, final String token, final String name, final SearchByNameRequestComplete searchByNameRequestComplete){
        this.requestComplete = searchByNameRequestComplete;
        retrofitInterface = RetrofitClient.getRetrofitClient().create(RetrofitInterface.class) ;


        Log.d("++URL++", name) ;
        url_new = RetrofitClient.BASE_URL+end_point ;

        if(publishSubject == null){

            Log.d("++checking++", "in Null") ;
            publishSubject = PublishSubject.create() ;
            publishSubject
                    .debounce(300, TimeUnit.MILLISECONDS)
                    .distinctUntilChanged()
                    .switchMap(searchValue -> retrofitInterface.getSearchData(url_new,token,name).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()))
                    .subscribeWith(new DisposableObserver<SearchByNameRoot>() {

                        @Override
                        public void onNext(SearchByNameRoot searchByNameRoot) {
                            Log.d("++stage++", "on Next") ;
                            requestComplete.onRequestComplete(searchByNameRoot);
                        }

                        @Override
                        public void onError(@NonNull Throwable e) {
                            Log.d("++exception++", String.valueOf(e)) ;
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }
        publishSubject.onNext(name);
    }
}
