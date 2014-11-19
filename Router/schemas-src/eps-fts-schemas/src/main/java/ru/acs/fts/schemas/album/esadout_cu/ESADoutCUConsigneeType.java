
package ru.acs.fts.schemas.album.esadout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUBranchDescriptionType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о получателе товаров
 */
public class ESADoutCUConsigneeType extends CUOrganizationType
{
    private String officesExchangeCode;
    private String contractorIndicator;
    private CUBranchDescriptionType branchDescription;

    /** 
     * Get the 'OfficesExchangeCode' element value. Код учреждения обмена подачи международных почтовых отправлений 
     * 
     * @return value
     */
    public String getOfficesExchangeCode() {
        return officesExchangeCode;
    }

    /** 
     * Set the 'OfficesExchangeCode' element value. Код учреждения обмена подачи международных почтовых отправлений 
     * 
     * @param officesExchangeCode
     */
    public void setOfficesExchangeCode(String officesExchangeCode) {
        this.officesExchangeCode = officesExchangeCode;
    }

    /** 
     * Get the 'ContractorIndicator' element value. Особенность указанных сведений:1-КОНТРАГЕНТ; 2 - РАЗНЫЕ ПО СПИСКУ
     * 
     * @return value
     */
    public String getContractorIndicator() {
        return contractorIndicator;
    }

    /** 
     * Set the 'ContractorIndicator' element value. Особенность указанных сведений:1-КОНТРАГЕНТ; 2 - РАЗНЫЕ ПО СПИСКУ
     * 
     * @param contractorIndicator
     */
    public void setContractorIndicator(String contractorIndicator) {
        this.contractorIndicator = contractorIndicator;
    }

    /** 
     * Get the 'BranchDescription' element value. Сведения об обособленном подразделении
     * 
     * @return value
     */
    public CUBranchDescriptionType getBranchDescription() {
        return branchDescription;
    }

    /** 
     * Set the 'BranchDescription' element value. Сведения об обособленном подразделении
     * 
     * @param branchDescription
     */
    public void setBranchDescription(CUBranchDescriptionType branchDescription) {
        this.branchDescription = branchDescription;
    }
}
