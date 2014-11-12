
package ru.acs.fts.schemas.album.transitinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.TDGuaranteeType;

/** 
 * Информация о транзитных товарах
 */
public class TransitInfoType extends BaseDocType
{
    private String statusName;
    private String documentDateTime;
    private List<String> reasonList = new ArrayList<String>();
    private String actNumber;
    private String customsCode;
    private String transitStampDateTime;
    private CustomsPersonType customsOfficial;
    private HeaderType header;
    private List<ConsigmentType> consigmentList = new ArrayList<ConsigmentType>();
    private DocumentBaseType precedingDocument;
    private DestinationPlaceType destinationPlace;
    private List<SealType> sealList = new ArrayList<SealType>();
    private List<TDGuaranteeType> guaranteeList = new ArrayList<TDGuaranteeType>();
    private String documentModeID;

    /** 
     * Get the 'StatusName' element value. Прикладное статусное состояние транзитной перевозки.
     * 
     * @return value
     */
    public String getStatusName() {
        return statusName;
    }

    /** 
     * Set the 'StatusName' element value. Прикладное статусное состояние транзитной перевозки.
     * 
     * @param statusName
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    /** 
     * Get the 'DocumentDateTime' element value. Дата и время создания документа.
     * 
     * @return value
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. Дата и время создания документа.
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the list of 'Reason' element items. Обоснование
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reason' element items. Обоснование
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'ActNumber' element value. Номер акта таможенного досмотра
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. Номер акта таможенного досмотра
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа отправления
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа отправления
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'TransitStampDateTime' element value. Дата и время из штампа
     * 
     * @return value
     */
    public String getTransitStampDateTime() {
        return transitStampDateTime;
    }

    /** 
     * Set the 'TransitStampDateTime' element value. Дата и время из штампа
     * 
     * @param transitStampDateTime
     */
    public void setTransitStampDateTime(String transitStampDateTime) {
        this.transitStampDateTime = transitStampDateTime;
    }

    /** 
     * Get the 'CustomsOfficial' element value. Сведения о должностном лице таможенного органа, проставившем штамп.
     * 
     * @return value
     */
    public CustomsPersonType getCustomsOfficial() {
        return customsOfficial;
    }

    /** 
     * Set the 'CustomsOfficial' element value. Сведения о должностном лице таможенного органа, проставившем штамп.
     * 
     * @param customsOfficial
     */
    public void setCustomsOfficial(CustomsPersonType customsOfficial) {
        this.customsOfficial = customsOfficial;
    }

    /** 
     * Get the 'Header' element value. Заголовок ТД
     * 
     * @return value
     */
    public HeaderType getHeader() {
        return header;
    }

    /** 
     * Set the 'Header' element value. Заголовок ТД
     * 
     * @param header
     */
    public void setHeader(HeaderType header) {
        this.header = header;
    }

    /** 
     * Get the list of 'Consigment' element items. Товарно-транспортная накладная.
     * 
     * @return list
     */
    public List<ConsigmentType> getConsigmentList() {
        return consigmentList;
    }

    /** 
     * Set the list of 'Consigment' element items. Товарно-транспортная накладная.
     * 
     * @param list
     */
    public void setConsigmentList(List<ConsigmentType> list) {
        consigmentList = list;
    }

    /** 
     * Get the 'PrecedingDocument' element value. Предшествующий документ (при открытии процедуры транзита)
     * 
     * @return value
     */
    public DocumentBaseType getPrecedingDocument() {
        return precedingDocument;
    }

    /** 
     * Set the 'PrecedingDocument' element value. Предшествующий документ (при открытии процедуры транзита)
     * 
     * @param precedingDocument
     */
    public void setPrecedingDocument(DocumentBaseType precedingDocument) {
        this.precedingDocument = precedingDocument;
    }

    /** 
     * Get the 'DestinationPlace' element value. Сведения о месте назначения
     * 
     * @return value
     */
    public DestinationPlaceType getDestinationPlace() {
        return destinationPlace;
    }

    /** 
     * Set the 'DestinationPlace' element value. Сведения о месте назначения
     * 
     * @param destinationPlace
     */
    public void setDestinationPlace(DestinationPlaceType destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    /** 
     * Get the list of 'Seal' element items. Информация о пломбах
     * 
     * @return list
     */
    public List<SealType> getSealList() {
        return sealList;
    }

    /** 
     * Set the list of 'Seal' element items. Информация о пломбах
     * 
     * @param list
     */
    public void setSealList(List<SealType> list) {
        sealList = list;
    }

    /** 
     * Get the list of 'Guarantee' element items. Гарантия
     * 
     * @return list
     */
    public List<TDGuaranteeType> getGuaranteeList() {
        return guaranteeList;
    }

    /** 
     * Set the list of 'Guarantee' element items. Гарантия
     * 
     * @param list
     */
    public void setGuaranteeList(List<TDGuaranteeType> list) {
        guaranteeList = list;
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
