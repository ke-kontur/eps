
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� ��� ��
 */
public class TDGuaranteeType
{
    private String measureCode;
    private String docNumber;
    private LocalDate docDate;
    private String guaranteeName;
    private String UNP;
    private String BIC;
    private String guaranteeAmount;
    private GuaranteeTDType guaranteeTD;
    private AddressType guaranteeAddress;

    /** 
     * Get the 'MeasureCode' element value. ��� ���� ����������� �� �������������� ��� �����������
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. ��� ���� ����������� �� �������������� ��� �����������
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the 'DocNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getDocNumber() {
        return docNumber;
    }

    /** 
     * Set the 'DocNumber' element value. ����� ���������
     * 
     * @param docNumber
     */
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    /** 
     * Get the 'DocDate' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getDocDate() {
        return docDate;
    }

    /** 
     * Set the 'DocDate' element value. ���� ���������
     * 
     * @param docDate
     */
    public void setDocDate(LocalDate docDate) {
        this.docDate = docDate;
    }

    /** 
     * Get the 'GuaranteeName' element value. ������������ �������
     * 
     * @return value
     */
    public String getGuaranteeName() {
        return guaranteeName;
    }

    /** 
     * Set the 'GuaranteeName' element value. ������������ �������
     * 
     * @param guaranteeName
     */
    public void setGuaranteeName(String guaranteeName) {
        this.guaranteeName = guaranteeName;
    }

    /** 
     * Get the 'UNP' element value. ������� ����� ����������� (���)
     * 
     * @return value
     */
    public String getUNP() {
        return UNP;
    }

    /** 
     * Set the 'UNP' element value. ������� ����� ����������� (���)
     * 
     * @param UNP
     */
    public void setUNP(String UNP) {
        this.UNP = UNP;
    }

    /** 
     * Get the 'BIC' element value. ��� ���/���
     * 
     * @return value
     */
    public String getBIC() {
        return BIC;
    }

    /** 
     * Set the 'BIC' element value. ��� ���/���
     * 
     * @param BIC
     */
    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    /** 
     * Get the 'GuaranteeAmount' element value. ����� �����������. ��� ��
     * 
     * @return value
     */
    public String getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /** 
     * Set the 'GuaranteeAmount' element value. ����� �����������. ��� ��
     * 
     * @param guaranteeAmount
     */
    public void setGuaranteeAmount(String guaranteeAmount) {
        this.guaranteeAmount = guaranteeAmount;
    }

    /** 
     * Get the 'GuaranteeTD' element value. ��������������
     * 
     * @return value
     */
    public GuaranteeTDType getGuaranteeTD() {
        return guaranteeTD;
    }

    /** 
     * Set the 'GuaranteeTD' element value. ��������������
     * 
     * @param guaranteeTD
     */
    public void setGuaranteeTD(GuaranteeTDType guaranteeTD) {
        this.guaranteeTD = guaranteeTD;
    }

    /** 
     * Get the 'GuaranteeAddress' element value. ����� �������
     * 
     * @return value
     */
    public AddressType getGuaranteeAddress() {
        return guaranteeAddress;
    }

    /** 
     * Set the 'GuaranteeAddress' element value. ����� �������
     * 
     * @param guaranteeAddress
     */
    public void setGuaranteeAddress(AddressType guaranteeAddress) {
        this.guaranteeAddress = guaranteeAddress;
    }
}
