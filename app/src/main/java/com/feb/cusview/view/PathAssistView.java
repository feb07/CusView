package com.feb.cusview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/**
 * @author lilichun
 * createDate: 2019-11-14
 */
public class PathAssistView extends View {
    private Paint mPaint;

    public PathAssistView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        Path circlePath = new Path();
        //CW  (0),顺时针
        //CCW (1);逆时针
        circlePath.addCircle(300, 300, 200, Path.Direction.CCW);
        circlePath.addCircle(400, 300, 200, Path.Direction.CW);
        circlePath.setFillType(Path.FillType.EVEN_ODD);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        canvas.drawPath(circlePath, mPaint);
        //五角星
        Path starPath = new Path();
        starPath.moveTo(500, 600);
        starPath.lineTo(350, 1100);
        starPath.lineTo(800, 800);
        starPath.lineTo(200, 800);
        starPath.lineTo(650, 1100);
        starPath.setFillType(Path.FillType.WINDING);
        starPath.close();

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        canvas.drawPath(starPath, mPaint);
    }
}
