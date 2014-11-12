
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADCommonOfficialMarkType;

/** 
 * ��������� ������� �� 
 */
public class GTDOutCommonMarkType extends RUESADCommonOfficialMarkType
{
    private String stageDescription;
    private String identifierDescription;
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
