
package ru.acs.fts.schemas.album.goodstranshipment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;

/** 
 * Сведения о товарах
 */
public class GoodsType
{
    private String goodsNumber;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String grossMass;
    private List<ESADContainerType> containerList = new ArrayList<ESADContainerType>();

    /** 
     * Get the 'GoodsNumber' element value. Порядковый номер товара по ТД/МДП.
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Порядковый номер товара по ТД/МДП.
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GrossMass' element value. Вес товара, брутто
     * 
     * @return value
     */
    public String getGrossMass() {
        return grossMass;
    }

    /** 
     * Set the 'GrossMass' element value. Вес товара, брутто
     * 
     * @param grossMass
     */
    public void setGrossMass(String grossMass) {
        this.grossMass = grossMass;
    }

    /** 
     * Get the list of 'Container' element items. Сведения о новом составе контейнеров
     * 
     * @return list
     */
    public List<ESADContainerType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. Сведения о новом составе контейнеров
     * 
     * @param list
     */
    public void setContainerList(List<ESADContainerType> list) {
        containerList = list;
    }
}
