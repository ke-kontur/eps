
package ru.acs.fts.schemas.album.guaranteeunacceptancenotif;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о невозможности использования обеспечения
 */
public class GuaranteeUnacceptanceInfoType
{
    private String measureCode;
    private String guaranteeDocNumber;
    private List<ReasonType> reasonList = new ArrayList<ReasonType>();

    /** 
     * Get the 'MeasureCode' element value. Код меры обеспечения
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. Код меры обеспечения
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the 'GuaranteeDocNumber' element value. Номер документа обеспечения
     * 
     * @return value
     */
    public String getGuaranteeDocNumber() {
        return guaranteeDocNumber;
    }

    /** 
     * Set the 'GuaranteeDocNumber' element value. Номер документа обеспечения
     * 
     * @param guaranteeDocNumber
     */
    public void setGuaranteeDocNumber(String guaranteeDocNumber) {
        this.guaranteeDocNumber = guaranteeDocNumber;
    }

    /** 
     * Get the list of 'Reason' element items. Причина невозможности принятия обеспечения. Элемент Name может принимать следующие значения: DOC_NOT_FOUND - документ не найден в БД АС Обеспечение; DOC_EXPIRED - наступил срок, указанный в документе обеспечения, по истечении которого невозможно использование дополнения; FALSE_INFO - несоответствие сведений из документа обеспечения сведениям в ТД; LACK_OF_FUNDS - недостаточность суммы обеспечения; NO_FREE_FUNDS - отсутствие свободного остатка ден. средств; TECH_PROBLEM - наличие технических проблем
     * 
     * @return list
     */
    public List<ReasonType> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. Причина невозможности принятия обеспечения. Элемент Name может принимать следующие значения: DOC_NOT_FOUND - документ не найден в БД АС Обеспечение; DOC_EXPIRED - наступил срок, указанный в документе обеспечения, по истечении которого невозможно использование дополнения; FALSE_INFO - несоответствие сведений из документа обеспечения сведениям в ТД; LACK_OF_FUNDS - недостаточность суммы обеспечения; NO_FREE_FUNDS - отсутствие свободного остатка ден. средств; TECH_PROBLEM - наличие технических проблем
     * 
     * @param list
     */
    public void setReasonList(List<ReasonType> list) {
        reasonList = list;
    }
}
