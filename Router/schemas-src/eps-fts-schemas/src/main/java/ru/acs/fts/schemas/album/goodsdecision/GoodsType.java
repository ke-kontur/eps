
package ru.acs.fts.schemas.album.goodsdecision;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;

/** 
 * Сведения о товарах
 */
public class GoodsType extends GoodsBaseType
{
    private String custControlForm;
    private String custControlResult;
    private String custControlDecision;
    private String wagonNumber;
    private String containerNumber;

    /** 
     * Get the 'CustControlForm' element value. Форма таможенного контроля
     * 
     * @return value
     */
    public String getCustControlForm() {
        return custControlForm;
    }

    /** 
     * Set the 'CustControlForm' element value. Форма таможенного контроля
     * 
     * @param custControlForm
     */
    public void setCustControlForm(String custControlForm) {
        this.custControlForm = custControlForm;
    }

    /** 
     * Get the 'CustControlResult' element value. Результат таможенного контроля
     * 
     * @return value
     */
    public String getCustControlResult() {
        return custControlResult;
    }

    /** 
     * Set the 'CustControlResult' element value. Результат таможенного контроля
     * 
     * @param custControlResult
     */
    public void setCustControlResult(String custControlResult) {
        this.custControlResult = custControlResult;
    }

    /** 
     * Get the 'CustControlDecision' element value. Принятое решение
     * 
     * @return value
     */
    public String getCustControlDecision() {
        return custControlDecision;
    }

    /** 
     * Set the 'CustControlDecision' element value. Принятое решение
     * 
     * @param custControlDecision
     */
    public void setCustControlDecision(String custControlDecision) {
        this.custControlDecision = custControlDecision;
    }

    /** 
     * Get the 'WagonNumber' element value. Номер вагона
     * 
     * @return value
     */
    public String getWagonNumber() {
        return wagonNumber;
    }

    /** 
     * Set the 'WagonNumber' element value. Номер вагона
     * 
     * @param wagonNumber
     */
    public void setWagonNumber(String wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    /** 
     * Get the 'ContainerNumber' element value. Номер контейнера
     * 
     * @return value
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /** 
     * Set the 'ContainerNumber' element value. Номер контейнера
     * 
     * @param containerNumber
     */
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }
}
