
package ru.acs.fts.schemas.admin.int_dtresponce;

import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * Результат поиска ДТ
 */
public class INTDTResponseType extends BaseDocType
{
    private String resultCode;
    private String resultDescription;
    private String documentModeID;

    /** 
     * Get the 'ResultCode' element value.
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value.
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the 'ResultDescription' element value.
     * 
     * @return value
     */
    public String getResultDescription() {
        return resultDescription;
    }

    /** 
     * Set the 'ResultDescription' element value.
     * 
     * @param resultDescription
     */
    public void setResultDescription(String resultDescription) {
        this.resultDescription = resultDescription;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
