
package ru.acs.fts.schemas.album.presenteddocinfores;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � ��������������  ����������
 */
public class PresentedDocumentType extends DocumentBaseType
{
    private String documentKind;

    /** 
     * Get the 'DocumentKind' element value. ��� ��������������� ���������.
     * 
     * @return value
     */
    public String getDocumentKind() {
        return documentKind;
    }

    /** 
     * Set the 'DocumentKind' element value. ��� ��������������� ���������.
     * 
     * @param documentKind
     */
    public void setDocumentKind(String documentKind) {
        this.documentKind = documentKind;
    }
}
