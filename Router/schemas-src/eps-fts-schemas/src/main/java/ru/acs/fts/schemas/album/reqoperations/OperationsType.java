
package ru.acs.fts.schemas.album.reqoperations;

/** 
 * Перечень операций в отношении товаров и транспортных средств
 */
public class OperationsType
{
    private String value;
    private String remark;

    /** 
     * Get the 'Value' element value. Значение: 0 или false - нет, 1 или true - да
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. Значение: 0 или false - нет, 1 или true - да
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'Remark' element value. Пояснение к проводимым операциям и/или детальное описание конкретных действий, которые требуется провести
     * 
     * @return value
     */
    public String getRemark() {
        return remark;
    }

    /** 
     * Set the 'Remark' element value. Пояснение к проводимым операциям и/или детальное описание конкретных действий, которые требуется провести
     * 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
