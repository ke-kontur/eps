
package ru.acs.fts.schemas.album.whdocinventory;

/** 
 * Получатель
 */
public class ReceiverType
{
    private int choiceSelect = -1;
    private static final int CUSTOMS_CHOICE = 0;
    private static final int SVH_CHOICE = 1;
    private CustomsType customs;
    private SVHType SVH;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if Customs is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCustoms() {
        return choiceSelect == CUSTOMS_CHOICE;
    }

    /** 
     * Get the 'Customs' element value. Таможенный пост
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный пост
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        setChoiceSelect(CUSTOMS_CHOICE);
        this.customs = customs;
    }

    /** 
     * Check if SVH is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifSVH() {
        return choiceSelect == SVH_CHOICE;
    }

    /** 
     * Get the 'SVH' element value. СВХ
     * 
     * @return value
     */
    public SVHType getSVH() {
        return SVH;
    }

    /** 
     * Set the 'SVH' element value. СВХ
     * 
     * @param SVH
     */
    public void setSVH(SVHType SVH) {
        setChoiceSelect(SVH_CHOICE);
        this.SVH = SVH;
    }
}
