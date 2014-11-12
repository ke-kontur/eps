
package ru.acs.fts.schemas.album.quaranfitosanitcontrol;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о подкарантинной продукции
 */
public class GoodsDescriptionType
{
    private List<String> productNameList = new ArrayList<String>();
    private String TNVED;
    private SupplementaryQuantityType quantity;

    /** 
     * Get the list of 'ProductName' element items. Наименование подкарантинной продукции
     * 
     * @return list
     */
    public List<String> getProductNameList() {
        return productNameList;
    }

    /** 
     * Set the list of 'ProductName' element items. Наименование подкарантинной продукции
     * 
     * @param list
     */
    public void setProductNameList(List<String> list) {
        productNameList = list;
    }

    /** 
     * Get the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
    }

    /** 
     * Get the 'Quantity' element value. Количество (вес) подкарантинной продукции
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. Количество (вес) подкарантинной продукции
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }
}
