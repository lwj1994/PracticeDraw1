package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice10HistogramView extends View {
  Paint paint;
  int width;
  int height;

  public Practice10HistogramView(Context context) {
    super(context);
    init();
  }

  public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    width = MeasureSpec.getSize(widthMeasureSpec);
    height = MeasureSpec.getSize(heightMeasureSpec);
  }

  private void init() {
    paint = new Paint(Paint.ANTI_ALIAS_FLAG);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        综合练习
    //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    paint.setStrokeWidth(2);
    paint.setColor(Color.WHITE);
    paint.setStrokeCap(Paint.Cap.SQUARE);
    canvas.drawLine(50, 10, 50, height / 4 * 3, paint);
    canvas.drawLine(50, height / 4 * 3, width / 10 * 9, height / 4 * 3, paint);

    int itemChartWidth = ((width / 10 * 9 - 50) - 30 * 9) / 7;
    paint.setTextSize(30);

    drawText(canvas, "Froyo", 0);
    drawText(canvas, "GB", 1);
    drawText(canvas, "ICS", 2);
    drawText(canvas, "JB", 3);
    drawText(canvas, "Kitkat", 4);
    drawText(canvas, "L", 5);
    drawText(canvas, "M", 6);

    paint.setStyle(Paint.Style.FILL);
    canvas.drawRect(80, height / 4 * 3 - 3, 80 + itemChartWidth, height / 4 * 3, paint);

    paint.setColor(Color.parseColor("#71B816"));
    canvas.drawRect(80 + (itemChartWidth + 30), height / 4 * 3 - 20,
        80 + (itemChartWidth + 30) + itemChartWidth, height / 4 * 3, paint);

    canvas.drawRect(80 + (itemChartWidth + 30) * 2, height / 4 * 3 - 20,
        80 + (itemChartWidth + 30) * 2 + itemChartWidth, height / 4 * 3, paint);

    canvas.drawRect(80 + (itemChartWidth + 30) * 3, height / 4 * 3 - 180,
        80 + (itemChartWidth + 30) * 3 + itemChartWidth, height / 4 * 3, paint);

    canvas.drawRect(80 + (itemChartWidth + 30) * 4, height / 4 * 3 - 360,
        80 + (itemChartWidth + 30) * 4 + itemChartWidth, height / 4 * 3, paint);
    canvas.drawRect(80 + (itemChartWidth + 30) * 5, height / 4 * 3 - 450,
        80 + (itemChartWidth + 30) * 5 + itemChartWidth, height / 4 * 3, paint);
    canvas.drawRect(80 + (itemChartWidth + 30) * 6, height / 4 * 3 - 150,
        80 + (itemChartWidth + 30) * 6 + itemChartWidth, height / 4 * 3, paint);

    paint.setColor(Color.WHITE);
    paint.setTextAlign(Paint.Align.CENTER);
    paint.setTextSize(60);
    canvas.drawText("直方图", width / 2, height - 10, paint);
  }

  private void drawText(Canvas canvas, String text, int i) {
    int itemChartWidth = ((width / 10 * 9 - 50) - 30 * 9) / 7;
    float v = (itemChartWidth - paint.measureText(text)) / 2;
    Log.d("text", "v = " + v);
    int x = (int) (80 + v) + (itemChartWidth + 30) * i;
    canvas.drawText(text, x, height / 4 * 3 + 30, paint);
  }
}
