
package ru.acs.fts.schemas.album.transportmeancardout;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADTransportMeanCardType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportManufacturerType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportOwnerType;

/** 
 * Карточка транспортного средства. Внешний формат.
 */
public class TransportMeanCardOutType extends BaseDocType
{
    private String GTDDocumentID;
    private TransportOwnerType transportOwner;
    private TransportManufacturerType transportManufacturer;
    private ESADTransportMeanCardType ESADTransportMeanCard;
    private DocumentBaseType document;
    private GTDIDType cardNumber;
    private String documentModeID;

    /** 
     * Get the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении отдельно от ДТ.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. Уникальный идентификатор ДТ.  Используется для привязки к ДТ при представлении отдельно от ДТ.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'TransportOwner' element value. Владелец ТС. Для  физических лиц заполняются Фамилия, Имя, Отчество, для юридических - Наименование.
     * 
     * @return value
     */
    public TransportOwnerType getTransportOwner() {
        return transportOwner;
    }

    /** 
     * Set the 'TransportOwner' element value. Владелец ТС. Для  физических лиц заполняются Фамилия, Имя, Отчество, для юридических - Наименование.
     * 
     * @param transportOwner
     */
    public void setTransportOwner(TransportOwnerType transportOwner) {
        this.transportOwner = transportOwner;
    }

    /** 
     * Get the 'TransportManufacturer' element value. Изготовитель транспортного средства.
     * 
     * @return value
     */
    public TransportManufacturerType getTransportManufacturer() {
        return transportManufacturer;
    }

    /** 
     * Set the 'TransportManufacturer' element value. Изготовитель транспортного средства.
     * 
     * @param transportManufacturer
     */
    public void setTransportManufacturer(
            TransportManufacturerType transportManufacturer) {
        this.transportManufacturer = transportManufacturer;
    }

    /** 
     * Get the 'ESADTransportMeanCard' element value. Карточка транспортного средства. Сведения о транспортном средстве.
     * 
     * @return value
     */
    public ESADTransportMeanCardType getESADTransportMeanCard() {
        return ESADTransportMeanCard;
    }

    /** 
     * Set the 'ESADTransportMeanCard' element value. Карточка транспортного средства. Сведения о транспортном средстве.
     * 
     * @param ESADTransportMeanCard
     */
    public void setESADTransportMeanCard(
            ESADTransportMeanCardType ESADTransportMeanCard) {
        this.ESADTransportMeanCard = ESADTransportMeanCard;
    }

    /** 
     * Get the 'Document' element value. Наименование, номер и дата документа (ТД, ТПО, иной документ)
     * 
     * @return value
     */
    public DocumentBaseType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. Наименование, номер и дата документа (ТД, ТПО, иной документ)
     * 
     * @param document
     */
    public void setDocument(DocumentBaseType document) {
        this.document = document;
    }

    /** 
     * Get the 'CardNumber' element value. Учетный номер карточки (формат аналогичен формату номера ДТ).
     * 
     * @return value
     */
    public GTDIDType getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. Учетный номер карточки (формат аналогичен формату номера ДТ).
     * 
     * @param cardNumber
     */
    public void setCardNumber(GTDIDType cardNumber) {
        this.cardNumber = cardNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
