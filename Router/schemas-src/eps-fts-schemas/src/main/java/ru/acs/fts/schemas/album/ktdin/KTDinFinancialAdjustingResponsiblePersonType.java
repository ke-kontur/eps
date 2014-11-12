
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.ContactType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADOrganizationInType;

/** 
 * Лицо ответственное за финансовое урегулирование.
 */
public class KTDinFinancialAdjustingResponsiblePersonType
        extends
            ESADOrganizationInType
{
    private String entityForm;
    private CUBranchDescriptionType branchDescription;
    private ContactType contact;

    /** 
     * Get the 'EntityForm' element value. Организационно-правовая форма
     * 
     * @return value
     */
    public String getEntityForm() {
        return entityForm;
    }

    /** 
     * Set the 'EntityForm' element value. Организационно-правовая форма
     * 
     * @param entityForm
     */
    public void setEntityForm(String entityForm) {
        this.entityForm = entityForm;
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
