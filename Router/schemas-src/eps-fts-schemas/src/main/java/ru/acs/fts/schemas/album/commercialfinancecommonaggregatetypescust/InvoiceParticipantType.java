
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * �������� �� ���������� ������ ��  �����-������� (�������� ��� ����������)
 */
public class InvoiceParticipantType
{
    private String companyID;
    private String KPPCode;
    private String name;
    private String phone;

    /** 
     * Get the 'CompanyID' element value. �������������� ����� �����������������  � ������������ � ������������ �������� ����������� (� �� ��� ��. ��� - ���)
     * 
     * @return value
     */
    public String getCompanyID() {
        return companyID;
    }

    /** 
     * Set the 'CompanyID' element value. �������������� ����� �����������������  � ������������ � ������������ �������� ����������� (� �� ��� ��. ��� - ���)
     * 
     * @param companyID
     */
    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    /** 
     * Get the 'KPPCode' element value. ��� ������� ���������� �� ��������� ����
     * 
     * @return value
     */
    public String getKPPCode() {
        return KPPCode;
    }

    /** 
     * Set the 'KPPCode' element value. ��� ������� ���������� �� ��������� ����
     * 
     * @param KPPCode
     */
    public void setKPPCode(String KPPCode) {
        this.KPPCode = KPPCode;
    }

    /** 
     * Get the 'Name' element value. ������������
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Phone' element value. �������
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. �������
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
