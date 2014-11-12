
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� � ��������������
 */
public class SuccessionDataType
{
    private String successionCode;
    private String OGRNIP;
    private String INN;
    private List<SuccessionDetailsType> selfSuccessorList = new ArrayList<SuccessionDetailsType>();
    private List<SuccessionDetailsType> ownSuccessorList = new ArrayList<SuccessionDetailsType>();
    private List<CUOrganizationType> farmList = new ArrayList<CUOrganizationType>();
    private RecordDataType recordData;

    /** 
     * Get the 'SuccessionCode' element value. ��� ��������� �� ����������� ������
     * 
     * @return value
     */
    public String getSuccessionCode() {
        return successionCode;
    }

    /** 
     * Set the 'SuccessionCode' element value. ��� ��������� �� ����������� ������
     * 
     * @param successionCode
     */
    public void setSuccessionCode(String successionCode) {
        this.successionCode = successionCode;
    }

    /** 
     * Get the 'OGRNIP' element value. �������� ��������������� ��������������� ����� ��������������� ��������������� (������)
     * 
     * @return value
     */
    public String getOGRNIP() {
        return OGRNIP;
    }

    /** 
     * Set the 'OGRNIP' element value. �������� ��������������� ��������������� ����� ��������������� ��������������� (������)
     * 
     * @param OGRNIP
     */
    public void setOGRNIP(String OGRNIP) {
        this.OGRNIP = OGRNIP;
    }

    /** 
     * Get the 'INN' element value. ��� ����������� ����
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ��� ����������� ����
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the list of 'SelfSuccessor' element items. �������� � ����������� ����, ��������������� �������� �������� ����������� ���� ��� �������� ����� ������������� ��� ��� ������������� � ����� �������������
     * 
     * @return list
     */
    public List<SuccessionDetailsType> getSelfSuccessorList() {
        return selfSuccessorList;
    }

    /** 
     * Set the list of 'SelfSuccessor' element items. �������� � ����������� ����, ��������������� �������� �������� ����������� ���� ��� �������� ����� ������������� ��� ��� ������������� � ����� �������������
     * 
     * @param list
     */
    public void setSelfSuccessorList(List<SuccessionDetailsType> list) {
        selfSuccessorList = list;
    }

    /** 
     * Get the list of 'OwnSuccessor' element items. �������� � ����������� ���� - ��������������  ��� ����������� ������������ � ���������� ������������� ��� ��� ������������� � ����� ���������
     * 
     * @return list
     */
    public List<SuccessionDetailsType> getOwnSuccessorList() {
        return ownSuccessorList;
    }

    /** 
     * Set the list of 'OwnSuccessor' element items. �������� � ����������� ���� - ��������������  ��� ����������� ������������ � ���������� ������������� ��� ��� ������������� � ����� ���������
     * 
     * @param list
     */
    public void setOwnSuccessorList(List<SuccessionDetailsType> list) {
        ownSuccessorList = list;
    }

    /** 
     * Get the list of 'Farm' element items. �������� � ������������ (����������) ��������� (���), �� ���� ��������� �������� ������� ����������� ����, ��� � ���, �������� � ������� ������� � �����, ��� ���������� ������� ��� � ������������ � ����������� �����������������
     * 
     * @return list
     */
    public List<CUOrganizationType> getFarmList() {
        return farmList;
    }

    /** 
     * Set the list of 'Farm' element items. �������� � ������������ (����������) ��������� (���), �� ���� ��������� �������� ������� ����������� ����, ��� � ���, �������� � ������� ������� � �����, ��� ���������� ������� ��� � ������������ � ����������� �����������������
     * 
     * @param list
     */
    public void setFarmList(List<CUOrganizationType> list) {
        farmList = list;
    }

    /** 
     * Get the 'RecordData' element value. �������� � ������
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. �������� � ������
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
