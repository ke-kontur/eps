
package ru.acs.fts.schemas.album.inventoryin;

import org.joda.time.LocalDate;

/** 
 * �������� �������, �� �������� ��������������� ��������.
 */
public class RequestDescriptionType
{
    private String requestNumber;
    private LocalDate requestDate;

    /** 
     * Get the 'RequestNumber' element value. ���������� ����� ������� �� �� � �������������� �������������� ����������
     * 
     * @return value
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /** 
     * Set the 'RequestNumber' element value. ���������� ����� ������� �� �� � �������������� �������������� ����������
     * 
     * @param requestNumber
     */
    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber;
    }

    /** 
     * Get the 'RequestDate' element value. ���� ������������ �������
     * 
     * @return value
     */
    public LocalDate getRequestDate() {
        return requestDate;
    }

    /** 
     * Set the 'RequestDate' element value. ���� ������������ �������
     * 
     * @param requestDate
     */
    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }
}
