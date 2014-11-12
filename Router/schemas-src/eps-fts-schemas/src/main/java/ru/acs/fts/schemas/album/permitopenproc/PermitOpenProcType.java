
package ru.acs.fts.schemas.album.permitopenproc;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Уведомление об открытии процедуры декларирования.
 */
public class PermitOpenProcType extends BaseDocType
{
    private String procedureID;
    private String documentModeID;

    /** 
     * Get the 'ProcedureID' element value. ID процедуры декларирования
     * 
     * @return value
     */
    public String getProcedureID() {
        return procedureID;
    }

    /** 
     * Set the 'ProcedureID' element value. ID процедуры декларирования
     * 
     * @param procedureID
     */
    public void setProcedureID(String procedureID) {
        this.procedureID = procedureID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
