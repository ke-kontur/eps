
package ru.acs.fts.schemas.album.custexpertresult;

/** 
 * Полученный экономический эффект
 */
public class RecEconomicEffectType extends SumType
{
    private String economicEffect;

    /** 
     * Get the 'EconomicEffect' element value. Полученный экономический эффект составил: 1- таможенные пошлины; 2- НДС; 3- акцизы; 4-штрафы; 5- сумма денежных средств, вырученных от  реализации товаров, обращенных в федеральную собственность; 6-сумма, конфискованного товара
     * 
     * @return value
     */
    public String getEconomicEffect() {
        return economicEffect;
    }

    /** 
     * Set the 'EconomicEffect' element value. Полученный экономический эффект составил: 1- таможенные пошлины; 2- НДС; 3- акцизы; 4-штрафы; 5- сумма денежных средств, вырученных от  реализации товаров, обращенных в федеральную собственность; 6-сумма, конфискованного товара
     * 
     * @param economicEffect
     */
    public void setEconomicEffect(String economicEffect) {
        this.economicEffect = economicEffect;
    }
}
