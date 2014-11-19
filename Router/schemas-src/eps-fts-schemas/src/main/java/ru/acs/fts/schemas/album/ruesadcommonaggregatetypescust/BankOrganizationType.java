
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ��� ��������� ����������� / ��������� ����� � ������� ������ ����.
 */
public class BankOrganizationType
{
    private String INN;
    private String OKPO;
    private String bankName;
    private String organizationKind;

    /** 
     * Get the 'INN' element value. ��� ��������� �����������
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ��� ��������� �����������
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'OKPO' element value. ���� �����
     * 
     * @return value
     */
    public String getOKPO() {
        return OKPO;
    }

    /** 
     * Set the 'OKPO' element value. ���� �����
     * 
     * @param OKPO
     */
    public void setOKPO(String OKPO) {
        this.OKPO = OKPO;
    }

    /** 
     * Get the 'BankName' element value. ������������ �����
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. ������������ �����
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'OrganizationKind' element value. ��� �����������, ��������� � ��. 28. 1- ��������� ����������� 2-���� � ������� ������ ����. 
     * 
     * @return value
     */
    public String getOrganizationKind() {
        return organizationKind;
    }

    /** 
     * Set the 'OrganizationKind' element value. ��� �����������, ��������� � ��. 28. 1- ��������� ����������� 2-���� � ������� ������ ����. 
     * 
     * @param organizationKind
     */
    public void setOrganizationKind(String organizationKind) {
        this.organizationKind = organizationKind;
    }
}
