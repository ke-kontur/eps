
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADCommonOfficialMarkType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.SolutionNumberType;

/** 
 * ��������� ������� �� ���
 */
public class KTDinCommonOfficialMarkType extends RUESADCommonOfficialMarkType
{
    private String technologicalMarkTypeCode;
    private String recordSerialNumber;
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
