package com.zyh.ourydc.yugangshuo_weeks.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.zyh.ourydc.yugangshuo_weeks.util.DisplayUtils;

/**
 * Created by zhengyouhong on 2018/4/18.
 */

public class CanvasTestView extends View {

    public CanvasTestView(Context context) {
        super(context);
    }

    public CanvasTestView(Context context,
                          @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasTestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawColor(Color.parseColor("#F699B4"));
        String myName = "郑友宏";
        Rect rect = new Rect();
        paint.setTextSize(DisplayUtils.dp2px(getContext(), 20));
        paint.getTextBounds(myName, 0, myName.length(), rect);
        canvas.drawText(myName, getWidth() / 2 - rect.width() / 2,
                getHeight() / 2 + rect.height() / 2, paint);
        canvas.save();
        canvas.rotate(45, getWidth() / 2, getHeight() / 2);

        myName = "zyh";
        rect = new Rect();
        paint.setTextSize(DisplayUtils.dp2px(getContext(), 20));
        paint.getTextBounds(myName, 0, myName.length(), rect);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);

        canvas.drawRect(rect, paint);
        paint.setColor(Color.BLACK);

        canvas.drawText(myName, getWidth() / 2 - rect.width() / 2,
                getHeight() / 2 + rect.height() / 2, paint);

        canvas.restore();


    }
}
