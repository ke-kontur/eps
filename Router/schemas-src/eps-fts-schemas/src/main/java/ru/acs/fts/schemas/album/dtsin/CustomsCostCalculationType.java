
package ru.acs.fts.schemas.album.dtsin;

import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSMethod1Type;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSMethod236Type;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSMethod46Type;
import ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust.DTSMethod56Type;
import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.DTS3Method1Type;
import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.DTS4Method236Type;
import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.DTS4Method56Type;

/** 
 * Расчет таможенной стоимости
 */
public class CustomsCostCalculationType
{
    private int choiceSelect = -1;
    private static final int DT_S3_METHOD1_CHOICE = 0;
    private static final int DTS_METHOD56_CHOICE = 1;
    private static final int DT_S4_METHOD236_CHOICE = 2;
    private static final int DTS_METHOD236_CHOICE = 3;
    private static final int DTS_METHOD46_CHOICE = 4;
    private static final int DT_S4_METHOD56_CHOICE = 5;
    private static final int DTS_METHOD1_CHOICE = 6;
    private DTS3Method1Type DTS3Method1;
    private DTSMethod56Type DTSMethod56;
    private DTS4Method236Type DTS4Method236;
    private DTSMethod236Type DTSMethod236;
    private DTSMethod46Type DTSMethod46;
    private DTS4Method56Type DTS4Method56;
    private DTSMethod1Type DTSMethod1;

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
     * Check if DTSMethod56 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTSMethod56() {
        return choiceSelect == DTS_METHOD56_CHOICE;
    }

    /** 
     * Get the 'DTSMethod56' element value. Резервный метод на основе метода таможенной стоимости. (5,6)
     * 
     * @return value
     */
    public DTSMethod56Type getDTSMethod56() {
        return DTSMethod56;
    }

    /** 
     * Set the 'DTSMethod56' element value. Резервный метод на основе метода таможенной стоимости. (5,6)
     * 
     * @param DTSMethod56
     */
    public void setDTSMethod56(DTSMethod56Type DTSMethod56) {
        setChoiceSelect(DTS_METHOD56_CHOICE);
        this.DTSMethod56 = DTSMethod56;
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
     * Check if DTSMethod236 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTSMethod236() {
        return choiceSelect == DTS_METHOD236_CHOICE;
    }

    /** 
     * Get the 'DTSMethod236' element value. Подробности расчета таможенной стоимости по методу  стоимости сделки с идентичными товарами и резервного на их основе.
     * 
     * @return value
     */
    public DTSMethod236Type getDTSMethod236() {
        return DTSMethod236;
    }

    /** 
     * Set the 'DTSMethod236' element value. Подробности расчета таможенной стоимости по методу  стоимости сделки с идентичными товарами и резервного на их основе.
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
     * Get the 'DTSMethod46' element value. Резервный метод на основе метода вычитания. (4,6)
     * 
     * @return value
     */
    public DTSMethod46Type getDTSMethod46() {
        return DTSMethod46;
    }

    /** 
     * Set the 'DTSMethod46' element value. Резервный метод на основе метода вычитания. (4,6)
     * 
     * @param DTSMethod46
     */
    public void setDTSMethod46(DTSMethod46Type DTSMethod46) {
        setChoiceSelect(DTS_METHOD46_CHOICE);
        this.DTSMethod46 = DTSMethod46;
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

    /** 
     * Check if DTSMethod1 is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDTSMethod1() {
        return choiceSelect == DTS_METHOD1_CHOICE;
    }

    /** 
     * Get the 'DTSMethod1' element value. Подробности расчета таможенной стоимости по ДТС-1 методу 1; ДТ-2 метод 6 на основе метода 1
     * 
     * @return value
     */
    public DTSMethod1Type getDTSMethod1() {
        return DTSMethod1;
    }

    /** 
     * Set the 'DTSMethod1' element value. Подробности расчета таможенной стоимости по ДТС-1 методу 1; ДТ-2 метод 6 на основе метода 1
     * 
     * @param DTSMethod1
     */
    public void setDTSMethod1(DTSMethod1Type DTSMethod1) {
        setChoiceSelect(DTS_METHOD1_CHOICE);
        this.DTSMethod1 = DTSMethod1;
    }
}
