
package ru.acs.fts.schemas.album.goodscomponentlist;

/** 
 * �������� � ���������� ��������������� �����
 */
public class MechUnitPartType
        extends
            ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.MechUnitPartType
{
    private String serviceID;

    /** 
     * Get the 'ServiceID' element value. ��������� ����� ����������
     * 
     * @return value
     */
    public String getServiceID() {
        return serviceID;
    }

    /** 
     * Set the 'ServiceID' element value. ��������� ����� ����������
     * 
     * @param serviceID
     */
    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }
}
