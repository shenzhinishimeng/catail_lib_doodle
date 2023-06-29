package cn.hzw.doodle.core;

import android.graphics.Paint;

public interface IDoodleColor {

    /**
     * 配置画笔
     * @param doodleItem
     * @param paint
     */
    void config(IDoodleItem doodleItem, Paint paint);

    /**
     * 深度拷贝
     * @return
     */
    IDoodleColor copy();
}
