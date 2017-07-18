package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {
  Paint paint;
  int width;
  int height;

  public Practice3DrawRectView(Context context) {
    super(context);
    init();
  }

  public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
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

    //        练习内容：使用 canvas.drawRect() 方法画矩形

    canvas.drawRect(width / 2 - 200, height / 2 - 200, width / 2 + 200, height / 2 + 200, paint);
  }
}
