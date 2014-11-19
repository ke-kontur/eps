
package ru.acs.fts.schemas.album.oez_notifreg;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ��������������� ����� ����������� � �����/������ �������/��������� �� �����������/���� �� �����������
 */
public class OEZNotifRegType extends BaseDocType
{
    private String documentSign;
    private CustomsType customs;
    private RegistrationNumberType registrationNumber;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'DocumentSign' element value. ��������������� �����: 1 - ����������� � ����� �������; 2 - ����������� � ������ �������; 3 - ��������� �� �����������; 4 - ���� �� �����������
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. ��������������� �����: 1 - ����������� � ����� �������; 2 - ����������� � ������ �������; 3 - ��������� �� �����������; 4 - ���� �� �����������
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ����������� � �����/������ �������
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ����������� � �����/������ �������
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
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

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
