package com.feb.cusview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author lilichun
 * createDate: 2019-11-13
 */
public class PointView extends View {
    private Paint mPaint;

    public PointView(Context context) {
        super(context);
    }

    public PointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(10);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(100, 100, mPaint);
        mPaint.setColor(Color.parseColor("#999999"));
        mPaint.setStrokeWidth(40);
        mPaint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(400, 100, mPaint);

        float[] points = {200, 200, 300, 300, 400, 400, 500, 300, 600, 200};
        canvas.drawPoints(points, mPaint);
    }
}
