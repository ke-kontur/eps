
package ru.acs.fts.schemas.album.cwquitance;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.CWDocType;

/** 
 * Квитанция об успешном получении информации
 */
public class CWQuitanceType extends CWDocType
{
    private int choiceSelect = -1;
    private static final int QUITANCE_CHOICE = 0;
    private static final int DOCUMENT_WITH_ERRORS_CHOICE = 1;
    private QuitanceType quitance;
    private DocumentWithErrorsType documentWithErrors;
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
     * Check if Quitance is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifQuitance() {
        return choiceSelect == QUITANCE_CHOICE;
    }

    /** 
     * Get the 'Quitance' element value. Квитанция
     * 
     * @return value
     */
    public QuitanceType getQuitance() {
        return quitance;
    }

    /** 
     * Set the 'Quitance' element value. Квитанция
     * 
     * @param quitance
     */
    public void setQuitance(QuitanceType quitance) {
        setChoiceSelect(QUITANCE_CHOICE);
        this.quitance = quitance;
    }

    /** 
     * Check if DocumentWithErrors is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifDocumentWithErrors() {
        return choiceSelect == DOCUMENT_WITH_ERRORS_CHOICE;
    }

    /** 
     * Get the 'DocumentWithErrors' element value. Документ,содержащий ошибки
     * 
     * @return value
     */
    public DocumentWithErrorsType getDocumentWithErrors() {
        return documentWithErrors;
    }

    /** 
     * Set the 'DocumentWithErrors' element value. Документ,содержащий ошибки
     * 
     * @param documentWithErrors
     */
    public void setDocumentWithErrors(DocumentWithErrorsType documentWithErrors) {
        setChoiceSelect(DOCUMENT_WITH_ERRORS_CHOICE);
        this.documentWithErrors = documentWithErrors;
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
