
package ru.acs.fts.schemas.album.commercialact;

/** 
 * �������� �������������� ���� ������ �� �� ��� ���������, ���������� � ���������������������� ����������
 */
public class GoodsTNVEDCodeType
{
    private String TNVEDCodeByDocs;
    private String TNVEDCodeByFact;

    /** 
     * Get the 'TNVEDCodeByDocs' element value. ��� ������ �� �� ��� �� �������� ���������������������� ����������
     * 
     * @return value
     */
    public String getTNVEDCodeByDocs() {
        return TNVEDCodeByDocs;
    }

    /** 
     * Set the 'TNVEDCodeByDocs' element value. ��� ������ �� �� ��� �� �������� ���������������������� ����������
     * 
     * @param TNVEDCodeByDocs
     */
    public void setTNVEDCodeByDocs(String TNVEDCodeByDocs) {
        this.TNVEDCodeByDocs = TNVEDCodeByDocs;
    }

    /** 
     * Get the 'TNVEDCodeByFact' element value. ��� ������ �� �� ��� �� �����������
     * 
     * @return value
     */
    public String getTNVEDCodeByFact() {
        return TNVEDCodeByFact;
    }

    /** 
     * Set the 'TNVEDCodeByFact' element value. ��� ������ �� �� ��� �� �����������
     * 
     * @param TNVEDCodeByFact
     */
    public void setTNVEDCodeByFact(String TNVEDCodeByFact) {
        this.TNVEDCodeByFact = TNVEDCodeByFact;
    }
}
