
package ru.acs.fts.schemas.album.esadoutp;

import org.joda.time.LocalDate;

/** 
 * ��������������
 */
public class ConfirmingOrganizationType
{
    private LocalDate date;
    private String organizationName;
    private String organizationSign;
    private PersonInfoType senderName;

    /** 
     * Get the 'Date' element value. ���� ����������� ����������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ����������� ����������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ �����������, �������������� �������� ����������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �����������, �������������� �������� ����������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'OrganizationSign' element value. ��������������: 0 - � �������� �������; 1 - �� ���������� �������
     * 
     * @return value
     */
    public String getOrganizationSign() {
        return organizationSign;
    }

    /** 
     * Set the 'OrganizationSign' element value. ��������������: 0 - � �������� �������; 1 - �� ���������� �������
     * 
     * @param organizationSign
     */
    public void setOrganizationSign(String organizationSign) {
        this.organizationSign = organizationSign;
    }

    /** 
     * Get the 'SenderName' element value. ��� ����, �������������� ��������
     * 
     * @return value
     */
    public PersonInfoType getSenderName() {
        return senderName;
    }

    /** 
     * Set the 'SenderName' element value. ��� ����, �������������� ��������
     * 
     * @param senderName
     */
    public void setSenderName(PersonInfoType senderName) {
        this.senderName = senderName;
    }
}
