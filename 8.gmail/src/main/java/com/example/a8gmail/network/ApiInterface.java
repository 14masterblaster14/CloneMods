package com.example.a8gmail.network;

import com.example.a8gmail.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Ravi Tamada on 21/02/17.
 * www.androidhive.info
 */

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
