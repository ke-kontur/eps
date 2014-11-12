
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о документах, указываемых в  п. 9.1 -9.6 за исключением случаев, когда ДТ используется в качестве заявления на переработку товаров.
 */
public class CustomConditionDocumentsType extends DocumentBaseType
{
    private String lineNumber;
    private String subLineNumber;
    private String documentModeCode;
    private String informationCode;
    private LocalDate periodDate;
    private LocalDate conditionDate;
    private LocalDate saleDate;
    private LocalDate presentingDate;
    private String goodsStatus;
    private String repairStatus;

    /** 
     * Get the 'LineNumber' element value. Номер строки
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. Номер строки
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the 'SubLineNumber' element value. Номер подстроки
     * 
     * @return value
     */
    public String getSubLineNumber() {
        return subLineNumber;
    }

    /** 
     * Set the 'SubLineNumber' element value. Номер подстроки
     * 
     * @param subLineNumber
     */
    public void setSubLineNumber(String subLineNumber) {
        this.subLineNumber = subLineNumber;
    }

    /** 
     * Get the 'DocumentModeCode' element value. Код вида представляемого документа(заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Код вида представляемого документа(заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

    /** 
     * Get the 'InformationCode' element value. Код информации ( ДТ / разрешение на переработку / разрешение продления сроков по реимпорту и пр.)
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. Код информации ( ДТ / разрешение на переработку / разрешение продления сроков по реимпорту и пр.)
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the 'PeriodDate' element value. Срок действия разрешения / срок помещения под режим ТС / дата фактического вывоза при реимпорте.
     * 
     * @return value
     */
    public LocalDate getPeriodDate() {
        return periodDate;
    }

    /** 
     * Set the 'PeriodDate' element value. Срок действия разрешения / срок помещения под режим ТС / дата фактического вывоза при реимпорте.
     * 
     * @param periodDate
     */
    public void setPeriodDate(LocalDate periodDate) {
        this.periodDate = periodDate;
    }

    /** 
     * Get the 'ConditionDate' element value. Срок годности.
     * 
     * @return value
     */
    public LocalDate getConditionDate() {
        return conditionDate;
    }

    /** 
     * Set the 'ConditionDate' element value. Срок годности.
     * 
     * @param conditionDate
     */
    public void setConditionDate(LocalDate conditionDate) {
        this.conditionDate = conditionDate;
    }

    /** 
     * Get the 'SaleDate' element value. Срок реализации.
     * 
     * @return value
     */
    public LocalDate getSaleDate() {
        return saleDate;
    }

    /** 
     * Set the 'SaleDate' element value. Срок реализации.
     * 
     * @param saleDate
     */
    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    /** 
     * Get the 'PresentingDate' element value. Дата представления недостающего документа / сведений
     * 
     * @return value
     */
    public LocalDate getPresentingDate() {
        return presentingDate;
    }

    /** 
     * Set the 'PresentingDate' element value. Дата представления недостающего документа / сведений
     * 
     * @param presentingDate
     */
    public void setPresentingDate(LocalDate presentingDate) {
        this.presentingDate = presentingDate;
    }

    /** 
     * Get the 'GoodsStatus' element value. Статус товаров при вывозе 1- Российские, 2 - Продукты переработки. 
     * 
     * @return value
     */
    public String getGoodsStatus() {
        return goodsStatus;
    }

    /** 
     * Set the 'GoodsStatus' element value. Статус товаров при вывозе 1- Российские, 2 - Продукты переработки. 
     * 
     * @param goodsStatus
     */
    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    /** 
     * Get the 'RepairStatus' element value. Признак ремонта за пределами таможенной территории РФ. 0 - Операции по ремонту не производились, 1 - Операции по ремонту производились
     * 
     * @return value
     */
    public String getRepairStatus() {
        return repairStatus;
    }

    /** 
     * Set the 'RepairStatus' element value. Признак ремонта за пределами таможенной территории РФ. 0 - Операции по ремонту не производились, 1 - Операции по ремонту производились
     * 
     * @param repairStatus
     */
    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }
}
