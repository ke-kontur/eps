
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.ContactType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADOrganizationInType;

/** 
 * ДТ и ТД. Внутренний формат. Сведения о получателе товаров.
 */
public class ESADinConsigneeType extends ESADOrganizationInType
{
    private String contractorIndicator;
    private String officesExchangeCode;
    private CUBranchDescriptionType branchDescription;
    private ContactType contact;

    /** 
     * Get the 'ContractorIndicator' element value. Особенность указанных сведений:1-КОНТРАГЕНТ; 2 - РАЗНЫЕ ПО СПИСКУ.
     * 
     * @return value
     */
    public String getContractorIndicator() {
        return contractorIndicator;
    }

    /** 
     * Set the 'ContractorIndicator' element value. Особенность указанных сведений:1-КОНТРАГЕНТ; 2 - РАЗНЫЕ ПО СПИСКУ.
     * 
     * @param contractorIndicator
     */
    public void setContractorIndicator(String contractorIndicator) {
        this.contractorIndicator = contractorIndicator;
    }

    /** 
     * Get the 'OfficesExchangeCode' element value. Код учреждения обмена подачи международных почтовых отправлений 
     * 
     * @return value
     */
    public String getOfficesExchangeCode() {
        return officesExchangeCode;
    }

    /** 
     * Set the 'OfficesExchangeCode' element value. Код учреждения обмена подачи международных почтовых отправлений 
     * 
     * @param officesExchangeCode
     */
    public void setOfficesExchangeCode(String officesExchangeCode) {
        this.officesExchangeCode = officesExchangeCode;
    }

    /** 
     * Get the 'BranchDescription' element value. Сведения об обособленном подразделении.
     * 
     * @return value
     */
    public CUBranchDescriptionType getBranchDescription() {
        return branchDescription;
    }

    /** 
     * Set the 'BranchDescription' element value. Сведения об обособленном подразделении.
     * 
     * @param branchDescription
     */
    public void setBranchDescription(CUBranchDescriptionType branchDescription) {
        this.branchDescription = branchDescription;
    }

    /** 
     * Get the 'Contact' element value. Контактная информация
     * 
     * @return value
     */
    public ContactType getContact() {
        return contact;
    }

    /** 
     * Set the 'Contact' element value. Контактная информация
     * 
     * @param contact
     */
    public void setContact(ContactType contact) {
        this.contact = contact;
    }
}
