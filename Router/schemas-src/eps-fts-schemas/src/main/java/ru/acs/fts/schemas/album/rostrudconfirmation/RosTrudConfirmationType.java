
package ru.acs.fts.schemas.album.rostrudconfirmation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Подтверждение Федеральной службы по труду и занятости  целевого назначения материалов и предметов для слепых и других лиц с физическими или умственными недостатками, ввозимых на территорию РФ
 */
public class RosTrudConfirmationType extends BaseDocType
{
    private List<String> agreementParagraphList = new ArrayList<String>();
    private DocumentBaseType confirmationInfo;
    private CUOrganizationType importer;
    private ContractType contract;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private CustomsType customs;
    private PersonSignatureType authorizedPerson;
    private String documentModeID;

    /** 
     * Get the list of 'AgreementParagraph' element items. Пункт приложения к Соглашению или приложения к Протоколу
     * 
     * @return list
     */
    public List<String> getAgreementParagraphList() {
        return agreementParagraphList;
    }

    /** 
     * Set the list of 'AgreementParagraph' element items. Пункт приложения к Соглашению или приложения к Протоколу
     * 
     * @param list
     */
    public void setAgreementParagraphList(List<String> list) {
        agreementParagraphList = list;
    }

    /** 
     * Get the 'ConfirmationInfo' element value. Сведения о подтверждении
     * 
     * @return value
     */
    public DocumentBaseType getConfirmationInfo() {
        return confirmationInfo;
    }

    /** 
     * Set the 'ConfirmationInfo' element value. Сведения о подтверждении
     * 
     * @param confirmationInfo
     */
    public void setConfirmationInfo(DocumentBaseType confirmationInfo) {
        this.confirmationInfo = confirmationInfo;
    }

    /** 
     * Get the 'Importer' element value. Сведения об импортере
     * 
     * @return value
     */
    public CUOrganizationType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. Сведения об импортере
     * 
     * @param importer
     */
    public void setImporter(CUOrganizationType importer) {
        this.importer = importer;
    }

    /** 
     * Get the 'Contract' element value. Сведения о контракте
     * 
     * @return value
     */
    public ContractType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Сведения о контракте
     * 
     * @param contract
     */
    public void setContract(ContractType contract) {
        this.contract = contract;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товаре
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товаре
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Уполномоченное лицо
     * 
     * @return value
     */
    public PersonSignatureType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Уполномоченное лицо
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonSignatureType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
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
