
package ru.acs.fts.schemas.album.previousrequestinfo;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * �������� � ����� ����������� ��������
 */
public class PreviousRequestsType
{
    private LocalDate previousRequestDate;
    private String previousRequestTime;
    private CustomsType customs;

    /** 
     * Get the 'PreviousRequestDate' element value. ���� �������
     * 
     * @return value
     */
    public LocalDate getPreviousRequestDate() {
        return previousRequestDate;
    }

    /** 
     * Set the 'PreviousRequestDate' element value. ���� �������
     * 
     * @param previousRequestDate
     */
    public void setPreviousRequestDate(LocalDate previousRequestDate) {
        this.previousRequestDate = previousRequestDate;
    }

    /** 
     * Get the 'PreviousRequestTime' element value. ����� �������
     * 
     * @return value
     */
    public String getPreviousRequestTime() {
        return previousRequestTime;
    }

    /** 
     * Set the 'PreviousRequestTime' element value. ����� �������
     * 
     * @param previousRequestTime
     */
    public void setPreviousRequestTime(String previousRequestTime) {
        this.previousRequestTime = previousRequestTime;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }
}
