package com.example.dipto.newsearchpractice;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by Dipto on 10/18/2017.
 */

public interface RetrofitInterface {

    @FormUrlEncoded
    @POST()
    Observable<SearchByNameRoot> getSearchData(@Url String url,
                                               @Field("token") String token,
                                               @Field("name") String name);
}
