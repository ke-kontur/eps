
package ru.acs.fts.schemas.album.scvvcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������� ��������. (��� ����, ������������, �����, ����)
 */
public class SCVVPresentedDocumentType extends DocumentBaseType
{
    private String presentedDocumentModeCode;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }
}
