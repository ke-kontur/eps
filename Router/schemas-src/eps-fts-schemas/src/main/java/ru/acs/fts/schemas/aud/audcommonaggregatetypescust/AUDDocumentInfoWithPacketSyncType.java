
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

public class AUDDocumentInfoWithPacketSyncType
        extends
            AUDDocumentInfoWithPacketType
{
    private String documenVersionChaintId;
    private List<AUDEmbeddedDocumentArchiveInfoSyncType> embeddedDocumentArchiveInfoSyncList = new ArrayList<AUDEmbeddedDocumentArchiveInfoSyncType>();

    /** 
     * Get the 'DocumenVersionChaintId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� �������� ������������ ����� ����� (���������) ������ ��� ��������� ���������.
     * 
     * @return value
     */
    public String getDocumenVersionChaintId() {
        return documenVersionChaintId;
    }

    /** 
     * Set the 'DocumenVersionChaintId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� �������� ������������ ����� ����� (���������) ������ ��� ��������� ���������.
     * 
     * @param documenVersionChaintId
     */
    public void setDocumenVersionChaintId(String documenVersionChaintId) {
        this.documenVersionChaintId = documenVersionChaintId;
    }

    /** 
     * Get the list of 'EmbeddedDocumentArchiveInfoSync' element items. ���������� � ���������� ���������, ��������� � ������������ �� �������� ��������-���������. ����������� ����������� � ��� � ������ � ��� ������, ���� ������������ �� �������� � ����� �������� ������������ ����� ��������-��������� ('ED_Container'). ����������� ��� ������� ���������, ���������� � ��������-���������.
     * 
     * @return list
     */
    public List<AUDEmbeddedDocumentArchiveInfoSyncType> getEmbeddedDocumentArchiveInfoSyncList() {
        return embeddedDocumentArchiveInfoSyncList;
    }

    /** 
     * Set the list of 'EmbeddedDocumentArchiveInfoSync' element items. ���������� � ���������� ���������, ��������� � ������������ �� �������� ��������-���������. ����������� ����������� � ��� � ������ � ��� ������, ���� ������������ �� �������� � ����� �������� ������������ ����� ��������-��������� ('ED_Container'). ����������� ��� ������� ���������, ���������� � ��������-���������.
     * 
     * @param list
     */
    public void setEmbeddedDocumentArchiveInfoSyncList(
            List<AUDEmbeddedDocumentArchiveInfoSyncType> list) {
        embeddedDocumentArchiveInfoSyncList = list;
    }
}
