
package ru.acs.fts.schemas.album.customsbrokercertificate;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Сведения об организации-таможенном представителе (брокере)
 */
public class BrokerOrganizationType extends OrganizationBaseType
{
    private List<BranchDescriptionType> branchDescriprionList = new ArrayList<BranchDescriptionType>();
    private AddressType address;
    private AddressType factAddress;

    /** 
     * Get the list of 'BranchDescriprion' element items. Обособленное структурное подразделение организации
     * 
     * @return list
     */
    public List<BranchDescriptionType> getBranchDescriprionList() {
        return branchDescriprionList;
    }

    /** 
     * Set the list of 'BranchDescriprion' element items. Обособленное структурное подразделение организации
     * 
     * @param list
     */
    public void setBranchDescriprionList(List<BranchDescriptionType> list) {
        branchDescriprionList = list;
    }

    /** 
     * Get the 'Address' element value. Адрес организации
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес организации
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the 'FactAddress' element value. Фактический  адрес
     * 
     * @return value
     */
    public AddressType getFactAddress() {
        return factAddress;
    }

    /** 
     * Set the 'FactAddress' element value. Фактический  адрес
     * 
     * @param factAddress
     */
    public void setFactAddress(AddressType factAddress) {
        this.factAddress = factAddress;
    }
}
