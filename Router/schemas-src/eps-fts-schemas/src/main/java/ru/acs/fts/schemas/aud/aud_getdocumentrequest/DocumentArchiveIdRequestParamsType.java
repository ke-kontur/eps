
package ru.acs.fts.schemas.aud.aud_getdocumentrequest;

import ru.acs.fts.schemas.aud.audcommonleaftypescust.AUDDocumentVersionsRequestType;

/** 
 * Параметры запроса документа по архивному идентификатору.
 */
public class DocumentArchiveIdRequestParamsType
{
    private String archiveDocumentId;
    private AUDDocumentVersionsRequestType documentVersionsRequirements;

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
     * Get the 'DocumentVersionsRequirements' element value. Указывает, какие версии документа с заданным архивным идентификатором требуется предоставить. Если значение не указано - предоставляется только документ с архивным идентификатором, указанным в элементе ArchiveDocumentId. Если указано значение 'all_versions' - предоставляются все версии документа, прежние и более новые. Если указано значение 'last_version' - предоставляется только последняя (актуальная) версия.
     * 
     * @return value
     */
    public AUDDocumentVersionsRequestType getDocumentVersionsRequirements() {
        return documentVersionsRequirements;
    }

    /** 
     * Set the 'DocumentVersionsRequirements' element value. Указывает, какие версии документа с заданным архивным идентификатором требуется предоставить. Если значение не указано - предоставляется только документ с архивным идентификатором, указанным в элементе ArchiveDocumentId. Если указано значение 'all_versions' - предоставляются все версии документа, прежние и более новые. Если указано значение 'last_version' - предоставляется только последняя (актуальная) версия.
     * 
     * @param documentVersionsRequirements
     */
    public void setDocumentVersionsRequirements(
            AUDDocumentVersionsRequestType documentVersionsRequirements) {
        this.documentVersionsRequirements = documentVersionsRequirements;
    }
}
