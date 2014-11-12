
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Заключается ли договор транспортного страхования в отношении товаров, поставляемых по контракту
 */
public class TransportInsuranceType
{
    private String not;
    private String risk;
    private String simpleAverage;
    private String damage;
    private String otherTerms;
    private String descriptionOtherTerms;

    /** 
     * Get the 'Not' element value. Признак того, что договор транспортного страхования в отношении товаров, поставляемых по контракту, не заключается
     * 
     * @return value
     */
    public String getNot() {
        return not;
    }

    /** 
     * Set the 'Not' element value. Признак того, что договор транспортного страхования в отношении товаров, поставляемых по контракту, не заключается
     * 
     * @param not
     */
    public void setNot(String not) {
        this.not = not;
    }

    /** 
     * Get the 'Risk' element value. Признак того, что заключался договор транспортного страхования в отношении товаров, поставляемых по контракту, с ответственностью за все риски
     * 
     * @return value
     */
    public String getRisk() {
        return risk;
    }

    /** 
     * Set the 'Risk' element value. Признак того, что заключался договор транспортного страхования в отношении товаров, поставляемых по контракту, с ответственностью за все риски
     * 
     * @param risk
     */
    public void setRisk(String risk) {
        this.risk = risk;
    }

    /** 
     * Get the 'SimpleAverage' element value. Признак того, что заключался договор транспортного страхования в отношении товаров, поставляемых по контракту, с ответственностью за частную аварию
     * 
     * @return value
     */
    public String getSimpleAverage() {
        return simpleAverage;
    }

    /** 
     * Set the 'SimpleAverage' element value. Признак того, что заключался договор транспортного страхования в отношении товаров, поставляемых по контракту, с ответственностью за частную аварию
     * 
     * @param simpleAverage
     */
    public void setSimpleAverage(String simpleAverage) {
        this.simpleAverage = simpleAverage;
    }

    /** 
     * Get the 'Damage' element value. Признак того, что заключался договор транспортного страхования в отношении товаров, поставляемых по контракту, без ответственности за повреждения, кроме случаев крушения
     * 
     * @return value
     */
    public String getDamage() {
        return damage;
    }

    /** 
     * Set the 'Damage' element value. Признак того, что заключался договор транспортного страхования в отношении товаров, поставляемых по контракту, без ответственности за повреждения, кроме случаев крушения
     * 
     * @param damage
     */
    public void setDamage(String damage) {
        this.damage = damage;
    }

    /** 
     * Get the 'OtherTerms' element value. Признак того, что заключался договор транспортного страхования в отношении товаров, поставляемых по контракту, на иных условиях
     * 
     * @return value
     */
    public String getOtherTerms() {
        return otherTerms;
    }

    /** 
     * Set the 'OtherTerms' element value. Признак того, что заключался договор транспортного страхования в отношении товаров, поставляемых по контракту, на иных условиях
     * 
     * @param otherTerms
     */
    public void setOtherTerms(String otherTerms) {
        this.otherTerms = otherTerms;
    }

    /** 
     * Get the 'DescriptionOtherTerms' element value. Указание подробности других условий.
     * 
     * @return value
     */
    public String getDescriptionOtherTerms() {
        return descriptionOtherTerms;
    }

    /** 
     * Set the 'DescriptionOtherTerms' element value. Указание подробности других условий.
     * 
     * @param descriptionOtherTerms
     */
    public void setDescriptionOtherTerms(String descriptionOtherTerms) {
        this.descriptionOtherTerms = descriptionOtherTerms;
    }
}
