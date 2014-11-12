
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ��������������
 */
public class GuaranteeTDType
{
    private String generalNumber;
    private LocalDate generalDate;
    private String guaranteeNumber;
    private LocalDate guaranteeDate;
    private String addGuaranteeNumber;
    private LocalDate addGuaranteeDate;

    /** 
     * Get the 'GeneralNumber' element value. ����� ������������ ��������
     * 
     * @return value
     */
    public String getGeneralNumber() {
        return generalNumber;
    }

    /** 
     * Set the 'GeneralNumber' element value. ����� ������������ ��������
     * 
     * @param generalNumber
     */
    public void setGeneralNumber(String generalNumber) {
        this.generalNumber = generalNumber;
    }

    /** 
     * Get the 'GeneralDate' element value. ���� ������������ ��������
     * 
     * @return value
     */
    public LocalDate getGeneralDate() {
        return generalDate;
    }

    /** 
     * Set the 'GeneralDate' element value. ���� ������������ ��������
     * 
     * @param generalDate
     */
    public void setGeneralDate(LocalDate generalDate) {
        this.generalDate = generalDate;
    }

    /** 
     * Get the 'GuaranteeNumber' element value. ����� �������� ��������������
     * 
     * @return value
     */
    public String getGuaranteeNumber() {
        return guaranteeNumber;
    }

    /** 
     * Set the 'GuaranteeNumber' element value. ����� �������� ��������������
     * 
     * @param guaranteeNumber
     */
    public void setGuaranteeNumber(String guaranteeNumber) {
        this.guaranteeNumber = guaranteeNumber;
    }

    /** 
     * Get the 'GuaranteeDate' element value. ���� �������� ��������������
     * 
     * @return value
     */
    public LocalDate getGuaranteeDate() {
        return guaranteeDate;
    }

    /** 
     * Set the 'GuaranteeDate' element value. ���� �������� ��������������
     * 
     * @param guaranteeDate
     */
    public void setGuaranteeDate(LocalDate guaranteeDate) {
        this.guaranteeDate = guaranteeDate;
    }

    /** 
     * Get the 'AddGuaranteeNumber' element value. ����� ���������� � �������� �������������� 
     * 
     * @return value
     */
    public String getAddGuaranteeNumber() {
        return addGuaranteeNumber;
    }

    /** 
     * Set the 'AddGuaranteeNumber' element value. ����� ���������� � �������� �������������� 
     * 
     * @param addGuaranteeNumber
     */
    public void setAddGuaranteeNumber(String addGuaranteeNumber) {
        this.addGuaranteeNumber = addGuaranteeNumber;
    }

    /** 
     * Get the 'AddGuaranteeDate' element value. ���� ���������� � �������� ��������������
     * 
     * @return value
     */
    public LocalDate getAddGuaranteeDate() {
        return addGuaranteeDate;
    }

    /** 
     * Set the 'AddGuaranteeDate' element value. ���� ���������� � �������� ��������������
     * 
     * @param addGuaranteeDate
     */
    public void setAddGuaranteeDate(LocalDate addGuaranteeDate) {
        this.addGuaranteeDate = addGuaranteeDate;
    }
}
