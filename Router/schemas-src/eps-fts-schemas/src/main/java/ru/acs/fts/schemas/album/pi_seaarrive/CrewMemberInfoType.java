
package ru.acs.fts.schemas.album.pi_seaarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� � ����� �������
 */
public class CrewMemberInfoType extends PersonBaseType
{
    private String nationality;

    /** 
     * Get the 'Nationality' element value. ����������� (����� ��� ������)
     * 
     * @return value
     */
    public String getNationality() {
        return nationality;
    }

    /** 
     * Set the 'Nationality' element value. ����������� (����� ��� ������)
     * 
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
