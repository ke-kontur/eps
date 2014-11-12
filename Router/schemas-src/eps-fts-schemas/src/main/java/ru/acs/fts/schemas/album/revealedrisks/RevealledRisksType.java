
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �� - ���������� �����
 */
public class RevealledRisksType
{
    private String goodsNumeric;
    private String riskProfileType;
    private String terrActionCode;
    private LocalDate riskProfileRegDate;
    private String riskProfileNumber;
    private String riskProfileNumberVersion;
    private String criteriionCode;
    private String pointCode;
    private LocalDate pointDate;
    private String pointTime;
    private String customsActionCode;
    private String softKind;
    private String softVersion;
    private LocalDate firstPointDate;
    private List<RiskActionType> riskActionList = new ArrayList<RiskActionType>();
    private NumberOrientationType numberOrientation;
    private List<AddNonFormInfoRiskProfileType> addNonFormInfoRiskProfileList = new ArrayList<AddNonFormInfoRiskProfileType>();

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ��, �� �������� ������� ����. 0 - ���� ���������� ���� ���������������� �� ��� ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ��, �� �������� ������� ����. 0 - ���� ���������� ���� ���������������� �� ��� ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'RiskProfileType' element value. ��� ����������� ������� �����: 0 - ������������� ���������� ����, ������������� ����������� ��������� � �������������� ������; 1 - �������������� ���������� ����, ������������� ����������� ��������� � �������������� ������ ��� �������� ����������� ����� ����������� ����� ����� ������ (� ��� �����, ��� ���������� "��������" ��  � �� �� ���������� ������������������ �������������); 2 � ����, ���������� � ������������������ ������, ������� �������� �������������� ������� ����������� ����� ����������� ����� (�������� �������� �������������, ������� �������� "2" � ������ ��������� ������� � ���������� ����� �������� �� ����� ���� ������ ��); 3 � ����, ���������� � ������������������ ������, �� �������� ����������� ����� ����������� ����� �� ��������� �������� ����������������� ����������� ����� ������� ������� - "���� �������"; 4 - ����, ���������� � ������������������ ������, �� �������� ����������� ����� ����������� ����� �� ��������� �������� ����������������� ����������� ����� ������� ������� - "���� �� �������"; 5 - ������; 6 - ������� ����� �� ����������� �� ������� ����������� �������� ���������� ��������� ���������� �������
     * 
     * @return value
     */
    public String getRiskProfileType() {
        return riskProfileType;
    }

    /** 
     * Set the 'RiskProfileType' element value. ��� ����������� ������� �����: 0 - ������������� ���������� ����, ������������� ����������� ��������� � �������������� ������; 1 - �������������� ���������� ����, ������������� ����������� ��������� � �������������� ������ ��� �������� ����������� ����� ����������� ����� ����� ������ (� ��� �����, ��� ���������� "��������" ��  � �� �� ���������� ������������������ �������������); 2 � ����, ���������� � ������������������ ������, ������� �������� �������������� ������� ����������� ����� ����������� ����� (�������� �������� �������������, ������� �������� "2" � ������ ��������� ������� � ���������� ����� �������� �� ����� ���� ������ ��); 3 � ����, ���������� � ������������������ ������, �� �������� ����������� ����� ����������� ����� �� ��������� �������� ����������������� ����������� ����� ������� ������� - "���� �������"; 4 - ����, ���������� � ������������������ ������, �� �������� ����������� ����� ����������� ����� �� ��������� �������� ����������������� ����������� ����� ������� ������� - "���� �� �������"; 5 - ������; 6 - ������� ����� �� ����������� �� ������� ����������� �������� ���������� ��������� ���������� �������
     * 
     * @param riskProfileType
     */
    public void setRiskProfileType(String riskProfileType) {
        this.riskProfileType = riskProfileType;
    }

    /** 
     * Get the 'TerrActionCode' element value. ��� ���� ������� �����. ��������� ��������: 11 - �������������� ������� �����, 12 - ������������ ������� �����, 13 - ��������� ������� �����, 20 - ������� ������� �����, 32 - ������� ����� �� ������ �������, 55 - ������� �����, ������������ � ����������, 77 - ������� ����� ��� ����������� ������� ������������, 88 - ��������� ������� �����
     * 
     * @return value
     */
    public String getTerrActionCode() {
        return terrActionCode;
    }

    /** 
     * Set the 'TerrActionCode' element value. ��� ���� ������� �����. ��������� ��������: 11 - �������������� ������� �����, 12 - ������������ ������� �����, 13 - ��������� ������� �����, 20 - ������� ������� �����, 32 - ������� ����� �� ������ �������, 55 - ������� �����, ������������ � ����������, 77 - ������� ����� ��� ����������� ������� ������������, 88 - ��������� ������� �����
     * 
     * @param terrActionCode
     */
    public void setTerrActionCode(String terrActionCode) {
        this.terrActionCode = terrActionCode;
    }

    /** 
     * Get the 'RiskProfileRegDate' element value. ���� ����������� ������� �����
     * 
     * @return value
     */
    public LocalDate getRiskProfileRegDate() {
        return riskProfileRegDate;
    }

    /** 
     * Set the 'RiskProfileRegDate' element value. ���� ����������� ������� �����
     * 
     * @param riskProfileRegDate
     */
    public void setRiskProfileRegDate(LocalDate riskProfileRegDate) {
        this.riskProfileRegDate = riskProfileRegDate;
    }

    /** 
     * Get the 'RiskProfileNumber' element value. ���������� ����� ������� �����
     * 
     * @return value
     */
    public String getRiskProfileNumber() {
        return riskProfileNumber;
    }

    /** 
     * Set the 'RiskProfileNumber' element value. ���������� ����� ������� �����
     * 
     * @param riskProfileNumber
     */
    public void setRiskProfileNumber(String riskProfileNumber) {
        this.riskProfileNumber = riskProfileNumber;
    }

    /** 
     * Get the 'RiskProfileNumberVersion' element value. ���������� ����� ������ ������� �����.
     * 
     * @return value
     */
    public String getRiskProfileNumberVersion() {
        return riskProfileNumberVersion;
    }

    /** 
     * Set the 'RiskProfileNumberVersion' element value. ���������� ����� ������ ������� �����.
     * 
     * @param riskProfileNumberVersion
     */
    public void setRiskProfileNumberVersion(String riskProfileNumberVersion) {
        this.riskProfileNumberVersion = riskProfileNumberVersion;
    }

    /** 
     * Get the 'CriteriionCode' element value. ��� �������� ��������� �������, ������������������� �������� � ��� � ������� �����
     * 
     * @return value
     */
    public String getCriteriionCode() {
        return criteriionCode;
    }

    /** 
     * Set the 'CriteriionCode' element value. ��� �������� ��������� �������, ������������������� �������� � ��� � ������� �����
     * 
     * @param criteriionCode
     */
    public void setCriteriionCode(String criteriionCode) {
        this.criteriionCode = criteriionCode;
    }

    /** 
     * Get the 'PointCode' element value. ���� ���������� �������� �� ������������ �������� �����  (����������� ����������� ��������� � �������������� ������).
     * 
     * @return value
     */
    public String getPointCode() {
        return pointCode;
    }

    /** 
     * Set the 'PointCode' element value. ���� ���������� �������� �� ������������ �������� �����  (����������� ����������� ��������� � �������������� ������).
     * 
     * @param pointCode
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    /** 
     * Get the 'PointDate' element value. ���� ���������� ���������� �������� �� ������������ �������� �����. ����������� ����������� ��������� � �������������� ������
     * 
     * @return value
     */
    public LocalDate getPointDate() {
        return pointDate;
    }

    /** 
     * Set the 'PointDate' element value. ���� ���������� ���������� �������� �� ������������ �������� �����. ����������� ����������� ��������� � �������������� ������
     * 
     * @param pointDate
     */
    public void setPointDate(LocalDate pointDate) {
        this.pointDate = pointDate;
    }

    /** 
     * Get the 'PointTime' element value. ����� ���������� ���������� �������� �� ������������ �������� �����  � ������� (��:��:��). ����������� ����������� ��������� � �������������� ������
     * 
     * @return value
     */
    public String getPointTime() {
        return pointTime;
    }

    /** 
     * Set the 'PointTime' element value. ����� ���������� ���������� �������� �� ������������ �������� �����  � ������� (��:��:��). ����������� ����������� ��������� � �������������� ������
     * 
     * @param pointTime
     */
    public void setPointTime(String pointTime) {
        this.pointTime = pointTime;
    }

    /** 
     * Get the 'CustomsActionCode' element value. ������ ���� ���� ���� ����������� ������,  ������������ ������� �����
     * 
     * @return value
     */
    public String getCustomsActionCode() {
        return customsActionCode;
    }

    /** 
     * Set the 'CustomsActionCode' element value. ������ ���� ���� ���� ����������� ������,  ������������ ������� �����
     * 
     * @param customsActionCode
     */
    public void setCustomsActionCode(String customsActionCode) {
        this.customsActionCode = customsActionCode;
    }

    /** 
     * Get the 'SoftKind' element value. ������� � ����������� ��� ������ ������ ����� ������ ����������� �������. ��� ������������ ����������� (������): 0 - �� "������ ��������� ������ ���"; 1 - ����� "����-��21"; 2 - ��� "��������� � ������ ������"
     * 
     * @return value
     */
    public String getSoftKind() {
        return softKind;
    }

    /** 
     * Set the 'SoftKind' element value. ������� � ����������� ��� ������ ������ ����� ������ ����������� �������. ��� ������������ ����������� (������): 0 - �� "������ ��������� ������ ���"; 1 - ����� "����-��21"; 2 - ��� "��������� � ������ ������"
     * 
     * @param softKind
     */
    public void setSoftKind(String softKind) {
        this.softKind = softKind;
    }

    /** 
     * Get the 'SoftVersion' element value. ������� � ����������� ��� ������ ������ ����� ������ ����������� �������. ������ ������������ �����������
     * 
     * @return value
     */
    public String getSoftVersion() {
        return softVersion;
    }

    /** 
     * Set the 'SoftVersion' element value. ������� � ����������� ��� ������ ������ ����� ������ ����������� �������. ������ ������������ �����������
     * 
     * @param softVersion
     */
    public void setSoftVersion(String softVersion) {
        this.softVersion = softVersion;
    }

    /** 
     * Get the 'FirstPointDate' element value. ���� ������ �������� ������ ������� �����
     * 
     * @return value
     */
    public LocalDate getFirstPointDate() {
        return firstPointDate;
    }

    /** 
     * Set the 'FirstPointDate' element value. ���� ������ �������� ������ ������� �����
     * 
     * @param firstPointDate
     */
    public void setFirstPointDate(LocalDate firstPointDate) {
        this.firstPointDate = firstPointDate;
    }

    /** 
     * Get the list of 'RiskAction' element items. �������� ���� �� ���������� ������
     * 
     * @return list
     */
    public List<RiskActionType> getRiskActionList() {
        return riskActionList;
    }

    /** 
     * Set the list of 'RiskAction' element items. �������� ���� �� ���������� ������
     * 
     * @param list
     */
    public void setRiskActionList(List<RiskActionType> list) {
        riskActionList = list;
    }

    /** 
     * Get the 'NumberOrientation' element value. ����� ������������ (������)
     * 
     * @return value
     */
    public NumberOrientationType getNumberOrientation() {
        return numberOrientation;
    }

    /** 
     * Set the 'NumberOrientation' element value. ����� ������������ (������)
     * 
     * @param numberOrientation
     */
    public void setNumberOrientation(NumberOrientationType numberOrientation) {
        this.numberOrientation = numberOrientation;
    }

    /** 
     * Get the list of 'AddNonFormInfoRiskProfile' element items. �������������� ����������������� ���������� - ������� ������� �����
     * 
     * @return list
     */
    public List<AddNonFormInfoRiskProfileType> getAddNonFormInfoRiskProfileList() {
        return addNonFormInfoRiskProfileList;
    }

    /** 
     * Set the list of 'AddNonFormInfoRiskProfile' element items. �������������� ����������������� ���������� - ������� ������� �����
     * 
     * @param list
     */
    public void setAddNonFormInfoRiskProfileList(
            List<AddNonFormInfoRiskProfileType> list) {
        addNonFormInfoRiskProfileList = list;
    }
}
