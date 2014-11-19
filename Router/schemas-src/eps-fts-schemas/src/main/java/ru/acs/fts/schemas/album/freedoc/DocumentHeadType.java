
package ru.acs.fts.schemas.album.freedoc;

import org.joda.time.LocalDate;

/** 
 * ��������� ���������
 */
public class DocumentHeadType
{
    private String documentName;
    private LocalDate documentDate;
    private String documentNumber;
    private String organizationName;
    private String visibleFlag;

    /** 
     * Get the 'DocumentName' element value. ������������ ���������
     * 
     * @return value
     */
    public String getDocumentName() {
        return documentName;
    }

    /** 
     * Set the 'DocumentName' element value. ������������ ���������
     * 
     * @param documentName
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /** 
     * Get the 'DocumentDate' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. ���� ���������
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������. � ������, ���� ������ ���, ����������� "�/�"
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������. � ������, ���� ������ ���, ����������� "�/�"
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ �����������,  �������� ��������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �����������,  �������� ��������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'VisibleFlag' attribute value.
     * 
     * @return value
     */
    public String getVisibleFlag() {
        return visibleFlag;
    }

    /** 
     * Set the 'VisibleFlag' attribute value.
     * 
     * @param visibleFlag
     */
    public void setVisibleFlag(String visibleFlag) {
        this.visibleFlag = visibleFlag;
    }
}
