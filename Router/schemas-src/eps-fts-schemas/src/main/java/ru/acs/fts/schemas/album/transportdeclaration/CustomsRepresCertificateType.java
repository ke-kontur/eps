
package ru.acs.fts.schemas.album.transportdeclaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������������� � ��������� ���� � ������ ���������� ��������������
 */
public class CustomsRepresCertificateType extends DocumentBaseType
{
    private String documentModeCode;

    /** 
     * Get the 'DocumentModeCode' element value. ��� ���������:2 - ������������� �����������  ������������� (������� ); 3 - ������������� ����������� �������������.
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. ��� ���������:2 - ������������� �����������  ������������� (������� ); 3 - ������������� ����������� �������������.
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
