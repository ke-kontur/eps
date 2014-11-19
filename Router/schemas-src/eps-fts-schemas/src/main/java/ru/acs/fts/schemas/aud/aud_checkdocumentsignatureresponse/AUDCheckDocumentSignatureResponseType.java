
package ru.acs.fts.schemas.aud.aud_checkdocumentsignatureresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDResultInfoType;

/** 
 * Ответ на запрос на проверку ЭЦП на документ.
 */
public class AUDCheckDocumentSignatureResponseType extends AUDBaseEnvelopeType
{
    private AUDResultInfoType resultInfo;
    private String documentModeID;

    /** 
     * Get the 'ResultInfo' element value. Результат проверки ЭЦП на документ.
     * 
     * @return value
     */
    public AUDResultInfoType getResultInfo() {
        return resultInfo;
    }

    /** 
     * Set the 'ResultInfo' element value. Результат проверки ЭЦП на документ.
     * 
     * @param resultInfo
     */
    public void setResultInfo(AUDResultInfoType resultInfo) {
        this.resultInfo = resultInfo;
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
