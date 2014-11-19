
package ru.acs.fts.schemas.album.datard;

import java.util.ArrayList;
import java.util.List;

/** 
 * Неквотируемые документы
 */
public class NotQuotaType
{
    private String formNumber;
    private List<StructuredTextType> goodsNameList = new ArrayList<StructuredTextType>();
    private StructuredTextType manufacturerName;
    private StructuredTextType receiverName;

    /** 
     * Get the 'FormNumber' element value. Номер бланка
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. Номер бланка
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the list of 'GoodsName' element items. Наименование продукции
     * 
     * @return list
     */
    public List<StructuredTextType> getGoodsNameList() {
        return goodsNameList;
    }

    /** 
     * Set the list of 'GoodsName' element items. Наименование продукции
     * 
     * @param list
     */
    public void setGoodsNameList(List<StructuredTextType> list) {
        goodsNameList = list;
    }

    /** 
     * Get the 'ManufacturerName' element value. Наименование фирмы изготовителя
     * 
     * @return value
     */
    public StructuredTextType getManufacturerName() {
        return manufacturerName;
    }

    /** 
     * Set the 'ManufacturerName' element value. Наименование фирмы изготовителя
     * 
     * @param manufacturerName
     */
    public void setManufacturerName(StructuredTextType manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /** 
     * Get the 'ReceiverName' element value. Наименование фирмы получателя
     * 
     * @return value
     */
    public StructuredTextType getReceiverName() {
        return receiverName;
    }

    /** 
     * Set the 'ReceiverName' element value. Наименование фирмы получателя
     * 
     * @param receiverName
     */
    public void setReceiverName(StructuredTextType receiverName) {
        this.receiverName = receiverName;
    }
}
