
package ru.acs.fts.schemas.album.pi_seaarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ���������� � ������, �� ������� ������������� ������ ��� �����������
 */
public class ProhibitedSubjectInfoType extends SupplementaryQuantityType
{
    private String name;
    private String description;

    /** 
     * Get the 'Name' element value. ������������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Description' element value. �������� ������
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. �������� ������
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
