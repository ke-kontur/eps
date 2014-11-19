
package ru.acs.fts.schemas.album.actinspectionin;

/** 
 * Сведения об общем фактическом весе товаров
 */
public class FactWeightInfoType
{
    private String weightNettoFact;
    private String weightBruttoFact;
    private String weightMethodKind;
    private String weightMetodDesc;

    /** 
     * Get the 'WeightNettoFact' element value. Фактический вес товара нетто, кг
     * 
     * @return value
     */
    public String getWeightNettoFact() {
        return weightNettoFact;
    }

    /** 
     * Set the 'WeightNettoFact' element value. Фактический вес товара нетто, кг
     * 
     * @param weightNettoFact
     */
    public void setWeightNettoFact(String weightNettoFact) {
        this.weightNettoFact = weightNettoFact;
    }

    /** 
     * Get the 'WeightBruttoFact' element value. Фактический вес товара брутто, кг
     * 
     * @return value
     */
    public String getWeightBruttoFact() {
        return weightBruttoFact;
    }

    /** 
     * Set the 'WeightBruttoFact' element value. Фактический вес товара брутто, кг
     * 
     * @param weightBruttoFact
     */
    public void setWeightBruttoFact(String weightBruttoFact) {
        this.weightBruttoFact = weightBruttoFact;
    }

    /** 
     * Get the 'WeightMethodKind' element value. Способ определения фактического веса товаров: "1" - фактическое взвешивание,  "2" - определение среднего веса одного места взвешиванием нескольких мест, "3" - расчетный метод, "4" - прочее.
     * 
     * @return value
     */
    public String getWeightMethodKind() {
        return weightMethodKind;
    }

    /** 
     * Set the 'WeightMethodKind' element value. Способ определения фактического веса товаров: "1" - фактическое взвешивание,  "2" - определение среднего веса одного места взвешиванием нескольких мест, "3" - расчетный метод, "4" - прочее.
     * 
     * @param weightMethodKind
     */
    public void setWeightMethodKind(String weightMethodKind) {
        this.weightMethodKind = weightMethodKind;
    }

    /** 
     * Get the 'WeightMetodDesc' element value. Примечание к способу взвешивания: количество взвешенных мест, способов расчетов, описание прочего способа взвешивания.
     * 
     * @return value
     */
    public String getWeightMetodDesc() {
        return weightMetodDesc;
    }

    /** 
     * Set the 'WeightMetodDesc' element value. Примечание к способу взвешивания: количество взвешенных мест, способов расчетов, описание прочего способа взвешивания.
     * 
     * @param weightMetodDesc
     */
    public void setWeightMetodDesc(String weightMetodDesc) {
        this.weightMetodDesc = weightMetodDesc;
    }
}
