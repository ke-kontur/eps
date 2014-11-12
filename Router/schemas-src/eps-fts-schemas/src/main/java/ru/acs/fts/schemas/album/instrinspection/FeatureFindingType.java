
package ru.acs.fts.schemas.album.instrinspection;

/** 
 * Измерение и определение характеристик товаров (с частичной разборкой/с полной разборкой)
 */
public class FeatureFindingType
{
    private String featureFindingGoods;
    private Choice choice;

    /** 
     * Get the 'FeatureFindingGoods' element value. Признак измерения и определения характеристик товаров с полной разборкой
     * 
     * @return value
     */
    public String getFeatureFindingGoods() {
        return featureFindingGoods;
    }

    /** 
     * Set the 'FeatureFindingGoods' element value. Признак измерения и определения характеристик товаров с полной разборкой
     * 
     * @param featureFindingGoods
     */
    public void setFeatureFindingGoods(String featureFindingGoods) {
        this.featureFindingGoods = featureFindingGoods;
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
        private static final int W_TAKE_SAMPLE_FLAG_CHOICE = 0;
        private static final int NO_TAKE_SAMPLE_FLAG_CHOICE = 1;
        private String WTakeSampleFlag;
        private String noTakeSampleFlag;

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
         * Check if WTakeSampleFlag is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifWTakeSampleFlag() {
            return choiceSelect == W_TAKE_SAMPLE_FLAG_CHOICE;
        }

        /** 
         * Get the 'WTakeSampleFlag' element value. Измерение и определение характеристик товаров со взятием проб и образцов
         * 
         * @return value
         */
        public String getWTakeSampleFlag() {
            return WTakeSampleFlag;
        }

        /** 
         * Set the 'WTakeSampleFlag' element value. Измерение и определение характеристик товаров со взятием проб и образцов
         * 
         * @param WTakeSampleFlag
         */
        public void setWTakeSampleFlag(String WTakeSampleFlag) {
            setChoiceSelect(W_TAKE_SAMPLE_FLAG_CHOICE);
            this.WTakeSampleFlag = WTakeSampleFlag;
        }

        /** 
         * Check if NoTakeSampleFlag is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifNoTakeSampleFlag() {
            return choiceSelect == NO_TAKE_SAMPLE_FLAG_CHOICE;
        }

        /** 
         * Get the 'NoTakeSampleFlag' element value. Измерение и определение характеристик без взятия проб и образцов
         * 
         * @return value
         */
        public String getNoTakeSampleFlag() {
            return noTakeSampleFlag;
        }

        /** 
         * Set the 'NoTakeSampleFlag' element value. Измерение и определение характеристик без взятия проб и образцов
         * 
         * @param noTakeSampleFlag
         */
        public void setNoTakeSampleFlag(String noTakeSampleFlag) {
            setChoiceSelect(NO_TAKE_SAMPLE_FLAG_CHOICE);
            this.noTakeSampleFlag = noTakeSampleFlag;
        }
    }
}
