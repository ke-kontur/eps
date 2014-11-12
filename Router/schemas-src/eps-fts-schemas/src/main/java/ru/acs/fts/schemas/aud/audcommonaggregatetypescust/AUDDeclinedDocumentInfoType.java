
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о документе архива, в доступе к которому отказано.
 */
public class AUDDeclinedDocumentInfoType
{
    private String archiveDocumentId;
    private AUDResultInfoType resultInfo;

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
     * Get the 'ResultInfo' element value. Информация о причине отказа в доступе.
     * 
     * @return value
     */
    public AUDResultInfoType getResultInfo() {
        return resultInfo;
    }

    /** 
     * Set the 'ResultInfo' element value. Информация о причине отказа в доступе.
     * 
     * @param resultInfo
     */
    public void setResultInfo(AUDResultInfoType resultInfo) {
        this.resultInfo = resultInfo;
    }
}
