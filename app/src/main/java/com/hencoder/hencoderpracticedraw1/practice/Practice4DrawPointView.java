package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {
    Paint paint;
    int width;
    int height;
    public Practice4DrawPointView(Context context) {
        super(context);
        init();
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init() {
        paint = new Paint();
    }

    @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = MeasureSpec.getSize(widthMeasureSpec);
        height = MeasureSpec.getSize(heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        paint.setStrokeWidth(80);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(width/3, height/2, paint);
        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(width/3*2, height/2, paint);

        //float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
        //// 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
        //canvas.drawPoints(points, 2 /* 跳过两个数，即前两个 0 */,
        //    8 /* 一共绘制 8 个数（4 个点）*/, paint);
    }
}
