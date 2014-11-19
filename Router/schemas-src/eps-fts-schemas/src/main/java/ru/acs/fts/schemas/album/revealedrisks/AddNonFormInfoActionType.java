
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������������� ����������������� ���������� - ������� ����
 */
public class AddNonFormInfoActionType
{
    private String informationCode;
    private String lineNumber;
    private String violationsCode;
    private List<String> typicalNameList = new ArrayList<String>();
    private String pointCode;

    /** 
     * Get the 'InformationCode' element value. ��� ����������: 0 - ������; 1- �������� ������� ������������ ���� � ���� ����������� ������, ���������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������; 2 - ������� � ����������� ���������� ���
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. ��� ����������: 0 - ������; 1- �������� ������� ������������ ���� � ���� ����������� ������, ���������� �� � ������������ � ����������������, ������������� � ������� �����, ���� �� � ������ ������; 2 - ������� � ����������� ���������� ���
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the 'LineNumber' element value. ���������� ����� ������ ����������
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. ���������� ����� ������ ����������
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the 'ViolationsCode' element value. ��� ���� ����������� ��������� ����������� ����������������
     * 
     * @return value
     */
    public String getViolationsCode() {
        return violationsCode;
    }

    /** 
     * Set the 'ViolationsCode' element value. ��� ���� ����������� ��������� ����������� ����������������
     * 
     * @param violationsCode
     */
    public void setViolationsCode(String violationsCode) {
        this.violationsCode = violationsCode;
    }

    /** 
     * Get the list of 'TypicalName' element items. ����������� ���������� (������������) ���
     * 
     * @return list
     */
    public List<String> getTypicalNameList() {
        return typicalNameList;
    }

    /** 
     * Set the list of 'TypicalName' element items. ����������� ���������� (������������) ���
     * 
     * @param list
     */
    public void setTypicalNameList(List<String> list) {
        typicalNameList = list;
    }

    /** 
     * Get the 'PointCode' element value. ���� ���������� �������� �� ������������ �������� ����� 
     * 
     * @return value
     */
    public String getPointCode() {
        return pointCode;
    }

    /** 
     * Set the 'PointCode' element value. ���� ���������� �������� �� ������������ �������� ����� 
     * 
     * @param pointCode
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }
}
