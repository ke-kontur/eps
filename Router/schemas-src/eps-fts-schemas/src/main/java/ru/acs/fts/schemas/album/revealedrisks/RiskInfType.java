
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * ����������� ���������� ��� �� ����������� ������
 */
public class RiskInfType
{
    private String goodsNumeric;
    private String terrActionCode;
    private LocalDate riskProfileRegDate;
    private String riskProfileNumber;
    private String riskProfileNumberVersion;
    private String informationCode;
    private String lineNumber;
    private List<String> typicalNameList = new ArrayList<String>();
    private String pointCode;
    private String customsActionCode;

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������ �� ���������, �� �������� ������� ����. 0 - 0 - ���� ���������� ���� ���������������� �� ��� ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������ �� ���������, �� �������� ������� ����. 0 - 0 - ���� ���������� ���� ���������������� �� ��� ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the 'TerrActionCode' element value. ��� ���� ���������
     * 
     * @return value
     */
    public String getTerrActionCode() {
        return terrActionCode;
    }

    /** 
     * Set the 'TerrActionCode' element value. ��� ���� ���������
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
     * Get the 'InformationCode' element value. ��� ����������: 4 - ���������� ��� �� ����������� ������ �� ��������� "��������" �������� �����, �� ������������ �������; 7 -  ���������� ��� �� ��������� �������� ����� �� ���������� ������������������ �������������
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. ��� ����������: 4 - ���������� ��� �� ����������� ������ �� ��������� "��������" �������� �����, �� ������������ �������; 7 -  ���������� ��� �� ��������� �������� ����� �� ���������� ������������������ �������������
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the 'LineNumber' element value. ���������� ����� ������ ����������
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. ���������� ����� ������ ����������
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the list of 'TypicalName' element items. ����������� ���������� ���:
     * 
     * @return list
     */
    public List<String> getTypicalNameList() {
        return typicalNameList;
    }

    /** 
     * Set the list of 'TypicalName' element items. ����������� ���������� ���:
     * 
     * @param list
     */
    public void setTypicalNameList(List<String> list) {
        typicalNameList = list;
    }

    /** 
     * Get the 'PointCode' element value. ���� ���������� �������� �� ������������ �������� �����  (����������� �������� ����������� ���������� �������������).
     * 
     * @return value
     */
    public String getPointCode() {
        return pointCode;
    }

    /** 
     * Set the 'PointCode' element value. ���� ���������� �������� �� ������������ �������� �����  (����������� �������� ����������� ���������� �������������).
     * 
     * @param pointCode
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    /** 
     * Get the 'CustomsActionCode' element value. ������ ���� ���� ���� ����������� ������,  ������������ ������� ����� (������������)
     * 
     * @return value
     */
    public String getCustomsActionCode() {
        return customsActionCode;
    }

    /** 
     * Set the 'CustomsActionCode' element value. ������ ���� ���� ���� ����������� ������,  ������������ ������� ����� (������������)
     * 
     * @param customsActionCode
     */
    public void setCustomsActionCode(String customsActionCode) {
        this.customsActionCode = customsActionCode;
    }
}
