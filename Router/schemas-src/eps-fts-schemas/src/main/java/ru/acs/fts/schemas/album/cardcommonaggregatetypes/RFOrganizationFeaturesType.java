
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

/** 
 * Сведения об организации. Особенности Российской Федерации
 */
public class RFOrganizationFeaturesType
{
    private String INN;
    private String KPP;

    /** 
     * Get the 'INN' element value. ИНН - Индивидуальный номер налогоплательщика
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ИНН - Индивидуальный номер налогоплательщика
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. КПП - Код причины постановки на учет
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. КПП - Код причины постановки на учет
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }
}
