
package ru.acs.fts.schemas.album.exchangecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ���������, ������������� ����������.
 */
public class DeclPersonType extends PersonBaseType
{
    private AuthoritesDocumentType authoritesDocument;

    /** 
     * Get the 'AuthoritesDocument' element value. ��������, �������������� ����������. 
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocument() {
        return authoritesDocument;
    }

    /** 
     * Set the 'AuthoritesDocument' element value. ��������, �������������� ����������. 
     * 
     * @param authoritesDocument
     */
    public void setAuthoritesDocument(AuthoritesDocumentType authoritesDocument) {
        this.authoritesDocument = authoritesDocument;
    }
}
