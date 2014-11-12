
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

/** 
 * Расчет таможенной стоимости
 */
public class DTSCUCustomsCostCalculationType
{
    private int choiceSelect = -1;
    private static final int DTS_METHOD1_CHOICE = 0;
    private static final int DTS_METHOD236_CHOICE = 1;
    private static final int DTS_METHOD46_CHOICE = 2;
    private static final int DTS_METHOD56_CHOICE = 3;
    private DTSMethod1Type DTSMethod1;
    private DTSMethod236Type DTSMethod236;
    private DTSMethod46Type DTSMethod46;
    private DTSMethod56Type DTSMethod56;

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
     * Check if DTSMethod1 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTSMethod1() {
        return choiceSelect == DTS_METHOD1_CHOICE;
    }

    /** 
     * Get the 'DTSMethod1' element value. Подробности расчета таможенной стоимости по ДТС-1 методу 1; ДТС-2 метод 6 на основе метода 1
     * 
     * @return value
     */
    public DTSMethod1Type getDTSMethod1() {
        return DTSMethod1;
    }

    /** 
     * Set the 'DTSMethod1' element value. Подробности расчета таможенной стоимости по ДТС-1 методу 1; ДТС-2 метод 6 на основе метода 1
     * 
     * @param DTSMethod1
     */
    public void setDTSMethod1(DTSMethod1Type DTSMethod1) {
        setChoiceSelect(DTS_METHOD1_CHOICE);
        this.DTSMethod1 = DTSMethod1;
    }

    /** 
     * Check if DTSMethod236 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTSMethod236() {
        return choiceSelect == DTS_METHOD236_CHOICE;
    }

    /** 
     * Get the 'DTSMethod236' element value. Подробности расчета таможенной стоимости по методу  стоимости сделки с идентичными товарами и резервного на их основе
     * 
     * @return value
     */
    public DTSMethod236Type getDTSMethod236() {
        return DTSMethod236;
    }

    /** 
     * Set the 'DTSMethod236' element value. Подробности расчета таможенной стоимости по методу  стоимости сделки с идентичными товарами и резервного на их основе
     * 
     * @param DTSMethod236
     */
    public void setDTSMethod236(DTSMethod236Type DTSMethod236) {
        setChoiceSelect(DTS_METHOD236_CHOICE);
        this.DTSMethod236 = DTSMethod236;
    }

    /** 
     * Check if DTSMethod46 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTSMethod46() {
        return choiceSelect == DTS_METHOD46_CHOICE;
    }

    /** 
     * Get the 'DTSMethod46' element value. Резервный метод на основе метода вычитания (4,6)
     * 
     * @return value
     */
    public DTSMethod46Type getDTSMethod46() {
        return DTSMethod46;
    }

    /** 
     * Set the 'DTSMethod46' element value. Резервный метод на основе метода вычитания (4,6)
     * 
     * @param DTSMethod46
     */
    public void setDTSMethod46(DTSMethod46Type DTSMethod46) {
        setChoiceSelect(DTS_METHOD46_CHOICE);
        this.DTSMethod46 = DTSMethod46;
    }

    /** 
     * Check if DTSMethod56 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTSMethod56() {
        return choiceSelect == DTS_METHOD56_CHOICE;
    }

    /** 
     * Get the 'DTSMethod56' element value. Резервный метод на основе метода таможенной стоимости (5,6)
     * 
     * @return value
     */
    public DTSMethod56Type getDTSMethod56() {
        return DTSMethod56;
    }

    /** 
     * Set the 'DTSMethod56' element value. Резервный метод на основе метода таможенной стоимости (5,6)
     * 
     * @param DTSMethod56
     */
    public void setDTSMethod56(DTSMethod56Type DTSMethod56) {
        setChoiceSelect(DTS_METHOD56_CHOICE);
        this.DTSMethod56 = DTSMethod56;
    }
}
