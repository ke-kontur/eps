
package ru.acs.fts.schemas.album.guaranteeunacceptancenotif;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ������������� ������������� �����������
 */
public class GuaranteeUnacceptanceInfoType
{
    private String measureCode;
    private String guaranteeDocNumber;
    private List<ReasonType> reasonList = new ArrayList<ReasonType>();

    /** 
     * Get the 'MeasureCode' element value. ��� ���� �����������
     * 
     * @return value
     */
    public String getMeasureCode() {
        return measureCode;
    }

    /** 
     * Set the 'MeasureCode' element value. ��� ���� �����������
     * 
     * @param measureCode
     */
    public void setMeasureCode(String measureCode) {
        this.measureCode = measureCode;
    }

    /** 
     * Get the 'GuaranteeDocNumber' element value. ����� ��������� �����������
     * 
     * @return value
     */
    public String getGuaranteeDocNumber() {
        return guaranteeDocNumber;
    }

    /** 
     * Set the 'GuaranteeDocNumber' element value. ����� ��������� �����������
     * 
     * @param guaranteeDocNumber
     */
    public void setGuaranteeDocNumber(String guaranteeDocNumber) {
        this.guaranteeDocNumber = guaranteeDocNumber;
    }

    /** 
     * Get the list of 'Reason' element items. ������� ������������� �������� �����������. ������� Name ����� ��������� ��������� ��������: DOC_NOT_FOUND - �������� �� ������ � �� �� �����������; DOC_EXPIRED - �������� ����, ��������� � ��������� �����������, �� ��������� �������� ���������� ������������� ����������; FALSE_INFO - �������������� �������� �� ��������� ����������� ��������� � ��; LACK_OF_FUNDS - ��������������� ����� �����������; NO_FREE_FUNDS - ���������� ���������� ������� ���. �������; TECH_PROBLEM - ������� ����������� �������
     * 
     * @return list
     */
    public List<ReasonType> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. ������� ������������� �������� �����������. ������� Name ����� ��������� ��������� ��������: DOC_NOT_FOUND - �������� �� ������ � �� �� �����������; DOC_EXPIRED - �������� ����, ��������� � ��������� �����������, �� ��������� �������� ���������� ������������� ����������; FALSE_INFO - �������������� �������� �� ��������� ����������� ��������� � ��; LACK_OF_FUNDS - ��������������� ����� �����������; NO_FREE_FUNDS - ���������� ���������� ������� ���. �������; TECH_PROBLEM - ������� ����������� �������
     * 
     * @param list
     */
    public void setReasonList(List<ReasonType> list) {
        reasonList = list;
    }
}
