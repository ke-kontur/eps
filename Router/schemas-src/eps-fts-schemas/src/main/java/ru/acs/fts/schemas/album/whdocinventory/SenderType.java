
package ru.acs.fts.schemas.album.whdocinventory;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHCarrierType;

/** 
 * Отправитель
 */
public class SenderType
{
    private int choiceSelect = -1;
    private static final int CARRIER_CHOICE = 0;
    private static final int CUSTOMS_CHOICE = 1;
    private WHCarrierType carrier;
    private CustomsType customs;

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
     * Check if Carrier is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCarrier() {
        return choiceSelect == CARRIER_CHOICE;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public WHCarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(WHCarrierType carrier) {
        setChoiceSelect(CARRIER_CHOICE);
        this.carrier = carrier;
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
}
