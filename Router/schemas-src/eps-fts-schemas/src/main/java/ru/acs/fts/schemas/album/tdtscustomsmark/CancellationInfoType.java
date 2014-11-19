
package ru.acs.fts.schemas.album.tdtscustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * �������� �� ������
 */
public class CancellationInfoType
{
    private LocalDate date;
    private String time;
    private String foundation;
    private String resolutionDescription;
    private CustomsPersonType customsPerson;

    /** 
     * Get the 'Date' element value. ����
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ����
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. �����
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. �����
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'Foundation' element value. �����������
     * 
     * @return value
     */
    public String getFoundation() {
        return foundation;
    }

    /** 
     * Set the 'Foundation' element value. �����������
     * 
     * @param foundation
     */
    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    /** 
     * Get the 'ResolutionDescription' element value. �������� ��������� �������
     * 
     * @return value
     */
    public String getResolutionDescription() {
        return resolutionDescription;
    }

    /** 
     * Set the 'ResolutionDescription' element value. �������� ��������� �������
     * 
     * @param resolutionDescription
     */
    public void setResolutionDescription(String resolutionDescription) {
        this.resolutionDescription = resolutionDescription;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }
}
