
package ru.acs.fts.schemas.album.instrinspection;

/** 
 * Пересчет грузовых мест
 */
public class ReCountPackType
{
    private String reCount;
    private Choice choice;

    /** 
     * Get the 'ReCount' element value. Пересчет грузовых мест
     * 
     * @return value
     */
    public String getReCount() {
        return reCount;
    }

    /** 
     * Set the 'ReCount' element value. Пересчет грузовых мест
     * 
     * @param reCount
     */
    public void setReCount(String reCount) {
        this.reCount = reCount;
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
        private static final int W_SELECT_OPEN_FLAG_CHOICE = 0;
        private static final int W_FULL_OPEN_FLAG_CHOICE = 1;
        private String WSelectOpenFlag;
        private String WFullOpenFlag;

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
         * Check if WSelectOpenFlag is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifWSelectOpenFlag() {
            return choiceSelect == W_SELECT_OPEN_FLAG_CHOICE;
        }

        /** 
         * Get the 'WSelectOpenFlag' element value. С частичным вскрытием
         * 
         * @return value
         */
        public String getWSelectOpenFlag() {
            return WSelectOpenFlag;
        }

        /** 
         * Set the 'WSelectOpenFlag' element value. С частичным вскрытием
         * 
         * @param WSelectOpenFlag
         */
        public void setWSelectOpenFlag(String WSelectOpenFlag) {
            setChoiceSelect(W_SELECT_OPEN_FLAG_CHOICE);
            this.WSelectOpenFlag = WSelectOpenFlag;
        }

        /** 
         * Check if WFullOpenFlag is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifWFullOpenFlag() {
            return choiceSelect == W_FULL_OPEN_FLAG_CHOICE;
        }

        /** 
         * Get the 'WFullOpenFlag' element value. Со вскрытием всех грузовых мест
         * 
         * @return value
         */
        public String getWFullOpenFlag() {
            return WFullOpenFlag;
        }

        /** 
         * Set the 'WFullOpenFlag' element value. Со вскрытием всех грузовых мест
         * 
         * @param WFullOpenFlag
         */
        public void setWFullOpenFlag(String WFullOpenFlag) {
            setChoiceSelect(W_FULL_OPEN_FLAG_CHOICE);
            this.WFullOpenFlag = WFullOpenFlag;
        }
    }
}
