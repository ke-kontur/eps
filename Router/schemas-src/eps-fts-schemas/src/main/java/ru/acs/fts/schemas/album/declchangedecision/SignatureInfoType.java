
package ru.acs.fts.schemas.album.declchangedecision;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� � �����������/��������� �������
 */
public class SignatureInfoType
{
    private String personName;
    private LocalDate date;
    private AddressType sendAddress;

    /** 
     * Get the 'PersonName' element value. �.�.�. ������������� ����, �������������� ������, ����������� �������/������������ ���� ����������� ������, ������������ �������
     * 
     * @return value
     */
    public String getPersonName() {
        return personName;
    }

    /** 
     * Set the 'PersonName' element value. �.�.�. ������������� ����, �������������� ������, ����������� �������/������������ ���� ����������� ������, ������������ �������
     * 
     * @param personName
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /** 
     * Get the 'Date' element value. ���� ��������� �������/���� ����������� �������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� ��������� �������/���� ����������� �������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'SendAddress' element value. ����� ����������� �������
     * 
     * @return value
     */
    public AddressType getSendAddress() {
        return sendAddress;
    }

    /** 
     * Set the 'SendAddress' element value. ����� ����������� �������
     * 
     * @param sendAddress
     */
    public void setSendAddress(AddressType sendAddress) {
        this.sendAddress = sendAddress;
    }
}
