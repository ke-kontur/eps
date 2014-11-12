
package ru.acs.fts.schemas.album.actregistrationmining;

import org.joda.time.LocalDate;

/** 
 * ����������
 */
public class ResolutionType
{
    private String resolutionNumber;
    private LocalDate resolutionDate;
    private String issued;

    /** 
     * Get the 'ResolutionNumber' element value. ����� ����������
     * 
     * @return value
     */
    public String getResolutionNumber() {
        return resolutionNumber;
    }

    /** 
     * Set the 'ResolutionNumber' element value. ����� ����������
     * 
     * @param resolutionNumber
     */
    public void setResolutionNumber(String resolutionNumber) {
        this.resolutionNumber = resolutionNumber;
    }

    /** 
     * Get the 'ResolutionDate' element value. ���� ����������
     * 
     * @return value
     */
    public LocalDate getResolutionDate() {
        return resolutionDate;
    }

    /** 
     * Set the 'ResolutionDate' element value. ���� ����������
     * 
     * @param resolutionDate
     */
    public void setResolutionDate(LocalDate resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    /** 
     * Get the 'Issued' element value. ��� ������
     * 
     * @return value
     */
    public String getIssued() {
        return issued;
    }

    /** 
     * Set the 'Issued' element value. ��� ������
     * 
     * @param issued
     */
    public void setIssued(String issued) {
        this.issued = issued;
    }
}
