
package ru.acs.fts.schemas.album.confirmquotadatard;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� � �������� �� �����
 */
public class ConfirmQuotaDataRDType extends BaseDocType
{
    private String BDRDID;
    private String useDateTime;
    private String custDocType;
    private GTDIDType GTDID;
    private List<GoodsDescriptionType> goodList = new ArrayList<GoodsDescriptionType>();
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ���������� ����� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'UseDateTime' element value. ���� ������������� � �����
     * 
     * @return value
     */
    public String getUseDateTime() {
        return useDateTime;
    }

    /** 
     * Set the 'UseDateTime' element value. ���� ������������� � �����
     * 
     * @param useDateTime
     */
    public void setUseDateTime(String useDateTime) {
        this.useDateTime = useDateTime;
    }

    /** 
     * Get the 'CustDocType' element value. ��� ����������� ���������. �� -���������� �� ������, �� - ��������� � ��������, �� - ��������� �� ������, �� - ���������� ����������.
     * 
     * @return value
     */
    public String getCustDocType() {
        return custDocType;
    }

    /** 
     * Set the 'CustDocType' element value. ��� ����������� ���������. �� -���������� �� ������, �� - ��������� � ��������, �� - ��������� �� ������, �� - ���������� ����������.
     * 
     * @param custDocType
     */
    public void setCustDocType(String custDocType) {
        this.custDocType = custDocType;
    }

    /** 
     * Get the 'GTDID' element value. ����� ����������� ���������, ��� ���������� �������� ����������� �������������� ��������
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ����� ����������� ���������, ��� ���������� �������� ����������� �������������� ��������
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsDescriptionType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsDescriptionType> list) {
        goodList = list;
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
