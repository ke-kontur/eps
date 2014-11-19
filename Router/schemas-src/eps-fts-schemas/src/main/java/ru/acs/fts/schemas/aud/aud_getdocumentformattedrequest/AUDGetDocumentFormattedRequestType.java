
package ru.acs.fts.schemas.aud.aud_getdocumentformattedrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Запрос на получение данных для отображения документа архива.
 */
public class AUDGetDocumentFormattedRequestType extends AUDBaseEnvelopeType
{
    private String archiveDocumentId;
    private String representationKindId;
    private String documentModeID;

    /** 
     * Get the 'ArchiveDocumentId' element value. Архивный идентификатор документа.
     * 
     * @return value
     */
    public String getArchiveDocumentId() {
        return archiveDocumentId;
    }

    /** 
     * Set the 'ArchiveDocumentId' element value. Архивный идентификатор документа.
     * 
     * @param archiveDocumentId
     */
    public void setArchiveDocumentId(String archiveDocumentId) {
        this.archiveDocumentId = archiveDocumentId;
    }

    /** 
     * Get the 'RepresentationKindId' element value. Идентификатор вида представления (используемого для визуализации документа).
     * 
     * @return value
     */
    public String getRepresentationKindId() {
        return representationKindId;
    }

    /** 
     * Set the 'RepresentationKindId' element value. Идентификатор вида представления (используемого для визуализации документа).
     * 
     * @param representationKindId
     */
    public void setRepresentationKindId(String representationKindId) {
        this.representationKindId = representationKindId;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
