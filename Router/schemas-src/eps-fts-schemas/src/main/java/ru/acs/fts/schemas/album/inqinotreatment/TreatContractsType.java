
package ru.acs.fts.schemas.album.inqinotreatment;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� ��� ���� ���������, � ������������ � �������� ������ �������� /���������  �� �����������
 */
public class TreatContractsType extends DocumentBaseType
{
    private String companyCountry;
    private String companyName;

    /** 
     * Get the 'CompanyCountry' element value. ������, ��� ����������� ����������� �����������
     * 
     * @return value
     */
    public String getCompanyCountry() {
        return companyCountry;
    }

    /** 
     * Set the 'CompanyCountry' element value. ������, ��� ����������� ����������� �����������
     * 
     * @param companyCountry
     */
    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    /** 
     * Get the 'CompanyName' element value. ������������ ����������� �����������
     * 
     * @return value
     */
    public String getCompanyName() {
        return companyName;
    }

    /** 
     * Set the 'CompanyName' element value. ������������ ����������� �����������
     * 
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
