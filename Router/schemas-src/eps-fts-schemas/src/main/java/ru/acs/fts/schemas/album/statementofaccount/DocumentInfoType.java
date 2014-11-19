
package ru.acs.fts.schemas.album.statementofaccount;

import org.joda.time.LocalDate;

/** 
 * ���������� � ������������ ����� ���������
 */
public class DocumentInfoType
{
    private String organizationName;
    private LocalDate creationDate;
    private String creationTime;

    /** 
     * Get the 'OrganizationName' element value. ������������ ����������, ������������ �����
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ����������, ������������ �����
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'CreationDate' element value. ���� ������������ �����
     * 
     * @return value
     */
    public LocalDate getCreationDate() {
        return creationDate;
    }

    /** 
     * Set the 'CreationDate' element value. ���� ������������ �����
     * 
     * @param creationDate
     */
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    /** 
     * Get the 'CreationTime' element value. ����� ������������ �����
     * 
     * @return value
     */
    public String getCreationTime() {
        return creationTime;
    }

    /** 
     * Set the 'CreationTime' element value. ����� ������������ �����
     * 
     * @param creationTime
     */
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
