
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Реквизиты организации. Базовый класс
 */
public class OrganizationBaseType
{
    private String organizationName;
    private String shortName;
    private String organizationLanguage;
    private Choice choice;

    /** 
     * Get the 'OrganizationName' element value. Наименование организации / ФИО физического лица
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации / ФИО физического лица
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'ShortName' element value. Краткое наименование организации
     * 
     * @return value
     */
    public String getShortName() {
        return shortName;
    }

    /** 
     * Set the 'ShortName' element value. Краткое наименование организации
     * 
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /** 
     * Get the 'OrganizationLanguage' element value. Код языка для заполнения наименования 
     * 
     * @return value
     */
    public String getOrganizationLanguage() {
        return organizationLanguage;
    }

    /** 
     * Set the 'OrganizationLanguage' element value. Код языка для заполнения наименования 
     * 
     * @param organizationLanguage
     */
    public void setOrganizationLanguage(String organizationLanguage) {
        this.organizationLanguage = organizationLanguage;
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
        private static final int RF_ORGANIZATION_FEATURES_CHOICE = 0;
        private static final int RK_ORGANIZATION_FEATURES_CHOICE = 1;
        private static final int RB_ORGANIZATION_FEATURES_CHOICE = 2;
        private RFOrganizationFeaturesType RFOrganizationFeatures;
        private RKOrganizationFeaturesType RKOrganizationFeatures;
        private RBOrganizationFeaturesType RBOrganizationFeatures;

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
         * Check if RFOrganizationFeatures is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifRFOrganizationFeatures() {
            return choiceSelect == RF_ORGANIZATION_FEATURES_CHOICE;
        }

        /** 
         * Get the 'RFOrganizationFeatures' element value. Сведения об организации. Особенности Российской Федерации
         * 
         * @return value
         */
        public RFOrganizationFeaturesType getRFOrganizationFeatures() {
            return RFOrganizationFeatures;
        }

        /** 
         * Set the 'RFOrganizationFeatures' element value. Сведения об организации. Особенности Российской Федерации
         * 
         * @param RFOrganizationFeatures
         */
        public void setRFOrganizationFeatures(
                RFOrganizationFeaturesType RFOrganizationFeatures) {
            setChoiceSelect(RF_ORGANIZATION_FEATURES_CHOICE);
            this.RFOrganizationFeatures = RFOrganizationFeatures;
        }

        /** 
         * Check if RKOrganizationFeatures is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifRKOrganizationFeatures() {
            return choiceSelect == RK_ORGANIZATION_FEATURES_CHOICE;
        }

        /** 
         * Get the 'RKOrganizationFeatures' element value. Сведения об организации. Особенности Республики Казахстан
         * 
         * @return value
         */
        public RKOrganizationFeaturesType getRKOrganizationFeatures() {
            return RKOrganizationFeatures;
        }

        /** 
         * Set the 'RKOrganizationFeatures' element value. Сведения об организации. Особенности Республики Казахстан
         * 
         * @param RKOrganizationFeatures
         */
        public void setRKOrganizationFeatures(
                RKOrganizationFeaturesType RKOrganizationFeatures) {
            setChoiceSelect(RK_ORGANIZATION_FEATURES_CHOICE);
            this.RKOrganizationFeatures = RKOrganizationFeatures;
        }

        /** 
         * Check if RBOrganizationFeatures is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifRBOrganizationFeatures() {
            return choiceSelect == RB_ORGANIZATION_FEATURES_CHOICE;
        }

        /** 
         * Get the 'RBOrganizationFeatures' element value. Сведения об организации. Особенности Республики Беларусь
         * 
         * @return value
         */
        public RBOrganizationFeaturesType getRBOrganizationFeatures() {
            return RBOrganizationFeatures;
        }

        /** 
         * Set the 'RBOrganizationFeatures' element value. Сведения об организации. Особенности Республики Беларусь
         * 
         * @param RBOrganizationFeatures
         */
        public void setRBOrganizationFeatures(
                RBOrganizationFeaturesType RBOrganizationFeatures) {
            setChoiceSelect(RB_ORGANIZATION_FEATURES_CHOICE);
            this.RBOrganizationFeatures = RBOrganizationFeatures;
        }
    }
}
