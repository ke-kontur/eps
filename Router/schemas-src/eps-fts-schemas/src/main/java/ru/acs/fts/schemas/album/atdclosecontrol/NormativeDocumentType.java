
package ru.acs.fts.schemas.album.atdclosecontrol;

import org.joda.time.LocalDate;

/** 
 * ����������� ��������
 */
public class NormativeDocumentType
{
    private String documentType;
    private String organizationName;
    private LocalDate documentDate;
    private String documentNumber;

    /** 
     * Get the 'DocumentType' element value. ������ �� ��� ������������ ���������
     * 
     * @return value
     */
    public String getDocumentType() {
        return documentType;
    }

    /** 
     * Set the 'DocumentType' element value. ������ �� ��� ������������ ���������
     * 
     * @param documentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /** 
     * Get the 'OrganizationName' element value. �����, ��������� ����������� ��������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. �����, ��������� ����������� ��������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'DocumentDate' element value. ���� �������� ������������ ���������
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. ���� �������� ������������ ���������
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'DocumentNumber' element value. ����� ������������ ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ������������ ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
