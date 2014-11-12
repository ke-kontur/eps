
package ru.acs.fts.schemas.album.pi_tiauto;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Предварительная информация в отношении временно ввозимых физическими лицами авто-, мототранспортных средств для личного пользования
 */
public class PITIAutoType extends BaseDocType
{
    private TransportMeanCardType transportMeanCard;
    private TransportPersonType transportDriver;
    private TransportPersonType transportOwner;
    private String documentModeID;

    /** 
     * Get the 'TransportMeanCard' element value. Карточка транспортного средства. Сведения о транспортном средстве
     * 
     * @return value
     */
    public TransportMeanCardType getTransportMeanCard() {
        return transportMeanCard;
    }

    /** 
     * Set the 'TransportMeanCard' element value. Карточка транспортного средства. Сведения о транспортном средстве
     * 
     * @param transportMeanCard
     */
    public void setTransportMeanCard(TransportMeanCardType transportMeanCard) {
        this.transportMeanCard = transportMeanCard;
    }

    /** 
     * Get the 'TransportDriver' element value. Информация о владельце (водителе) транспортного средства
     * 
     * @return value
     */
    public TransportPersonType getTransportDriver() {
        return transportDriver;
    }

    /** 
     * Set the 'TransportDriver' element value. Информация о владельце (водителе) транспортного средства
     * 
     * @param transportDriver
     */
    public void setTransportDriver(TransportPersonType transportDriver) {
        this.transportDriver = transportDriver;
    }

    /** 
     * Get the 'TransportOwner' element value. Информация о собственнике транспортного средства
     * 
     * @return value
     */
    public TransportPersonType getTransportOwner() {
        return transportOwner;
    }

    /** 
     * Set the 'TransportOwner' element value. Информация о собственнике транспортного средства
     * 
     * @param transportOwner
     */
    public void setTransportOwner(TransportPersonType transportOwner) {
        this.transportOwner = transportOwner;
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
