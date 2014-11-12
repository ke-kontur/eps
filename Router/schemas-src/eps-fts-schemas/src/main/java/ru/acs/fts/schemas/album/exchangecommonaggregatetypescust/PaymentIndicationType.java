
package ru.acs.fts.schemas.album.exchangecommonaggregatetypescust;

/** 
 * Признаки ПП
 */
public class PaymentIndicationType
{
    private String depletedResources;
    private String allowancesResources;
    private Choice choice;
    private Choice1 choice1;

    /** 
     * Get the 'DepletedResources' element value. Средства на ПП исчерпаны
     * 
     * @return value
     */
    public String getDepletedResources() {
        return depletedResources;
    }

    /** 
     * Set the 'DepletedResources' element value. Средства на ПП исчерпаны
     * 
     * @param depletedResources
     */
    public void setDepletedResources(String depletedResources) {
        this.depletedResources = depletedResources;
    }

    /** 
     * Get the 'AllowancesResources' element value. По ПП уже были списания таможенных платежей
     * 
     * @return value
     */
    public String getAllowancesResources() {
        return allowancesResources;
    }

    /** 
     * Set the 'AllowancesResources' element value. По ПП уже были списания таможенных платежей
     * 
     * @param allowancesResources
     */
    public void setAllowancesResources(String allowancesResources) {
        this.allowancesResources = allowancesResources;
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

    /** 
     * Get the choice value.
     * 
     * @return value
     */
    public Choice1 getChoice1() {
        return choice1;
    }

    /** 
     * Set the choice value.
     * 
     * @param choice1
     */
    public void setChoice1(Choice1 choice1) {
        this.choice1 = choice1;
    }
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int ATTESTED_PAYMENT_ORDER_CHOICE = 0;
        private static final int NOT_ATTESTED_PAYMENT_ORDER_CHOICE = 1;
        private String attestedPaymentOrder;
        private String notAttestedPaymentOrder;

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
         * Check if AttestedPaymentOrder is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifAttestedPaymentOrder() {
            return choiceSelect == ATTESTED_PAYMENT_ORDER_CHOICE;
        }

        /** 
         * Get the 'AttestedPaymentOrder' element value. ПП заверена инспектором в программном средстве учета и контроля таможенных платежей
         * 
         * @return value
         */
        public String getAttestedPaymentOrder() {
            return attestedPaymentOrder;
        }

        /** 
         * Set the 'AttestedPaymentOrder' element value. ПП заверена инспектором в программном средстве учета и контроля таможенных платежей
         * 
         * @param attestedPaymentOrder
         */
        public void setAttestedPaymentOrder(String attestedPaymentOrder) {
            setChoiceSelect(ATTESTED_PAYMENT_ORDER_CHOICE);
            this.attestedPaymentOrder = attestedPaymentOrder;
        }

        /** 
         * Check if NotAttestedPaymentOrder is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifNotAttestedPaymentOrder() {
            return choiceSelect == NOT_ATTESTED_PAYMENT_ORDER_CHOICE;
        }

        /** 
         * Get the 'NotAttestedPaymentOrder' element value. ПП не заверена инспектором в программном средстве учета и контроля таможенных платежей
         * 
         * @return value
         */
        public String getNotAttestedPaymentOrder() {
            return notAttestedPaymentOrder;
        }

        /** 
         * Set the 'NotAttestedPaymentOrder' element value. ПП не заверена инспектором в программном средстве учета и контроля таможенных платежей
         * 
         * @param notAttestedPaymentOrder
         */
        public void setNotAttestedPaymentOrder(String notAttestedPaymentOrder) {
            setChoiceSelect(NOT_ATTESTED_PAYMENT_ORDER_CHOICE);
            this.notAttestedPaymentOrder = notAttestedPaymentOrder;
        }
    }
    public static class Choice1
    {
        private int choice1Select = -1;
        private static final int PERMIT_REMOTENESS_WRITTEN_CHOICE = 0;
        private static final int INTERDICTION_REMOTENESS_WRITTEN_CHOICE = 1;
        private String permitRemotenessWritten;
        private String interdictionRemotenessWritten;

        private void setChoice1Select(int choice) {
            if (choice1Select == -1) {
                choice1Select = choice;
            } else if (choice1Select != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoice1Select() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoice1Select() {
            choice1Select = -1;
        }

        /** 
         * Check if PermitRemotenessWritten is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifPermitRemotenessWritten() {
            return choice1Select == PERMIT_REMOTENESS_WRITTEN_CHOICE;
        }

        /** 
         * Get the 'PermitRemotenessWritten' element value. ПП разрешена к использованию при удаленном списании средств из СТО
         * 
         * @return value
         */
        public String getPermitRemotenessWritten() {
            return permitRemotenessWritten;
        }

        /** 
         * Set the 'PermitRemotenessWritten' element value. ПП разрешена к использованию при удаленном списании средств из СТО
         * 
         * @param permitRemotenessWritten
         */
        public void setPermitRemotenessWritten(String permitRemotenessWritten) {
            setChoice1Select(PERMIT_REMOTENESS_WRITTEN_CHOICE);
            this.permitRemotenessWritten = permitRemotenessWritten;
        }

        /** 
         * Check if InterdictionRemotenessWritten is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifInterdictionRemotenessWritten() {
            return choice1Select == INTERDICTION_REMOTENESS_WRITTEN_CHOICE;
        }

        /** 
         * Get the 'InterdictionRemotenessWritten' element value. ПП не разрешена к использованию при удаленном списании средств из СТО
         * 
         * @return value
         */
        public String getInterdictionRemotenessWritten() {
            return interdictionRemotenessWritten;
        }

        /** 
         * Set the 'InterdictionRemotenessWritten' element value. ПП не разрешена к использованию при удаленном списании средств из СТО
         * 
         * @param interdictionRemotenessWritten
         */
        public void setInterdictionRemotenessWritten(
                String interdictionRemotenessWritten) {
            setChoice1Select(INTERDICTION_REMOTENESS_WRITTEN_CHOICE);
            this.interdictionRemotenessWritten = interdictionRemotenessWritten;
        }
    }
}
