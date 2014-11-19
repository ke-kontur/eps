
package ru.acs.fts.schemas.album.do2report;

import org.joda.time.LocalDate;

/** 
 * ����������� ��� ��� �������� ������ �� ��2 �� ����� ������ ��1
 */
public class DO2DO1GoodLinkType
{
    private LocalDate DO1Date;
    private String DO1Number;
    private int choiceSelect = -1;
    private static final int D_O1_GOOD_NUMBER_CHOICE = 0;
    private static final int MPO_INDEX_NUM_CHOICE = 1;
    private String DO1GoodNumber;
    private String MPOIndexNum;

    /** 
     * Get the 'DO1Date' element value. ���� ������ ��1, ����� �� �������� ��������
     * 
     * @return value
     */
    public LocalDate getDO1Date() {
        return DO1Date;
    }

    /** 
     * Set the 'DO1Date' element value. ���� ������ ��1, ����� �� �������� ��������
     * 
     * @param DO1Date
     */
    public void setDO1Date(LocalDate DO1Date) {
        this.DO1Date = DO1Date;
    }

    /** 
     * Get the 'DO1Number' element value. ����� ������ ��1, ����������� ����������� �������� ��������� ���, ����� �� �������� ��������
     * 
     * @return value
     */
    public String getDO1Number() {
        return DO1Number;
    }

    /** 
     * Set the 'DO1Number' element value. ����� ������ ��1, ����������� ����������� �������� ��������� ���, ����� �� �������� ��������
     * 
     * @param DO1Number
     */
    public void setDO1Number(String DO1Number) {
        this.DO1Number = DO1Number;
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
     * Check if DO1GoodNumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDO1GoodNumber() {
        return choiceSelect == D_O1_GOOD_NUMBER_CHOICE;
    }

    /** 
     * Get the 'DO1GoodNumber' element value. ������� ����� ������ � ������ ��1
     * 
     * @return value
     */
    public String getDO1GoodNumber() {
        return DO1GoodNumber;
    }

    /** 
     * Set the 'DO1GoodNumber' element value. ������� ����� ������ � ������ ��1
     * 
     * @param DO1GoodNumber
     */
    public void setDO1GoodNumber(String DO1GoodNumber) {
        setChoiceSelect(D_O1_GOOD_NUMBER_CHOICE);
        this.DO1GoodNumber = DO1GoodNumber;
    }

    /** 
     * Check if MPOIndexNum is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifMPOIndexNum() {
        return choiceSelect == MPO_INDEX_NUM_CHOICE;
    }

    /** 
     * Get the 'MPOIndexNum' element value. ���������� ����� ��� � ������ ��1
     * 
     * @return value
     */
    public String getMPOIndexNum() {
        return MPOIndexNum;
    }

    /** 
     * Set the 'MPOIndexNum' element value. ���������� ����� ��� � ������ ��1
     * 
     * @param MPOIndexNum
     */
    public void setMPOIndexNum(String MPOIndexNum) {
        setChoiceSelect(MPO_INDEX_NUM_CHOICE);
        this.MPOIndexNum = MPOIndexNum;
    }
}
