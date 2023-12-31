package cn.hzw.doodle.core;

import android.graphics.Canvas;
import android.graphics.PointF;

/**
 * Created on 27/06/2018.
 */

public interface IDoodleItem {

    void setDoodle(IDoodle doodle);

    IDoodle getDoodle();

    /**
     * 获取画笔
     *
     * @return
     */
    IDoodlePen getPen();

    /**
     * 设置画笔
     *
     * @param pen
     */
    void setPen(IDoodlePen pen);

    /**
     * 获取画笔形状
     *
     * @return
     */
    IDoodleShape getShape();

    /**
     * 设置画笔形状
     *
     * @param shape
     */
    void setShape(IDoodleShape shape);

    /**
     * 获取大小
     *
     * @return
     */
    float getSize();

    /**
     * 设置大小
     *
     * @param size
     */
    void setSize(float size);

    /**
     * 获取颜色
     *
     * @return
     */
    IDoodleColor getColor();

    /**
     * 设置颜色
     *
     * @param color
     */
    void setColor(IDoodleColor color);

    /**
     * 绘制item
     *
     * @param canvas
     */
    void draw(Canvas canvas);

    /**
     * 画在所有item的上面
     * @param canvas
     */
    void drawAtTheTop(Canvas canvas);

    /**
     * 设置在当前涂鸦中的左上角位置
     *
     * @param x
     * @param y
     */
    void setLocation(float x, float y);

    /**
     * 获取当前涂鸦中的起始坐标
     */
    PointF getLocation();

    /**
     * item中心点x
     *
     * @param pivotX
     */
    void setPivotX(float pivotX);

    /**
     * item中心点x
     */
    float getPivotX();

    /**
     * item中心点y
     *
     * @param pivotY
     */
    void setPivotY(float pivotY);

    /**
     * item中心点y
     */
    float getPivotY();

    /**
     * 设置item的旋转值，围绕中心点Pivot旋转
     *
     * @param degree
     */
    void setItemRotate(float degree);

    /**
     * 获取item的旋转值
     *
     * @return
     */
    float getItemRotate();

    /**
     * 是否需要裁剪图片区域外的部分
     *
     * @return
     */
    boolean isNeedClipOutside();

    /**
     * 设置是否需要裁剪图片区域外的部分
     *
     * @param clip
     */
    void setNeedClipOutside(boolean clip);

    /**
     * 添加进涂鸦时回调
     */
    void onAdd();

    /**
     * 移除涂鸦时回调
     */
    void onRemove();

    /**
     * 刷新
     */
    void refresh();

    /**
     * item是否可以编辑。用于编辑模式下对item的操作
     * @return
     */
    boolean isDoodleEditable();

    /**
     * 缩放倍数，围绕(PivotX,PivotY)旋转
     */
    void setScale(float scale);

    float getScale();

    /**
     * 监听器
     * @param listener
     */
    void addItemListener(IDoodleItemListener listener);

    void removeItemListener(IDoodleItemListener listener);
}
