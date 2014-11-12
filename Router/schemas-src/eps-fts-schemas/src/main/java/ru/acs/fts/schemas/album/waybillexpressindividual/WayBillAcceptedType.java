
package ru.acs.fts.schemas.album.waybillexpressindividual;

/** 
 * ��������� ���� �������: ����, ����� � ��� ���������� ����
 */
public class WayBillAcceptedType
{
    private String dateTime;
    private String personName;

    /** 
     * Get the 'DateTime' element value. ���� � ����� �������� ���������
     * 
     * @return value
     */
    public String getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'DateTime' element value. ���� � ����� �������� ���������
     * 
     * @param dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /** 
     * Get the 'PersonName' element value. ��� ����, ���������� ���������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. ��� ����, ���������� ���������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
