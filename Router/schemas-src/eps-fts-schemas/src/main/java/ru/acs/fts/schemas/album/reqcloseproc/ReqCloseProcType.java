
package ru.acs.fts.schemas.album.reqcloseproc;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Запрос на закрытие предварительной процедуры / процедуры декларирования
 */
public class ReqCloseProcType extends BaseDocType
{
    private String closeProcedureID;
    private OrganizationType declarant;
    private String documentModeID;

    /** 
     * Get the 'CloseProcedureID' element value. Идентификатор  процедуры декларирования.
     * 
     * @return value
     */
    public String getCloseProcedureID() {
        return closeProcedureID;
    }

    /** 
     * Set the 'CloseProcedureID' element value. Идентификатор  процедуры декларирования.
     * 
     * @param closeProcedureID
     */
    public void setCloseProcedureID(String closeProcedureID) {
        this.closeProcedureID = closeProcedureID;
    }

    /** 
     * Get the 'Declarant' element value. Информация об участнике ВЭД.
     * 
     * @return value
     */
    public OrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Информация об участнике ВЭД.
     * 
     * @param declarant
     */
    public void setDeclarant(OrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Уникальный идентификатор документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Уникальный идентификатор документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
