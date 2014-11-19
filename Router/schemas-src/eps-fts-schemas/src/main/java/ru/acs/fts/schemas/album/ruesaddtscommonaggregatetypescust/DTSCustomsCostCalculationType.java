
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

/** 
 * Расчет таможенной стоимости.
 */
public class DTSCustomsCostCalculationType
{
    private int choiceSelect = -1;
    private static final int DT_S3_METHOD1_CHOICE = 0;
    private static final int DT_S4_METHOD236_CHOICE = 1;
    private static final int DT_S4_METHOD56_CHOICE = 2;
    private DTS3Method1Type DTS3Method1;
    private DTS4Method236Type DTS4Method236;
    private DTS4Method56Type DTS4Method56;

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
     * Check if DTS3Method1 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTS3Method1() {
        return choiceSelect == DT_S3_METHOD1_CHOICE;
    }

    /** 
     * Get the 'DTS3Method1' element value. ДТС-3   Подробности расчета таможенной стоимости по методу 1
     * 
     * @return value
     */
    public DTS3Method1Type getDTS3Method1() {
        return DTS3Method1;
    }

    /** 
     * Set the 'DTS3Method1' element value. ДТС-3   Подробности расчета таможенной стоимости по методу 1
     * 
     * @param DTS3Method1
     */
    public void setDTS3Method1(DTS3Method1Type DTS3Method1) {
        setChoiceSelect(DT_S3_METHOD1_CHOICE);
        this.DTS3Method1 = DTS3Method1;
    }

    /** 
     * Check if DTS4Method236 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTS4Method236() {
        return choiceSelect == DT_S4_METHOD236_CHOICE;
    }

    /** 
     * Get the 'DTS4Method236' element value. ДТС 4 Подробности расчета таможенной стоимости по методу 2,3,6
     * 
     * @return value
     */
    public DTS4Method236Type getDTS4Method236() {
        return DTS4Method236;
    }

    /** 
     * Set the 'DTS4Method236' element value. ДТС 4 Подробности расчета таможенной стоимости по методу 2,3,6
     * 
     * @param DTS4Method236
     */
    public void setDTS4Method236(DTS4Method236Type DTS4Method236) {
        setChoiceSelect(DT_S4_METHOD236_CHOICE);
        this.DTS4Method236 = DTS4Method236;
    }

    /** 
     * Check if DTS4Method56 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTS4Method56() {
        return choiceSelect == DT_S4_METHOD56_CHOICE;
    }

    /** 
     * Get the 'DTS4Method56' element value. Подробности расчета таможенной стоимости по методу 5,6
     * 
     * @return value
     */
    public DTS4Method56Type getDTS4Method56() {
        return DTS4Method56;
    }

    /** 
     * Set the 'DTS4Method56' element value. Подробности расчета таможенной стоимости по методу 5,6
     * 
     * @param DTS4Method56
     */
    public void setDTS4Method56(DTS4Method56Type DTS4Method56) {
        setChoiceSelect(DT_S4_METHOD56_CHOICE);
        this.DTS4Method56 = DTS4Method56;
    }
}
