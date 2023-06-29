package cn.hzw.doodle.core;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * 图形
 */
public interface IDoodleShape {


     /**
      * 配置图形
      * @param doodleItem
      * @param paint
      */
     void config(IDoodleItem doodleItem, Paint paint);

     /**
      * 深度拷贝
      * @return
      */
     IDoodleShape copy();

     /**
      * 绘制图形辅助工具，由IDoodle绘制，不属于IDoodleItem的内容
      *
      * @param canvas
      * @param doodle
      */
     void drawHelpers(Canvas canvas, IDoodle doodle);
}
