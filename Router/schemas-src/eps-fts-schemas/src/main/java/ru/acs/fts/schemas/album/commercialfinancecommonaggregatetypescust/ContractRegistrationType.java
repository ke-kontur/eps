
package ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о подписании (заключении) контракта (дата, номер, место)
 */
public class ContractRegistrationType extends DocumentBaseType
{
    private String contractPlace;

    /** 
     * Get the 'ContractPlace' element value. Место заключения контракта
     * 
     * @return value
     */
    public String getContractPlace() {
        return contractPlace;
    }

    /** 
     * Set the 'ContractPlace' element value. Место заключения контракта
     * 
     * @param contractPlace
     */
    public void setContractPlace(String contractPlace) {
        this.contractPlace = contractPlace;
    }
}
