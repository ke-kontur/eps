
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения об организации, включая банковские счета
 */
public class OrganizationWBankType extends OrganizationType
{
    private List<BankInformationType> bankInformationList = new ArrayList<BankInformationType>();

    /** 
     * Get the list of 'BankInformation' element items. Информация о банковских счетах.
     * 
     * @return list
     */
    public List<BankInformationType> getBankInformationList() {
        return bankInformationList;
    }

    /** 
     * Set the list of 'BankInformation' element items. Информация о банковских счетах.
     * 
     * @param list
     */
    public void setBankInformationList(List<BankInformationType> list) {
        bankInformationList = list;
    }
}
