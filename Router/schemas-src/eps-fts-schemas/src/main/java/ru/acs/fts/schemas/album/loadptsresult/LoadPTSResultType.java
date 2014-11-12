
package ru.acs.fts.schemas.album.loadptsresult;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Пакет с протоколом обработки
 */
public class LoadPTSResultType extends BaseDocType
{
    private ProtocolProcessingPacketType protocolProcessingPacket;
    private List<ProtocolProcessingFormType> protocolProcessingFormList = new ArrayList<ProtocolProcessingFormType>();
    private String documentModeID;

    /** 
     * Get the 'ProtocolProcessingPacket' element value. Результат загрузки / обработки пакета 
     * 
     * @return value
     */
    public ProtocolProcessingPacketType getProtocolProcessingPacket() {
        return protocolProcessingPacket;
    }

    /** 
     * Set the 'ProtocolProcessingPacket' element value. Результат загрузки / обработки пакета 
     * 
     * @param protocolProcessingPacket
     */
    public void setProtocolProcessingPacket(
            ProtocolProcessingPacketType protocolProcessingPacket) {
        this.protocolProcessingPacket = protocolProcessingPacket;
    }

    /** 
     * Get the list of 'ProtocolProcessingForm' element items. Сведения о результатах проведения форматного и структурного контроля бланка
     * 
     * @return list
     */
    public List<ProtocolProcessingFormType> getProtocolProcessingFormList() {
        return protocolProcessingFormList;
    }

    /** 
     * Set the list of 'ProtocolProcessingForm' element items. Сведения о результатах проведения форматного и структурного контроля бланка
     * 
     * @param list
     */
    public void setProtocolProcessingFormList(
            List<ProtocolProcessingFormType> list) {
        protocolProcessingFormList = list;
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
