
package ru.acs.fts.schemas.album.eps_inforequest;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Запрос статуса электронного документа / процедуры / процесса.
 */
public class EPSInfoRequestType extends BaseDocType
{
    private int choiceSelect = -1;
    private static final int ARCH_REQUEST_CHOICE = 0;
    private static final int PROCESS_REQUEST_CHOICE = 1;
    private static final int ENV_REQUEST_CHOICE = 2;
    private ArchRequestType archRequest;
    private ProcessRequestType processRequest;
    private EnvRequestType envRequest;
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
     * Check if ArchRequest is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifArchRequest() {
        return choiceSelect == ARCH_REQUEST_CHOICE;
    }

    /** 
     * Get the 'ArchRequest' element value. Запрос к архиву декларанта
     * 
     * @return value
     */
    public ArchRequestType getArchRequest() {
        return archRequest;
    }

    /** 
     * Set the 'ArchRequest' element value. Запрос к архиву декларанта
     * 
     * @param archRequest
     */
    public void setArchRequest(ArchRequestType archRequest) {
        setChoiceSelect(ARCH_REQUEST_CHOICE);
        this.archRequest = archRequest;
    }

    /** 
     * Check if ProcessRequest is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifProcessRequest() {
        return choiceSelect == PROCESS_REQUEST_CHOICE;
    }

    /** 
     * Get the 'ProcessRequest' element value. Запрос к процедуре / процессу
     * 
     * @return value
     */
    public ProcessRequestType getProcessRequest() {
        return processRequest;
    }

    /** 
     * Set the 'ProcessRequest' element value. Запрос к процедуре / процессу
     * 
     * @param processRequest
     */
    public void setProcessRequest(ProcessRequestType processRequest) {
        setChoiceSelect(PROCESS_REQUEST_CHOICE);
        this.processRequest = processRequest;
    }

    /** 
     * Check if EnvRequest is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifEnvRequest() {
        return choiceSelect == ENV_REQUEST_CHOICE;
    }

    /** 
     * Get the 'EnvRequest' element value. Запрос на передачу сообщения
     * 
     * @return value
     */
    public EnvRequestType getEnvRequest() {
        return envRequest;
    }

    /** 
     * Set the 'EnvRequest' element value. Запрос на передачу сообщения
     * 
     * @param envRequest
     */
    public void setEnvRequest(EnvRequestType envRequest) {
        setChoiceSelect(ENV_REQUEST_CHOICE);
        this.envRequest = envRequest;
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
