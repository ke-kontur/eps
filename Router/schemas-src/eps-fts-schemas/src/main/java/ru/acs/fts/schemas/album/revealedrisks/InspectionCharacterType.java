
package ru.acs.fts.schemas.album.revealedrisks;

/** 
 * �������������� ��������/�������
 */
public class InspectionCharacterType
{
    private String inspCharCode;
    private String inspCharValue;
    private String codeChoiceIndicator;

    /** 
     * Get the 'InspCharCode' element value. ��� �������������� ��������/������� (����������� � ������������ �� ��������� �������������� "������������� ����������� �������� �������")
     * 
     * @return value
     */
    public String getInspCharCode() {
        return inspCharCode;
    }

    /** 
     * Set the 'InspCharCode' element value. ��� �������������� ��������/������� (����������� � ������������ �� ��������� �������������� "������������� ����������� �������� �������")
     * 
     * @param inspCharCode
     */
    public void setInspCharCode(String inspCharCode) {
        this.inspCharCode = inspCharCode;
    }

    /** 
     * Get the 'InspCharValue' element value. �������� �������������� ��������/������� (����������� � ������������ �� ��������� �������������� "���������� �������� ������������� ����������� �������� �������" rskzdosm.dbf)
     * 
     * @return value
     */
    public String getInspCharValue() {
        return inspCharValue;
    }

    /** 
     * Set the 'InspCharValue' element value. �������� �������������� ��������/������� (����������� � ������������ �� ��������� �������������� "���������� �������� ������������� ����������� �������� �������" rskzdosm.dbf)
     * 
     * @param inspCharValue
     */
    public void setInspCharValue(String inspCharValue) {
        this.inspCharValue = inspCharValue;
    }

    /** 
     * Get the 'CodeChoiceIndicator' element value. �������, ������������ ����������� ������ �������� �������������� ����������� ��������/�������.  0 - �������� �������� �������� ������������� ����������� ��������/�������, 1 - ����������� ������ ����������� (������� ����������� � ������������ �� ���������� �������������, ������������� �������� �����)
     * 
     * @return value
     */
    public String getCodeChoiceIndicator() {
        return codeChoiceIndicator;
    }

    /** 
     * Set the 'CodeChoiceIndicator' element value. �������, ������������ ����������� ������ �������� �������������� ����������� ��������/�������.  0 - �������� �������� �������� ������������� ����������� ��������/�������, 1 - ����������� ������ ����������� (������� ����������� � ������������ �� ���������� �������������, ������������� �������� �����)
     * 
     * @param codeChoiceIndicator
     */
    public void setCodeChoiceIndicator(String codeChoiceIndicator) {
        this.codeChoiceIndicator = codeChoiceIndicator;
    }
}
