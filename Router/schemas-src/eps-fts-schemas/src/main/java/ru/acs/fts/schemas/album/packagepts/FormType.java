
package ru.acs.fts.schemas.album.packagepts;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����� ��� � ����-�
 */
public class FormType
{
    private String formType;
    private String LNPCustomsCode;
    private String formNumber;
    private String dateState;
    private String modificationDate;
    private String unloadDate;
    private String GUID;
    private String oldFormNumber;
    private String oldFormState;
    private Choice choice;
    private CustomsPersonType customsPerson;
    private CustomsType customs;

    /** 
     * Get the 'FormType' element value. ��� ������������ ������ (TYPE_OBJ): 210- ���; 220- ����. 
     * 
     * @return value
     */
    public String getFormType() {
        return formType;
    }

    /** 
     * Set the 'FormType' element value. ��� ������������ ������ (TYPE_OBJ): 210- ���; 220- ����. 
     * 
     * @param formType
     */
    public void setFormType(String formType) {
        this.formType = formType;
    }

    /** 
     * Get the 'LNPCustomsCode' element value. ��� ����������� ������ �� ������� ��� (KTAM_PCH)
     * 
     * @return value
     */
    public String getLNPCustomsCode() {
        return LNPCustomsCode;
    }

    /** 
     * Set the 'LNPCustomsCode' element value. ��� ����������� ������ �� ������� ��� (KTAM_PCH)
     * 
     * @param LNPCustomsCode
     */
    public void setLNPCustomsCode(String LNPCustomsCode) {
        this.LNPCustomsCode = LNPCustomsCode;
    }

    /** 
     * Get the 'FormNumber' element value. ���, ����� � ����� ������ (BSO_NUM)
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. ���, ����� � ����� ������ (BSO_NUM)
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'DateState' element value. ���� � ����� ���������� ������
     * 
     * @return value
     */
    public String getDateState() {
        return dateState;
    }

    /** 
     * Set the 'DateState' element value. ���� � ����� ���������� ������
     * 
     * @param dateState
     */
    public void setDateState(String dateState) {
        this.dateState = dateState;
    }

    /** 
     * Get the 'ModificationDate' element value. ���� � ����� �������� ��������� � �����
     * 
     * @return value
     */
    public String getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. ���� � ����� �������� ��������� � �����
     * 
     * @param modificationDate
     */
    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'UnloadDate' element value. ���� � ����� �������� ������
     * 
     * @return value
     */
    public String getUnloadDate() {
        return unloadDate;
    }

    /** 
     * Set the 'UnloadDate' element value. ���� � ����� �������� ������
     * 
     * @param unloadDate
     */
    public void setUnloadDate(String unloadDate) {
        this.unloadDate = unloadDate;
    }

    /** 
     * Get the 'GUID' element value. ���������� ������������� ������
     * 
     * @return value
     */
    public String getGUID() {
        return GUID;
    }

    /** 
     * Set the 'GUID' element value. ���������� ������������� ������
     * 
     * @param GUID
     */
    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    /** 
     * Get the 'OldFormNumber' element value. ���, ����� � ����� ������, ������ �������� �������� �������� (OLD_BSO_NUM)
     * 
     * @return value
     */
    public String getOldFormNumber() {
        return oldFormNumber;
    }

    /** 
     * Set the 'OldFormNumber' element value. ���, ����� � ����� ������, ������ �������� �������� �������� (OLD_BSO_NUM)
     * 
     * @param oldFormNumber
     */
    public void setOldFormNumber(String oldFormNumber) {
        this.oldFormNumber = oldFormNumber;
    }

    /** 
     * Get the 'OldFormState' element value. ������ ����������� ������, ������ �������� �������� �������� (OLD_BSO_STATE): 2- �����������; 4- ������� ����� ����������. 
     * 
     * @return value
     */
    public String getOldFormState() {
        return oldFormState;
    }

    /** 
     * Set the 'OldFormState' element value. ������ ����������� ������, ������ �������� �������� �������� (OLD_BSO_STATE): 2- �����������; 4- ������� ����� ����������. 
     * 
     * @param oldFormState
     */
    public void setOldFormState(String oldFormState) {
        this.oldFormState = oldFormState;
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
     * Get the 'CustomsPerson' element value. ���������, ������������� ����������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ���������, ������������� ����������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. ���������� �����, � ������� ����� ��� ��������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ���������� �����, � ������� ����� ��� ��������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }
    public static class Choice
    {
        private int choiceSelect = -1;
        private static final int TPO_NUMBER_CHOICE = 0;
        private static final int GTDID_CHOICE = 1;
        private TPOIDType TPONumber;
        private GTDIDType GTDID;

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
         * Check if TPONumber is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTPONumber() {
            return choiceSelect == TPO_NUMBER_CHOICE;
        }

        /** 
         * Get the 'TPONumber' element value. ����� ��� 
         * 
         * @return value
         */
        public TPOIDType getTPONumber() {
            return TPONumber;
        }

        /** 
         * Set the 'TPONumber' element value. ����� ��� 
         * 
         * @param TPONumber
         */
        public void setTPONumber(TPOIDType TPONumber) {
            setChoiceSelect(TPO_NUMBER_CHOICE);
            this.TPONumber = TPONumber;
        }

        /** 
         * Check if GTDID is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifGTDID() {
            return choiceSelect == GTDID_CHOICE;
        }

        /** 
         * Get the 'GTDID' element value. ����� ��
         * 
         * @return value
         */
        public GTDIDType getGTDID() {
            return GTDID;
        }

        /** 
         * Set the 'GTDID' element value. ����� ��
         * 
         * @param GTDID
         */
        public void setGTDID(GTDIDType GTDID) {
            setChoiceSelect(GTDID_CHOICE);
            this.GTDID = GTDID;
        }
    }
}
