
package ru.acs.fts.schemas.album.liquidationact;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����, �������������� ��� �����������
 */
public class ParticipatedPersonType extends PersonSignatureType
{
    private String personSign;

    /** 
     * Get the 'PersonSign' element value. ������� ����: 0 - �� ��������������� ����������� ������; 1 - �� ��������� (��������� ���/����������/����������� �������������); 2 - �� �����������, �������������� �����������
     * 
     * @return value
     */
    public String getPersonSign() {
        return personSign;
    }

    /** 
     * Set the 'PersonSign' element value. ������� ����: 0 - �� ��������������� ����������� ������; 1 - �� ��������� (��������� ���/����������/����������� �������������); 2 - �� �����������, �������������� �����������
     * 
     * @param personSign
     */
    public void setPersonSign(String personSign) {
        this.personSign = personSign;
    }
}
