
package ru.acs.fts.schemas.album.legalentityinfo;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RFOrganizationFeaturesType;

/** 
 * �������� �� ����� � ������
 */
public class RegInfoType
{
    private LocalDate regDate;
    private LocalDate taxRegDateEnd;
    private String regNum;
    private RFOrganizationFeaturesType regData;
    private RegOrganType taxOrgan;
    private RecordDataType recordData;

    /** 
     * Get the 'RegDate' element value. ���� ���������� �� ���� � ��������� ������ / ���� ����������� ������������ ���� � �������� ������������
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. ���� ���������� �� ���� � ��������� ������ / ���� ����������� ������������ ���� � �������� ������������
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'TaxRegDateEnd' element value. ���� ������ � ����� � ��������� ������
     * 
     * @return value
     */
    public LocalDate getTaxRegDateEnd() {
        return taxRegDateEnd;
    }

    /** 
     * Set the 'TaxRegDateEnd' element value. ���� ������ � ����� � ��������� ������
     * 
     * @param taxRegDateEnd
     */
    public void setTaxRegDateEnd(LocalDate taxRegDateEnd) {
        this.taxRegDateEnd = taxRegDateEnd;
    }

    /** 
     * Get the 'RegNum' element value. ��������������� ����� � ������
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. ��������������� ����� � ������
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'RegData' element value. ��������������� ������
     * 
     * @return value
     */
    public RFOrganizationFeaturesType getRegData() {
        return regData;
    }

    /** 
     * Set the 'RegData' element value. ��������������� ������
     * 
     * @param regData
     */
    public void setRegData(RFOrganizationFeaturesType regData) {
        this.regData = regData;
    }

    /** 
     * Get the 'TaxOrgan' element value. �������� � ��������� ������, ������������� ���������� �� ���� ������������ ����
     * 
     * @return value
     */
    public RegOrganType getTaxOrgan() {
        return taxOrgan;
    }

    /** 
     * Set the 'TaxOrgan' element value. �������� � ��������� ������, ������������� ���������� �� ���� ������������ ����
     * 
     * @param taxOrgan
     */
    public void setTaxOrgan(RegOrganType taxOrgan) {
        this.taxOrgan = taxOrgan;
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
