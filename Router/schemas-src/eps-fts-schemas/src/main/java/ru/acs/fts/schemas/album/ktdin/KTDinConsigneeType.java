
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.ContactType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADOrganizationInType;

/** 
 * Сведения о получателе товаров
 */
public class KTDinConsigneeType extends ESADOrganizationInType
{
    private String contractorIndicator;
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
