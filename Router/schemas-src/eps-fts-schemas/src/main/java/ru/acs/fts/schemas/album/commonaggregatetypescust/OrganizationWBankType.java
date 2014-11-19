
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �� �����������, ������� ���������� �����
 */
public class OrganizationWBankType extends OrganizationType
{
    private List<BankInformationType> bankInformationList = new ArrayList<BankInformationType>();

    /** 
     * Get the list of 'BankInformation' element items. ���������� � ���������� ������.
     * 
     * @return list
     */
    public List<BankInformationType> getBankInformationList() {
        return bankInformationList;
    }

    /** 
     * Set the list of 'BankInformation' element items. ���������� � ���������� ������.
     * 
     * @param list
     */
    public void setBankInformationList(List<BankInformationType> list) {
        bankInformationList = list;
    }
}
