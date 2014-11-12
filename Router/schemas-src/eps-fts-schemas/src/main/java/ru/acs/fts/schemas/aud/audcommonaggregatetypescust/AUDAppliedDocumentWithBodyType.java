
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация прикладной системы о документе и, возможно, тело документа.
 */
public class AUDAppliedDocumentWithBodyType extends AUDAppliedDocumentInfoType
{
    private AUDDocumentBodyType documentBody;

    /** 
     * Get the 'DocumentBody' element value. Тело документа.
     * 
     * @return value
     */
    public AUDDocumentBodyType getDocumentBody() {
        return documentBody;
    }

    /** 
     * Set the 'DocumentBody' element value. Тело документа.
     * 
     * @param documentBody
     */
    public void setDocumentBody(AUDDocumentBodyType documentBody) {
        this.documentBody = documentBody;
    }
}
