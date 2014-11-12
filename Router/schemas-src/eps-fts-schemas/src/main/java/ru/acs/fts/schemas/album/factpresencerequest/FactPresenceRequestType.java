
package ru.acs.fts.schemas.album.factpresencerequest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Запрос о факте наличия товаров (о факте совершения таможенных операций, необходимых для завершения таможенного транзита/Запрос информации о разрешительных документах, указанных в графе 44)
 */
public class FactPresenceRequestType extends BaseDocType
{
    private String departureCountryCode;
    private LocalDate reqDate;
    private String reqTime;
    private CUOrganizationType consignor;
    private CUOrganizationType consignee;
    private CustomsType goodsLocationCustoms;
    private List<MarkType> markList = new ArrayList<MarkType>();
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private List<TransportMeanArriveType> transportMeanArriveList = new ArrayList<TransportMeanArriveType>();
    private List<Choice> choiceList = new ArrayList<Choice>();
    private CUOrganizationType declarant;
    private String documentModeID;

    /** 
     * Get the 'DepartureCountryCode' element value. Код страны отправления
     * 
     * @return value
     */
    public String getDepartureCountryCode() {
        return departureCountryCode;
    }

    /** 
     * Set the 'DepartureCountryCode' element value. Код страны отправления
     * 
     * @param departureCountryCode
     */
    public void setDepartureCountryCode(String departureCountryCode) {
        this.departureCountryCode = departureCountryCode;
    }

    /** 
     * Get the 'ReqDate' element value. Дата формирования запроса
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. Дата формирования запроса
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the 'ReqTime' element value. Время формирования запроса
     * 
     * @return value
     */
    public String getReqTime() {
        return reqTime;
    }

    /** 
     * Set the 'ReqTime' element value. Время формирования запроса
     * 
     * @param reqTime
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    /** 
     * Get the 'Consignor' element value. Отправитель
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Отправитель
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. Получатель
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Получатель
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'GoodsLocationCustoms' element value. Таможенный орган местонахождения товаров
     * 
     * @return value
     */
    public CustomsType getGoodsLocationCustoms() {
        return goodsLocationCustoms;
    }

    /** 
     * Set the 'GoodsLocationCustoms' element value. Таможенный орган местонахождения товаров
     * 
     * @param goodsLocationCustoms
     */
    public void setGoodsLocationCustoms(CustomsType goodsLocationCustoms) {
        this.goodsLocationCustoms = goodsLocationCustoms;
    }

    /** 
     * Get the list of 'Marks' element items. Отметки о прохождении товарами таможенного и иных видов контроля
     * 
     * @return list
     */
    public List<MarkType> getMarkList() {
        return markList;
    }

    /** 
     * Set the list of 'Marks' element items. Отметки о прохождении товарами таможенного и иных видов контроля
     * 
     * @param list
     */
    public void setMarkList(List<MarkType> list) {
        markList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе, осуществляющем запрос
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе, осуществляющем запрос
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'TransportMeanArrive' element items. Описание транспортного средства
     * 
     * @return list
     */
    public List<TransportMeanArriveType> getTransportMeanArriveList() {
        return transportMeanArriveList;
    }

    /** 
     * Set the list of 'TransportMeanArrive' element items. Описание транспортного средства
     * 
     * @param list
     */
    public void setTransportMeanArriveList(List<TransportMeanArriveType> list) {
        transportMeanArriveList = list;
    }

    /** 
     * Get the list of choice items.
     * 
     * @return list
     */
    public List<Choice> getChoiceList() {
        return choiceList;
    }

    /** 
     * Set the list of choice items.
     * 
     * @param list
     */
    public void setChoiceList(List<Choice> list) {
        choiceList = list;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о декларанте
     * 
     * @return value
     */
    public CUOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о декларанте
     * 
     * @param declarant
     */
    public void setDeclarant(CUOrganizationType declarant) {
        this.declarant = declarant;
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
    public static class Choice
    {
        private int choiceListSelect = -1;
        private static final int TRANSPORT_DOC_CHOICE = 0;
        private static final int TD_NUMBER_CHOICE = 1;
        private static final int TIRID_CHOICE = 2;
        private DocumentBaseType transportDoc;
        private GTDIDType TDNumber;
        private TIRIDType TIRID;

        private void setChoiceListSelect(int choice) {
            if (choiceListSelect == -1) {
                choiceListSelect = choice;
            } else if (choiceListSelect != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoiceListSelect() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoiceListSelect() {
            choiceListSelect = -1;
        }

        /** 
         * Check if TransportDoc is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTransportDoc() {
            return choiceListSelect == TRANSPORT_DOC_CHOICE;
        }

        /** 
         * Get the 'TransportDoc' element value. Номер транспортного (перевозочного) документа
         * 
         * @return value
         */
        public DocumentBaseType getTransportDoc() {
            return transportDoc;
        }

        /** 
         * Set the 'TransportDoc' element value. Номер транспортного (перевозочного) документа
         * 
         * @param transportDoc
         */
        public void setTransportDoc(DocumentBaseType transportDoc) {
            setChoiceListSelect(TRANSPORT_DOC_CHOICE);
            this.transportDoc = transportDoc;
        }

        /** 
         * Check if TDNumber is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTDNumber() {
            return choiceListSelect == TD_NUMBER_CHOICE;
        }

        /** 
         * Get the 'TDNumber' element value. Номер транзитной декларации
         * 
         * @return value
         */
        public GTDIDType getTDNumber() {
            return TDNumber;
        }

        /** 
         * Set the 'TDNumber' element value. Номер транзитной декларации
         * 
         * @param TDNumber
         */
        public void setTDNumber(GTDIDType TDNumber) {
            setChoiceListSelect(TD_NUMBER_CHOICE);
            this.TDNumber = TDNumber;
        }

        /** 
         * Check if TIRID is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTIRID() {
            return choiceListSelect == TIRID_CHOICE;
        }

        /** 
         * Get the 'TIRID' element value. Номер книжки МДП
         * 
         * @return value
         */
        public TIRIDType getTIRID() {
            return TIRID;
        }

        /** 
         * Set the 'TIRID' element value. Номер книжки МДП
         * 
         * @param TIRID
         */
        public void setTIRID(TIRIDType TIRID) {
            setChoiceListSelect(TIRID_CHOICE);
            this.TIRID = TIRID;
        }
    }
}
