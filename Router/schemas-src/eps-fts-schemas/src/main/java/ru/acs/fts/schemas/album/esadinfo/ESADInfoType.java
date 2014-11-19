
package ru.acs.fts.schemas.album.esadinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� �� ���
 */
public class ESADInfoType extends BaseDocType
{
    private GTDIDType GTDID;
    private OrganizationType consigner;
    private OrganizationType consignee;
    private List<GoodsListType> goodsList = new ArrayList<GoodsListType>();
    private List<DocsInfoType> supportingDocumentList = new ArrayList<DocsInfoType>();
    private List<DocsInfoType> transportDocumentList = new ArrayList<DocsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'GTDID' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� ����� ��
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'Consigner' element value. ����������������
     * 
     * @return value
     */
    public OrganizationType getConsigner() {
        return consigner;
    }

    /** 
     * Set the 'Consigner' element value. ����������������
     * 
     * @param consigner
     */
    public void setConsigner(OrganizationType consigner) {
        this.consigner = consigner;
    }

    /** 
     * Get the 'Consignee' element value. ���������������
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������������
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'GoodsList' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsListType> getGoodsList() {
        return goodsList;
    }

    /** 
     * Set the list of 'GoodsList' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodsList(List<GoodsListType> list) {
        goodsList = list;
    }

    /** 
     * Get the list of 'SupportingDocuments' element items. ��������, �������������� ���������� ������������������� ������
     * 
     * @return list
     */
    public List<DocsInfoType> getSupportingDocumentList() {
        return supportingDocumentList;
    }

    /** 
     * Set the list of 'SupportingDocuments' element items. ��������, �������������� ���������� ������������������� ������
     * 
     * @param list
     */
    public void setSupportingDocumentList(List<DocsInfoType> list) {
        supportingDocumentList = list;
    }

    /** 
     * Get the list of 'TransportDocuments' element items. ������������ (������������) �������� (��������������� ���������)
     * 
     * @return list
     */
    public List<DocsInfoType> getTransportDocumentList() {
        return transportDocumentList;
    }

    /** 
     * Set the list of 'TransportDocuments' element items. ������������ (������������) �������� (��������������� ���������)
     * 
     * @param list
     */
    public void setTransportDocumentList(List<DocsInfoType> list) {
        transportDocumentList = list;
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
