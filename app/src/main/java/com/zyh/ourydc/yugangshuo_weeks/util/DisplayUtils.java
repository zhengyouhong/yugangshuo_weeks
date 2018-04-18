package com.zyh.ourydc.yugangshuo_weeks.util;

import android.content.Context;

/**
 * Created by zhengyouhong on 2018/4/18.
 */

public class DisplayUtils {

    public static int dp2px(Context context, float dpValue){
        return (int) (context.getResources().getDisplayMetrics().density * dpValue + 0.5f);
    }
}
