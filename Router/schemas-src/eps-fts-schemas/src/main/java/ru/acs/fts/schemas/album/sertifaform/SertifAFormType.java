
package ru.acs.fts.schemas.album.sertifaform;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * Сертификат о происхождении товаров по форме "А"
 */
public class SertifAFormType extends BaseDocType
{
    private String countryCode;
    private String route;
    private String specialComments;
    private LocalDate filledDate;
    private String place;
    private String countryOriginCode;
    private String destinationCountryCode;
    private String countryOriginName;
    private String destinationCountryName;
    private AuthenticationType registrationDocument;
    private SertifOrgBaseType consignor;
    private int choiceSelect = -1;
    private static final int TO_ORDER_FLAG_CHOICE = 0;
    private static final int CONSIGNEE_NAME_CHOICE = 1;
    private static final int CONSIGNEE_COUNTRY_CHOICE = 2;
    private String toOrderFlag;
    private SertifOrgBaseType consigneeName;
    private ConsigneeCountryType consigneeCountry;
    private DocumentBaseType annuledSertifAForm;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private List<DocumentBaseType> invoiceList = new ArrayList<DocumentBaseType>();
    private PersonSignatureType exportSign;
    private String documentModeID;

    /** 
     * Get the 'CountryCode' element value. Код страны, в которой выдан сертификат
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны, в которой выдан сертификат
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'Route' element value. Cведения о маршруте транспортировки товаров и транспортных средствах (насколько это известно)
     * 
     * @return value
     */
    public String getRoute() {
        return route;
    }

    /** 
     * Set the 'Route' element value. Cведения о маршруте транспортировки товаров и транспортных средствах (насколько это известно)
     * 
     * @param route
     */
    public void setRoute(String route) {
        this.route = route;
    }

    /** 
     * Get the 'SpecialComments' element value. Специальные отметки ("duplicate" ("дубликат"), "issued retrospectively" ("выдан впоследствии") или  "issued instead" ("выдан взамен") )
     * 
     * @return value
     */
    public String getSpecialComments() {
        return specialComments;
    }

    /** 
     * Set the 'SpecialComments' element value. Специальные отметки ("duplicate" ("дубликат"), "issued retrospectively" ("выдан впоследствии") или  "issued instead" ("выдан взамен") )
     * 
     * @param specialComments
     */
    public void setSpecialComments(String specialComments) {
        this.specialComments = specialComments;
    }

    /** 
     * Get the 'FilledDate' element value. Дата заполнения сертификата
     * 
     * @return value
     */
    public LocalDate getFilledDate() {
        return filledDate;
    }

    /** 
     * Set the 'FilledDate' element value. Дата заполнения сертификата
     * 
     * @param filledDate
     */
    public void setFilledDate(LocalDate filledDate) {
        this.filledDate = filledDate;
    }

    /** 
     * Get the 'Place' element value. Место заполнения сертификата
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Место заполнения сертификата
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /** 
     * Get the 'CountryOriginCode' element value. Код страны происхождения товаров
     * 
     * @return value
     */
    public String getCountryOriginCode() {
        return countryOriginCode;
    }

    /** 
     * Set the 'CountryOriginCode' element value. Код страны происхождения товаров
     * 
     * @param countryOriginCode
     */
    public void setCountryOriginCode(String countryOriginCode) {
        this.countryOriginCode = countryOriginCode;
    }

    /** 
     * Get the 'DestinationCountryCode' element value. Код страны назначения товаров
     * 
     * @return value
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /** 
     * Set the 'DestinationCountryCode' element value. Код страны назначения товаров
     * 
     * @param destinationCountryCode
     */
    public void setDestinationCountryCode(String destinationCountryCode) {
        this.destinationCountryCode = destinationCountryCode;
    }

    /** 
     * Get the 'CountryOriginName' element value. Наименование страны происхождения
     * 
     * @return value
     */
    public String getCountryOriginName() {
        return countryOriginName;
    }

    /** 
     * Set the 'CountryOriginName' element value. Наименование страны происхождения
     * 
     * @param countryOriginName
     */
    public void setCountryOriginName(String countryOriginName) {
        this.countryOriginName = countryOriginName;
    }

    /** 
     * Get the 'DestinationCountryName' element value. Наименование страны назначения товаров
     * 
     * @return value
     */
    public String getDestinationCountryName() {
        return destinationCountryName;
    }

    /** 
     * Set the 'DestinationCountryName' element value. Наименование страны назначения товаров
     * 
     * @param destinationCountryName
     */
    public void setDestinationCountryName(String destinationCountryName) {
        this.destinationCountryName = destinationCountryName;
    }

    /** 
     * Get the 'RegistrationDocument' element value. Сведения об удостоверении сертификата
     * 
     * @return value
     */
    public AuthenticationType getRegistrationDocument() {
        return registrationDocument;
    }

    /** 
     * Set the 'RegistrationDocument' element value. Сведения об удостоверении сертификата
     * 
     * @param registrationDocument
     */
    public void setRegistrationDocument(AuthenticationType registrationDocument) {
        this.registrationDocument = registrationDocument;
    }

    /** 
     * Get the 'Consignor' element value. Наименование и адрес лица, которое является экспортером (поставщиком) товара (продавца товара по контракту или иного лица, если ему переданы права на поставку товара, в том числе производителя товара).
     * 
     * @return value
     */
    public SertifOrgBaseType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. Наименование и адрес лица, которое является экспортером (поставщиком) товара (продавца товара по контракту или иного лица, если ему переданы права на поставку товара, в том числе производителя товара).
     * 
     * @param consignor
     */
    public void setConsignor(SertifOrgBaseType consignor) {
        this.consignor = consignor;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if ToOrderFlag is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifToOrderFlag() {
        return choiceSelect == TO_ORDER_FLAG_CHOICE;
    }

    /** 
     * Get the 'ToOrderFlag' element value. Признак проставления записи "to order"
     * 
     * @return value
     */
    public String getToOrderFlag() {
        return toOrderFlag;
    }

    /** 
     * Set the 'ToOrderFlag' element value. Признак проставления записи "to order"
     * 
     * @param toOrderFlag
     */
    public void setToOrderFlag(String toOrderFlag) {
        setChoiceSelect(TO_ORDER_FLAG_CHOICE);
        this.toOrderFlag = toOrderFlag;
    }

    /** 
     * Check if ConsigneeName is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifConsigneeName() {
        return choiceSelect == CONSIGNEE_NAME_CHOICE;
    }

    /** 
     * Get the 'ConsigneeName' element value. Наименование и адрес грузополучателя
     * 
     * @return value
     */
    public SertifOrgBaseType getConsigneeName() {
        return consigneeName;
    }

    /** 
     * Set the 'ConsigneeName' element value. Наименование и адрес грузополучателя
     * 
     * @param consigneeName
     */
    public void setConsigneeName(SertifOrgBaseType consigneeName) {
        setChoiceSelect(CONSIGNEE_NAME_CHOICE);
        this.consigneeName = consigneeName;
    }

    /** 
     * Check if ConsigneeCountry is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifConsigneeCountry() {
        return choiceSelect == CONSIGNEE_COUNTRY_CHOICE;
    }

    /** 
     * Get the 'ConsigneeCountry' element value. Страна грузополучателя
     * 
     * @return value
     */
    public ConsigneeCountryType getConsigneeCountry() {
        return consigneeCountry;
    }

    /** 
     * Set the 'ConsigneeCountry' element value. Страна грузополучателя
     * 
     * @param consigneeCountry
     */
    public void setConsigneeCountry(ConsigneeCountryType consigneeCountry) {
        setChoiceSelect(CONSIGNEE_COUNTRY_CHOICE);
        this.consigneeCountry = consigneeCountry;
    }

    /** 
     * Get the 'AnnuledSertifAForm' element value. Сведения аннулированного сертификата
     * 
     * @return value
     */
    public DocumentBaseType getAnnuledSertifAForm() {
        return annuledSertifAForm;
    }

    /** 
     * Set the 'AnnuledSertifAForm' element value. Сведения аннулированного сертификата
     * 
     * @param annuledSertifAForm
     */
    public void setAnnuledSertifAForm(DocumentBaseType annuledSertifAForm) {
        this.annuledSertifAForm = annuledSertifAForm;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the list of 'Invoice' element items. Номер и дата счета-фактуры (инвойса) или счета-проформы без  привязки к товару
     * 
     * @return list
     */
    public List<DocumentBaseType> getInvoiceList() {
        return invoiceList;
    }

    /** 
     * Set the list of 'Invoice' element items. Номер и дата счета-фактуры (инвойса) или счета-проформы без  привязки к товару
     * 
     * @param list
     */
    public void setInvoiceList(List<DocumentBaseType> list) {
        invoiceList = list;
    }

    /** 
     * Get the 'ExportSign' element value. Подпись уполномоченного лица экспортера
     * 
     * @return value
     */
    public PersonSignatureType getExportSign() {
        return exportSign;
    }

    /** 
     * Set the 'ExportSign' element value. Подпись уполномоченного лица экспортера
     * 
     * @param exportSign
     */
    public void setExportSign(PersonSignatureType exportSign) {
        this.exportSign = exportSign;
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
