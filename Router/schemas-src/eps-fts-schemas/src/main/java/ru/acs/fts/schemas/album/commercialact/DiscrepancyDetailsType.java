
package ru.acs.fts.schemas.album.commercialact;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ������������ �� ��������������� ��������� ��������������
 */
public class DiscrepancyDetailsType
{
    private String recipientFlag;
    private String carrierFlag;
    private String leaksFlag;
    private List<String> leaksDescriptionList = new ArrayList<String>();

    /** 
     * Get the 'RecipientFlag' element value. ������� ����������� ������������� ��������������� � ������ ��������� ��������������: 0 - �� ������������; 1 - ������������
     * 
     * @return value
     */
    public String getRecipientFlag() {
        return recipientFlag;
    }

    /** 
     * Set the 'RecipientFlag' element value. ������� ����������� ������������� ��������������� � ������ ��������� ��������������: 0 - �� ������������; 1 - ������������
     * 
     * @param recipientFlag
     */
    public void setRecipientFlag(String recipientFlag) {
        this.recipientFlag = recipientFlag;
    }

    /** 
     * Get the 'CarrierFlag' element value. ������� ����������� ������������� ����������� � ������ ��������� ��������������: 0 - �� ������������; 1 - ������������
     * 
     * @return value
     */
    public String getCarrierFlag() {
        return carrierFlag;
    }

    /** 
     * Set the 'CarrierFlag' element value. ������� ����������� ������������� ����������� � ������ ��������� ��������������: 0 - �� ������������; 1 - ������������
     * 
     * @param carrierFlag
     */
    public void setCarrierFlag(String carrierFlag) {
        this.carrierFlag = carrierFlag;
    }

    /** 
     * Get the 'LeaksFlag' element value. ������� ������� ����������� �������� �������: 0 - �� ������������; 1 - ������������
     * 
     * @return value
     */
    public String getLeaksFlag() {
        return leaksFlag;
    }

    /** 
     * Set the 'LeaksFlag' element value. ������� ������� ����������� �������� �������: 0 - �� ������������; 1 - ������������
     * 
     * @param leaksFlag
     */
    public void setLeaksFlag(String leaksFlag) {
        this.leaksFlag = leaksFlag;
    }

    /** 
     * Get the list of 'LeaksDescription' element items. �������� ����������� �������� �������
     * 
     * @return list
     */
    public List<String> getLeaksDescriptionList() {
        return leaksDescriptionList;
    }

    /** 
     * Set the list of 'LeaksDescription' element items. �������� ����������� �������� �������
     * 
     * @param list
     */
    public void setLeaksDescriptionList(List<String> list) {
        leaksDescriptionList = list;
    }
}
