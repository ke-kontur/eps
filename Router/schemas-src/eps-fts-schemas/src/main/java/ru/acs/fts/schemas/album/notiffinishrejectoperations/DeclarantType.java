
package ru.acs.fts.schemas.album.notiffinishrejectoperations;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * �������� � ����������/���� ����, ���������� ������������ � ��������� ������� � (���) ������������ �������, � �� ��������������.
 */
public class DeclarantType extends OrganizationBaseType
{
    private OrganizationBaseType representative;

    /** 
     * Get the 'Representative' element value. �������������
     * 
     * @return value
     */
    public OrganizationBaseType getRepresentative() {
        return representative;
    }

    /** 
     * Set the 'Representative' element value. �������������
     * 
     * @param representative
     */
    public void setRepresentative(OrganizationBaseType representative) {
        this.representative = representative;
    }
}
