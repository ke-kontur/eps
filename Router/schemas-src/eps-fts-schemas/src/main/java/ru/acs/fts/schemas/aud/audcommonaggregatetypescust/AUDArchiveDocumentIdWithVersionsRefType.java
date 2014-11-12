
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о предыдущей и следующей версиях архивного документа.
 */
public class AUDArchiveDocumentIdWithVersionsRefType
{
    private String prevVersionArchiveDocumentId;
    private String nextVersionArchiveDocumentId;

    /** 
     * Get the 'PrevVersionArchiveDocumentId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если данный документ заменил собой другой архивный документ, прежней версии.
     * 
     * @return value
     */
    public String getPrevVersionArchiveDocumentId() {
        return prevVersionArchiveDocumentId;
    }

    /** 
     * Set the 'PrevVersionArchiveDocumentId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если данный документ заменил собой другой архивный документ, прежней версии.
     * 
     * @param prevVersionArchiveDocumentId
     */
    public void setPrevVersionArchiveDocumentId(
            String prevVersionArchiveDocumentId) {
        this.prevVersionArchiveDocumentId = prevVersionArchiveDocumentId;
    }

    /** 
     * Get the 'NextVersionArchiveDocumentId' element value. Архивный идентификатор документа следующей версии. Указывается в случае, если данный документ был заменен другим архивным документом, следующей версии.
     * 
     * @return value
     */
    public String getNextVersionArchiveDocumentId() {
        return nextVersionArchiveDocumentId;
    }

    /** 
     * Set the 'NextVersionArchiveDocumentId' element value. Архивный идентификатор документа следующей версии. Указывается в случае, если данный документ был заменен другим архивным документом, следующей версии.
     * 
     * @param nextVersionArchiveDocumentId
     */
    public void setNextVersionArchiveDocumentId(
            String nextVersionArchiveDocumentId) {
        this.nextVersionArchiveDocumentId = nextVersionArchiveDocumentId;
    }
}
