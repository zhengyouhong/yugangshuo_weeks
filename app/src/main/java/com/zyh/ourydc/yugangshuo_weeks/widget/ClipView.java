package com.zyh.ourydc.yugangshuo_weeks.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.zyh.ourydc.yugangshuo_weeks.util.DisplayUtils;

/**
 * Created by zhengyouhong on 2018/4/23.
 */

public class ClipView extends View {
    public ClipView(Context context) {
        super(context);
    }

    public ClipView(Context context,
                    @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ClipView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawColor(Color.BLUE);

        int topLeft = DisplayUtils.dp2px(getContext(), 50);
        int rightBottom = DisplayUtils.dp2px(getContext(), 250);

        canvas.save();
        canvas.clipRect(topLeft, topLeft, rightBottom, rightBottom);
        canvas.drawColor(Color.BLACK);

        paint.setColor(Color.RED);
        topLeft = DisplayUtils.dp2px(getContext(), 100);
        rightBottom = DisplayUtils.dp2px(getContext(), 200);
        Path path = new Path();
        path.moveTo(topLeft, topLeft);
        path.lineTo(topLeft, rightBottom);
        path.lineTo(rightBottom, rightBottom);
        path.lineTo(rightBottom, topLeft);
        path.close();
        canvas.drawPath(path, paint);

        canvas.restore();


        canvas.save();


        canvas.restore();
    }
}
