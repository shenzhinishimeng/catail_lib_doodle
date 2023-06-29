package cn.hzw.doodle.core;

import android.graphics.Bitmap;

import java.util.List;

/**
 * Created on 27/06/2018.
 */

public interface IDoodle {
    /**
     * Gets the unit size in the current doodle coordinate system, which refers to the dp, independent of the image
     * 获取当前涂鸦坐标系中的单位大小，该单位参考dp，独立于图片
     *
     * @return
     */
    float getUnitSize();

    /**
     * 设置图片旋转值
     *
     * @param degree
     */
    void setDoodleRotation(int degree);

    /**
     * 获取图片旋转值
     *
     * @return
     */
    int getDoodleRotation();

    /**
     * 设置图片缩放倍数
     *
     * @param scale
     * @param pivotX
     * @param pivotY
     */
    void setDoodleScale(float scale, float pivotX, float pivotY);

    /**
     * 获取图片缩放倍数
     */
    float getDoodleScale();

    /**
     * 设置画笔
     *
     * @param pen
     */
    void setPen(IDoodlePen pen);

    /**
     * 获取画笔
     */
    IDoodlePen getPen();

    /**
     * 设置画笔形状
     *
     * @param shape
     */
    void setShape(IDoodleShape shape);

    /**
     * 获取画笔形状
     */
    IDoodleShape getShape();

    /**
     * 设置图片偏移量x
     *
     * @param transX
     */
    void setDoodleTranslation(float transX, float transY);


    /**
     * 设置图片偏移量x
     *
     * @param transX
     */
    void setDoodleTranslationX(float transX);

    /**
     * 获取图片偏移量x
     *
     * @return
     */
    float getDoodleTranslationX();

    /**
     * 设置图片偏移量y
     *
     * @param transY
     */
    void setDoodleTranslationY(float transY);

    /**
     * 获取图片偏移量y
     *
     * @return
     */
    float getDoodleTranslationY();

    /**
     * 设置大小
     *
     * @param paintSize
     */
    void setSize(float paintSize);

    /**
     * 获取大小
     *
     * @return
     */
    float getSize();

    /**
     * 设置颜色
     *
     * @param color
     */
    void setColor(IDoodleColor color);

    /**
     * 获取颜色
     *
     * @return
     */
    IDoodleColor getColor();

    /**
     * 最小缩放倍数限制
     *
     * @param minScale
     */
    void setDoodleMinScale(float minScale);

    /**
     * 最小缩放倍数限制
     *
     * @return
     */
    float getDoodleMinScale();

    /**
     * 最大缩放倍数限制
     *
     * @param maxScale
     */
    void setDoodleMaxScale(float maxScale);

    /**
     * 最大缩放倍数限制
     *
     * @return
     */
    float getDoodleMaxScale();

    /**
     * 添加item
     *
     * @param doodleItem
     */
    void addItem(IDoodleItem doodleItem);

    /**
     * 移除item
     *
     * @param doodleItem
     */
    void removeItem(IDoodleItem doodleItem);

    /**
     * 获取所有的涂鸦
     *
     * @return
     */
    List<IDoodleItem> getAllItem();

    /**
     * 设置放大镜倍数
     *
     * @param scale
     */
    void setZoomerScale(float scale);

    /**
     * 获取放大镜倍数
     *
     * @return
     */
    float getZoomerScale();


    /**
     * 是否允许涂鸦显示在图片边界之外
     *
     * @param isDrawableOutside
     */
    void setIsDrawableOutside(boolean isDrawableOutside);

    /**
     * 是否允许涂鸦显示在图片边界之外
     */
    boolean isDrawableOutside();

    /**
     * 是否显示原图
     *
     * @param justDrawOriginal
     */
    void setShowOriginal(boolean justDrawOriginal);

    /**
     * 是否显示原图
     */
    boolean isShowOriginal();

    /**
     * 保存当前涂鸦图片
     */
    void save();

    /**
     * 清楚所有涂鸦
     */
    void clear();

    /**
     * 置顶item
     *
     * @param item
     */
    void topItem(IDoodleItem item);

    /**
     * 置底item
     *
     * @param item
     */
    void bottomItem(IDoodleItem item);

    /**
     * 撤销一步
     *
     * @return
     */
    boolean undo();

    /**
     * 指定撤销的步数
     *
     * @param step
     * @return
     */
    boolean undo(int step);

    /**
     * 获取当前显示的图片(无涂鸦)
     *
     * @return
     */
    Bitmap getBitmap();

    /**
     * 获取当前显示的图片(包含涂鸦)
     *
     * @return
     */
    Bitmap getDoodleBitmap();

    /**
     * 刷新
     */
    void refresh();

}
