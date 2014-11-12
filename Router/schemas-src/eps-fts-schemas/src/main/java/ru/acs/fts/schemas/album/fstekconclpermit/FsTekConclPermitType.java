
package ru.acs.fts.schemas.album.fstekconclpermit;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Сведения о разрешениях Комиссии по экспортному контролю РФ на временный вывоз из РФ контролируемых товаров и технологий/на осуществление внешнеэкономических операций/ о заключениях ФСТЭК России о применении мер нетарифного регулирования/ о заключениях организаций, получивших специальное разрешение на проведение независимой идентификационной экспертизы товаров и технологий в целях экспортного контроля
 */
public class FsTekConclPermitType extends BaseDocType
{
    private String BDRDID;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String destinationCountry;
    private LocalDate termReturns;
    private String conslusions;
    private AuthorizationType authorization;
    private DocumentBaseType contract;
    private PersonBaseType authorizedPerson;
    private CUOrganizationType releaseOrg;
    private CUOrganizationType consignee;
    private CUOrganizationType applicant;
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
     * Get the list of 'GoodsDescription' element items. Описание товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'DestinationCountry' element value. Страна назначения
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. Страна назначения
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'TermReturns' element value. Срок  возврата товара
     * 
     * @return value
     */
    public LocalDate getTermReturns() {
        return termReturns;
    }

    /** 
     * Set the 'TermReturns' element value. Срок  возврата товара
     * 
     * @param termReturns
     */
    public void setTermReturns(LocalDate termReturns) {
        this.termReturns = termReturns;
    }

    /** 
     * Get the 'Conslusions' element value. Выводы, содержащиеся в заключении
     * 
     * @return value
     */
    public String getConslusions() {
        return conslusions;
    }

    /** 
     * Set the 'Conslusions' element value. Выводы, содержащиеся в заключении
     * 
     * @param conslusions
     */
    public void setConslusions(String conslusions) {
        this.conslusions = conslusions;
    }

    /** 
     * Get the 'Authorization' element value. Разрешение/Заключение
     * 
     * @return value
     */
    public AuthorizationType getAuthorization() {
        return authorization;
    }

    /** 
     * Set the 'Authorization' element value. Разрешение/Заключение
     * 
     * @param authorization
     */
    public void setAuthorization(AuthorizationType authorization) {
        this.authorization = authorization;
    }

    /** 
     * Get the 'Contract' element value. Контракт
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Контракт
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Уполномоченное должностное лицо, подписавшее разрешение/заключение
     * 
     * @return value
     */
    public PersonBaseType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Уполномоченное должностное лицо, подписавшее разрешение/заключение
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonBaseType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'ReleaseOrg' element value. Наименование организации, выдавшей заключение
     * 
     * @return value
     */
    public CUOrganizationType getReleaseOrg() {
        return releaseOrg;
    }

    /** 
     * Set the 'ReleaseOrg' element value. Наименование организации, выдавшей заключение
     * 
     * @param releaseOrg
     */
    public void setReleaseOrg(CUOrganizationType releaseOrg) {
        this.releaseOrg = releaseOrg;
    }

    /** 
     * Get the 'Consignee' element value. Наименование иностранного получателя товара
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. Наименование иностранного получателя товара
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Applicant' element value. Заявитель
     * 
     * @return value
     */
    public CUOrganizationType getApplicant() {
        return applicant;
    }

    /** 
     * Set the 'Applicant' element value. Заявитель
     * 
     * @param applicant
     */
    public void setApplicant(CUOrganizationType applicant) {
        this.applicant = applicant;
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
