
package ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RBOrganizationFeaturesType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RFOrganizationFeaturesType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.RKOrganizationFeaturesType;

/** 
 * Платежный документ
 */
public class KTSPaymentDocumentType extends DocumentBaseType
{
    private String paymentAmount;
    private String paymentWayCode;
    private Choice choice;

    /** 
     * Get the 'PaymentAmount' element value. Сумма платежа
     * 
     * @return value
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /** 
     * Set the 'PaymentAmount' element value. Сумма платежа
     * 
     * @param paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /** 
     * Get the 'PaymentWayCode' element value. Способ уплаты в соответствии с классификатором способов уплаты таможенных и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @return value
     */
    public String getPaymentWayCode() {
        return paymentWayCode;
    }

    /** 
     * Set the 'PaymentWayCode' element value. Способ уплаты в соответствии с классификатором способов уплаты таможенных и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @param paymentWayCode
     */
    public void setPaymentWayCode(String paymentWayCode) {
        this.paymentWayCode = paymentWayCode;
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
