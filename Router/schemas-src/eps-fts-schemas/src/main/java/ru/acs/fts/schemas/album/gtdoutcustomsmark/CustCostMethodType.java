
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

/** 
 * Признак корректировки и метод определения таможенной стоимости (гр. 43 ДТ) 
 */
public class CustCostMethodType
{
    private String customsCostCorrectMark;
    private String customsCostCorrectMethod;

    /** 
     * Get the 'CustomsCostCorrectMark' element value. Признак корректировки таможенной стоимости.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMark() {
        return customsCostCorrectMark;
    }

    /** 
     * Set the 'CustomsCostCorrectMark' element value. Признак корректировки таможенной стоимости.
     * 
     * @param customsCostCorrectMark
     */
    public void setCustomsCostCorrectMark(String customsCostCorrectMark) {
        this.customsCostCorrectMark = customsCostCorrectMark;
    }

    /** 
     * Get the 'CustomsCostCorrectMethod' element value. Номер метода определения таможенной стоимости. Заполняется в соответствии с классификатором методов определения таможенной стоимости.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMethod() {
        return customsCostCorrectMethod;
    }

    /** 
     * Set the 'CustomsCostCorrectMethod' element value. Номер метода определения таможенной стоимости. Заполняется в соответствии с классификатором методов определения таможенной стоимости.
     * 
     * @param customsCostCorrectMethod
     */
    public void setCustomsCostCorrectMethod(String customsCostCorrectMethod) {
        this.customsCostCorrectMethod = customsCostCorrectMethod;
    }
}
