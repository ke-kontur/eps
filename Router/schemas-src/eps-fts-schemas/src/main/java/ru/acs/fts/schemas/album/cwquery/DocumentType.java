
package ru.acs.fts.schemas.album.cwquery;

/** 
 * Информация о запрашиваемых документах 
 */
public class DocumentType
{
    private String documentModeID;
    private Choice choice;

    /** 
     * Get the 'DocumentModeID' element value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' element value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
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
        private static final int PERIOD_CHOICE = 0;
        private static final int NUMBERS_CHOICE = 1;
        private PeriodType period;
        private NumbersType numbers;

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
         * Check if Period is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifPeriod() {
            return choiceSelect == PERIOD_CHOICE;
        }

        /** 
         * Get the 'Period' element value. Период, за который запрашиваются документы
         * 
         * @return value
         */
        public PeriodType getPeriod() {
            return period;
        }

        /** 
         * Set the 'Period' element value. Период, за который запрашиваются документы
         * 
         * @param period
         */
        public void setPeriod(PeriodType period) {
            setChoiceSelect(PERIOD_CHOICE);
            this.period = period;
        }

        /** 
         * Check if Numbers is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifNumbers() {
            return choiceSelect == NUMBERS_CHOICE;
        }

        /** 
         * Get the 'Numbers' element value. Номера запрашиваемых документов
         * 
         * @return value
         */
        public NumbersType getNumbers() {
            return numbers;
        }

        /** 
         * Set the 'Numbers' element value. Номера запрашиваемых документов
         * 
         * @param numbers
         */
        public void setNumbers(NumbersType numbers) {
            setChoiceSelect(NUMBERS_CHOICE);
            this.numbers = numbers;
        }
    }
}
