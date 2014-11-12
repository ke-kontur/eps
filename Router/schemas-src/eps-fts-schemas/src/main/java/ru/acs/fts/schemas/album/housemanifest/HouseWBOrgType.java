
package ru.acs.fts.schemas.album.housemanifest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * �������� �� ����������� �� �������� ���������
 */
public class HouseWBOrgType extends OrganizationType
{
    private String accountNumber;

    /** 
     * Get the 'AccountNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /** 
     * Set the 'AccountNumber' element value. ����� �����
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
