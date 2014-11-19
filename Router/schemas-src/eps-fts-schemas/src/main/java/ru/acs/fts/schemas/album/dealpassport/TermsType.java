
package ru.acs.fts.schemas.album.dealpassport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����� �������� � ���������, �����������/����������
 */
public class TermsType extends DocumentBaseType
{
    private LocalDate contractEndDate;
    private String specialTerms1;
    private String specialTerms2;
    private String specialTerms3;
    private String specialTerms4;

    /** 
     * Get the 'ContractEndDate' element value. ���� ���������� ���������� ������������ �� ���������
     * 
     * @return value
     */
    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    /** 
     * Set the 'ContractEndDate' element value. ���� ���������� ���������� ������������ �� ���������
     * 
     * @param contractEndDate
     */
    public void setContractEndDate(LocalDate contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /** 
     * Get the 'SpecialTerms1' element value. ������ ������� - ����� ���������� ���������� �� ����� �� �������
     * 
     * @return value
     */
    public String getSpecialTerms1() {
        return specialTerms1;
    }

    /** 
     * Set the 'SpecialTerms1' element value. ������ ������� - ����� ���������� ���������� �� ����� �� �������
     * 
     * @param specialTerms1
     */
    public void setSpecialTerms1(String specialTerms1) {
        this.specialTerms1 = specialTerms1;
    }

    /** 
     * Get the 'SpecialTerms2' element value. ������ ������� - �������� ��������
     * 
     * @return value
     */
    public String getSpecialTerms2() {
        return specialTerms2;
    }

    /** 
     * Set the 'SpecialTerms2' element value. ������ ������� - �������� ��������
     * 
     * @param specialTerms2
     */
    public void setSpecialTerms2(String specialTerms2) {
        this.specialTerms2 = specialTerms2;
    }

    /** 
     * Get the 'SpecialTerms3' element value. ������ ������� - ����/����� �������, ��������� � �������� XVI, XVII � XIX �� ��� ��
     * 
     * @return value
     */
    public String getSpecialTerms3() {
        return specialTerms3;
    }

    /** 
     * Set the 'SpecialTerms3' element value. ������ ������� - ����/����� �������, ��������� � �������� XVI, XVII � XIX �� ��� ��
     * 
     * @param specialTerms3
     */
    public void setSpecialTerms3(String specialTerms3) {
        this.specialTerms3 = specialTerms3;
    }

    /** 
     * Get the 'SpecialTerms4' element value. ������ ������� - ���������� ������������ � ��������� ����� �� ��������� ���������� ��
     * 
     * @return value
     */
    public String getSpecialTerms4() {
        return specialTerms4;
    }

    /** 
     * Set the 'SpecialTerms4' element value. ������ ������� - ���������� ������������ � ��������� ����� �� ��������� ���������� ��
     * 
     * @param specialTerms4
     */
    public void setSpecialTerms4(String specialTerms4) {
        this.specialTerms4 = specialTerms4;
    }
}
