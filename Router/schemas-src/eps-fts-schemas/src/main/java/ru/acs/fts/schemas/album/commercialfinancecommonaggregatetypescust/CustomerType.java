
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

/** 
 * ��������� �����������
 */
public class CustomerType
{
    private String organizationName;
    private String INN;
    private String KPP;
    private BankType bank;

    /** 
     * Get the 'OrganizationName' element value. ������������ �������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'INN' element value. ��� �������
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ��� �������
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. ��� ���������� �� ���� (���) �������
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. ��� ���������� �� ���� (���) �������
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    /** 
     * Get the 'Bank' element value. ��������� ����� �������
     * 
     * @return value
     */
    public BankType getBank() {
        return bank;
    }

    /** 
     * Set the 'Bank' element value. ��������� ����� �������
     * 
     * @param bank
     */
    public void setBank(BankType bank) {
        this.bank = bank;
    }
}
