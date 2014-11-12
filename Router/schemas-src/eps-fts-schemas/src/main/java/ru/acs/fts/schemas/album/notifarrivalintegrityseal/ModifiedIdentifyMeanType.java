
package ru.acs.fts.schemas.album.notifarrivalintegrityseal;

/** 
 * Характеристика нарушенного средства идентификации
 */
public class ModifiedIdentifyMeanType
{
    private String identMeanState;
    private String identNumber;
    private String identBreakFlag;
    private String identKind;
    private String identDesc;

    /** 
     * Get the 'IdentMeanState' element value. Статус средства идентификации 1 - средство идентификации до начала проведения таможенного досмотра 2 - средство идентификации после проведения таможенного досмотра (наложенные)
     * 
     * @return value
     */
    public String getIdentMeanState() {
        return identMeanState;
    }

    /** 
     * Set the 'IdentMeanState' element value. Статус средства идентификации 1 - средство идентификации до начала проведения таможенного досмотра 2 - средство идентификации после проведения таможенного досмотра (наложенные)
     * 
     * @param identMeanState
     */
    public void setIdentMeanState(String identMeanState) {
        this.identMeanState = identMeanState;
    }

    /** 
     * Get the 'IdentNumber' element value. Номер наложенного средства идентификации
     * 
     * @return value
     */
    public String getIdentNumber() {
        return identNumber;
    }

    /** 
     * Set the 'IdentNumber' element value. Номер наложенного средства идентификации
     * 
     * @param identNumber
     */
    public void setIdentNumber(String identNumber) {
        this.identNumber = identNumber;
    }

    /** 
     * Get the 'IdentBreakFlag' element value. Признак нарушения средств идентификации
     * 
     * @return value
     */
    public String getIdentBreakFlag() {
        return identBreakFlag;
    }

    /** 
     * Set the 'IdentBreakFlag' element value. Признак нарушения средств идентификации
     * 
     * @param identBreakFlag
     */
    public void setIdentBreakFlag(String identBreakFlag) {
        this.identBreakFlag = identBreakFlag;
    }

    /** 
     * Get the 'IdentKind' element value. Вид средств идентификации: 1 - пломба, 2 - печать, 3 - иное
     * 
     * @return value
     */
    public String getIdentKind() {
        return identKind;
    }

    /** 
     * Set the 'IdentKind' element value. Вид средств идентификации: 1 - пломба, 2 - печать, 3 - иное
     * 
     * @param identKind
     */
    public void setIdentKind(String identKind) {
        this.identKind = identKind;
    }

    /** 
     * Get the 'IdentDesc' element value. Примечание по средству идентификации
     * 
     * @return value
     */
    public String getIdentDesc() {
        return identDesc;
    }

    /** 
     * Set the 'IdentDesc' element value. Примечание по средству идентификации
     * 
     * @param identDesc
     */
    public void setIdentDesc(String identDesc) {
        this.identDesc = identDesc;
    }
}
