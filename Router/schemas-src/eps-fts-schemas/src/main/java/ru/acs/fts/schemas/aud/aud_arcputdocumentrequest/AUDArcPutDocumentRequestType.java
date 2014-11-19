
package ru.acs.fts.schemas.aud.aud_arcputdocumentrequest;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentInfoWithPacketSyncType;

/** 
 * Запрос на размещение документа на хранение в архиве верхнего уровня.
 */
public class AUDArcPutDocumentRequestType extends AUDBaseEnvelopeType
{
    private AUDDocumentInfoWithPacketSyncType documentInfoWithPacketSync;
    private String documentModeID;

    /** 
     * Get the 'DocumentInfoWithPacketSync' element value. Информация о документе архива и пакете (в состав которого входит документ).
     * 
     * @return value
     */
    public AUDDocumentInfoWithPacketSyncType getDocumentInfoWithPacketSync() {
        return documentInfoWithPacketSync;
    }

    /** 
     * Set the 'DocumentInfoWithPacketSync' element value. Информация о документе архива и пакете (в состав которого входит документ).
     * 
     * @param documentInfoWithPacketSync
     */
    public void setDocumentInfoWithPacketSync(
            AUDDocumentInfoWithPacketSyncType documentInfoWithPacketSync) {
        this.documentInfoWithPacketSync = documentInfoWithPacketSync;
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
