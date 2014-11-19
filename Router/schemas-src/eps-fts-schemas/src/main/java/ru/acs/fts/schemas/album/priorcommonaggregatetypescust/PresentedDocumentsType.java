
package ru.acs.fts.schemas.album.priorcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������, �������������� ���������� ��������
 */
public class PresentedDocumentsType extends DocumentBaseType
{
    private String presentedDocumentModeCode;
    private String organizationName;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������(����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������(����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ ������, ��������� ��������. ��� ������������� ���������� ������������� ����������� ����� ����������� CMR
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ������, ��������� ��������. ��� ������������� ���������� ������������� ����������� ����� ����������� CMR
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
