
package ru.acs.fts.schemas.album.mpo_declaration;

/** 
 * Сведения о целостности упаковки
 */
public class PackingStateType
{
    private String value;
    private String remark;

    /** 
     * Get the 'Value' element value. Значение: 0 или false - нарушена, 1 или true - целостна
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. Значение: 0 или false - нарушена, 1 или true - целостна
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** 
     * Get the 'Remark' element value. Пояснение
     * 
     * @return value
     */
    public String getRemark() {
        return remark;
    }

    /** 
     * Set the 'Remark' element value. Пояснение
     * 
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
