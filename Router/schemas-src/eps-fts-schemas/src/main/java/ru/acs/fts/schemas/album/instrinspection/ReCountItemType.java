
package ru.acs.fts.schemas.album.instrinspection;

/** 
 * Пересчет количества предметов в грузовых местах
 */
public class ReCountItemType
{
    private String reCountGoods;
    private Choice choice;

    /** 
     * Get the 'ReCountGoods' element value. Пересчет количества предметов в грузовых  местах
     * 
     * @return value
     */
    public String getReCountGoods() {
        return reCountGoods;
    }

    /** 
     * Set the 'ReCountGoods' element value. Пересчет количества предметов в грузовых  местах
     * 
     * @param reCountGoods
     */
    public void setReCountGoods(String reCountGoods) {
        this.reCountGoods = reCountGoods;
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
        private static final int SELECT_PACK_FLAG_CHOICE = 0;
        private static final int FULL_COUNT_FLAG_CHOICE = 1;
        private String selectPackFlag;
        private String fullCountFlag;

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
         * Check if SelectPackFlag is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifSelectPackFlag() {
            return choiceSelect == SELECT_PACK_FLAG_CHOICE;
        }

        /** 
         * Get the 'SelectPackFlag' element value. Пересчет выборочно
         * 
         * @return value
         */
        public String getSelectPackFlag() {
            return selectPackFlag;
        }

        /** 
         * Set the 'SelectPackFlag' element value. Пересчет выборочно
         * 
         * @param selectPackFlag
         */
        public void setSelectPackFlag(String selectPackFlag) {
            setChoiceSelect(SELECT_PACK_FLAG_CHOICE);
            this.selectPackFlag = selectPackFlag;
        }

        /** 
         * Check if FullCountFlag is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifFullCountFlag() {
            return choiceSelect == FULL_COUNT_FLAG_CHOICE;
        }

        /** 
         * Get the 'FullCountFlag' element value. Пересчет во всех грузовых местах
         * 
         * @return value
         */
        public String getFullCountFlag() {
            return fullCountFlag;
        }

        /** 
         * Set the 'FullCountFlag' element value. Пересчет во всех грузовых местах
         * 
         * @param fullCountFlag
         */
        public void setFullCountFlag(String fullCountFlag) {
            setChoiceSelect(FULL_COUNT_FLAG_CHOICE);
            this.fullCountFlag = fullCountFlag;
        }
    }
}
