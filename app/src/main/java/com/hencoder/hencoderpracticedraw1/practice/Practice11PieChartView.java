package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice11PieChartView extends View {
  Paint paint;
  int width;
  int height;
  RectF rectF;
  Path path;

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
    path = new Path();
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

    rectF.set(110, 20, 710, 620);
    // marshmallow
    //path.arcTo(rectF,300,60,true);
    canvas.drawArc(rectF, 300, 60, true, paint);
    //canvas.drawPath(,paint);
    // froyo
    paint.setColor(Color.parseColor("#506E7A"));
    canvas.drawArc(rectF, 0, 3, true, paint);

    // gingerbread
    paint.setColor(Color.parseColor("#9C27B0"));
    canvas.drawArc(rectF, 3, 8, true, paint);

    // iceCreamSandwich
    paint.setColor(Color.parseColor("#9E9E9E"));
    canvas.drawArc(rectF, 12, 8, true, paint);

    // jelly bean
    paint.setColor(Color.parseColor("#009688"));
    canvas.drawArc(rectF, 22, 30, true, paint);

    // kitkat
    paint.setColor(Color.parseColor("#2196F3"));
    canvas.drawArc(rectF, 56, 110, true, paint);

    // lollipop
    rectF.set(90, 0, 690, 600);
    paint.setColor(Color.parseColor("#F44336"));
    canvas.drawArc(rectF, 56 + 110, 300 - 110 - 56, true, paint);

    int centreX = 110 + 300;
    int centreY = 20 + 300;
    Log.d("三角", "cos30=" + Math.cos((double) (360)) + ",sin30=" + Math.sin(-30));
    int lineStatX = (int) (centreX + 300 * Math.cos((double) (30 / 360)));
    int lineStatY = (int) (centreY - 300 * Math.sin((double) (30 / 360)));
    paint.setColor(Color.WHITE);
    paint.setStyle(Paint.Style.STROKE);
    paint.setStrokeWidth(4);
    path.setLastPoint(lineStatX, lineStatY);
    path.lineTo(lineStatX + 40, lineStatY - 40); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
    path.rLineTo(lineStatX + 40, 0); // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线
    canvas.drawPath(path, paint);
  }
}
