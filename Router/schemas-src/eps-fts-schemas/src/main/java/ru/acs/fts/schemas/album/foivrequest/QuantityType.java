
package ru.acs.fts.schemas.album.foivrequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ����������
 */
public class QuantityType extends SupplementaryQuantityType
{
    private String UUID;

    /** 
     * Get the 'UUID' element value. ������������� ������� ���������
     * 
     * @return value
     */
    public String getUUID() {
        return UUID;
    }

    /** 
     * Set the 'UUID' element value. ������������� ������� ���������
     * 
     * @param UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
}
