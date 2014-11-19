
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� ���������� ������� � ������ ����������.
 */
public class AUDAppliedPacketInfoType
{
    private String appliedPacketId;
    private String description;
    private String appliedPacketType;
    private String appliedProcessId;
    private List<AUDGTDIDType> AUDGTDIDList = new ArrayList<AUDGTDIDType>();

    /** 
     * Get the 'AppliedPacketId' element value. ���������� ������������� ������.
     * 
     * @return value
     */
    public String getAppliedPacketId() {
        return appliedPacketId;
    }

    /** 
     * Set the 'AppliedPacketId' element value. ���������� ������������� ������.
     * 
     * @param appliedPacketId
     */
    public void setAppliedPacketId(String appliedPacketId) {
        this.appliedPacketId = appliedPacketId;
    }

    /** 
     * Get the 'Description' element value. �������� ������.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. �������� ������.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'AppliedPacketType' element value. ��� ������������  ������ 01 - ���, 99 - ������
     * 
     * @return value
     */
    public String getAppliedPacketType() {
        return appliedPacketType;
    }

    /** 
     * Set the 'AppliedPacketType' element value. ��� ������������  ������ 01 - ���, 99 - ������
     * 
     * @param appliedPacketType
     */
    public void setAppliedPacketType(String appliedPacketType) {
        this.appliedPacketType = appliedPacketType;
    }

    /** 
     * Get the 'AppliedProcessId' element value. ���������� ������������� ��������
     * 
     * @return value
     */
    public String getAppliedProcessId() {
        return appliedProcessId;
    }

    /** 
     * Set the 'AppliedProcessId' element value. ���������� ������������� ��������
     * 
     * @param appliedProcessId
     */
    public void setAppliedProcessId(String appliedProcessId) {
        this.appliedProcessId = appliedProcessId;
    }

    /** 
     * Get the list of 'AUD_GTDID' element items. ���������������  ����� ��� �����������  ���   ����������  � ��������������  ������,  ���������������� ���  �������� ���
     * 
     * @return list
     */
    public List<AUDGTDIDType> getAUDGTDIDList() {
        return AUDGTDIDList;
    }

    /** 
     * Set the list of 'AUD_GTDID' element items. ���������������  ����� ��� �����������  ���   ����������  � ��������������  ������,  ���������������� ���  �������� ���
     * 
     * @param list
     */
    public void setAUDGTDIDList(List<AUDGTDIDType> list) {
        AUDGTDIDList = list;
    }
}
