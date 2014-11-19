
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADCommonOfficialMarkType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.SolutionNumberType;

/** 
 * �� � ��. ���������� ������. ��������� ������� �� ��.
 */
public class ESADinCommonOfficialMarkType extends RUESADCommonOfficialMarkType
{
    private String technologicalMarkTypeCode;
    private String recordSerialNumber;
    private String paymentWayCode;
    private String guaranteeFoundation;
    private SolutionNumberType solutionNumber;

    /** 
     * Get the 'TechnologicalMarkTypeCode' element value. ��� ������������� ��������������� ������� (1-�������, ���������� �� ������� ����� ���� �������� �� ������� ���, 2-����������, ���������� ������� �������� ������ � ������ ����)
     * 
     * @return value
     */
    public String getTechnologicalMarkTypeCode() {
        return technologicalMarkTypeCode;
    }

    /** 
     * Set the 'TechnologicalMarkTypeCode' element value. ��� ������������� ��������������� ������� (1-�������, ���������� �� ������� ����� ���� �������� �� ������� ���, 2-����������, ���������� ������� �������� ������ � ������ ����)
     * 
     * @param technologicalMarkTypeCode
     */
    public void setTechnologicalMarkTypeCode(String technologicalMarkTypeCode) {
        this.technologicalMarkTypeCode = technologicalMarkTypeCode;
    }

    /** 
     * Get the 'RecordSerialNumber' element value. ���������� ����� ������ �� �������������� ������������� ��������������� �������
     * 
     * @return value
     */
    public String getRecordSerialNumber() {
        return recordSerialNumber;
    }

    /** 
     * Set the 'RecordSerialNumber' element value. ���������� ����� ������ �� �������������� ������������� ��������������� �������
     * 
     * @param recordSerialNumber
     */
    public void setRecordSerialNumber(String recordSerialNumber) {
        this.recordSerialNumber = recordSerialNumber;
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

    /** 
     * Get the 'SolutionNumber' element value. ����� �������
     * 
     * @return value
     */
    public SolutionNumberType getSolutionNumber() {
        return solutionNumber;
    }

    /** 
     * Set the 'SolutionNumber' element value. ����� �������
     * 
     * @param solutionNumber
     */
    public void setSolutionNumber(SolutionNumberType solutionNumber) {
        this.solutionNumber = solutionNumber;
    }
}
