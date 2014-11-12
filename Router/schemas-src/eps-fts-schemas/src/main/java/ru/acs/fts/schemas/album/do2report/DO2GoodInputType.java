
package ru.acs.fts.schemas.album.do2report;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhGoodType;

/** 
 * Комплексный тип для описания товара в графе приход по отчету ДО2. Количественные сведения (вес, стоимость, доп.единицы) указываются по отчету ДО1 с учетом выдачи по предшествующим отчетам ДО2
 */
public class DO2GoodInputType extends WhGoodType
{
    private String MPOCaseNum1;
    private String WHNumber;
    private DO2DO1GoodLinkType DO1GoodLink;
    private DO2KeepingLimitType keepingLimit;

    /** 
     * Get the 'MPOCaseNum' element value. Номер емкости МПО
     * 
     * @return value
     */
    public String getMPOCaseNum1() {
        return MPOCaseNum1;
    }

    /** 
     * Set the 'MPOCaseNum' element value. Номер емкости МПО
     * 
     * @param MPOCaseNum1
     */
    public void setMPOCaseNum1(String MPOCaseNum1) {
        this.MPOCaseNum1 = MPOCaseNum1;
    }

    /** 
     * Get the 'WHNumber' element value. Складской номер товара
     * 
     * @return value
     */
    public String getWHNumber() {
        return WHNumber;
    }

    /** 
     * Set the 'WHNumber' element value. Складской номер товара
     * 
     * @param WHNumber
     */
    public void setWHNumber(String WHNumber) {
        this.WHNumber = WHNumber;
    }

    /** 
     * Get the 'DO1GoodLink' element value. Указание на товар отчета ДО1, который выдается
     * 
     * @return value
     */
    public DO2DO1GoodLinkType getDO1GoodLink() {
        return DO1GoodLink;
    }

    /** 
     * Set the 'DO1GoodLink' element value. Указание на товар отчета ДО1, который выдается
     * 
     * @param DO1GoodLink
     */
    public void setDO1GoodLink(DO2DO1GoodLinkType DO1GoodLink) {
        this.DO1GoodLink = DO1GoodLink;
    }

    /** 
     * Get the 'KeepingLimit' element value. Сведения о сроке хранения товара
     * 
     * @return value
     */
    public DO2KeepingLimitType getKeepingLimit() {
        return keepingLimit;
    }

    /** 
     * Set the 'KeepingLimit' element value. Сведения о сроке хранения товара
     * 
     * @param keepingLimit
     */
    public void setKeepingLimit(DO2KeepingLimitType keepingLimit) {
        this.keepingLimit = keepingLimit;
    }
}
