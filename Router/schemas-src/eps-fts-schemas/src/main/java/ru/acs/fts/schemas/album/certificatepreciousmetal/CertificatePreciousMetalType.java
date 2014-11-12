
package ru.acs.fts.schemas.album.certificatepreciousmetal;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Сертификат химического состава на содержание драгметаллов
 */
public class CertificatePreciousMetalType extends BaseDocType
{
    private LocalDate issueDate;
    private String registrationNumber;
    private LocalDate expirationDate;
    private String namePreciousMetal;
    private String contentPercent;
    private String recalculatedContent;
    private OrganizationType declarantInfo;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private List<DocumentBaseType> experimentAccordanceDocumentList = new ArrayList<DocumentBaseType>();
    private LaboratoryType laboratory;
    private List<DocumentBaseType> testReportList = new ArrayList<DocumentBaseType>();
    private OrganizationType issueOrganization;
    private PersonSignatureType issuePersonSignature;
    private String documentModeID;

    /** 
     * Get the 'IssueDate' element value. Дата выдачи
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. Регистрационный номер
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'ExpirationDate' element value. Дата окончания действия сертификата
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. Дата окончания действия сертификата
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'NamePreciousMetal' element value. Наименование драгметалла
     * 
     * @return value
     */
    public String getNamePreciousMetal() {
        return namePreciousMetal;
    }

    /** 
     * Set the 'NamePreciousMetal' element value. Наименование драгметалла
     * 
     * @param namePreciousMetal
     */
    public void setNamePreciousMetal(String namePreciousMetal) {
        this.namePreciousMetal = namePreciousMetal;
    }

    /** 
     * Get the 'ContentPercent' element value. Содержание в % драгметалла
     * 
     * @return value
     */
    public String getContentPercent() {
        return contentPercent;
    }

    /** 
     * Set the 'ContentPercent' element value. Содержание в % драгметалла
     * 
     * @param contentPercent
     */
    public void setContentPercent(String contentPercent) {
        this.contentPercent = contentPercent;
    }

    /** 
     * Get the 'RecalculatedContent' element value. Содержание в граммах/тоннах драгметалла 
     * 
     * @return value
     */
    public String getRecalculatedContent() {
        return recalculatedContent;
    }

    /** 
     * Set the 'RecalculatedContent' element value. Содержание в граммах/тоннах драгметалла 
     * 
     * @param recalculatedContent
     */
    public void setRecalculatedContent(String recalculatedContent) {
        this.recalculatedContent = recalculatedContent;
    }

    /** 
     * Get the 'DeclarantInfo' element value. Сведения о заявителе
     * 
     * @return value
     */
    public OrganizationType getDeclarantInfo() {
        return declarantInfo;
    }

    /** 
     * Set the 'DeclarantInfo' element value. Сведения о заявителе
     * 
     * @param declarantInfo
     */
    public void setDeclarantInfo(OrganizationType declarantInfo) {
        this.declarantInfo = declarantInfo;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. Сведения о продукции
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Сведения о продукции
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the list of 'ExperimentAccordanceDocuments' element items. Испытан в соответствии с требованиями, установленными в документах
     * 
     * @return list
     */
    public List<DocumentBaseType> getExperimentAccordanceDocumentList() {
        return experimentAccordanceDocumentList;
    }

    /** 
     * Set the list of 'ExperimentAccordanceDocuments' element items. Испытан в соответствии с требованиями, установленными в документах
     * 
     * @param list
     */
    public void setExperimentAccordanceDocumentList(List<DocumentBaseType> list) {
        experimentAccordanceDocumentList = list;
    }

    /** 
     * Get the 'Laboratory' element value. Лаборатория
     * 
     * @return value
     */
    public LaboratoryType getLaboratory() {
        return laboratory;
    }

    /** 
     * Set the 'Laboratory' element value. Лаборатория
     * 
     * @param laboratory
     */
    public void setLaboratory(LaboratoryType laboratory) {
        this.laboratory = laboratory;
    }

    /** 
     * Get the list of 'TestReport' element items. Протокол испытаний
     * 
     * @return list
     */
    public List<DocumentBaseType> getTestReportList() {
        return testReportList;
    }

    /** 
     * Set the list of 'TestReport' element items. Протокол испытаний
     * 
     * @param list
     */
    public void setTestReportList(List<DocumentBaseType> list) {
        testReportList = list;
    }

    /** 
     * Get the 'IssueOrganization' element value. Организация, выдавшая сертификат химического состава на содержание драгметаллов
     * 
     * @return value
     */
    public OrganizationType getIssueOrganization() {
        return issueOrganization;
    }

    /** 
     * Set the 'IssueOrganization' element value. Организация, выдавшая сертификат химического состава на содержание драгметаллов
     * 
     * @param issueOrganization
     */
    public void setIssueOrganization(OrganizationType issueOrganization) {
        this.issueOrganization = issueOrganization;
    }

    /** 
     * Get the 'IssuePersonSignature' element value. Подпись руководителя организации, выдавшей сертификат
     * 
     * @return value
     */
    public PersonSignatureType getIssuePersonSignature() {
        return issuePersonSignature;
    }

    /** 
     * Set the 'IssuePersonSignature' element value. Подпись руководителя организации, выдавшей сертификат
     * 
     * @param issuePersonSignature
     */
    public void setIssuePersonSignature(PersonSignatureType issuePersonSignature) {
        this.issuePersonSignature = issuePersonSignature;
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
