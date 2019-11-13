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
public class RectView extends View {
    private Paint mPaint;

    public RectView(Context context) {
        this(context, null);
    }

    public RectView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.parseColor("#ff6666"));
        Rect rect = new Rect(100, 100, 500, 200);
        canvas.drawRect(rect, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.parseColor("#666666"));
        canvas.drawRect(100, 500, 300, 800, mPaint);


        RectF roundRect = new RectF(100, 1000, 500, 1500);
        canvas.drawRoundRect(roundRect, 10, 10, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.parseColor("#999999"));
        RectF round = new RectF(600, 1000, 1000, 1400);
        canvas.drawRoundRect(round, 40, 40, mPaint);
    }
}
