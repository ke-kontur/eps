
package ru.acs.fts.schemas.album.factpresencerequest;

/** 
 * Отметки о прохождении товарами таможенного и иных видов контроля
 */
public class MarkType
{
    private String markSign;
    private String markKind;
    private String resultControl;

    /** 
     * Get the 'MarkSign' element value. Признак наличия отметки
     * 
     * @return value
     */
    public String getMarkSign() {
        return markSign;
    }

    /** 
     * Set the 'MarkSign' element value. Признак наличия отметки
     * 
     * @param markSign
     */
    public void setMarkSign(String markSign) {
        this.markSign = markSign;
    }

    /** 
     * Get the 'MarkKind' element value. Тип отметки
     * 
     * @return value
     */
    public String getMarkKind() {
        return markKind;
    }

    /** 
     * Set the 'MarkKind' element value. Тип отметки
     * 
     * @param markKind
     */
    public void setMarkKind(String markKind) {
        this.markKind = markKind;
    }

    /** 
     * Get the 'ResultControl' element value. Результат прохождения контроля
     * 
     * @return value
     */
    public String getResultControl() {
        return resultControl;
    }

    /** 
     * Set the 'ResultControl' element value. Результат прохождения контроля
     * 
     * @param resultControl
     */
    public void setResultControl(String resultControl) {
        this.resultControl = resultControl;
    }
}
