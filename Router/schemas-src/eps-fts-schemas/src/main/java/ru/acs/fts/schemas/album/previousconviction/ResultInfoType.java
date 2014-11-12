
package ru.acs.fts.schemas.album.previousconviction;

import org.joda.time.LocalDate;

/** 
 * �������� � ���������� ���� �� ����
 */
public class ResultInfoType
{
    private String orgCode;
    private String orgName;
    private String resultSign;
    private LocalDate resultDate;

    /** 
     * Get the 'OrgCode' element value. ��� ������������� �� ����������� "������ ����� ������� ��� "���� ��� ������" 
     * 
     * @return value
     */
    public String getOrgCode() {
        return orgCode;
    }

    /** 
     * Set the 'OrgCode' element value. ��� ������������� �� ����������� "������ ����� ������� ��� "���� ��� ������" 
     * 
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /** 
     * Get the 'OrgName' element value. ������������ �������������
     * 
     * @return value
     */
    public String getOrgName() {
        return orgName;
    }

    /** 
     * Set the 'OrgName' element value. ������������ �������������
     * 
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /** 
     * Get the 'ResultSign' element value. ������� ������� �������� � �����: 1 - � ������ ������� �������� � �����; 2 - � ������ ���������� �������� � �����; 3 - � ������ ��������������� ������ � �������������� ��������
     * 
     * @return value
     */
    public String getResultSign() {
        return resultSign;
    }

    /** 
     * Set the 'ResultSign' element value. ������� ������� �������� � �����: 1 - � ������ ������� �������� � �����; 2 - � ������ ���������� �������� � �����; 3 - � ������ ��������������� ������ � �������������� ��������
     * 
     * @param resultSign
     */
    public void setResultSign(String resultSign) {
        this.resultSign = resultSign;
    }

    /** 
     * Get the 'ResultDate' element value. ���� �������������� ��������
     * 
     * @return value
     */
    public LocalDate getResultDate() {
        return resultDate;
    }

    /** 
     * Set the 'ResultDate' element value. ���� �������������� ��������
     * 
     * @param resultDate
     */
    public void setResultDate(LocalDate resultDate) {
        this.resultDate = resultDate;
    }
}
