
package ru.acs.fts.schemas.album.actinspectionin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * АТД - документ по которому проведен таможенный досмотр
 */
public class InspectionDocumentType extends DocumentBaseType
{
    private String presentedDocumentModeCode;
    private String custWaybillNumber;
    private String recordNumber;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. Код вида документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. Код вида документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'CustWaybillNumber' element value. Таможенный номер накладной
     * 
     * @return value
     */
    public String getCustWaybillNumber() {
        return custWaybillNumber;
    }

    /** 
     * Set the 'CustWaybillNumber' element value. Таможенный номер накладной
     * 
     * @param custWaybillNumber
     */
    public void setCustWaybillNumber(String custWaybillNumber) {
        this.custWaybillNumber = custWaybillNumber;
    }

    /** 
     * Get the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
