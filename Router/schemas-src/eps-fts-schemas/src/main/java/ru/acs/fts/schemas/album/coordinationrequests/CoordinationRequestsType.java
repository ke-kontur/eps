
package ru.acs.fts.schemas.album.coordinationrequests;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ����������� �� ������������
 */
public class CoordinationRequestsType extends BaseDocType
{
    private LocalDate coordReqDate;
    private String coordReqTime;
    private String docID;
    private String coordReqNumber;
    private String farINN;
    private String farKPP;
    private PersonBaseType createUserNameFIO;
    private GTDIDType GTDID;
    private List<MeasureListType> measureList = new ArrayList<MeasureListType>();
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'CoordReqDate' element value. ���� �������� �����������
     * 
     * @return value
     */
    public LocalDate getCoordReqDate() {
        return coordReqDate;
    }

    /** 
     * Set the 'CoordReqDate' element value. ���� �������� �����������
     * 
     * @param coordReqDate
     */
    public void setCoordReqDate(LocalDate coordReqDate) {
        this.coordReqDate = coordReqDate;
    }

    /** 
     * Get the 'CoordReqTime' element value. ����� �������� �����������
     * 
     * @return value
     */
    public String getCoordReqTime() {
        return coordReqTime;
    }

    /** 
     * Set the 'CoordReqTime' element value. ����� �������� �����������
     * 
     * @param coordReqTime
     */
    public void setCoordReqTime(String coordReqTime) {
        this.coordReqTime = coordReqTime;
    }

    /** 
     * Get the 'Doc_ID' element value. ���������� ������������� (DocumentID) ���� ��������� ��, �� �������� ���� ������� ����������� (����� �������� 1 ����������� ����������� ����� ���� �������� ���������� ��,  ��� ����������� �� ��� �� �� ����� ��� ������)
     * 
     * @return value
     */
    public String getDocID() {
        return docID;
    }

    /** 
     * Set the 'Doc_ID' element value. ���������� ������������� (DocumentID) ���� ��������� ��, �� �������� ���� ������� ����������� (����� �������� 1 ����������� ����������� ����� ���� �������� ���������� ��,  ��� ����������� �� ��� �� �� ����� ��� ������)
     * 
     * @param docID
     */
    public void setDocID(String docID) {
        this.docID = docID;
    }

    /** 
     * Get the 'CoordReqNumber' element value. ���������� ����� �����������
     * 
     * @return value
     */
    public String getCoordReqNumber() {
        return coordReqNumber;
    }

    /** 
     * Set the 'CoordReqNumber' element value. ���������� ����� �����������
     * 
     * @param coordReqNumber
     */
    public void setCoordReqNumber(String coordReqNumber) {
        this.coordReqNumber = coordReqNumber;
    }

    /** 
     * Get the 'FarINN' element value. ��� ����, �������������� �� ���������� ��������������, ������������ � ������� ��� ������ ������� ����������� �� ������������
     * 
     * @return value
     */
    public String getFarINN() {
        return farINN;
    }

    /** 
     * Set the 'FarINN' element value. ��� ����, �������������� �� ���������� ��������������, ������������ � ������� ��� ������ ������� ����������� �� ������������
     * 
     * @param farINN
     */
    public void setFarINN(String farINN) {
        this.farINN = farINN;
    }

    /** 
     * Get the 'FarKPP' element value. ��� ����, �������������� �� ���������� ��������������, ������������ � ������� ��� ������ ������� ����������� �� ������������
     * 
     * @return value
     */
    public String getFarKPP() {
        return farKPP;
    }

    /** 
     * Set the 'FarKPP' element value. ��� ����, �������������� �� ���������� ��������������, ������������ � ������� ��� ������ ������� ����������� �� ������������
     * 
     * @param farKPP
     */
    public void setFarKPP(String farKPP) {
        this.farKPP = farKPP;
    }

    /** 
     * Get the 'CreateUserNameFIO' element value. ��� ������������, ���������� �����������
     * 
     * @return value
     */
    public PersonBaseType getCreateUserNameFIO() {
        return createUserNameFIO;
    }

    /** 
     * Set the 'CreateUserNameFIO' element value. ��� ������������, ���������� �����������
     * 
     * @param createUserNameFIO
     */
    public void setCreateUserNameFIO(PersonBaseType createUserNameFIO) {
        this.createUserNameFIO = createUserNameFIO;
    }

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
     * Get the list of 'MeasureList' element items. ���� �� ��������� ������� ���� ������������ ����������� � �������������� ������ ������� ��� �������� �������
     * 
     * @return list
     */
    public List<MeasureListType> getMeasureList() {
        return measureList;
    }

    /** 
     * Set the list of 'MeasureList' element items. ���� �� ��������� ������� ���� ������������ ����������� � �������������� ������ ������� ��� �������� �������
     * 
     * @param list
     */
    public void setMeasureList(List<MeasureListType> list) {
        measureList = list;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. ���������� �� �������, �� ������� ��������� ������� �������. ���� ���� ������� �� ��� �������� ������ � �����, �� �� �������� ����������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. ���������� �� �������, �� ������� ��������� ������� �������. ���� ���� ������� �� ��� �������� ������ � �����, �� �� �������� ����������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
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
