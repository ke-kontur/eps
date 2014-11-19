
package ru.acs.fts.schemas.album.kdtout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения об организации в товарной части ДТ
 */
public class KDToutGoodsOrganizationType extends CUOrganizationType
{
    private String contractorIndicator;

    /** 
     * Get the 'ContractorIndicator' element value. Особенность указанных сведений: 1 - КОНТРАГЕНТ; 2 - РАЗНЫЕ ПО СПИСКУ
     * 
     * @return value
     */
    public String getContractorIndicator() {
        return contractorIndicator;
    }

    /** 
     * Set the 'ContractorIndicator' element value. Особенность указанных сведений: 1 - КОНТРАГЕНТ; 2 - РАЗНЫЕ ПО СПИСКУ
     * 
     * @param contractorIndicator
     */
    public void setContractorIndicator(String contractorIndicator) {
        this.contractorIndicator = contractorIndicator;
    }
}
