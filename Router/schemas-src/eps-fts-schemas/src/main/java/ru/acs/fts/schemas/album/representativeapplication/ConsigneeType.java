
package ru.acs.fts.schemas.album.representativeapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * ����������
 */
public class ConsigneeType extends CUOrganizationType
{
    private String consigneeSign;

    /** 
     * Get the 'ConsigneeSign' element value. ������� ����������: 0 - �� ���������������������� ����������; 1 - �� ������������
     * 
     * @return value
     */
    public String getConsigneeSign() {
        return consigneeSign;
    }

    /** 
     * Set the 'ConsigneeSign' element value. ������� ����������: 0 - �� ���������������������� ����������; 1 - �� ������������
     * 
     * @param consigneeSign
     */
    public void setConsigneeSign(String consigneeSign) {
        this.consigneeSign = consigneeSign;
    }
}
