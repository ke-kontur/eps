
package ru.acs.fts.schemas.album.instrinspection;

import org.joda.time.LocalDate;

/** 
 * ����� ������� �����
 */
public class RiskProfileType
{
    private String riskProfileKind;
    private String customsCode;
    private LocalDate registryDate;
    private String sequenceNumber;
    private String riskProfileNumberVersion;

    /** 
     * Get the 'RiskProfileKind' element value. ��� ���� ������� ����� � ������������ � ��������������� ����� �������� ������
     * 
     * @return value
     */
    public String getRiskProfileKind() {
        return riskProfileKind;
    }

    /** 
     * Set the 'RiskProfileKind' element value. ��� ���� ������� ����� � ������������ � ��������������� ����� �������� ������
     * 
     * @param riskProfileKind
     */
    public void setRiskProfileKind(String riskProfileKind) {
        this.riskProfileKind = riskProfileKind;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, ����������� ���� �������� ��������� ������� �����
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, ����������� ���� �������� ��������� ������� �����
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RegistryDate' element value. ���� ����������� ��
     * 
     * @return value
     */
    public LocalDate getRegistryDate() {
        return registryDate;
    }

    /** 
     * Set the 'RegistryDate' element value. ���� ����������� ��
     * 
     * @param registryDate
     */
    public void setRegistryDate(LocalDate registryDate) {
        this.registryDate = registryDate;
    }

    /** 
     * Get the 'SequenceNumber' element value. ���������� ����� ��
     * 
     * @return value
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /** 
     * Set the 'SequenceNumber' element value. ���������� ����� ��
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    /** 
     * Get the 'RiskProfileNumberVersion' element value. ���������� ����� ������ ������� �����
     * 
     * @return value
     */
    public String getRiskProfileNumberVersion() {
        return riskProfileNumberVersion;
    }

    /** 
     * Set the 'RiskProfileNumberVersion' element value. ���������� ����� ������ ������� �����
     * 
     * @param riskProfileNumberVersion
     */
    public void setRiskProfileNumberVersion(String riskProfileNumberVersion) {
        this.riskProfileNumberVersion = riskProfileNumberVersion;
    }
}
