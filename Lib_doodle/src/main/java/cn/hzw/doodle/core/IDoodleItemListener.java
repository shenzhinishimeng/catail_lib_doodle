package cn.hzw.doodle.core;

/**
 * Created on 19/01/2019.
 */
public interface IDoodleItemListener {
    int PROPERTY_SCALE = 1;
    int PROPERTY_ROTATE = 2;
    int PROPERTY_PIVOT_X = 3;
    int PROPERTY_PIVOT_Y = 4;
    int PROPERTY_SIZE = 5;
    int PROPERTY_COLOR = 6;
    int PROPERTY_LOCATION = 7;

    /**
     * 属性改变时回调
     * @param property 属性
     */
    void onPropertyChanged(int property);
}
