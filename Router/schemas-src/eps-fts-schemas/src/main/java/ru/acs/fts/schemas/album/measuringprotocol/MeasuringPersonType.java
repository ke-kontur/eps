
package ru.acs.fts.schemas.album.measuringprotocol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� � ����, ��������������/����������� ���������
 */
public class MeasuringPersonType extends PersonSignatureType
{
    private String personSign;

    /** 
     * Get the 'PersonSign' element value. ������� ����: 0 - ����������� ���������; 1 - �������������� ��� ���������� ���������
     * 
     * @return value
     */
    public String getPersonSign() {
        return personSign;
    }

    /** 
     * Set the 'PersonSign' element value. ������� ����: 0 - ����������� ���������; 1 - �������������� ��� ���������� ���������
     * 
     * @param personSign
     */
    public void setPersonSign(String personSign) {
        this.personSign = personSign;
    }
}
