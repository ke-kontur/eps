
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Комплексный тип для описания товаро-транспортной накладной, используемый при описании товаров на временном хранении
 */
public class WhTransportDocType extends WhPresentDocType
{
    private List<String> completteList = new ArrayList<String>();
    private TransportDocRegNumType customNumber;
    private ConsignorType consignor;
    private ConsigneeType consignee;

    /** 
     * Get the list of 'CompletteList' element items. Номера связанных ТТН. Заполняется в случае партии комплектных (насыпных, наливных) товаров, следующих по нескольким накладным
     * 
     * @return list
     */
    public List<String> getCompletteList() {
        return completteList;
    }

    /** 
     * Set the list of 'CompletteList' element items. Номера связанных ТТН. Заполняется в случае партии комплектных (насыпных, наливных) товаров, следующих по нескольким накладным
     * 
     * @param list
     */
    public void setCompletteList(List<String> list) {
        completteList = list;
    }

    /** 
     * Get the 'CustomNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public TransportDocRegNumType getCustomNumber() {
        return customNumber;
    }

    /** 
     * Set the 'CustomNumber' element value. Регистрационный номер
     * 
     * @param customNumber
     */
    public void setCustomNumber(TransportDocRegNumType customNumber) {
        this.customNumber = customNumber;
    }

    /** 
     * Get the 'Consignor' element value. Отправитель
     * 
     * @return value
     */
    public ConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Отправитель
     * 
     * @param consignor
     */
    public void setConsignor(ConsignorType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Получатель
     * 
     * @return value
     */
    public ConsigneeType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель
     * 
     * @param consignee
     */
    public void setConsignee(ConsigneeType consignee) {
        this.consignee = consignee;
    }
}
