
package ru.acs.fts.schemas.album.gtdincustomsmark;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADCommonOfficialMarkType;

/** 
 * ��������� ������� �� 
 */
public class GTDInCommonMarkType extends RUESADCommonOfficialMarkType
{
    private String stageDescription;
    private String identifierDescription;
    private String INPIGUID;
    private LocalDate goodsPresentDate;
    private String goodsPresentTime;
    private String paymentWayCode;
    private String guaranteeFoundation;

    /** 
     * Get the 'StageDescription' element value. �������� �����.
     * 
     * @return value
     */
    public String getStageDescription() {
        return stageDescription;
    }

    /** 
     * Set the 'StageDescription' element value. �������� �����.
     * 
     * @param stageDescription
     */
    public void setStageDescription(String stageDescription) {
        this.stageDescription = stageDescription;
    }

    /** 
     * Get the 'IdentifierDescription' element value. �������� ���� ����������
     * 
     * @return value
     */
    public String getIdentifierDescription() {
        return identifierDescription;
    }

    /** 
     * Set the 'IdentifierDescription' element value. �������� ���� ����������
     * 
     * @param identifierDescription
     */
    public void setIdentifierDescription(String identifierDescription) {
        this.identifierDescription = identifierDescription;
    }

    /** 
     * Get the 'INPI_GUID' element value. ����������������� ����� ��������������� ���������� � �������, ������������ ����������� �������� �������� ���������� � ���� ���������� ������� ���������� ��������� (���������� �������������)
     * 
     * @return value
     */
    public String getINPIGUID() {
        return INPIGUID;
    }

    /** 
     * Set the 'INPI_GUID' element value. ����������������� ����� ��������������� ���������� � �������, ������������ ����������� �������� �������� ���������� � ���� ���������� ������� ���������� ��������� (���������� �������������)
     * 
     * @param INPIGUID
     */
    public void setINPIGUID(String INPIGUID) {
        this.INPIGUID = INPIGUID;
    }

    /** 
     * Get the 'GoodsPresentDate' element value. ���� ������������� �������
     * 
     * @return value
     */
    public LocalDate getGoodsPresentDate() {
        return goodsPresentDate;
    }

    /** 
     * Set the 'GoodsPresentDate' element value. ���� ������������� �������
     * 
     * @param goodsPresentDate
     */
    public void setGoodsPresentDate(LocalDate goodsPresentDate) {
        this.goodsPresentDate = goodsPresentDate;
    }

    /** 
     * Get the 'GoodsPresentTime' element value. ����� ������������� �������
     * 
     * @return value
     */
    public String getGoodsPresentTime() {
        return goodsPresentTime;
    }

    /** 
     * Set the 'GoodsPresentTime' element value. ����� ������������� �������
     * 
     * @param goodsPresentTime
     */
    public void setGoodsPresentTime(String goodsPresentTime) {
        this.goodsPresentTime = goodsPresentTime;
    }

    /** 
     * Get the 'PaymentWayCode' element value. ��� ������� ����������� ������ � ������������ � ��������������� �������� ����������� ������ ���������� ������, �������
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value. ��� ������� ����������� ������ � ������������ � ��������������� �������� ����������� ������ ���������� ������, �������
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
    }

    /** 
     * Get the 'GuaranteeFoundation' element value. ��������� �������������� ����������� ������ ����������  ������, �������, �����������, ���������������, ��������������� ������
     * 
     * @return value
     */
    public String getGuaranteeFoundation() {
        return guaranteeFoundation;
    }

    /** 
     * Set the 'GuaranteeFoundation' element value. ��������� �������������� ����������� ������ ����������  ������, �������, �����������, ���������������, ��������������� ������
     * 
     * @param guaranteeFoundation
     */
    public void setGuaranteeFoundation(String guaranteeFoundation) {
        this.guaranteeFoundation = guaranteeFoundation;
    }
}
