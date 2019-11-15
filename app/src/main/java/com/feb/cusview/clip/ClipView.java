package com.feb.cusview.clip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.feb.cusview.R;

import androidx.annotation.Nullable;

/**
 * @author lilichun
 * createDate: 2019-11-15
 */
public class ClipView extends View {
    private Paint mPaint;
    private Bitmap logoBitmap;
    private Path circle;

    public ClipView(Context context) {
        this(context, null);

    }

    public ClipView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ClipView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        circle = new Path();
        logoBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStyle(Paint.Style.FILL);
        if (logoBitmap != null) {
            canvas.save();
            //clipRect  clipPath两种
//            Rect rect = new Rect(100,100,150,150);
//            canvas.clipRect(rect);

//            circle.addCircle(100, 100, 100, Path.Direction.CCW);
//            canvas.clipPath(circle);

            canvas.translate(500, 0);
            canvas.rotate(90);
            canvas.scale(1.5f, 1.5f, 100, 100);
            canvas.skew(0.5f,-1.0f);
            canvas.drawBitmap(logoBitmap, 100, 100, mPaint);
            canvas.restore();
        } else {
            Log.e("ClipView", "drawBitmap is null");
        }

    }
}
