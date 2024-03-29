
package ru.acs.fts.schemas.admin.confirmwhdocregremote;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * ������������� ����������� ��������� (���)
 */
public class ConfirmWHDocRegRemoteType extends BaseDocType
{
    private List<EADInfoType> EADInfoList = new ArrayList<EADInfoType>();
    private GTDIDType GTDID;
    private String documentModeID;

    /** 
     * Get the list of 'EADInfo' element items. ���������� � ���������� � ������ ����������
     * 
     * @return list
     */
    public List<EADInfoType> getEADInfoList() {
        return EADInfoList;
    }

    /** 
     * Set the list of 'EADInfo' element items. ���������� � ���������� � ������ ����������
     * 
     * @param list
     */
    public void setEADInfoList(List<EADInfoType> list) {
        EADInfoList = list;
    }

    /** 
     * Get the 'GTDID' element value. ���������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ���������� ����� ��
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
