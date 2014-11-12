
package ru.acs.fts.schemas.album.legalentityinfo;

/** 
 * �������� �� ��������������-�������� �����
 */
public class OrganizationFormType
{
    private String classifierName;
    private String classifierCode;
    private String formName;

    /** 
     * Get the 'ClassifierName' element value. ������������ �������������� �� �������� ������� �������� �� ��������������-�������� �����: �����, ����
     * 
     * @return value
     */
    public String getClassifierName() {
        return classifierName;
    }

    /** 
     * Set the 'ClassifierName' element value. ������������ �������������� �� �������� ������� �������� �� ��������������-�������� �����: �����, ����
     * 
     * @param classifierName
     */
    public void setClassifierName(String classifierName) {
        this.classifierName = classifierName;
    }

    /** 
     * Get the 'ClassifierCode' element value. ��� �� ���������� ��������������
     * 
     * @return value
     */
    public String getClassifierCode() {
        return classifierCode;
    }

    /** 
     * Set the 'ClassifierCode' element value. ��� �� ���������� ��������������
     * 
     * @param classifierCode
     */
    public void setClassifierCode(String classifierCode) {
        this.classifierCode = classifierCode;
    }

    /** 
     * Get the 'FormName' element value. ������ ������������ ��������������-�������� �����
     * 
     * @return value
     */
    public String getFormName() {
        return formName;
    }

    /** 
     * Set the 'FormName' element value. ������ ������������ ��������������-�������� �����
     * 
     * @param formName
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }
}
