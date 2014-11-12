
package ru.acs.fts.schemas.album.gtdobligation;

/** 
 * ���������� ���������
 */
public class CustomsProcedureType
{
    private String mainCustomsModeCode;
    private String declarationKind;

    /** 
     * Get the 'MainCustomsModeCode' element value. ��� ���������� ���������� ��������� � ������������ � ��������������� ����� ����������  ��������.
     * 
     * @return value
     */
    public String getMainCustomsModeCode() {
        return mainCustomsModeCode;
    }

    /** 
     * Set the 'MainCustomsModeCode' element value. ��� ���������� ���������� ��������� � ������������ � ��������������� ����� ����������  ��������.
     * 
     * @param mainCustomsModeCode
     */
    public void setMainCustomsModeCode(String mainCustomsModeCode) {
        this.mainCustomsModeCode = mainCustomsModeCode;
    }

    /** 
     * Get the 'DeclarationKind' element value. ��� ����������� �������������� ������� �� �������������� ������������ ����������� �������������� �������.
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. ��� ����������� �������������� ������� �� �������������� ������������ ����������� �������������� �������.
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }
}
