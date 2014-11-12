
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Краткие сведения по юр. лицу/Сведения об учете организации в налоговом органе по месту нахождения ее обособленного подразделения/Выписка о юр. лице
 */
public class LegalEntityInfoType extends BaseDocType
{
    private String docSign;
    private String resultCode;
    private LocalDate formDate;
    private BaseDetailsType baseDetails;
    private List<AuthorizedOrgType> authorizedOrgList = new ArrayList<AuthorizedOrgType>();
    private RegInfoType taxRegInfo;
    private RegInfoType pensionServiceReg;
    private RegInfoType insuranceServiceReg;
    private List<LicenseType> licenseList = new ArrayList<LicenseType>();
    private List<RecordDescriptionType> recordDescriptionList = new ArrayList<RecordDescriptionType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Признак документа: 1 - Краткие сведения по юр. лицу; 2 - Сведения об учете организации в налоговом органе по месту нахождения ее обособленного подразделения; 3 - выписка о юр. лице
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 1 - Краткие сведения по юр. лицу; 2 - Сведения об учете организации в налоговом органе по месту нахождения ее обособленного подразделения; 3 - выписка о юр. лице
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'ResultCode' element value. Код обработки
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. Код обработки
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the 'FormDate' element value. Дата формирования сведений из ЕГРЮЛ в отношении юридического лица
     * 
     * @return value
     */
    public LocalDate getFormDate() {
        return formDate;
    }

    /** 
     * Set the 'FormDate' element value. Дата формирования сведений из ЕГРЮЛ в отношении юридического лица
     * 
     * @param formDate
     */
    public void setFormDate(LocalDate formDate) {
        this.formDate = formDate;
    }

    /** 
     * Get the 'BaseDetails' element value. Сведения о  юридическом лице
     * 
     * @return value
     */
    public BaseDetailsType getBaseDetails() {
        return baseDetails;
    }

    /** 
     * Set the 'BaseDetails' element value. Сведения о  юридическом лице
     * 
     * @param baseDetails
     */
    public void setBaseDetails(BaseDetailsType baseDetails) {
        this.baseDetails = baseDetails;
    }

    /** 
     * Get the list of 'AuthorizedOrg' element items. Сведения о лице, имеющем право без доверенности действовать от имени юридического лица
     * 
     * @return list
     */
    public List<AuthorizedOrgType> getAuthorizedOrgList() {
        return authorizedOrgList;
    }

    /** 
     * Set the list of 'AuthorizedOrg' element items. Сведения о лице, имеющем право без доверенности действовать от имени юридического лица
     * 
     * @param list
     */
    public void setAuthorizedOrgList(List<AuthorizedOrgType> list) {
        authorizedOrgList = list;
    }

    /** 
     * Get the 'TaxRegInfo' element value. Сведения об учете в налоговом органе
     * 
     * @return value
     */
    public RegInfoType getTaxRegInfo() {
        return taxRegInfo;
    }

    /** 
     * Set the 'TaxRegInfo' element value. Сведения об учете в налоговом органе
     * 
     * @param taxRegInfo
     */
    public void setTaxRegInfo(RegInfoType taxRegInfo) {
        this.taxRegInfo = taxRegInfo;
    }

    /** 
     * Get the 'PensionServiceReg' element value. Сведения о регистрации юридического лица в качестве страхователя в территориальном органе Пенсионного фонда РФ
     * 
     * @return value
     */
    public RegInfoType getPensionServiceReg() {
        return pensionServiceReg;
    }

    /** 
     * Set the 'PensionServiceReg' element value. Сведения о регистрации юридического лица в качестве страхователя в территориальном органе Пенсионного фонда РФ
     * 
     * @param pensionServiceReg
     */
    public void setPensionServiceReg(RegInfoType pensionServiceReg) {
        this.pensionServiceReg = pensionServiceReg;
    }

    /** 
     * Get the 'InsuranceServiceReg' element value. Сведения о регистрации юридического лица в качестве страхователя в исполнительном органе Фонда социального страхования РФ
     * 
     * @return value
     */
    public RegInfoType getInsuranceServiceReg() {
        return insuranceServiceReg;
    }

    /** 
     * Set the 'InsuranceServiceReg' element value. Сведения о регистрации юридического лица в качестве страхователя в исполнительном органе Фонда социального страхования РФ
     * 
     * @param insuranceServiceReg
     */
    public void setInsuranceServiceReg(RegInfoType insuranceServiceReg) {
        this.insuranceServiceReg = insuranceServiceReg;
    }

    /** 
     * Get the list of 'License' element items. Сведения о лицензии
     * 
     * @return list
     */
    public List<LicenseType> getLicenseList() {
        return licenseList;
    }

    /** 
     * Set the list of 'License' element items. Сведения о лицензии
     * 
     * @param list
     */
    public void setLicenseList(List<LicenseType> list) {
        licenseList = list;
    }

    /** 
     * Get the list of 'RecordDescription' element items. Сведения о записях, внесенных в ЕГРЮЛ
     * 
     * @return list
     */
    public List<RecordDescriptionType> getRecordDescriptionList() {
        return recordDescriptionList;
    }

    /** 
     * Set the list of 'RecordDescription' element items. Сведения о записях, внесенных в ЕГРЮЛ
     * 
     * @param list
     */
    public void setRecordDescriptionList(List<RecordDescriptionType> list) {
        recordDescriptionList = list;
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
