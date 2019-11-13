package com.feb.cusview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * @author lilichun
 * createDate: 2019-11-13
 */
public class ArcView extends View {
    private Paint mPaint;

    public ArcView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        RectF rectF = new RectF(100, 100, 700, 700);
        canvas.drawArc(rectF, 90, 270, true, mPaint);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.parseColor("#ff6666"));
        canvas.drawArc(rectF, 270, 90, true, mPaint);

        mPaint.setColor(Color.parseColor("#ff6666"));
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, 360, 90, false, mPaint);
    }
}
