
package ru.acs.fts.schemas.album.mzsrdrugsubstance;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * �������� �� ���������������� ������� ������������� �������
 */
public class MZSRDrugSubstanceType extends BaseDocType
{
    private String BDRDID;
    private String docSign;
    private int choiceSelect = -1;
    private static final int DRUGS_CHOICE = 0;
    private static final int SUBSTANCE_CHOICE = 1;
    private DrugsType drugs;
    private SubstanceType substance;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 0 - �������������� ������ ��� �������������� ���������; 1 - �������������� ������ ��� ����������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 0 - �������������� ������ ��� �������������� ���������; 1 - �������������� ������ ��� ����������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

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
     * Check if Drugs is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDrugs() {
        return choiceSelect == DRUGS_CHOICE;
    }

    /** 
     * Get the 'Drugs' element value. � ��������� ������������� ����������
     * 
     * @return value
     */
    public DrugsType getDrugs() {
        return drugs;
    }

    /** 
     * Set the 'Drugs' element value. � ��������� ������������� ����������
     * 
     * @param drugs
     */
    public void setDrugs(DrugsType drugs) {
        setChoiceSelect(DRUGS_CHOICE);
        this.drugs = drugs;
    }

    /** 
     * Check if Substance is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifSubstance() {
        return choiceSelect == SUBSTANCE_CHOICE;
    }

    /** 
     * Get the 'Substance' element value. � ��������� ���������������� ����������
     * 
     * @return value
     */
    public SubstanceType getSubstance() {
        return substance;
    }

    /** 
     * Set the 'Substance' element value. � ��������� ���������������� ����������
     * 
     * @param substance
     */
    public void setSubstance(SubstanceType substance) {
        setChoiceSelect(SUBSTANCE_CHOICE);
        this.substance = substance;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
