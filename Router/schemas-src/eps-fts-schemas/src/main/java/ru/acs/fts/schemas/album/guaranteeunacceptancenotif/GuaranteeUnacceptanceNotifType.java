
package ru.acs.fts.schemas.album.guaranteeunacceptancenotif;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� � ������������� ������������� �����������
 */
public class GuaranteeUnacceptanceNotifType extends BaseDocType
{
    private int choiceSelect = -1;
    private static final int TD_NUMBER_CHOICE = 0;
    private static final int TIRID_CHOICE = 1;
    private GTDIDType TDNumber;
    private TIRIDType TIRID;
    private List<GuaranteeUnacceptanceInfoType> guaranteeUnacceptanceInfoList = new ArrayList<GuaranteeUnacceptanceInfoType>();
    private String documentModeID;

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
     * Check if TDNumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTDNumber() {
        return choiceSelect == TD_NUMBER_CHOICE;
    }

    /** 
     * Get the 'TDNumber' element value. ����� ���������� ����������
     * 
     * @return value
     */
    public GTDIDType getTDNumber() {
        return TDNumber;
    }

    /** 
     * Set the 'TDNumber' element value. ����� ���������� ����������
     * 
     * @param TDNumber
     */
    public void setTDNumber(GTDIDType TDNumber) {
        setChoiceSelect(TD_NUMBER_CHOICE);
        this.TDNumber = TDNumber;
    }

    /** 
     * Check if TIRID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTIRID() {
        return choiceSelect == TIRID_CHOICE;
    }

    /** 
     * Get the 'TIRID' element value. ����� ������ ���
     * 
     * @return value
     */
    public TIRIDType getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. ����� ������ ���
     * 
     * @param TIRID
     */
    public void setTIRID(TIRIDType TIRID) {
        setChoiceSelect(TIRID_CHOICE);
        this.TIRID = TIRID;
    }

    /** 
     * Get the list of 'GuaranteeUnacceptanceInfo' element items. �������� � ������������� ������������� �����������
     * 
     * @return list
     */
    public List<GuaranteeUnacceptanceInfoType> getGuaranteeUnacceptanceInfoList() {
        return guaranteeUnacceptanceInfoList;
    }

    /** 
     * Set the list of 'GuaranteeUnacceptanceInfo' element items. �������� � ������������� ������������� �����������
     * 
     * @param list
     */
    public void setGuaranteeUnacceptanceInfoList(
            List<GuaranteeUnacceptanceInfoType> list) {
        guaranteeUnacceptanceInfoList = list;
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
