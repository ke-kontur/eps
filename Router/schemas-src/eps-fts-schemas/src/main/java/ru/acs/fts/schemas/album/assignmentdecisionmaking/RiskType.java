
package ru.acs.fts.schemas.album.assignmentdecisionmaking;

import org.joda.time.LocalDate;

/** 
 * ����� ������� �����
 */
public class RiskType
{
    private String terrActionCode;
    private String customsActionCode;
    private LocalDate riskProfileRegDate;
    private String riskProfileNumber;
    private String riskProfileNumberVersion;

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
}
