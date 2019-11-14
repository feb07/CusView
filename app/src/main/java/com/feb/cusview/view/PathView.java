package com.feb.cusview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/**
 * @author lilichun
 * createDate: 2019-11-14
 */
public class PathView extends View {

    private Paint mPaint;

    public PathView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        Path path = new Path();
        RectF rectF = new RectF(200, 200, 400, 400);
        path.addArc(rectF, -225, 225);
        RectF rect = new RectF(400, 200, 600, 400);
        path.arcTo(rect, -180, 225, false);
        path.lineTo(400, 542);
        canvas.drawPath(path, mPaint);

        mPaint.setColor(Color.parseColor("#999999"));
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10);
        Path quadPath = new Path();
        quadPath.cubicTo(100, 600, 500, 900, 600, 1200);
        canvas.drawPath(quadPath, mPaint);

        mPaint.setColor(Color.parseColor("#666666"));
        mPaint.setStyle(Paint.Style.FILL);
        Path linePath = new Path();
        linePath.moveTo(500, 500);
        linePath.lineTo(500, 1000);
        linePath.lineTo(250, 1000);
        canvas.drawPath(linePath, mPaint);
    }
}
