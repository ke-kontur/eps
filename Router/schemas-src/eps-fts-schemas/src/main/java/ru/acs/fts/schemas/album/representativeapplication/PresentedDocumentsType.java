
package ru.acs.fts.schemas.album.representativeapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � �������������� ����������
 */
public class PresentedDocumentsType extends DocumentBaseType
{
    private String documentModeCode;

    /** 
     * Get the 'DocumentModeCode' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. ��� ���� ���������
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
