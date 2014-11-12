
package ru.acs.fts.schemas.album.declarationconformity;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о типе объекта декларирования
 */
public class TypeDeclarationType
{
    private String number;
    private String size;
    private String quantity;
    private List<DocumentBaseType> shippingDocumentList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the 'Number' element value. Номер партии/изделия
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер партии/изделия
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'Size' element value. Размер партии
     * 
     * @return value
     */
    public String getSize() {
        return size;
    }

    /** 
     * Set the 'Size' element value. Размер партии
     * 
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /** 
     * Get the 'Quantity' element value. Количество товара в партии
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество товара в партии
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the list of 'ShippingDocuments' element items. Товаросопроводительные документы
     * 
     * @return list
     */
    public List<DocumentBaseType> getShippingDocumentList() {
        return shippingDocumentList;
    }

    /** 
     * Set the list of 'ShippingDocuments' element items. Товаросопроводительные документы
     * 
     * @param list
     */
    public void setShippingDocumentList(List<DocumentBaseType> list) {
        shippingDocumentList = list;
    }
}
