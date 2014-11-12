
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Информация о найденных расхождениях в товарной партии
 */
public class ShipmentDiscrepancyInfoType
{
    private String shipmentDiscrepancyCode;
    private String customsNumber;
    private GTDIDType DTID;
    private List<GoodsDiscrepancyInfoType> goodsDiscrepancyInfoList = new ArrayList<GoodsDiscrepancyInfoType>();
    private List<SCVVPresentedDocumentType> presentedDocumentList = new ArrayList<SCVVPresentedDocumentType>();

    /** 
     * Get the 'ShipmentDiscrepancyCode' element value. Код найденных расхождений (в соответствии со Спецификацией обмена)
     * 
     * @return value
     */
    public String getShipmentDiscrepancyCode() {
        return shipmentDiscrepancyCode;
    }

    /** 
     * Set the 'ShipmentDiscrepancyCode' element value. Код найденных расхождений (в соответствии со Спецификацией обмена)
     * 
     * @param shipmentDiscrepancyCode
     */
    public void setShipmentDiscrepancyCode(String shipmentDiscrepancyCode) {
        this.shipmentDiscrepancyCode = shipmentDiscrepancyCode;
    }

    /** 
     * Get the 'CustomsNumber' element value. Таможенный номер накладной
     * 
     * @return value
     */
    public String getCustomsNumber() {
        return customsNumber;
    }

    /** 
     * Set the 'CustomsNumber' element value. Таможенный номер накладной
     * 
     * @param customsNumber
     */
    public void setCustomsNumber(String customsNumber) {
        this.customsNumber = customsNumber;
    }

    /** 
     * Get the 'DTID' element value. Регистрационный номер таможенного документа.
     * 
     * @return value
     */
    public GTDIDType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. Регистрационный номер таможенного документа.
     * 
     * @param DTID
     */
    public void setDTID(GTDIDType DTID) {
        this.DTID = DTID;
    }

    /** 
     * Get the list of 'GoodsDiscrepancyInfo' element items. Информация о найденных расхождениях в товаре
     * 
     * @return list
     */
    public List<GoodsDiscrepancyInfoType> getGoodsDiscrepancyInfoList() {
        return goodsDiscrepancyInfoList;
    }

    /** 
     * Set the list of 'GoodsDiscrepancyInfo' element items. Информация о найденных расхождениях в товаре
     * 
     * @param list
     */
    public void setGoodsDiscrepancyInfoList(List<GoodsDiscrepancyInfoType> list) {
        goodsDiscrepancyInfoList = list;
    }

    /** 
     * Get the list of 'PresentedDocument' element items. Транспортный документ
     * 
     * @return list
     */
    public List<SCVVPresentedDocumentType> getPresentedDocumentList() {
        return presentedDocumentList;
    }

    /** 
     * Set the list of 'PresentedDocument' element items. Транспортный документ
     * 
     * @param list
     */
    public void setPresentedDocumentList(List<SCVVPresentedDocumentType> list) {
        presentedDocumentList = list;
    }
}
