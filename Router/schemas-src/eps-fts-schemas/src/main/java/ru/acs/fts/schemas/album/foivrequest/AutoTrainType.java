
package ru.acs.fts.schemas.album.foivrequest;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о транспортном средстве (автопоезд)
 */
public class AutoTrainType
{
    private String totalWeight;
    private String length;
    private String width;
    private String height;
    private List<String> axisLoadList = new ArrayList<String>();
    private List<String> axisInvervalList = new ArrayList<String>();

    /** 
     * Get the 'TotalWeight' element value. Общий вес автопоезда с грузом
     * 
     * @return value
     */
    public String getTotalWeight() {
        return totalWeight;
    }

    /** 
     * Set the 'TotalWeight' element value. Общий вес автопоезда с грузом
     * 
     * @param totalWeight
     */
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    /** 
     * Get the 'Length' element value. Длина автопоезда (в метрах)
     * 
     * @return value
     */
    public String getLength() {
        return length;
    }

    /** 
     * Set the 'Length' element value. Длина автопоезда (в метрах)
     * 
     * @param length
     */
    public void setLength(String length) {
        this.length = length;
    }

    /** 
     * Get the 'Width' element value. Ширина автопоезда (в метрах)
     * 
     * @return value
     */
    public String getWidth() {
        return width;
    }

    /** 
     * Set the 'Width' element value. Ширина автопоезда (в метрах)
     * 
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /** 
     * Get the 'Height' element value. Высота автопоезда (в метрах)
     * 
     * @return value
     */
    public String getHeight() {
        return height;
    }

    /** 
     * Set the 'Height' element value. Высота автопоезда (в метрах)
     * 
     * @param height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /** 
     * Get the list of 'AxisLoads' element items. Массив нагрузок на оси (в тоннах)
     * 
     * @return list
     */
    public List<String> getAxisLoadList() {
        return axisLoadList;
    }

    /** 
     * Set the list of 'AxisLoads' element items. Массив нагрузок на оси (в тоннах)
     * 
     * @param list
     */
    public void setAxisLoadList(List<String> list) {
        axisLoadList = list;
    }

    /** 
     * Get the list of 'AxisInvervals' element items. Массив интервалов между осями (в метрах)
     * 
     * @return list
     */
    public List<String> getAxisInvervalList() {
        return axisInvervalList;
    }

    /** 
     * Set the list of 'AxisInvervals' element items. Массив интервалов между осями (в метрах)
     * 
     * @param list
     */
    public void setAxisInvervalList(List<String> list) {
        axisInvervalList = list;
    }
}
