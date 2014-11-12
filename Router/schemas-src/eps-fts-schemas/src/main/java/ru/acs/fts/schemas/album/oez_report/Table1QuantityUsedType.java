
package ru.acs.fts.schemas.album.oez_report;

import java.util.ArrayList;
import java.util.List;

/** 
 * Таблица 1. Количество товара, использованное в отчётном периоде 
 */
public class Table1QuantityUsedType
{
    private String quantityConformUsageGoods;
    private String quantityOEZConsumed;
    private String recyclingGoodsQuantity;
    private String residentsGoodsQuantity;
    private List<CustomsModeQuantityType> customsTreatmentModeChangedList = new ArrayList<CustomsModeQuantityType>();
    private List<GoodsUsageType> OEZDestructedGoodList = new ArrayList<GoodsUsageType>();
    private List<GoodsUsageType> otherGoodsUsageList = new ArrayList<GoodsUsageType>();
    private List<StatusDisguiseGoodsType> statusDisguiseGoodList = new ArrayList<StatusDisguiseGoodsType>();

    /** 
     * Get the 'QuantityConformUsageGoods' element value. Количество товара, использованное в соответствии с п.4 ст. 13 Соглашения о СЭЗ
     * 
     * @return value
     */
    public String getQuantityConformUsageGoods() {
        return quantityConformUsageGoods;
    }

    /** 
     * Set the 'QuantityConformUsageGoods' element value. Количество товара, использованное в соответствии с п.4 ст. 13 Соглашения о СЭЗ
     * 
     * @param quantityConformUsageGoods
     */
    public void setQuantityConformUsageGoods(String quantityConformUsageGoods) {
        this.quantityConformUsageGoods = quantityConformUsageGoods;
    }

    /** 
     * Get the 'QuantityOEZConsumed' element value. Количество товаров, потребленных на территории оэз, без учета товаров указанных в графе 19
     * 
     * @return value
     */
    public String getQuantityOEZConsumed() {
        return quantityOEZConsumed;
    }

    /** 
     * Set the 'QuantityOEZConsumed' element value. Количество товаров, потребленных на территории оэз, без учета товаров указанных в графе 19
     * 
     * @param quantityOEZConsumed
     */
    public void setQuantityOEZConsumed(String quantityOEZConsumed) {
        this.quantityOEZConsumed = quantityOEZConsumed;
    }

    /** 
     * Get the 'RecyclingGoodsQuantity' element value. Количество товаров, подвергнутых операциям по переработке(обработке)
     * 
     * @return value
     */
    public String getRecyclingGoodsQuantity() {
        return recyclingGoodsQuantity;
    }

    /** 
     * Set the 'RecyclingGoodsQuantity' element value. Количество товаров, подвергнутых операциям по переработке(обработке)
     * 
     * @param recyclingGoodsQuantity
     */
    public void setRecyclingGoodsQuantity(String recyclingGoodsQuantity) {
        this.recyclingGoodsQuantity = recyclingGoodsQuantity;
    }

    /** 
     * Get the 'ResidentsGoodsQuantity' element value. Товары находящиеся у резидента ОЭЗ в отношении которых осуществляется хранение(складирование) на территории ОЭЗ
     * 
     * @return value
     */
    public String getResidentsGoodsQuantity() {
        return residentsGoodsQuantity;
    }

    /** 
     * Set the 'ResidentsGoodsQuantity' element value. Товары находящиеся у резидента ОЭЗ в отношении которых осуществляется хранение(складирование) на территории ОЭЗ
     * 
     * @param residentsGoodsQuantity
     */
    public void setResidentsGoodsQuantity(String residentsGoodsQuantity) {
        this.residentsGoodsQuantity = residentsGoodsQuantity;
    }

    /** 
     * Get the list of 'CustomsTreatmentModeChanged' element items. Изменение таможенного режима СТЗ на иной таможенный режим
     * 
     * @return list
     */
    public List<CustomsModeQuantityType> getCustomsTreatmentModeChangedList() {
        return customsTreatmentModeChangedList;
    }

    /** 
     * Set the list of 'CustomsTreatmentModeChanged' element items. Изменение таможенного режима СТЗ на иной таможенный режим
     * 
     * @param list
     */
    public void setCustomsTreatmentModeChangedList(
            List<CustomsModeQuantityType> list) {
        customsTreatmentModeChangedList = list;
    }

    /** 
     * Get the list of 'OEZDestructedGoods' element items. Сведения о товарах, уничтоженных на территории ОЭЗ
     * 
     * @return list
     */
    public List<GoodsUsageType> getOEZDestructedGoodList() {
        return OEZDestructedGoodList;
    }

    /** 
     * Set the list of 'OEZDestructedGoods' element items. Сведения о товарах, уничтоженных на территории ОЭЗ
     * 
     * @param list
     */
    public void setOEZDestructedGoodList(List<GoodsUsageType> list) {
        OEZDestructedGoodList = list;
    }

    /** 
     * Get the list of 'OtherGoodsUsage' element items. Сведения о товарах, в отношении которых были совершены иные операции
     * 
     * @return list
     */
    public List<GoodsUsageType> getOtherGoodsUsageList() {
        return otherGoodsUsageList;
    }

    /** 
     * Set the list of 'OtherGoodsUsage' element items. Сведения о товарах, в отношении которых были совершены иные операции
     * 
     * @param list
     */
    public void setOtherGoodsUsageList(List<GoodsUsageType> list) {
        otherGoodsUsageList = list;
    }

    /** 
     * Get the list of 'StatusDisguiseGoods' element items. Сведения товарах с изменным статусом
     * 
     * @return list
     */
    public List<StatusDisguiseGoodsType> getStatusDisguiseGoodList() {
        return statusDisguiseGoodList;
    }

    /** 
     * Set the list of 'StatusDisguiseGoods' element items. Сведения товарах с изменным статусом
     * 
     * @param list
     */
    public void setStatusDisguiseGoodList(List<StatusDisguiseGoodsType> list) {
        statusDisguiseGoodList = list;
    }
}
