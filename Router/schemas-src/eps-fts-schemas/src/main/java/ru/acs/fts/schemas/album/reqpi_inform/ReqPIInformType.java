
package ru.acs.fts.schemas.album.reqpi_inform;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.TIRIDType;

/** 
 * Запрос на предоставление предварительной информации
 */
public class ReqPIInformType extends BaseDocType
{
    private String customsCode;
    private int choiceSelect = -1;
    private static final int TIRID_CHOICE = 0;
    private static final int PI_REG_ID_CHOICE = 1;
    private TIRIDType TIRID;
    private String PIRegID;
    private String documentModeID;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
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
     * Get the 'TIR_ID' element value. Номер книжки МДП
     * 
     * @return value
     */
    public TIRIDType getTIRID() {
        return TIRID;
    }

    /** 
     * Set the 'TIR_ID' element value. Номер книжки МДП
     * 
     * @param TIRID
     */
    public void setTIRID(TIRIDType TIRID) {
        setChoiceSelect(TIRID_CHOICE);
        this.TIRID = TIRID;
    }

    /** 
     * Check if PIRegID is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifPIRegID() {
        return choiceSelect == PI_REG_ID_CHOICE;
    }

    /** 
     * Get the 'PI_RegID' element value. Идентификатор запрашиваемой предварительной информации.
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. Идентификатор запрашиваемой предварительной информации.
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        setChoiceSelect(PI_REG_ID_CHOICE);
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
