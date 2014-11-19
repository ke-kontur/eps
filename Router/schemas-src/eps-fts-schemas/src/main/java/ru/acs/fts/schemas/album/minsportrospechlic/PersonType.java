
package ru.acs.fts.schemas.album.minsportrospechlic;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � ����������
 */
public class PersonType extends OrganizationBaseType
{
    private String personStatus;

    /** 
     * Get the 'PersonStatus' element value. ������ ���������� �/� (0 - ����������� ����; 1 - ���������� ����)
     * 
     * @return value
     */
    public String getPersonStatus() {
        return personStatus;
    }

    /** 
     * Set the 'PersonStatus' element value. ������ ���������� �/� (0 - ����������� ����; 1 - ���������� ����)
     * 
     * @param personStatus
     */
    public void setPersonStatus(String personStatus) {
        this.personStatus = personStatus;
    }
}
