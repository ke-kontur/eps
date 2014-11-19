
package ru.acs.fts.schemas.album.stateregistrationcertif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Свидетельство о государственной регистрации
 */
public class StateRegistrationCertifType extends BaseDocType
{
    private String BDRDID;
    private String autorizedAgency;
    private String agencyHead;
    private String territorialUnit;
    private String blankSeries;
    private String blankTypographNum;
    private String certificateNumber;
    private LocalDate certDate;
    private String certStatus;
    private String blankTypeID;
    private GoodsType goods;
    private ManufacturerType manufacturerInf;
    private CUOrganizationType goodsRecipient;
    private List<OrganizationBaseType> testingOrgList = new ArrayList<OrganizationBaseType>();
    private PersonBaseType autorizedPerson;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'AutorizedAgency' element value. Наименование уполномоченного органа Стороны
     * 
     * @return value
     */
    public String getAutorizedAgency() {
        return autorizedAgency;
    }

    /** 
     * Set the 'AutorizedAgency' element value. Наименование уполномоченного органа Стороны
     * 
     * @param autorizedAgency
     */
    public void setAutorizedAgency(String autorizedAgency) {
        this.autorizedAgency = autorizedAgency;
    }

    /** 
     * Get the 'AgencyHead' element value. Руководитель уполномоченного органа
     * 
     * @return value
     */
    public String getAgencyHead() {
        return agencyHead;
    }

    /** 
     * Set the 'AgencyHead' element value. Руководитель уполномоченного органа
     * 
     * @param agencyHead
     */
    public void setAgencyHead(String agencyHead) {
        this.agencyHead = agencyHead;
    }

    /** 
     * Get the 'TerritorialUnit' element value. Наименование административно-территориальной единицы
     * 
     * @return value
     */
    public String getTerritorialUnit() {
        return territorialUnit;
    }

    /** 
     * Set the 'TerritorialUnit' element value. Наименование административно-территориальной единицы
     * 
     * @param territorialUnit
     */
    public void setTerritorialUnit(String territorialUnit) {
        this.territorialUnit = territorialUnit;
    }

    /** 
     * Get the 'BlankSeries' element value. Серия бланка
     * 
     * @return value
     */
    public String getBlankSeries() {
        return blankSeries;
    }

    /** 
     * Set the 'BlankSeries' element value. Серия бланка
     * 
     * @param blankSeries
     */
    public void setBlankSeries(String blankSeries) {
        this.blankSeries = blankSeries;
    }

    /** 
     * Get the 'BlankTypographNum' element value. Типографский номер бланка (без лидирующих нулей)
     * 
     * @return value
     */
    public String getBlankTypographNum() {
        return blankTypographNum;
    }

    /** 
     * Set the 'BlankTypographNum' element value. Типографский номер бланка (без лидирующих нулей)
     * 
     * @param blankTypographNum
     */
    public void setBlankTypographNum(String blankTypographNum) {
        this.blankTypographNum = blankTypographNum;
    }

    /** 
     * Get the 'CertificateNumber' element value. Номер свидетельства о государственной регистрации
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер свидетельства о государственной регистрации
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Get the 'CertDate' element value. Дата выдачи свидетельства
     * 
     * @return value
     */
    public LocalDate getCertDate() {
        return certDate;
    }

    /** 
     * Set the 'CertDate' element value. Дата выдачи свидетельства
     * 
     * @param certDate
     */
    public void setCertDate(LocalDate certDate) {
        this.certDate = certDate;
    }

    /** 
     * Get the 'CertStatus' element value. Статус документа: 1 - подписан и действует; 2 - приостановлен; 3 - аннулирован / отозван; 4 - удален из-за технической ошибки при оформлении; 5 - удален в связи с переоформлением
     * 
     * @return value
     */
    public String getCertStatus() {
        return certStatus;
    }

    /** 
     * Set the 'CertStatus' element value. Статус документа: 1 - подписан и действует; 2 - приостановлен; 3 - аннулирован / отозван; 4 - удален из-за технической ошибки при оформлении; 5 - удален в связи с переоформлением
     * 
     * @param certStatus
     */
    public void setCertStatus(String certStatus) {
        this.certStatus = certStatus;
    }

    /** 
     * Get the 'BlankTypeID' element value. Идентификатор типа бланка
     * 
     * @return value
     */
    public String getBlankTypeID() {
        return blankTypeID;
    }

    /** 
     * Set the 'BlankTypeID' element value. Идентификатор типа бланка
     * 
     * @param blankTypeID
     */
    public void setBlankTypeID(String blankTypeID) {
        this.blankTypeID = blankTypeID;
    }

    /** 
     * Get the 'Goods' element value. Сведения о  продукции
     * 
     * @return value
     */
    public GoodsType getGoods() {
        return goods;
    }

    /** 
     * Set the 'Goods' element value. Сведения о  продукции
     * 
     * @param goods
     */
    public void setGoods(GoodsType goods) {
        this.goods = goods;
    }

    /** 
     * Get the 'ManufacturerInf' element value. Информация об изготовителе/индивидуальном предпринимателе
     * 
     * @return value
     */
    public ManufacturerType getManufacturerInf() {
        return manufacturerInf;
    }

    /** 
     * Set the 'ManufacturerInf' element value. Информация об изготовителе/индивидуальном предпринимателе
     * 
     * @param manufacturerInf
     */
    public void setManufacturerInf(ManufacturerType manufacturerInf) {
        this.manufacturerInf = manufacturerInf;
    }

    /** 
     * Get the 'GoodsRecipient' element value. Информация о получателе товаров
     * 
     * @return value
     */
    public CUOrganizationType getGoodsRecipient() {
        return goodsRecipient;
    }

    /** 
     * Set the 'GoodsRecipient' element value. Информация о получателе товаров
     * 
     * @param goodsRecipient
     */
    public void setGoodsRecipient(CUOrganizationType goodsRecipient) {
        this.goodsRecipient = goodsRecipient;
    }

    /** 
     * Get the list of 'TestingOrg' element items. Сведения об организации, проводившей исследование продукции
     * 
     * @return list
     */
    public List<OrganizationBaseType> getTestingOrgList() {
        return testingOrgList;
    }

    /** 
     * Set the list of 'TestingOrg' element items. Сведения об организации, проводившей исследование продукции
     * 
     * @param list
     */
    public void setTestingOrgList(List<OrganizationBaseType> list) {
        testingOrgList = list;
    }

    /** 
     * Get the 'AutorizedPerson' element value. Лицо, выдавшее свидетельство
     * 
     * @return value
     */
    public PersonBaseType getAutorizedPerson() {
        return autorizedPerson;
    }

    /** 
     * Set the 'AutorizedPerson' element value. Лицо, выдавшее свидетельство
     * 
     * @param autorizedPerson
     */
    public void setAutorizedPerson(PersonBaseType autorizedPerson) {
        this.autorizedPerson = autorizedPerson;
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
