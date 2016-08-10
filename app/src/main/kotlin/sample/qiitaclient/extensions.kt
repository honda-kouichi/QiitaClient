package sample.qiitaclient

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by kouichihonda on 2016/08/11.
 * Copyright © 2016年 actindi Inc. All rights reserved.
 */
fun <T: View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById(id) as T
}