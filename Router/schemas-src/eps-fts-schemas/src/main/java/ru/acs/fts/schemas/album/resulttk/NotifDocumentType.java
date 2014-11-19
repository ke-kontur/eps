
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� �� �����������
 */
public class NotifDocumentType
{
    private String notifID;
    private String notifNumber;
    private String countryCode;
    private CUCustomsType customs;
    private CustomsPersonType customsPerson;
    private PersonBaseType driver;

    /** 
     * Get the 'NotifID' element value. ������������� �����������
     * 
     * @return value
     */
    public String getNotifID() {
        return notifID;
    }

    /** 
     * Set the 'NotifID' element value. ������������� �����������
     * 
     * @param notifID
     */
    public void setNotifID(String notifID) {
        this.notifID = notifID;
    }

    /** 
     * Get the 'NotifNumber' element value. ����� ����������� 
     * 
     * @return value
     */
    public String getNotifNumber() {
        return notifNumber;
    }

    /** 
     * Set the 'NotifNumber' element value. ����� ����������� 
     * 
     * @param notifNumber
     */
    public void setNotifNumber(String notifNumber) {
        this.notifNumber = notifNumber;
    }

    /** 
     * Get the 'CountryCode' element value. ��� ������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��� ������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'Customs' element value. ����������� �����, � ������� ���������� ������������ ���������
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ����������� �����, � ������� ���������� ������������ ���������
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. ���������, �������� �����������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ���������, �������� �����������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Driver' element value. ��������
     * 
     * @return value
     */
    public PersonBaseType getDriver() {
        return driver;
    }

    /** 
     * Set the 'Driver' element value. ��������
     * 
     * @param driver
     */
    public void setDriver(PersonBaseType driver) {
        this.driver = driver;
    }
}
