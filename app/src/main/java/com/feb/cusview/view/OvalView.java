package com.feb.cusview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author lilichun
 * createDate: 2019-11-13
 */
public class OvalView extends View {
    private Paint mPaint;

    public OvalView(Context context) {
        this(context, null);
    }

    public OvalView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        RectF rectF = new RectF(100, 100, 500, 200);
        canvas.drawOval(rectF, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.parseColor("#999999"));
        RectF rect = new RectF(100, 500, 1000, 700);
        canvas.drawOval(rect, mPaint);
    }
}
