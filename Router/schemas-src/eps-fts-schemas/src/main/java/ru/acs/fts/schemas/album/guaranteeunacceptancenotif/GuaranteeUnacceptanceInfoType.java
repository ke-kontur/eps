
package ru.acs.fts.schemas.album.guaranteeunacceptancenotif;

import java.util.ArrayList;
import java.util.List;

/** 
 * —ведени€ о невозможности использовани€ обеспечени€
 */
public class GuaranteeUnacceptanceInfoType
{
    private String measureCode;
    private String guaranteeDocNumber;
    private List<ReasonType> reasonList = new ArrayList<ReasonType>();

    /** 
     * Get the 'MeasureCode' element value.  од меры обеспечени€
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value.  од меры обеспечени€
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the 'GuaranteeDocNumber' element value. Ќомер документа обеспечени€
     * 
     * @return value
     */
    public String getGuaranteeDocNumber() {
        return guaranteeDocNumber;
    }

    /** 
     * Set the 'GuaranteeDocNumber' element value. Ќомер документа обеспечени€
     * 
     * @param guaranteeDocNumber
     */
    public void setGuaranteeDocNumber(String guaranteeDocNumber) {
        this.guaranteeDocNumber = guaranteeDocNumber;
    }

    /** 
     * Get the list of 'Reason' element items. ѕричина невозможности прин€ти€ обеспечени€. Ёлемент Name может принимать следующие значени€: DOC_NOT_FOUND - документ не найден в Ѕƒ ј— ќбеспечение; DOC_EXPIRED - наступил срок, указанный в документе обеспечени€, по истечении которого невозможно использование дополнени€; FALSE_INFO - несоответствие сведений из документа обеспечени€ сведени€м в “ƒ; LACK_OF_FUNDS - недостаточность суммы обеспечени€; NO_FREE_FUNDS - отсутствие свободного остатка ден. средств; TECH_PROBLEM - наличие технических проблем
     * 
     * @return list
     */
    public List<ReasonType> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. ѕричина невозможности прин€ти€ обеспечени€. Ёлемент Name может принимать следующие значени€: DOC_NOT_FOUND - документ не найден в Ѕƒ ј— ќбеспечение; DOC_EXPIRED - наступил срок, указанный в документе обеспечени€, по истечении которого невозможно использование дополнени€; FALSE_INFO - несоответствие сведений из документа обеспечени€ сведени€м в “ƒ; LACK_OF_FUNDS - недостаточность суммы обеспечени€; NO_FREE_FUNDS - отсутствие свободного остатка ден. средств; TECH_PROBLEM - наличие технических проблем
     * 
     * @param list
     */
    public void setReasonList(List<ReasonType> list) {
        reasonList = list;
    }
}
