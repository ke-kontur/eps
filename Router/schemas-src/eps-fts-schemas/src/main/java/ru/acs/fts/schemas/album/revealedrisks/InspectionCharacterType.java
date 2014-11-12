
package ru.acs.fts.schemas.album.revealedrisks;

/** 
 * Характеристики досмотра/осмотра
 */
public class InspectionCharacterType
{
    private String inspCharCode;
    private String inspCharValue;
    private String codeChoiceIndicator;

    /** 
     * Get the 'InspCharCode' element value. Код характеристики досмотра/осмотра (указывается в соответствии со значением классификатора "Характеристик таможенного досмотра товаров")
     * 
     * @return value
     */
    public String getInspCharCode() {
        return inspCharCode;
    }

    /** 
     * Set the 'InspCharCode' element value. Код характеристики досмотра/осмотра (указывается в соответствии со значением классификатора "Характеристик таможенного досмотра товаров")
     * 
     * @param inspCharCode
     */
    public void setInspCharCode(String inspCharCode) {
        this.inspCharCode = inspCharCode;
    }

    /** 
     * Get the 'InspCharValue' element value. Значение характеристики досмотра/осмотра (указывается в соответствии со значением классификатора "Допустимых значений Характеристик таможенного досмотра товаров" rskzdosm.dbf)
     * 
     * @return value
     */
    public String getInspCharValue() {
        return inspCharValue;
    }

    /** 
     * Set the 'InspCharValue' element value. Значение характеристики досмотра/осмотра (указывается в соответствии со значением классификатора "Допустимых значений Характеристик таможенного досмотра товаров" rskzdosm.dbf)
     * 
     * @param inspCharValue
     */
    public void setInspCharValue(String inspCharValue) {
        this.inspCharValue = inspCharValue;
    }

    /** 
     * Get the 'CodeChoiceIndicator' element value. Признак, определяющий возможность выбора значения характеристики таможенного досмотра/осмотра.  0 - возможно выбирать значения характеристик таможенного досмотра/осмотра, 1 - возможность выбора отсутствует (досмотр применяется в соответствии со значениями характеристик, установленных профилем риска)
     * 
     * @return value
     */
    public String getCodeChoiceIndicator() {
        return codeChoiceIndicator;
    }

    /** 
     * Set the 'CodeChoiceIndicator' element value. Признак, определяющий возможность выбора значения характеристики таможенного досмотра/осмотра.  0 - возможно выбирать значения характеристик таможенного досмотра/осмотра, 1 - возможность выбора отсутствует (досмотр применяется в соответствии со значениями характеристик, установленных профилем риска)
     * 
     * @param codeChoiceIndicator
     */
    public void setCodeChoiceIndicator(String codeChoiceIndicator) {
        this.codeChoiceIndicator = codeChoiceIndicator;
    }
}
