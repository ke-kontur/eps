
package ru.acs.fts.schemas.album.custuse_pi;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.TIRIDType;

/** 
 * Уведомление об использовании предварительной информации
 */
public class CustUsePIType extends BaseDocType
{
    private String useDocumentNumber;
    private LocalDate useDocumentDate;
    private String useDocDscrepancy;
    private String useDocumentKind;
    private int choiceSelect = -1;
    private static final int TIRID_CHOICE = 0;
    private static final int PI_REG_ID_CHOICE = 1;
    private TIRIDType TIRID;
    private String PIRegID;
    private String documentModeID;

    /** 
     * Get the 'UseDocumentNumber' element value. Номер документа в котором использована предварительная информация
     * 
     * @return value
     */
    public String getUseDocumentNumber() {
        return useDocumentNumber;
    }

    /** 
     * Set the 'UseDocumentNumber' element value. Номер документа в котором использована предварительная информация
     * 
     * @param useDocumentNumber
     */
    public void setUseDocumentNumber(String useDocumentNumber) {
        this.useDocumentNumber = useDocumentNumber;
    }

    /** 
     * Get the 'UseDocumentDate' element value. Дата документа в котором использована предварительная информация
     * 
     * @return value
     */
    public LocalDate getUseDocumentDate() {
        return useDocumentDate;
    }

    /** 
     * Set the 'UseDocumentDate' element value. Дата документа в котором использована предварительная информация
     * 
     * @param useDocumentDate
     */
    public void setUseDocumentDate(LocalDate useDocumentDate) {
        this.useDocumentDate = useDocumentDate;
    }

    /** 
     * Get the 'UseDocDscrepancy' element value. Признак наличия расхождений в ПИ и оформленном документе
     * 
     * @return value
     */
    public String getUseDocDscrepancy() {
        return useDocDscrepancy;
    }

    /** 
     * Set the 'UseDocDscrepancy' element value. Признак наличия расхождений в ПИ и оформленном документе
     * 
     * @param useDocDscrepancy
     */
    public void setUseDocDscrepancy(String useDocDscrepancy) {
        this.useDocDscrepancy = useDocDscrepancy;
    }

    /** 
     * Get the 'UseDocumentKind' element value. Тип документа в котором использована предварительная информация - ТД / ДТ
     * 
     * @return value
     */
    public String getUseDocumentKind() {
        return useDocumentKind;
    }

    /** 
     * Set the 'UseDocumentKind' element value. Тип документа в котором использована предварительная информация - ТД / ДТ
     * 
     * @param useDocumentKind
     */
    public void setUseDocumentKind(String useDocumentKind) {
        this.useDocumentKind = useDocumentKind;
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
