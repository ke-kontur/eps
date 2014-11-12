
package ru.acs.fts.schemas.album.esadout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения об организации в товарной части ДТ
 */
public class ESADoutGoodsOrganizationType extends CUOrganizationType
{
    private String contractorIndicator;

    /** 
     * Get the 'ContractorIndicator' element value. Особенность указанных сведений:1-КОНТРАГЕНТ
     * 
     * @return value
     */
    public String getContractorIndicator() {
        return contractorIndicator;
    }

    /** 
     * Set the 'ContractorIndicator' element value. Особенность указанных сведений:1-КОНТРАГЕНТ
     * 
     * @param contractorIndicator
     */
    public void setContractorIndicator(String contractorIndicator) {
        this.contractorIndicator = contractorIndicator;
    }
}
