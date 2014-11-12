
package ru.acs.fts.schemas.album.notif_piresult;

import java.util.ArrayList;
import java.util.List;

/** 
 * Результат обработки документа
 */
public class ResponseType
{
    private List<ResultInformationType> resultInformationList = new ArrayList<ResultInformationType>();
    private Choice choice;

    /** 
     * Get the list of 'ResultInformation' element items. Информация о результате обработки
     * 
     * @return list
     */
    public List<ResultInformationType> getResultInformationList() {
        return resultInformationList;
    }

    /** 
     * Set the list of 'ResultInformation' element items. Информация о результате обработки
     * 
     * @param list
     */
    public void setResultInformationList(List<ResultInformationType> list) {
        resultInformationList = list;
    }

    /** 
     * Get the choice value.
     * 
     * @return value
     */
    public Choice getChoice() {
        return choice;
    }

    /** 
     * Set the choice value.
     * 
     * @param choice
     */
    public void setChoice(Choice choice) {
        this.choice = choice;
    }
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int PI_DOC_RESULT_CHOICE = 0;
        private static final int TIR_RESULT_CHOICE = 1;
        private PIDocResultType PIDocResult;
        private TIRDocResultType TIRResult;

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
         * Check if PIDocResult is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifPIDocResult() {
            return choiceSelect == PI_DOC_RESULT_CHOICE;
        }

        /** 
         * Get the 'PI_DocResult' element value. Информация об обработке документа
         * 
         * @return value
         */
        public PIDocResultType getPIDocResult() {
            return PIDocResult;
        }

        /** 
         * Set the 'PI_DocResult' element value. Информация об обработке документа
         * 
         * @param PIDocResult
         */
        public void setPIDocResult(PIDocResultType PIDocResult) {
            setChoiceSelect(PI_DOC_RESULT_CHOICE);
            this.PIDocResult = PIDocResult;
        }

        /** 
         * Check if TIRResult is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTIRResult() {
            return choiceSelect == TIR_RESULT_CHOICE;
        }

        /** 
         * Get the 'TIR_Result' element value. Информация по книжке МДП
         * 
         * @return value
         */
        public TIRDocResultType getTIRResult() {
            return TIRResult;
        }

        /** 
         * Set the 'TIR_Result' element value. Информация по книжке МДП
         * 
         * @param TIRResult
         */
        public void setTIRResult(TIRDocResultType TIRResult) {
            setChoiceSelect(TIR_RESULT_CHOICE);
            this.TIRResult = TIRResult;
        }
    }
}
