package com.feb.cusview;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.feb.cusview.view.ArcView;
import com.feb.cusview.view.CircleView;
import com.feb.cusview.view.ColorView;
import com.feb.cusview.view.LineView;
import com.feb.cusview.view.OvalView;
import com.feb.cusview.view.PathAssistView;
import com.feb.cusview.view.PathView;
import com.feb.cusview.view.PointView;
import com.feb.cusview.view.RectView;
import com.google.android.flexbox.FlexboxLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FlexboxLayout mFlexBoxLayout;
    private LinearLayout mCvLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlexBoxLayout = findViewById(R.id.flex_box);
        mCvLayout = findViewById(R.id.ll_cv);
        findViewById(R.id.btn_draw_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDrawColor();
            }
        });
        findViewById(R.id.btn_draw_circle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDrawCircle();
            }
        });
        findViewById(R.id.btn_draw_rect).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDrawRect();
            }
        });
        findViewById(R.id.btn_draw_point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDrawPoint();
            }
        });
        findViewById(R.id.btn_draw_oval).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDrawOval();
            }
        });
        findViewById(R.id.btn_draw_line).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDrawLine();
            }
        });
        findViewById(R.id.btn_draw_arc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDrawArc();
            }
        });
        findViewById(R.id.btn_draw_path).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDrawPath();
            }
        });
        findViewById(R.id.btn_draw_path_assist).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDrawPathAssist();
            }
        });
    }

    private void showDrawColor() {
        ColorView colorView = new ColorView(this);
        mCvLayout.removeAllViews();
        mCvLayout.addView(colorView, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
    }

    private void showDrawCircle() {
        CircleView circleView = new CircleView(this);
        mCvLayout.removeAllViews();
        mCvLayout.addView(circleView);
    }

    private void showDrawRect() {
        RectView rectView = new RectView(this);
        mCvLayout.removeAllViews();
        mCvLayout.addView(rectView);
    }

    private void showDrawPoint() {
        PointView pointView = new PointView(this);
        mCvLayout.removeAllViews();
        mCvLayout.addView(pointView);
    }

    private void showDrawOval() {
        OvalView ovalView = new OvalView(this);
        mCvLayout.removeAllViews();
        mCvLayout.addView(ovalView);
    }

    private void showDrawLine() {
        LineView lineView = new LineView(this);
        mCvLayout.removeAllViews();
        mCvLayout.addView(lineView);
    }

    private void showDrawArc() {
        ArcView arcView = new ArcView(this);
        mCvLayout.removeAllViews();
        mCvLayout.addView(arcView);
    }

    private void showDrawPath() {
        PathView pathView = new PathView(this);
        mCvLayout.removeAllViews();
        mCvLayout.addView(pathView);
    }

    private void showDrawPathAssist() {
        PathAssistView pathAssistView = new PathAssistView(this);
        mCvLayout.removeAllViews();
        mCvLayout.addView(pathAssistView);
    }

}
