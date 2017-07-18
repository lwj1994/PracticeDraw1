package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {
  Paint paint;
  int width;
  int height;
  RectF rectF;

  public Practice5DrawOvalView(Context context) {
    super(context);
    init();
  }

  public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
    init();
  }

  public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  private void init() {
    paint = new Paint();
    rectF = new RectF(width / 2 - 400, height / 2 + 200, width / 2 + 400, height / 2 - 200);
  }

  @Override protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    width = MeasureSpec.getSize(widthMeasureSpec);
    height = MeasureSpec.getSize(heightMeasureSpec);
  }

  @Override protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);

    //        练习内容：使用 canvas.drawOval() 方法画椭圆
    paint.setStyle(Paint.Style.FILL);
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
      canvas.drawOval(width / 2 - 400, height / 2 + 200, width / 2 + 400, height / 2 - 200, paint);
    } else {
      canvas.drawOval(rectF, paint);
    }
  }
}
