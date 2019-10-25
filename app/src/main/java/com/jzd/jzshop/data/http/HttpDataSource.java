package com.jzd.jzshop.data.http;

import com.jzd.jzshop.entity.DemoEntity;

import io.reactivex.Observable;
import me.goldze.mvvmhabit.http.BaseResponse;

/**
 * Created by jzd on 2019/3/26.
 */
public interface HttpDataSource {
    //模拟登录
    Observable<Object> login();

    //模拟上拉加载
    Observable<DemoEntity> loadMore();

    Observable<BaseResponse<DemoEntity>> demoGet();

    Observable<BaseResponse<DemoEntity>> demoPost(String catalog);


}
