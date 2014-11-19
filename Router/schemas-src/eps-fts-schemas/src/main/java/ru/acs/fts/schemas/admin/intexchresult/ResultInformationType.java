
package ru.acs.fts.schemas.admin.intexchresult;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����������  �  ���������� ��������� ���������
 */
public class ResultInformationType
{
    private String resultSource;
    private String resultCode;
    private List<String> resultDescriptionList = new ArrayList<String>();
    private String resultCategory;
    private String refLineID;
    private ItemInfoType itemInfo;
    private List<EADInfoType> EADInfoList = new ArrayList<EADInfoType>();
    private ProcInformationType procInformation;

    /** 
     * Get the 'ResultSource' element value. �������� ������. ��� ����������, ��������� ������.
     * 
     * @return value
     */
    public String getResultSource() {
        return resultSource;
    }

    /** 
     * Set the 'ResultSource' element value. �������� ������. ��� ����������, ��������� ������.
     * 
     * @param resultSource
     */
    public void setResultSource(String resultSource) {
        this.resultSource = resultSource;
    }

    /** 
     * Get the 'ResultCode' element value. ��� ������.
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. ��� ������.
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the list of 'ResultDescription' element items. ��������� �������� ������.
     * 
     * @return list
     */
    public List<String> getResultDescriptionList() {
        return resultDescriptionList;
    }

    /** 
     * Set the list of 'ResultDescription' element items. ��������� �������� ������.
     * 
     * @param list
     */
    public void setResultDescriptionList(List<String> list) {
        resultDescriptionList = list;
    }

    /** 
     * Get the 'ResultCategory' element value. ������� ����������� ������. ��� ��� ������������� ��������.
     * 
     * @return value
     */
    public String getResultCategory() {
        return resultCategory;
    }

    /** 
     * Set the 'ResultCategory' element value. ������� ����������� ������. ��� ��� ������������� ��������.
     * 
     * @param resultCategory
     */
    public void setResultCategory(String resultCategory) {
        this.resultCategory = resultCategory;
    }

    /** 
     * Get the 'RefLineID' element value. ������������� ������ ������� � ������������ ������
     * 
     * @return value
     */
    public String getRefLineID() {
        return refLineID;
    }

    /** 
     * Set the 'RefLineID' element value. ������������� ������ ������� � ������������ ������
     * 
     * @param refLineID
     */
    public void setRefLineID(String refLineID) {
        this.refLineID = refLineID;
    }

    /** 
     * Get the 'ItemInfo' element value. ������ �� ������� � �������
     * 
     * @return value
     */
    public ItemInfoType getItemInfo() {
        return itemInfo;
    }

    /** 
     * Set the 'ItemInfo' element value. ������ �� ������� � �������
     * 
     * @param itemInfo
     */
    public void setItemInfo(ItemInfoType itemInfo) {
        this.itemInfo = itemInfo;
    }

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
     * Get the 'ProcInformation' element value. ���������� � ��������, ��� �������� ������������� ������/�������
     * 
     * @return value
     */
    public ProcInformationType getProcInformation() {
        return procInformation;
    }

    /** 
     * Set the 'ProcInformation' element value. ���������� � ��������, ��� �������� ������������� ������/�������
     * 
     * @param procInformation
     */
    public void setProcInformation(ProcInformationType procInformation) {
        this.procInformation = procInformation;
    }
}
