
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Представленные документы. Гр. 44
 */
public class CUESADPresentedDocumentsType extends DocumentBaseType
{
    private String customsCode;
    private String presentedDocumentModeCode;
    private LocalDate documentBeginActionsDate;
    private LocalDate documentEndActionsDate;
    private LocalDate presentingLackingDate;
    private String temporaryImportCode;
    private LocalDate temporaryStorageImportDate;
    private String customsPaymentModeCodeType;
    private String supplyStatus;
    private String countryCode;
    private String specialSimplifiedCode;
    private String totalDocuments;
    private String preferenciiCountryCode;
    private String preferenciiDocID;
    private String processingGoodsCost;
    private LicenseGoodsType licenseGoods;

    /** 
     * Get the 'CustomsCode' element value. Код таможенного органа, зарегистрировавшего документ
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. Код таможенного органа, зарегистрировавшего документ
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'DocumentBeginActionsDate' element value. Дата начала действия документа
     * 
     * @return value
     */
    public LocalDate getDocumentBeginActionsDate() {
        return documentBeginActionsDate;
    }

    /** 
     * Set the 'DocumentBeginActionsDate' element value. Дата начала действия документа
     * 
     * @param documentBeginActionsDate
     */
    public void setDocumentBeginActionsDate(LocalDate documentBeginActionsDate) {
        this.documentBeginActionsDate = documentBeginActionsDate;
    }

    /** 
     * Get the 'DocumentEndActionsDate' element value. Дата окончания действия документа
     * 
     * @return value
     */
    public LocalDate getDocumentEndActionsDate() {
        return documentEndActionsDate;
    }

    /** 
     * Set the 'DocumentEndActionsDate' element value. Дата окончания действия документа
     * 
     * @param documentEndActionsDate
     */
    public void setDocumentEndActionsDate(LocalDate documentEndActionsDate) {
        this.documentEndActionsDate = documentEndActionsDate;
    }

    /** 
     * Get the 'PresentingLackingDate' element value. Дата представления недостающего документа
     * 
     * @return value
     */
    public LocalDate getPresentingLackingDate() {
        return presentingLackingDate;
    }

    /** 
     * Set the 'PresentingLackingDate' element value. Дата представления недостающего документа
     * 
     * @param presentingLackingDate
     */
    public void setPresentingLackingDate(LocalDate presentingLackingDate) {
        this.presentingLackingDate = presentingLackingDate;
    }

    /** 
     * Get the 'TemporaryImportCode' element value. Код срока временного ввоза. 1- если срок временного ввоз/вывоза менее 1 года, 2- если срок временного ввоз/вывоза более 1 года
     * 
     * @return value
     */
    public String getTemporaryImportCode() {
        return temporaryImportCode;
    }

    /** 
     * Set the 'TemporaryImportCode' element value. Код срока временного ввоза. 1- если срок временного ввоз/вывоза менее 1 года, 2- если срок временного ввоз/вывоза более 1 года
     * 
     * @param temporaryImportCode
     */
    public void setTemporaryImportCode(String temporaryImportCode) {
        this.temporaryImportCode = temporaryImportCode;
    }

    /** 
     * Get the 'TemporaryStorageImportDate' element value. Заявляемый срок временного ввоза/вывоза./Срок хранения товаров/Запрашиваемый срок переработки
     * 
     * @return value
     */
    public LocalDate getTemporaryStorageImportDate() {
        return temporaryStorageImportDate;
    }

    /** 
     * Set the 'TemporaryStorageImportDate' element value. Заявляемый срок временного ввоза/вывоза./Срок хранения товаров/Запрашиваемый срок переработки
     * 
     * @param temporaryStorageImportDate
     */
    public void setTemporaryStorageImportDate(
            LocalDate temporaryStorageImportDate) {
        this.temporaryStorageImportDate = temporaryStorageImportDate;
    }

    /** 
     * Get the 'CustomsPaymentModeCodeType' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @return value
     */
    public String getCustomsPaymentModeCodeType() {
        return customsPaymentModeCodeType;
    }

    /** 
     * Set the 'CustomsPaymentModeCodeType' element value. Код вида таможенного платежа по классификатору видов налогов, сборов и иных платежей, взимание которых возложено на таможенные органы
     * 
     * @param customsPaymentModeCodeType
     */
    public void setCustomsPaymentModeCodeType(String customsPaymentModeCodeType) {
        this.customsPaymentModeCodeType = customsPaymentModeCodeType;
    }

    /** 
     * Get the 'SupplyStatus' element value. 11 - ОПЕРЕЖАЮЩАЯ ПОСТАВКА. Заполняется если продукты переработки ввозятся раньше, чем осуществлен вывоз товаров на переработку вне таможенной территории. В остальных случаях не заполняется
     * 
     * @return value
     */
    public String getSupplyStatus() {
        return supplyStatus;
    }

    /** 
     * Set the 'SupplyStatus' element value. 11 - ОПЕРЕЖАЮЩАЯ ПОСТАВКА. Заполняется если продукты переработки ввозятся раньше, чем осуществлен вывоз товаров на переработку вне таможенной территории. В остальных случаях не заполняется
     * 
     * @param supplyStatus
     */
    public void setSupplyStatus(String supplyStatus) {
        this.supplyStatus = supplyStatus;
    }

    /** 
     * Get the 'CountryCode' element value. Код страны в соответствии с классификатором стран мира, в которой выдан сертификат
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Код страны в соответствии с классификатором стран мира, в которой выдан сертификат
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'SpecialSimplifiedCode' element value. Код вида специальных упрощений в соответствии с классификатором видов специальных упрощений
     * 
     * @return value
     */
    public String getSpecialSimplifiedCode() {
        return specialSimplifiedCode;
    }

    /** 
     * Set the 'SpecialSimplifiedCode' element value. Код вида специальных упрощений в соответствии с классификатором видов специальных упрощений
     * 
     * @param specialSimplifiedCode
     */
    public void setSpecialSimplifiedCode(String specialSimplifiedCode) {
        this.specialSimplifiedCode = specialSimplifiedCode;
    }

    /** 
     * Get the 'TotalDocuments' element value. Общее количество документов (ПС, контрактов) для РФ
     * 
     * @return value
     */
    public String getTotalDocuments() {
        return totalDocuments;
    }

    /** 
     * Set the 'TotalDocuments' element value. Общее количество документов (ПС, контрактов) для РФ
     * 
     * @param totalDocuments
     */
    public void setTotalDocuments(String totalDocuments) {
        this.totalDocuments = totalDocuments;
    }

    /** 
     * Get the 'PreferenciiCountryCode' element value. Код страны классификации документов, подтверждающих наличие льгот или особенностей по уплате таможенных платежей. Для РБ
     * 
     * @return value
     */
    public String getPreferenciiCountryCode() {
        return preferenciiCountryCode;
    }

    /** 
     * Set the 'PreferenciiCountryCode' element value. Код страны классификации документов, подтверждающих наличие льгот или особенностей по уплате таможенных платежей. Для РБ
     * 
     * @param preferenciiCountryCode
     */
    public void setPreferenciiCountryCode(String preferenciiCountryCode) {
        this.preferenciiCountryCode = preferenciiCountryCode;
    }

    /** 
     * Get the 'PreferenciiDocID' element value. Идентификатор документа, по национальному классификатору документов, необходимых для декларирования товаров в соответствии с классификатором кодов дополнительной информации о документах. Для РБ
     * 
     * @return value
     */
    public String getPreferenciiDocID() {
        return preferenciiDocID;
    }

    /** 
     * Set the 'PreferenciiDocID' element value. Идентификатор документа, по национальному классификатору документов, необходимых для декларирования товаров в соответствии с классификатором кодов дополнительной информации о документах. Для РБ
     * 
     * @param preferenciiDocID
     */
    public void setPreferenciiDocID(String preferenciiDocID) {
        this.preferenciiDocID = preferenciiDocID;
    }

    /** 
     * Get the 'ProcessingGoodsCost' element value. Стоимость операций по переработке товаров, помещенных под таможенную процедуру переработки товаров вне таможенной территории
     * 
     * @return value
     */
    public String getProcessingGoodsCost() {
        return processingGoodsCost;
    }

    /** 
     * Set the 'ProcessingGoodsCost' element value. Стоимость операций по переработке товаров, помещенных под таможенную процедуру переработки товаров вне таможенной территории
     * 
     * @param processingGoodsCost
     */
    public void setProcessingGoodsCost(String processingGoodsCost) {
        this.processingGoodsCost = processingGoodsCost;
    }

    /** 
     * Get the 'LicenseGoods' element value. Сведения о декларируемом товаре по лицензии
     * 
     * @return value
     */
    public LicenseGoodsType getLicenseGoods() {
        return licenseGoods;
    }

    /** 
     * Set the 'LicenseGoods' element value. Сведения о декларируемом товаре по лицензии
     * 
     * @param licenseGoods
     */
    public void setLicenseGoods(LicenseGoodsType licenseGoods) {
        this.licenseGoods = licenseGoods;
    }
}
