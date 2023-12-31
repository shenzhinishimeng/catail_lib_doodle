package cn.hzw.doodle.core;

import android.graphics.Rect;

/**
 * Created on 27/06/2018.
 */

public interface IDoodleSelectableItem extends IDoodleItem {

    /**
     * 设置是否选中
     * @param isSelected
     */
    void setSelected(boolean isSelected);

    /**
     * 是否选中
     * @return
     */
    boolean isSelected();

    /**
     * item的矩形(缩放scale之后)范围
     * @return
     */
    Rect getBounds();

    /**
     * 判断点（x,y）是否在item内，用于判断是否点中item
     */
    boolean contains(float x, float y);

}
