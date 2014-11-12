
package ru.acs.fts.schemas.album.housemanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Сведения об организации из домашней накладной
 */
public class HouseWBOrgType extends OrganizationType
{
    private String accountNumber;

    /** 
     * Get the 'AccountNumber' element value. Номер счета
     * 
     * @return value
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /** 
     * Set the 'AccountNumber' element value. Номер счета
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
