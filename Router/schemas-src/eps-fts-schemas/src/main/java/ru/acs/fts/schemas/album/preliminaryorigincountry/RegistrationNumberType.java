
package ru.acs.fts.schemas.album.preliminaryorigincountry;

/** 
 * ��������������� �����
 */
public class RegistrationNumberType
{
    private String indexManagement;
    private String caseNumber;
    private String serialNumber;

    /** 
     * Get the 'IndexManagement' element value. ������ ����������
     * 
     * @return value
     */
    public String getIndexManagement() {
        return indexManagement;
    }

    /** 
     * Set the 'IndexManagement' element value. ������ ����������
     * 
     * @param indexManagement
     */
    public void setIndexManagement(String indexManagement) {
        this.indexManagement = indexManagement;
    }

    /** 
     * Get the 'CaseNumber' element value. ����� ���� �� ������������ ��� ����������
     * 
     * @return value
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /** 
     * Set the 'CaseNumber' element value. ����� ���� �� ������������ ��� ����������
     * 
     * @param caseNumber
     */
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    /** 
     * Get the 'SerialNumber' element value. ���������� ��������� ����� ���������������� ������� � ����������
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. ���������� ��������� ����� ���������������� ������� � ����������
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
