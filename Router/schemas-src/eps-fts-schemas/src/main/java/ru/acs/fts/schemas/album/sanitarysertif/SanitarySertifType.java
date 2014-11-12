
package ru.acs.fts.schemas.album.sanitarysertif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * Санитарно-эпидемиологическое заключение (гигиенический сертификат)
 */
public class SanitarySertifType extends BaseDocType
{
    private String sertifNumber;
    private LocalDate beginDate;
    private LocalDate endDate;
    private String formNumber;
    private String typeOfSetif;
    private SertifOrganizationType sertifOrganization;
    private SertifOrgBaseType normDocsOrganization;
    private List<SertifOrgBaseType> manufacturerInfList = new ArrayList<SertifOrgBaseType>();
    private SertifOrgBaseType sertifRecipient;
    private GoodsType goods;
    private PersonSignatureType documentSignature;
    private List<DocumentBaseType> contractList = new ArrayList<DocumentBaseType>();
    private SertifSupplementType sertifSupplement;
    private String documentModeID;

    /** 
     * Get the 'SertifNumber' element value. Номер сертификата
     * 
     * @return value
     */
    public String getSertifNumber() {
        return sertifNumber;
    }

    /** 
     * Set the 'SertifNumber' element value. Номер сертификата
     * 
     * @param sertifNumber
     */
    public void setSertifNumber(String sertifNumber) {
        this.sertifNumber = sertifNumber;
    }

    /** 
     * Get the 'BeginDate' element value. Дата начала действия сертификата (совпадает с датой регистрации документа)
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала действия сертификата (совпадает с датой регистрации документа)
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата окончания действия сертификата (необязателен при сертификации партии)
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата окончания действия сертификата (необязателен при сертификации партии)
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'FormNumber' element value. Номер бланка сертификата
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. Номер бланка сертификата
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'TypeOfSetif' element value. Признак вида заключения: 1 - санитарно-эпидемиологическое заключение, иначе - гигиеническое
     * 
     * @return value
     */
    public String getTypeOfSetif() {
        return typeOfSetif;
    }

    /** 
     * Set the 'TypeOfSetif' element value. Признак вида заключения: 1 - санитарно-эпидемиологическое заключение, иначе - гигиеническое
     * 
     * @param typeOfSetif
     */
    public void setTypeOfSetif(String typeOfSetif) {
        this.typeOfSetif = typeOfSetif;
    }

    /** 
     * Get the 'SertifOrganization' element value. Сведения об органе сертификации
     * 
     * @return value
     */
    public SertifOrganizationType getSertifOrganization() {
        return sertifOrganization;
    }

    /** 
     * Set the 'SertifOrganization' element value. Сведения об органе сертификации
     * 
     * @param sertifOrganization
     */
    public void setSertifOrganization(SertifOrganizationType sertifOrganization) {
        this.sertifOrganization = sertifOrganization;
    }

    /** 
     * Get the 'NormDocsOrganization' element value. Информация об организации - разработчике нормативной документации
     * 
     * @return value
     */
    public SertifOrgBaseType getNormDocsOrganization() {
        return normDocsOrganization;
    }

    /** 
     * Set the 'NormDocsOrganization' element value. Информация об организации - разработчике нормативной документации
     * 
     * @param normDocsOrganization
     */
    public void setNormDocsOrganization(SertifOrgBaseType normDocsOrganization) {
        this.normDocsOrganization = normDocsOrganization;
    }

    /** 
     * Get the list of 'ManufacturerInf' element items. Информация об изготовителе/индивидуальном предпринимателе
     * 
     * @return list
     */
    public List<SertifOrgBaseType> getManufacturerInfList() {
        return manufacturerInfList;
    }

    /** 
     * Set the list of 'ManufacturerInf' element items. Информация об изготовителе/индивидуальном предпринимателе
     * 
     * @param list
     */
    public void setManufacturerInfList(List<SertifOrgBaseType> list) {
        manufacturerInfList = list;
    }

    /** 
     * Get the 'SertifRecipient' element value. Информация о лице, которому выдан сертификат 
     * 
     * @return value
     */
    public SertifOrgBaseType getSertifRecipient() {
        return sertifRecipient;
    }

    /** 
     * Set the 'SertifRecipient' element value. Информация о лице, которому выдан сертификат 
     * 
     * @param sertifRecipient
     */
    public void setSertifRecipient(SertifOrgBaseType sertifRecipient) {
        this.sertifRecipient = sertifRecipient;
    }

    /** 
     * Get the 'Goods' element value. Сведения о продукции
     * 
     * @return value
     */
    public GoodsType getGoods() {
        return goods;
    }

    /** 
     * Set the 'Goods' element value. Сведения о продукции
     * 
     * @param goods
     */
    public void setGoods(GoodsType goods) {
        this.goods = goods;
    }

    /** 
     * Get the 'DocumentSignature' element value. Подпись руководителя
     * 
     * @return value
     */
    public PersonSignatureType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. Подпись руководителя
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonSignatureType documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the list of 'Contract' element items. Номер и дата контракта
     * 
     * @return list
     */
    public List<DocumentBaseType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. Номер и дата контракта
     * 
     * @param list
     */
    public void setContractList(List<DocumentBaseType> list) {
        contractList = list;
    }

    /** 
     * Get the 'SertifSupplement' element value. Приложение к санитарно-эпидемиологическому заключению / кроме описания заводов изготовителей
     * 
     * @return value
     */
    public SertifSupplementType getSertifSupplement() {
        return sertifSupplement;
    }

    /** 
     * Set the 'SertifSupplement' element value. Приложение к санитарно-эпидемиологическому заключению / кроме описания заводов изготовителей
     * 
     * @param sertifSupplement
     */
    public void setSertifSupplement(SertifSupplementType sertifSupplement) {
        this.sertifSupplement = sertifSupplement;
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
