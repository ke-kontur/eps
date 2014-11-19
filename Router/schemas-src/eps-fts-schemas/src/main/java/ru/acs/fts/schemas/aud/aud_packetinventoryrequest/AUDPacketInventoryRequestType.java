
package ru.acs.fts.schemas.aud.aud_packetinventoryrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDGTDIDType;

/** 
 * Запрос описи документов по пакету (процедуре), которые храняться в АЮД
 */
public class AUDPacketInventoryRequestType extends AUDBaseEnvelopeType
{
    private String appliedProcessId;
    private AUDGTDIDType AUDGTDID;
    private String documentModeID;

    /** 
     * Get the 'AppliedProcessId' element value. Уникальный идентификатор процесса (архивный идентификатор пакета)
     * 
     * @return value
     */
    public String getAppliedProcessId() {
        return appliedProcessId;
    }

    /** 
     * Set the 'AppliedProcessId' element value. Уникальный идентификатор процесса (архивный идентификатор пакета)
     * 
     * @param appliedProcessId
     */
    public void setAppliedProcessId(String appliedProcessId) {
        this.appliedProcessId = appliedProcessId;
    }

    /** 
     * Get the 'AUD_GTDID' element value. Регистрационный  номер ГТД заполняется  при   размещении  и предоставлении  пакета,  предназначенного для  хранения ГТД
     * 
     * @return value
     */
    public AUDGTDIDType getAUDGTDID() {
        return AUDGTDID;
    }

    /** 
     * Set the 'AUD_GTDID' element value. Регистрационный  номер ГТД заполняется  при   размещении  и предоставлении  пакета,  предназначенного для  хранения ГТД
     * 
     * @param AUDGTDID
     */
    public void setAUDGTDID(AUDGTDIDType AUDGTDID) {
        this.AUDGTDID = AUDGTDID;
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
