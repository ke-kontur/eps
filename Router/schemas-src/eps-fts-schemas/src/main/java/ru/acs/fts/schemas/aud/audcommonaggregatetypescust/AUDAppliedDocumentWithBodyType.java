
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� ���������� ������� � ��������� �, ��������, ���� ���������.
 */
public class AUDAppliedDocumentWithBodyType extends AUDAppliedDocumentInfoType
{
    private AUDDocumentBodyType documentBody;

    /** 
     * Get the 'DocumentBody' element value. ���� ���������.
     * 
     * @return value
     */
    public AUDDocumentBodyType getDocumentBody() {
        return documentBody;
    }

    /** 
     * Set the 'DocumentBody' element value. ���� ���������.
     * 
     * @param documentBody
     */
    public void setDocumentBody(AUDDocumentBodyType documentBody) {
        this.documentBody = documentBody;
    }
}
