
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� ����� �������, ������������� �� ������� ����������� ������� � �������� ��������� � ��������, ������������ � ��, ����� ������� ������� � ������������� �� ����������� �����
 */
public class SolutionNumberType extends GTDIDType
{
    private String code;
    private String solutionInformation;

    /** 
     * Get the 'Code' element value. ��� ������������� � ������������ � ��������������� ����� ������������� �� ����� ������� �������
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. ��� ������������� � ������������ � ��������������� ����� ������������� �� ����� ������� �������
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'SolutionInformation' element value. ���������� � �������� ������� �� �������� ��������� � ��
     * 
     * @return value
     */
    public String getSolutionInformation() {
        return solutionInformation;
    }

    /** 
     * Set the 'SolutionInformation' element value. ���������� � �������� ������� �� �������� ��������� � ��
     * 
     * @param solutionInformation
     */
    public void setSolutionInformation(String solutionInformation) {
        this.solutionInformation = solutionInformation;
    }
}
