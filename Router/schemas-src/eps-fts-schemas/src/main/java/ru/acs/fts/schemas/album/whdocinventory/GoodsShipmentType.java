
package ru.acs.fts.schemas.album.whdocinventory;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHContainerInformationType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhGoodType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhTransportDocType;

/** 
 * Комплексный тип для описания товаро-транспортной накладной (товарной партии), представляемой при помещении товаров на временное хранение
 */
public class GoodsShipmentType extends WhTransportDocType
{
    private List<WhGoodType> goodList = new ArrayList<WhGoodType>();
    private List<WHContainerInformationType> containerList = new ArrayList<WHContainerInformationType>();

    /** 
     * Get the list of 'Goods' element items. Описание товаров согласно накладной и товароспроводительным документам
     * 
     * @return list
     */
    public List<WhGoodType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Описание товаров согласно накладной и товароспроводительным документам
     * 
     * @param list
     */
    public void setGoodList(List<WhGoodType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'Containers' element items. Описание контейнеров согласно накладной и товароспроводительным документам
     * 
     * @return list
     */
    public List<WHContainerInformationType> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Containers' element items. Описание контейнеров согласно накладной и товароспроводительным документам
     * 
     * @param list
     */
    public void setContainerList(List<WHContainerInformationType> list) {
        containerList = list;
    }
}
