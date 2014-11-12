
package ru.acs.fts.schemas.album.inffromactinspection;

/** 
 * Краткая информация об участнике ВЭД
 */
public class VEDParticipantShortInfType
{
    private String INNID;
    private String KPPCode;

    /** 
     * Get the 'INNID' element value. Индивидуальный номер налогоплательщика 
     * 
     * @return value
     */
    public String getINNID() {
        return INNID;
    }

    /** 
     * Set the 'INNID' element value. Индивидуальный номер налогоплательщика 
     * 
     * @param INNID
     */
    public void setINNID(String INNID) {
        this.INNID = INNID;
    }

    /** 
     * Get the 'KPPCode' element value. Код причины постановки на налоговый учет
     * 
     * @return value
     */
    public String getKPPCode() {
        return KPPCode;
    }

    /** 
     * Set the 'KPPCode' element value. Код причины постановки на налоговый учет
     * 
     * @param KPPCode
     */
    public void setKPPCode(String KPPCode) {
        this.KPPCode = KPPCode;
    }
}
