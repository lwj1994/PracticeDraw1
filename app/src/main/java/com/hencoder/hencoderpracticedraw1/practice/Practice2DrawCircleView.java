package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
  Paint paint;
  int width;
  int height;

  public Practice2DrawCircleView(Context context) {
    super(context);
    init();
  }

  public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        练习内容：使用 canvas.drawCircle() 方法画圆
    //        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
    paint.setColor(Color.BLACK);
    paint.setStyle(Paint.Style.FILL);
    canvas.drawCircle(width / 3, height / 4, width / 7, paint);

    paint.setColor(Color.BLACK);
    paint.setStrokeWidth(5);
    paint.setStyle(Paint.Style.STROKE);
    canvas.drawCircle(width / 3 * 2, height / 4, width / 7, paint);

    paint.setColor(Color.parseColor("#3E79BE"));
    paint.setStyle(Paint.Style.FILL);
    canvas.drawCircle(width / 3, height / 4 * 3, width / 7, paint);

    paint.setColor(Color.BLACK);
    paint.setStrokeWidth(50);
    paint.setStyle(Paint.Style.STROKE);
    canvas.drawCircle(width / 3 * 2, height / 4 * 3, width / 7, paint);
  }
}
