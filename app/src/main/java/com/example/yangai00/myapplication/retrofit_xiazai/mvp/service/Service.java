package com.example.yangai00.myapplication.retrofit_xiazai.mvp.service;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Streaming;

/**
 * Created by yangai00 on 2018/7/22.
 */

public interface Service {
    //断点续传下载接口，@Streaming大文件需要加入这个判断，防止下载过程中写入到内存中
    //@head标签是指定下载的起始位置（断点续传的位置）
    @Streaming
    @GET
    Observable<ResponseBody> getData(@Header("RANGE") String start, String url);

}
