
package ru.acs.fts.schemas.album.presenteddocinfores;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Сведения о разрешительных документах
 */
public class PresentedDocType
{
    private String transitStatus;
    private int choiceSelect = -1;
    private static final int TIRID_CHOICE = 0;
    private static final int TD_NUMBER_CHOICE = 1;
    private TIRIDType TIRID;
    private GTDIDType TDNumber;
    private List<PresentedDocumentType> presentedDocumentList = new ArrayList<PresentedDocumentType>();

    /** 
     * Get the 'TransitStatus' element value. Статус таможенного транзита: 1 - транзит открыт и товары не поступили; 2 - транзит закрыт; 3 - транзит открыт и товары поступили
     * 
     * @return value
     */
    public String getTransitStatus() {
        return transitStatus;
    }

    /** 
     * Set the 'TransitStatus' element value. Статус таможенного транзита: 1 - транзит открыт и товары не поступили; 2 - транзит закрыт; 3 - транзит открыт и товары поступили
     * 
     * @param transitStatus
     */
    public void setTransitStatus(String transitStatus) {
        this.transitStatus = transitStatus;
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
     * Check if TIRID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifTIRID() {
        return choiceSelect == TIRID_CHOICE;
    }

    /** 
     * Get the 'TIRID' element value. Номер книжки МДП
     * 
     * @return value
     */
    public TIRIDType getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIRID' element value. Номер книжки МДП
     * 
     * @param TIRID
     */
    public void setTIRID(TIRIDType TIRID) {
        setChoiceSelect(TIRID_CHOICE);
        this.TIRID = TIRID;
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
     * Get the 'TDNumber' element value. Номер транзитной декларации
     * 
     * @return value
     */
    public GTDIDType getTDNumber() {
        return TDNumber;
    }

    /** 
     * Set the 'TDNumber' element value. Номер транзитной декларации
     * 
     * @param TDNumber
     */
    public void setTDNumber(GTDIDType TDNumber) {
        setChoiceSelect(TD_NUMBER_CHOICE);
        this.TDNumber = TDNumber;
    }

    /** 
     * Get the list of 'PresentedDocument' element items. Информация о разрешительных  документах
     * 
     * @return list
     */
    public List<PresentedDocumentType> getPresentedDocumentList() {
        return presentedDocumentList;
    }

    /** 
     * Set the list of 'PresentedDocument' element items. Информация о разрешительных  документах
     * 
     * @param list
     */
    public void setPresentedDocumentList(List<PresentedDocumentType> list) {
        presentedDocumentList = list;
    }
}
