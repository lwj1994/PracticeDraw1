package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
  Paint paint;
  int width;
  int height;
  RectF rectF;
  public Practice11PieChartView(Context context) {
    super(context);
    init();
  }

  public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  private void init() {
    paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    rectF = new RectF();
  }

  @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    width = MeasureSpec.getSize(widthMeasureSpec);
    height = MeasureSpec.getSize(heightMeasureSpec);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);


    paint.setColor(Color.parseColor("#FFC107"));
    //canvas.drawArc();
    //        综合练习
    //        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

  }
}
