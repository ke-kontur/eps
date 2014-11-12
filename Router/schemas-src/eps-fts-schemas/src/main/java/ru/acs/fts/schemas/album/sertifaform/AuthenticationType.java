
package ru.acs.fts.schemas.album.sertifaform;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� �� ������������� �����������
 */
public class AuthenticationType extends DocumentBaseType
{
    private String agency;
    private String place;
    private PersonSignatureType authSign;

    /** 
     * Get the 'Agency' element value. ������������ ������, ��������������� � ������������ � ������������ ����������������� ������������ ������������� �������
     * 
     * @return value
     */
    public String getAgency() {
        return agency;
    }

    /** 
     * Set the 'Agency' element value. ������������ ������, ��������������� � ������������ � ������������ ����������������� ������������ ������������� �������
     * 
     * @param agency
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /** 
     * Get the 'Place' element value. ����� ������.
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. ����� ������.
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /** 
     * Get the 'AuthSign' element value. ������� ������������ ���� �����������, �������������� ������������� �������
     * 
     * @return value
     */
    public PersonSignatureType getAuthSign() {
        return authSign;
    }

    /** 
     * Set the 'AuthSign' element value. ������� ������������ ���� �����������, �������������� ������������� �������
     * 
     * @param authSign
     */
    public void setAuthSign(PersonSignatureType authSign) {
        this.authSign = authSign;
    }
}
