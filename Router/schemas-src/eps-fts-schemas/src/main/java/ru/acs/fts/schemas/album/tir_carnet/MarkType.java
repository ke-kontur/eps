
package ru.acs.fts.schemas.album.tir_carnet;

/** 
 * Отметки о прохождении товарами таможенного и иных видов государственного контроля.
 */
public class MarkType
{
    private String markSing;
    private String markKind;
    private String resultControl;

    /** 
     * Get the 'MarkSing' element value. Признак наличия отметки
     * 
     * @return value
     */
    public String getMarkSing() {
        return markSing;
    }

    /** 
     * Set the 'MarkSing' element value. Признак наличия отметки
     * 
     * @param markSing
     */
    public void setMarkSing(String markSing) {
        this.markSing = markSing;
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
