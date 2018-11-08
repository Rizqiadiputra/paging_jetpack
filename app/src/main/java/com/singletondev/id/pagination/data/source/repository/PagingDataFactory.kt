package com.singletondev.id.pagination.data.source.repository

import android.arch.lifecycle.MutableLiveData
import android.arch.paging.DataSource
import javax.inject.Inject
import com.singletondev.id.pagination.data.model.Result

class PagingDataFactory @Inject constructor(
    val infinityDataSource : PagingDataSource
) : DataSource.Factory<Long, Result>(){
    val mutableLiveData = MutableLiveData<PagingDataSource>()

    override fun create(): DataSource<Long, Result> {
        mutableLiveData.postValue(infinityDataSource)
        return infinityDataSource
    }

}