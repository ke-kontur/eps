
package ru.acs.fts.schemas.aud.aud_registryresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ������ ����������,  �����������  � ������
 */
public class AUDRegistryResponseType extends AUDBaseEnvelopeType
{
    private boolean nullFlag;
    private List<RegistryPacketInfoType> AUDPacketRegistryRowList = new ArrayList<RegistryPacketInfoType>();
    private String documentModeID;

    /** 
     * Get the 'NullFlag' element value. ������� �������  �������  � �������. true - ������������ false -  �����������
     * 
     * @return value
     */
    public boolean isNullFlag() {
        return nullFlag;
    }

    /** 
     * Set the 'NullFlag' element value. ������� �������  �������  � �������. true - ������������ false -  �����������
     * 
     * @param nullFlag
     */
    public void setNullFlag(boolean nullFlag) {
        this.nullFlag = nullFlag;
    }

    /** 
     * Get the list of 'AUD_PacketRegistryRow' element items. �������� �  �����������  �������
     * 
     * @return list
     */
    public List<RegistryPacketInfoType> getAUDPacketRegistryRowList() {
        return AUDPacketRegistryRowList;
    }

    /** 
     * Set the list of 'AUD_PacketRegistryRow' element items. �������� �  �����������  �������
     * 
     * @param list
     */
    public void setAUDPacketRegistryRowList(List<RegistryPacketInfoType> list) {
        AUDPacketRegistryRowList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
