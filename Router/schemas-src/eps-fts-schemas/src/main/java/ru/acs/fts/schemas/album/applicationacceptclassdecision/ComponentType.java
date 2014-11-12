
package ru.acs.fts.schemas.album.applicationacceptclassdecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupInformationType;

/** 
 * Перечень компонентов
 */
public class ComponentType
{
    private String numberComponent;
    private List<String> nameComponentList = new ArrayList<String>();
    private String TNVEDCode;
    private String netWeightQuantity;
    private GoodsGroupInformationType goodsInformation;
    private CustomsType customsExport;

    /** 
     * Get the 'NumberComponent' element value. Номер компонента/Номер части компонента
     * 
     * @return value
     */
    public String getNumberComponent() {
        return numberComponent;
    }

    /** 
     * Set the 'NumberComponent' element value. Номер компонента/Номер части компонента
     * 
     * @param numberComponent
     */
    public void setNumberComponent(String numberComponent) {
        this.numberComponent = numberComponent;
    }

    /** 
     * Get the list of 'NameComponent' element items. Наименование компонента
     * 
     * @return list
     */
    public List<String> getNameComponentList() {
        return nameComponentList;
    }

    /** 
     * Set the list of 'NameComponent' element items. Наименование компонента
     * 
     * @param list
     */
    public void setNameComponentList(List<String> list) {
        nameComponentList = list;
    }

    /** 
     * Get the 'TNVEDCode' element value. Классификационный код по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Классификационный код по ТН ВЭД ТС
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'NetWeightQuantity' element value. Вес нетто компонента, кг
     * 
     * @return value
     */
    public String getNetWeightQuantity() {
        return netWeightQuantity;
    }

    /** 
     * Set the 'NetWeightQuantity' element value. Вес нетто компонента, кг
     * 
     * @param netWeightQuantity
     */
    public void setNetWeightQuantity(String netWeightQuantity) {
        this.netWeightQuantity = netWeightQuantity;
    }

    /** 
     * Get the 'GoodsInformation' element value. Характеристики товаров
     * 
     * @return value
     */
    public GoodsGroupInformationType getGoodsInformation() {
        return goodsInformation;
    }

    /** 
     * Set the 'GoodsInformation' element value. Характеристики товаров
     * 
     * @param goodsInformation
     */
    public void setGoodsInformation(GoodsGroupInformationType goodsInformation) {
        this.goodsInformation = goodsInformation;
    }

    /** 
     * Get the 'CustomsExport' element value. Таможенный орган вывоза
     * 
     * @return value
     */
    public CustomsType getCustomsExport() {
        return customsExport;
    }

    /** 
     * Set the 'CustomsExport' element value. Таможенный орган вывоза
     * 
     * @param customsExport
     */
    public void setCustomsExport(CustomsType customsExport) {
        this.customsExport = customsExport;
    }
}
