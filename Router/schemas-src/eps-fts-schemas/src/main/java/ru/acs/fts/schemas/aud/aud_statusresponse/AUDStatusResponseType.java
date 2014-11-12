
package ru.acs.fts.schemas.aud.aud_statusresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Ответ на запрос информации о статусе функционирования системы.
 */
public class AUDStatusResponseType extends AUDBaseEnvelopeType
{
    private boolean testModeIndicator;
    private String documentModeID;

    /** 
     * Get the 'TestModeIndicator' element value. Признак того, что система функционирует в тестовом режиме.
     * 
     * @return value
     */
    public boolean isTestModeIndicator() {
        return testModeIndicator;
    }

    /** 
     * Set the 'TestModeIndicator' element value. Признак того, что система функционирует в тестовом режиме.
     * 
     * @param testModeIndicator
     */
    public void setTestModeIndicator(boolean testModeIndicator) {
        this.testModeIndicator = testModeIndicator;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида технологического документа (запроса, ответа)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
