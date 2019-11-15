package com.feb.cusview.clip;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.feb.cusview.R;

/**
 * @author lilichun
 * createDate: 2019-11-15
 */
public class CameraView extends View {

    private Paint mPaint;
    private Camera camera;
    private Bitmap logoBitmap;

    public CameraView(Context context) {
        super(context);
        init();
    }

    private void init() {
        mPaint = new Paint();
        camera = new Camera();
        logoBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }


    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
//        camera.rotate(30,30,30);
        camera.rotateX(50);
        camera.applyToCanvas(canvas);
        canvas.drawBitmap(logoBitmap, 100, 100, mPaint);
        canvas.restore();
    }
}
