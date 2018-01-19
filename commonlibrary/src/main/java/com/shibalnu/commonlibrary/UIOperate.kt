package com.shibalnu.commonlibrary

/**
 * Created by chenYuXuan on 2018/1/19.
 * email : southxvii@163.com
 */
interface UIOperate {

    fun attachViewRes():Int

    fun initView()

    fun showLoading()
    fun hideLoading()

    fun showLoading(text:String)

}