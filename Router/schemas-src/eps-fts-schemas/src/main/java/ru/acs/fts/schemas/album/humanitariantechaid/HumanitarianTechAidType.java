
package ru.acs.fts.schemas.album.humanitariantechaid;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.DocumentType;

/** 
 * Удостоверение о признании средств, товаров, работ и услуг гуманитарной помощью/технической помощью (содействием)
 */
public class HumanitarianTechAidType extends BaseDocType
{
    private String docSign;
    private String donor;
    private String countryName;
    private String sum;
    private String aidProjectReestrInfo;
    private DocumentType confirmationInfo;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private CUOrganizationType recipient;
    private CUOrganizationType supplier;
    private DocumentBaseType contract;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Удостоверение о признании средств, товаров, работ и услуг : 0 - гуманитарной помощью; 1 - технической помощью (содействием)
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Удостоверение о признании средств, товаров, работ и услуг : 0 - гуманитарной помощью; 1 - технической помощью (содействием)
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Donor' element value. Донор
     * 
     * @return value
     */
    public String getDonor() {
        return donor;
    }

    /** 
     * Set the 'Donor' element value. Донор
     * 
     * @param donor
     */
    public void setDonor(String donor) {
        this.donor = donor;
    }

    /** 
     * Get the 'CountryName' element value. Страна
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Страна
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'Sum' element value. Сумма удостоверения о признании средств, товаров, работ и услуг технической помощью (содействием)
     * 
     * @return value
     */
    public String getSum() {
        return sum;
    }

    /** 
     * Set the 'Sum' element value. Сумма удостоверения о признании средств, товаров, работ и услуг технической помощью (содействием)
     * 
     * @param sum
     */
    public void setSum(String sum) {
        this.sum = sum;
    }

    /** 
     * Get the 'AidProjectReestrInfo' element value. Регистрационный номер, наименование проекта/программы
     * 
     * @return value
     */
    public String getAidProjectReestrInfo() {
        return aidProjectReestrInfo;
    }

    /** 
     * Set the 'AidProjectReestrInfo' element value. Регистрационный номер, наименование проекта/программы
     * 
     * @param aidProjectReestrInfo
     */
    public void setAidProjectReestrInfo(String aidProjectReestrInfo) {
        this.aidProjectReestrInfo = aidProjectReestrInfo;
    }

    /** 
     * Get the 'ConfirmationInfo' element value. Сведения об удостоверении
     * 
     * @return value
     */
    public DocumentType getConfirmationInfo() {
        return confirmationInfo;
    }

    /** 
     * Set the 'ConfirmationInfo' element value. Сведения об удостоверении
     * 
     * @param confirmationInfo
     */
    public void setConfirmationInfo(DocumentType confirmationInfo) {
        this.confirmationInfo = confirmationInfo;
    }

    /** 
     * Get the list of 'Goods' element items. Сведения о товарах/работах/услугах
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Сведения о товарах/работах/услугах
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'Recipient' element value. Получатель
     * 
     * @return value
     */
    public CUOrganizationType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. Получатель
     * 
     * @param recipient
     */
    public void setRecipient(CUOrganizationType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'Supplier' element value. Поставщик
     * 
     * @return value
     */
    public CUOrganizationType getSupplier() {
        return supplier;
    }

    /** 
     * Set the 'Supplier' element value. Поставщик
     * 
     * @param supplier
     */
    public void setSupplier(CUOrganizationType supplier) {
        this.supplier = supplier;
    }

    /** 
     * Get the 'Contract' element value. Договор
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Договор
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
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
