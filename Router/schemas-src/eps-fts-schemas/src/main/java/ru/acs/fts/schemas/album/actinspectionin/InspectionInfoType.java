
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ����������� ��������
 */
public class InspectionInfoType
{
    private String inspItemNum;
    private String grossWeightDocs;
    private String violationSign;
    private List<InspGTDType> inspGTDNumList = new ArrayList<InspGTDType>();
    private FactWeightInfoType factWeightInfo;
    private InspRadiationInfoType inspRadiationInfo;
    private IdentityMeansInfoType identityMeansInfo;
    private InspectionResultType inspectionResult;
    private List<InspectionDocumentType> inspectionDocumentList = new ArrayList<InspectionDocumentType>();
    private List<InspGoodsType> inspGoodList = new ArrayList<InspGoodsType>();
    private List<UseTMCCType> useTMCCList = new ArrayList<UseTMCCType>();
    private MPOType MPO;

    /** 
     * Get the 'InspItemNum' element value. ���������� ���� ������ (������ ������), ������������� � ����������� �������� (�� ����������)
     * 
     * @return value
     */
    public String getInspItemNum() {
        return inspItemNum;
    }

    /** 
     * Set the 'InspItemNum' element value. ���������� ���� ������ (������ ������), ������������� � ����������� �������� (�� ����������)
     * 
     * @param inspItemNum
     */
    public void setInspItemNum(String inspItemNum) {
        this.inspItemNum = inspItemNum;
    }

    /** 
     * Get the 'GrossWeightDocs' element value. ����� ��� ������ ������� �� ���������� (��.)
     * 
     * @return value
     */
    public String getGrossWeightDocs() {
        return grossWeightDocs;
    }

    /** 
     * Set the 'GrossWeightDocs' element value. ����� ��� ������ ������� �� ���������� (��.)
     * 
     * @param grossWeightDocs
     */
    public void setGrossWeightDocs(String grossWeightDocs) {
        this.grossWeightDocs = grossWeightDocs;
    }

    /** 
     * Get the 'ViolationSign' element value. ������� ��������� ����������� ���������������� ��� ��������� ������� � ��� � ����� ����������� ����: 0 - �� ��������; 1 - ��������
     * 
     * @return value
     */
    public String getViolationSign() {
        return violationSign;
    }

    /** 
     * Set the 'ViolationSign' element value. ������� ��������� ����������� ���������������� ��� ��������� ������� � ��� � ����� ����������� ����: 0 - �� ��������; 1 - ��������
     * 
     * @param violationSign
     */
    public void setViolationSign(String violationSign) {
        this.violationSign = violationSign;
    }

    /** 
     * Get the list of 'InspGTDNum' element items. ����� �� � ������� �������� �������� � ��������������  �������
     * 
     * @return list
     */
    public List<InspGTDType> getInspGTDNumList() {
        return inspGTDNumList;
    }

    /** 
     * Set the list of 'InspGTDNum' element items. ����� �� � ������� �������� �������� � ��������������  �������
     * 
     * @param list
     */
    public void setInspGTDNumList(List<InspGTDType> list) {
        inspGTDNumList = list;
    }

    /** 
     * Get the 'FactWeightInfo' element value. �������� �� ����� ����������� ���� �������
     * 
     * @return value
     */
    public FactWeightInfoType getFactWeightInfo() {
        return factWeightInfo;
    }

    /** 
     * Set the 'FactWeightInfo' element value. �������� �� ����� ����������� ���� �������
     * 
     * @param factWeightInfo
     */
    public void setFactWeightInfo(FactWeightInfoType factWeightInfo) {
        this.factWeightInfo = factWeightInfo;
    }

    /** 
     * Get the 'InspRadiationInfo' element value. ��������� ������ ������������� ���������
     * 
     * @return value
     */
    public InspRadiationInfoType getInspRadiationInfo() {
        return inspRadiationInfo;
    }

    /** 
     * Set the 'InspRadiationInfo' element value. ��������� ������ ������������� ���������
     * 
     * @param inspRadiationInfo
     */
    public void setInspRadiationInfo(InspRadiationInfoType inspRadiationInfo) {
        this.inspRadiationInfo = inspRadiationInfo;
    }

    /** 
     * Get the 'IdentityMeansInfo' element value. �������� �������������
     * 
     * @return value
     */
    public IdentityMeansInfoType getIdentityMeansInfo() {
        return identityMeansInfo;
    }

    /** 
     * Set the 'IdentityMeansInfo' element value. �������� �������������
     * 
     * @param identityMeansInfo
     */
    public void setIdentityMeansInfo(IdentityMeansInfoType identityMeansInfo) {
        this.identityMeansInfo = identityMeansInfo;
    }

    /** 
     * Get the 'InspectionResult' element value. ���������� ����������� ��������
     * 
     * @return value
     */
    public InspectionResultType getInspectionResult() {
        return inspectionResult;
    }

    /** 
     * Set the 'InspectionResult' element value. ���������� ����������� ��������
     * 
     * @param inspectionResult
     */
    public void setInspectionResult(InspectionResultType inspectionResult) {
        this.inspectionResult = inspectionResult;
    }

    /** 
     * Get the list of 'InspectionDocument' element items. ��� - �������� �� �������� �������� ���������� �������
     * 
     * @return list
     */
    public List<InspectionDocumentType> getInspectionDocumentList() {
        return inspectionDocumentList;
    }

    /** 
     * Set the list of 'InspectionDocument' element items. ��� - �������� �� �������� �������� ���������� �������
     * 
     * @param list
     */
    public void setInspectionDocumentList(List<InspectionDocumentType> list) {
        inspectionDocumentList = list;
    }

    /** 
     * Get the list of 'InspGoods' element items. �������� � ������
     * 
     * @return list
     */
    public List<InspGoodsType> getInspGoodList() {
        return inspGoodList;
    }

    /** 
     * Set the list of 'InspGoods' element items. �������� � ������
     * 
     * @param list
     */
    public void setInspGoodList(List<InspGoodsType> list) {
        inspGoodList = list;
    }

    /** 
     * Get the list of 'UseTMCC' element items. ����������� ����������� �������� ����������� ��������
     * 
     * @return list
     */
    public List<UseTMCCType> getUseTMCCList() {
        return useTMCCList;
    }

    /** 
     * Set the list of 'UseTMCC' element items. ����������� ����������� �������� ����������� ��������
     * 
     * @param list
     */
    public void setUseTMCCList(List<UseTMCCType> list) {
        useTMCCList = list;
    }

    /** 
     * Get the 'MPO' element value. �������� � ������������� ���
     * 
     * @return value
     */
    public MPOType getMPO() {
        return MPO;
    }

    /** 
     * Set the 'MPO' element value. �������� � ������������� ���
     * 
     * @param MPO
     */
    public void setMPO(MPOType MPO) {
        this.MPO = MPO;
    }
}
