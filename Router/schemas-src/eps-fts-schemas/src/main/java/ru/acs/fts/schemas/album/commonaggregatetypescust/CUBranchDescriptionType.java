
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * �������� �� ������������ �������������
 */
public class CUBranchDescriptionType
{
    private String organizationName;
    private AddressType address;
    private Choice choice;

    /** 
     * Get the 'OrganizationName' element value. ������� ������������ ������������� �������������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������� ������������ ������������� �������������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'Address' element value. ����� ������������� �������������
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� ������������� �������������
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
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
         * Get the 'RFOrganizationFeatures' element value. �������� �� �����������. ����������� ���������� ���������
         * 
         * @return value
         */
        public RFOrganizationFeaturesType getRFOrganizationFeatures() {
            return RFOrganizationFeatures;
        }

        /** 
         * Set the 'RFOrganizationFeatures' element value. �������� �� �����������. ����������� ���������� ���������
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
         * Get the 'RKOrganizationFeatures' element value. �������� �� �����������. ����������� ���������� ���������
         * 
         * @return value
         */
        public RKOrganizationFeaturesType getRKOrganizationFeatures() {
            return RKOrganizationFeatures;
        }

        /** 
         * Set the 'RKOrganizationFeatures' element value. �������� �� �����������. ����������� ���������� ���������
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
         * Get the 'RBOrganizationFeatures' element value. �������� �� �����������. ����������� ���������� ��������
         * 
         * @return value
         */
        public RBOrganizationFeaturesType getRBOrganizationFeatures() {
            return RBOrganizationFeatures;
        }

        /** 
         * Set the 'RBOrganizationFeatures' element value. �������� �� �����������. ����������� ���������� ��������
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
