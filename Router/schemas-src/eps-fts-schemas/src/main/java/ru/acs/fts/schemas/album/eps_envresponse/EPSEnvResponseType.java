
package ru.acs.fts.schemas.album.eps_envresponse;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Повтор сообщения по запросу.
 */
public class EPSEnvResponseType extends BaseDocType
{
    private EnvelopeDataType envData;
    private String documentModeID;

    /** 
     * Get the 'EnvData' element value. Запрошенное сообщение
     * 
     * @return value
     */
    public EnvelopeDataType getEnvData() {
        return envData;
    }

    /** 
     * Set the 'EnvData' element value. Запрошенное сообщение
     * 
     * @param envData
     */
    public void setEnvData(EnvelopeDataType envData) {
        this.envData = envData;
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
