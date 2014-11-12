
package ru.acs.fts.schemas.album.actcommonform;

import java.util.ArrayList;
import java.util.List;

/** 
 * Перечень грузов
 */
public class GoodsInfoType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String carriage;
    private String container;

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование груза
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование груза
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'Carriage' element value. Номер вагона
     * 
     * @return value
     */
    public String getCarriage() {
        return carriage;
    }

    /** 
     * Set the 'Carriage' element value. Номер вагона
     * 
     * @param carriage
     */
    public void setCarriage(String carriage) {
        this.carriage = carriage;
    }

    /** 
     * Get the 'Container' element value. Номер контейнера
     * 
     * @return value
     */
    public String getContainer() {
        return container;
    }

    /** 
     * Set the 'Container' element value. Номер контейнера
     * 
     * @param container
     */
    public void setContainer(String container) {
        this.container = container;
    }
}
