
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.ContactType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADOrganizationInType;

/** 
 * ДТ и ТД. Внутренний формат. Лицо ответственное за финансовое урегулирование.
 */
public class ESADinFinancialAdjustingResponsiblePersonType
        extends
            ESADOrganizationInType
{
    private CUBranchDescriptionType branchDescription;
    private ContactType contact;

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
