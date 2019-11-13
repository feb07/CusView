package com.feb.cusview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * @author lilichun
 * createDate: 2019-11-13
 */
public class LineView extends View {

    private Paint mPaint;

    public LineView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(5);
        float[] points = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120};
        canvas.drawLines(points, mPaint);
    }

}
