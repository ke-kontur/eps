
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * ИНН кредитной организации / реквизиты банка в котором открыт счет.
 */
public class BankOrganizationType
{
    private String INN;
    private String OKPO;
    private String bankName;
    private String organizationKind;

    /** 
     * Get the 'INN' element value. ИНН кредитной организации
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ИНН кредитной организации
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'OKPO' element value. ОКПО банка
     * 
     * @return value
     */
    public String getOKPO() {
        return OKPO;
    }

    /** 
     * Set the 'OKPO' element value. ОКПО банка
     * 
     * @param OKPO
     */
    public void setOKPO(String OKPO) {
        this.OKPO = OKPO;
    }

    /** 
     * Get the 'BankName' element value. Наименование банка
     * 
     * @return value
     */
    public String getBankName() {
        return bankName;
    }

    /** 
     * Set the 'BankName' element value. Наименование банка
     * 
     * @param bankName
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /** 
     * Get the 'OrganizationKind' element value. Тип организации, указанный в гр. 28. 1- Кредитная организация 2-Банк в котором открыт счет. 
     * 
     * @return value
     */
    public String getOrganizationKind() {
        return organizationKind;
    }

    /** 
     * Set the 'OrganizationKind' element value. Тип организации, указанный в гр. 28. 1- Кредитная организация 2-Банк в котором открыт счет. 
     * 
     * @param organizationKind
     */
    public void setOrganizationKind(String organizationKind) {
        this.organizationKind = organizationKind;
    }
}
