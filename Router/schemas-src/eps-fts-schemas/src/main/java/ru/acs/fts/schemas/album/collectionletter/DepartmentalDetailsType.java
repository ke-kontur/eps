
package ru.acs.fts.schemas.album.collectionletter;

import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.DepartmentalInfoType;

/** 
 * ������������� ���������� �� ����������� ���������
 */
public class DepartmentalDetailsType extends DepartmentalInfoType
{
    private String uniqueID;

    /** 
     * Get the 'UniqueID' element value. ���������� ������������� �������/���������� (����� ���)
     * 
     * @return value
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /** 
     * Set the 'UniqueID' element value. ���������� ������������� �������/���������� (����� ���)
     * 
     * @param uniqueID
     */
    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}
