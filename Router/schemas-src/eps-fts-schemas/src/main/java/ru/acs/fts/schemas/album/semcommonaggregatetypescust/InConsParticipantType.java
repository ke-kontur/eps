
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

/** 
 * Сведения об отправителе/получателе товаров
 */
public class InConsParticipantType extends InParticipantType
{
    private String bowelsINN;
    private String bowelsOKPO;
    private String contractorIndicator;

    /** 
     * Get the 'BowelsINN' element value. ИНН недропользователя.
     * 
     * @return value
     */
    public String getBowelsINN() {
        return bowelsINN;
    }

    /** 
     * Set the 'BowelsINN' element value. ИНН недропользователя.
     * 
     * @param bowelsINN
     */
    public void setBowelsINN(String bowelsINN) {
        this.bowelsINN = bowelsINN;
    }

    /** 
     * Get the 'BowelsOKPO' element value. ОКПО недропользователя.
     * 
     * @return value
     */
    public String getBowelsOKPO() {
        return bowelsOKPO;
    }

    /** 
     * Set the 'BowelsOKPO' element value. ОКПО недропользователя.
     * 
     * @param bowelsOKPO
     */
    public void setBowelsOKPO(String bowelsOKPO) {
        this.bowelsOKPO = bowelsOKPO;
    }

    /** 
     * Get the 'ContractorIndicator' element value. Особенность указанных сведений:1-КОНТРАГЕНТ; 2 - РАЗНЫЕ ПО СПИСКУ.
     * 
     * @return value
     */
    public String getContractorIndicator() {
        return contractorIndicator;
    }

    /** 
     * Set the 'ContractorIndicator' element value. Особенность указанных сведений:1-КОНТРАГЕНТ; 2 - РАЗНЫЕ ПО СПИСКУ.
     * 
     * @param contractorIndicator
     */
    public void setContractorIndicator(String contractorIndicator) {
        this.contractorIndicator = contractorIndicator;
    }
}
