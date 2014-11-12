
package ru.acs.fts.schemas.album.custexpertresult;

/** 
 * Условный экономический эффект
 */
public class ConventionalEconomicEffectType extends SumType
{
    private String section;
    private String quantityDrug;
    private String measureUnitQualifierName;
    private String kind;

    /** 
     * Get the 'Section' element value. Раздел: 1- стоимость изъятых товаров, оборот которых запрещен; 2 - стоимость некачественных и фальсифицированных товаров (по каждому виду), ввоз (вывоз) которых на (с) территорию ТС запрещен; 3 - стоимость запрещенных (ограниченных) к ввозу/вывозу товаров; 4- вес наркотических средств (по каждому виду)
     * 
     * @return value
     */
    public String getSection() {
        return section;
    }

    /** 
     * Set the 'Section' element value. Раздел: 1- стоимость изъятых товаров, оборот которых запрещен; 2 - стоимость некачественных и фальсифицированных товаров (по каждому виду), ввоз (вывоз) которых на (с) территорию ТС запрещен; 3 - стоимость запрещенных (ограниченных) к ввозу/вывозу товаров; 4- вес наркотических средств (по каждому виду)
     * 
     * @param section
     */
    public void setSection(String section) {
        this.section = section;
    }

    /** 
     * Get the 'QuantityDrug' element value. Вес наркотических средств (по каждому виду)
     * 
     * @return value
     */
    public String getQuantityDrug() {
        return quantityDrug;
    }

    /** 
     * Set the 'QuantityDrug' element value. Вес наркотических средств (по каждому виду)
     * 
     * @param quantityDrug
     */
    public void setQuantityDrug(String quantityDrug) {
        this.quantityDrug = quantityDrug;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. Наименование единицы измерения
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. Наименование единицы измерения
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'Kind' element value. Вид
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. Вид
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }
}
