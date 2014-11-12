
package ru.acs.fts.schemas.album.extractfromorder;

/** 
 * ����� ������
 */
public class EmploymentPlaceType
{
    private String departmentName;
    private String personPost;
    private String mounthlyWage;
    private String extraPay;

    /** 
     * Get the 'DepartmentName' element value. ������������ ������������ �������������
     * 
     * @return value
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /** 
     * Set the 'DepartmentName' element value. ������������ ������������ �������������
     * 
     * @param departmentName
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /** 
     * Get the 'PersonPost' element value. ������������ ��������� (���������), ������, ����� (���������) ������������
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. ������������ ��������� (���������), ������, ����� (���������) ������������
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }

    /** 
     * Get the 'MounthlyWage' element value. ����� (�������� ������)
     * 
     * @return value
     */
    public String getMounthlyWage() {
        return mounthlyWage;
    }

    /** 
     * Set the 'MounthlyWage' element value. ����� (�������� ������)
     * 
     * @param mounthlyWage
     */
    public void setMounthlyWage(String mounthlyWage) {
        this.mounthlyWage = mounthlyWage;
    }

    /** 
     * Get the 'ExtraPay' element value. ��������
     * 
     * @return value
     */
    public String getExtraPay() {
        return extraPay;
    }

    /** 
     * Set the 'ExtraPay' element value. ��������
     * 
     * @param extraPay
     */
    public void setExtraPay(String extraPay) {
        this.extraPay = extraPay;
    }
}
