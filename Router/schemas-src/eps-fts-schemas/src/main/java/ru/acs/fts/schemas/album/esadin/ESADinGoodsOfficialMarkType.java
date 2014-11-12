
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsOfficialMarkType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.SolutionNumberType;

/** 
 * �� � ��. ���������� ������. ��������� ������� �� ������.
 */
public class ESADinGoodsOfficialMarkType extends ESADGoodsOfficialMarkType
{
    private String technologicalMarkTypeCode;
    private String recordNumber;
    private String code;
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
     * Get the 'RecordNumber' element value. ���������� ����� ������ �� �������������� ������������� ��������������� �������
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ �� �������������� ������������� ��������������� �������
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'Code' element value. ��� ��������� ��������� ����� ������� �������
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. ��� ��������� ��������� ����� ������� �������
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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
