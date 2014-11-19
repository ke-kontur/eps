
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� ����������� �������� (�������)
 */
public class InspectionResultsType
{
    private String applicMarks;
    private String AKParts;
    private String newIdentMarks;
    private String numberOfNewIdentMarks;
    private String violationSign;
    private RadiationType radiation;
    private FactWeightType factWeight;
    private List<IdentifyMeanType> identifyMeanList = new ArrayList<IdentifyMeanType>();
    private List<InspGoodsType> inspGoodList = new ArrayList<InspGoodsType>();
    private MPOType MPO;

    /** 
     * Get the 'ApplicMarks' element value. ����������� � ���� �����, �������� �.�.
     * 
     * @return value
     */
    public String getApplicMarks() {
        return applicMarks;
    }

    /** 
     * Set the 'ApplicMarks' element value. ����������� � ���� �����, �������� �.�.
     * 
     * @param applicMarks
     */
    public void setApplicMarks(String applicMarks) {
        this.applicMarks = applicMarks;
    }

    /** 
     * Get the 'AKParts' element value. ������ ����������������� �������, ��� ������� ��������� ������������ �������� ���������������� ��������������
     * 
     * @return value
     */
    public String getAKParts() {
        return AKParts;
    }

    /** 
     * Set the 'AKParts' element value. ������ ����������������� �������, ��� ������� ��������� ������������ �������� ���������������� ��������������
     * 
     * @param AKParts
     */
    public void setAKParts(String AKParts) {
        this.AKParts = AKParts;
    }

    /** 
     * Get the 'NewIdentMarks' element value. �������� ���������� ������� �������������
     * 
     * @return value
     */
    public String getNewIdentMarks() {
        return newIdentMarks;
    }

    /** 
     * Set the 'NewIdentMarks' element value. �������� ���������� ������� �������������
     * 
     * @param newIdentMarks
     */
    public void setNewIdentMarks(String newIdentMarks) {
        this.newIdentMarks = newIdentMarks;
    }

    /** 
     * Get the 'NumberOfNewIdentMarks' element value. ����� ���������� ������� �������������
     * 
     * @return value
     */
    public String getNumberOfNewIdentMarks() {
        return numberOfNewIdentMarks;
    }

    /** 
     * Set the 'NumberOfNewIdentMarks' element value. ����� ���������� ������� �������������
     * 
     * @param numberOfNewIdentMarks
     */
    public void setNumberOfNewIdentMarks(String numberOfNewIdentMarks) {
        this.numberOfNewIdentMarks = numberOfNewIdentMarks;
    }

    /** 
     * Get the 'ViolationSign' element value. ������� ��������� ��������� ����������� ���������������� ��� ��������� ������� � ��� � ����� ����������� ����
     * 
     * @return value
     */
    public String getViolationSign() {
        return violationSign;
    }

    /** 
     * Set the 'ViolationSign' element value. ������� ��������� ��������� ����������� ���������������� ��� ��������� ������� � ��� � ����� ����������� ����
     * 
     * @param violationSign
     */
    public void setViolationSign(String violationSign) {
        this.violationSign = violationSign;
    }

    /** 
     * Get the 'Radiation' element value. ��������� ������ ��������
     * 
     * @return value
     */
    public RadiationType getRadiation() {
        return radiation;
    }

    /** 
     * Set the 'Radiation' element value. ��������� ������ ��������
     * 
     * @param radiation
     */
    public void setRadiation(RadiationType radiation) {
        this.radiation = radiation;
    }

    /** 
     * Get the 'FactWeight' element value. ����������� ��� �������
     * 
     * @return value
     */
    public FactWeightType getFactWeight() {
        return factWeight;
    }

    /** 
     * Set the 'FactWeight' element value. ����������� ��� �������
     * 
     * @param factWeight
     */
    public void setFactWeight(FactWeightType factWeight) {
        this.factWeight = factWeight;
    }

    /** 
     * Get the list of 'IdentifyMean' element items. �������� �������������
     * 
     * @return list
     */
    public List<IdentifyMeanType> getIdentifyMeanList() {
        return identifyMeanList;
    }

    /** 
     * Set the list of 'IdentifyMean' element items. �������� �������������
     * 
     * @param list
     */
    public void setIdentifyMeanList(List<IdentifyMeanType> list) {
        identifyMeanList = list;
    }

    /** 
     * Get the list of 'InspGoods' element items. �������� � �����e
     * 
     * @return list
     */
    public List<InspGoodsType> getInspGoodList() {
        return inspGoodList;
    }

    /** 
     * Set the list of 'InspGoods' element items. �������� � �����e
     * 
     * @param list
     */
    public void setInspGoodList(List<InspGoodsType> list) {
        inspGoodList = list;
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
