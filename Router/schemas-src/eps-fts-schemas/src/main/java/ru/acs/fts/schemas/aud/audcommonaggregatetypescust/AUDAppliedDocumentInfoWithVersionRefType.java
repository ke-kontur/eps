
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о документе от прикладной системы, с указанием ссылки на прежнюю версию документа.
 */
public class AUDAppliedDocumentInfoWithVersionRefType
        extends
            AUDAppliedDocumentInfoType
{
    private String prevVersionArchiveDocumentId;

    /** 
     * Get the 'PrevVersionArchiveDocumentId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если документ представляет собой новую (следующую) версию уже хранимого документа.
     * 
     * @return value
     */
    public String getPrevVersionArchiveDocumentId() {
        return prevVersionArchiveDocumentId;
    }

    /** 
     * Set the 'PrevVersionArchiveDocumentId' element value. Архивный идентификатор документа прежней версии. Указывается в случае, если документ представляет собой новую (следующую) версию уже хранимого документа.
     * 
     * @param prevVersionArchiveDocumentId
     */
    public void setPrevVersionArchiveDocumentId(
            String prevVersionArchiveDocumentId) {
        this.prevVersionArchiveDocumentId = prevVersionArchiveDocumentId;
    }
}
