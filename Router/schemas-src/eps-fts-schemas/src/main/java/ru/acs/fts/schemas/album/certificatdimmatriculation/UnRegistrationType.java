
package ru.acs.fts.schemas.album.certificatdimmatriculation;

import org.joda.time.LocalDate;

/** 
 * �������� � ������ � ����� ��
 */
public class UnRegistrationType
{
    private LocalDate date;
    private String GAIName;
    private String cause;

    /** 
     * Get the 'Date' element value. ���� ������ � �����
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ������ � �����
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'GAIName' element value. ������������ ���
     * 
     * @return value
     */
    public String getGAIName() {
        return GAIName;
    }

    /** 
     * Set the 'GAIName' element value. ������������ ���
     * 
     * @param GAIName
     */
    public void setGAIName(String GAIName) {
        this.GAIName = GAIName;
    }

    /** 
     * Get the 'Cause' element value. ����� ������� ������ � ����� ��
     * 
     * @return value
     */
    public String getCause() {
        return cause;
    }

    /** 
     * Set the 'Cause' element value. ����� ������� ������ � ����� ��
     * 
     * @param cause
     */
    public void setCause(String cause) {
        this.cause = cause;
    }
}
