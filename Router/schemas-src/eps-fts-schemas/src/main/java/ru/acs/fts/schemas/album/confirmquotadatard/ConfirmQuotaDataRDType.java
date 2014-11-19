
package ru.acs.fts.schemas.album.confirmquotadatard;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Информация о списании по квоте
 */
public class ConfirmQuotaDataRDType extends BaseDocType
{
    private String BDRDID;
    private String useDateTime;
    private String custDocType;
    private GTDIDType GTDID;
    private List<GoodsDescriptionType> goodList = new ArrayList<GoodsDescriptionType>();
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. Уникальный номер по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Уникальный номер по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'UseDateTime' element value. Дата использования и время
     * 
     * @return value
     */
    public String getUseDateTime() {
        return useDateTime;
    }

    /** 
     * Set the 'UseDateTime' element value. Дата использования и время
     * 
     * @param useDateTime
     */
    public void setUseDateTime(String useDateTime) {
        this.useDateTime = useDateTime;
    }

    /** 
     * Get the 'CustDocType' element value. Тип таможенного документа. ДТ -декларация на товары, ПР - сообщение о прибытии, УБ - сообщение об убытии, ТД - транзитная декларация.
     * 
     * @return value
     */
    public String getCustDocType() {
        return custDocType;
    }

    /** 
     * Set the 'CustDocType' element value. Тип таможенного документа. ДТ -декларация на товары, ПР - сообщение о прибытии, УБ - сообщение об убытии, ТД - транзитная декларация.
     * 
     * @param custDocType
     */
    public void setCustDocType(String custDocType) {
        this.custDocType = custDocType;
    }

    /** 
     * Get the 'GTDID' element value. Номер таможенного документа, при оформлении которого использован разрешительный документ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Номер таможенного документа, при оформлении которого использован разрешительный документ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<GoodsDescriptionType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodList(List<GoodsDescriptionType> list) {
        goodList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
