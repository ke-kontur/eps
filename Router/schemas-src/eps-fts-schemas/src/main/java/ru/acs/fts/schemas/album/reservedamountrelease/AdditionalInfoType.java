
package ru.acs.fts.schemas.album.reservedamountrelease;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� � ���������� � �������� ��������������
 */
public class AdditionalInfoType
{
    private String guarantor;
    private LocalDate validityDate;
    private String GRN;
    private String additionalID;
    private GTDIDType additionalNumber;

    /** 
     * Get the 'Guarantor' element value. ������������ ����������
     * 
     * @return value
     */
    public String getGuarantor() {
        return guarantor;
    }

    /** 
     * Set the 'Guarantor' element value. ������������ ����������
     * 
     * @param guarantor
     */
    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    /** 
     * Get the 'ValidityDate' element value. C���, �� ��������� �������� �������� ������������� ���������� � ����� ����������� ������ ���������� ������, ������� ��� ���������� �������� �������.
     * 
     * @return value
     */
    public LocalDate getValidityDate() {
        return validityDate;
    }

    /** 
     * Set the 'ValidityDate' element value. C���, �� ��������� �������� �������� ������������� ���������� � ����� ����������� ������ ���������� ������, ������� ��� ���������� �������� �������.
     * 
     * @param validityDate
     */
    public void setValidityDate(LocalDate validityDate) {
        this.validityDate = validityDate;
    }

    /** 
     * Get the 'GRN' element value. C�������� ����� �������� � �������� 
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. C�������� ����� �������� � �������� 
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'AdditionalID' element value. ���������� �������������, ������������� ���������� � �������� �������������� ��� �����������
     * 
     * @return value
     */
    public String getAdditionalID() {
        return additionalID;
    }

    /** 
     * Set the 'AdditionalID' element value. ���������� �������������, ������������� ���������� � �������� �������������� ��� �����������
     * 
     * @param additionalID
     */
    public void setAdditionalID(String additionalID) {
        this.additionalID = additionalID;
    }

    /** 
     * Get the 'AdditionalNumber' element value. ����������� ����� ���������� � �������� ��������������
     * 
     * @return value
     */
    public GTDIDType getAdditionalNumber() {
        return additionalNumber;
    }

    /** 
     * Set the 'AdditionalNumber' element value. ����������� ����� ���������� � �������� ��������������
     * 
     * @param additionalNumber
     */
    public void setAdditionalNumber(GTDIDType additionalNumber) {
        this.additionalNumber = additionalNumber;
    }
}
