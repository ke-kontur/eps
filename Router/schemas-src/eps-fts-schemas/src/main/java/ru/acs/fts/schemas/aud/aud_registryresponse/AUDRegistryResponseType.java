
package ru.acs.fts.schemas.aud.aud_registryresponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * Реестр документов,  размещенных  в архиве
 */
public class AUDRegistryResponseType extends AUDBaseEnvelopeType
{
    private boolean nullFlag;
    private List<RegistryPacketInfoType> AUDPacketRegistryRowList = new ArrayList<RegistryPacketInfoType>();
    private String documentModeID;

    /** 
     * Get the 'NullFlag' element value. Признак наличия  записей  в реестре. true - присутствуют false -  отсутствуют
     * 
     * @return value
     */
    public boolean isNullFlag() {
        return nullFlag;
    }

    /** 
     * Set the 'NullFlag' element value. Признак наличия  записей  в реестре. true - присутствуют false -  отсутствуют
     * 
     * @param nullFlag
     */
    public void setNullFlag(boolean nullFlag) {
        this.nullFlag = nullFlag;
    }

    /** 
     * Get the list of 'AUD_PacketRegistryRow' element items. Сведения о  размещенных  пакетах
     * 
     * @return list
     */
    public List<RegistryPacketInfoType> getAUDPacketRegistryRowList() {
        return AUDPacketRegistryRowList;
    }

    /** 
     * Set the list of 'AUD_PacketRegistryRow' element items. Сведения о  размещенных  пакетах
     * 
     * @param list
     */
    public void setAUDPacketRegistryRowList(List<RegistryPacketInfoType> list) {
        AUDPacketRegistryRowList = list;
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
