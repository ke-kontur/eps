
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� ��� ���� ���������, � ������������ � �������� ������ ��������   �� �����������
 */
public class BaseTreatmentDocsType extends DocumentBaseType
{
    private String companyName;

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
