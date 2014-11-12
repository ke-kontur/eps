
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������� ���������. ��. 44
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
     * Get the 'CustomsCode' element value. ��� ����������� ������, ������������������� ��������
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, ������������������� ��������
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'DocumentBeginActionsDate' element value. ���� ������ �������� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentBeginActionsDate() {
        return documentBeginActionsDate;
    }

    /** 
     * Set the 'DocumentBeginActionsDate' element value. ���� ������ �������� ���������
     * 
     * @param documentBeginActionsDate
     */
    public void setDocumentBeginActionsDate(LocalDate documentBeginActionsDate) {
        this.documentBeginActionsDate = documentBeginActionsDate;
    }

    /** 
     * Get the 'DocumentEndActionsDate' element value. ���� ��������� �������� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentEndActionsDate() {
        return documentEndActionsDate;
    }

    /** 
     * Set the 'DocumentEndActionsDate' element value. ���� ��������� �������� ���������
     * 
     * @param documentEndActionsDate
     */
    public void setDocumentEndActionsDate(LocalDate documentEndActionsDate) {
        this.documentEndActionsDate = documentEndActionsDate;
    }

    /** 
     * Get the 'PresentingLackingDate' element value. ���� ������������� ������������ ���������
     * 
     * @return value
     */
    public LocalDate getPresentingLackingDate() {
        return presentingLackingDate;
    }

    /** 
     * Set the 'PresentingLackingDate' element value. ���� ������������� ������������ ���������
     * 
     * @param presentingLackingDate
     */
    public void setPresentingLackingDate(LocalDate presentingLackingDate) {
        this.presentingLackingDate = presentingLackingDate;
    }

    /** 
     * Get the 'TemporaryImportCode' element value. ��� ����� ���������� �����. 1- ���� ���� ���������� ����/������ ����� 1 ����, 2- ���� ���� ���������� ����/������ ����� 1 ����
     * 
     * @return value
     */
    public String getTemporaryImportCode() {
        return temporaryImportCode;
    }

    /** 
     * Set the 'TemporaryImportCode' element value. ��� ����� ���������� �����. 1- ���� ���� ���������� ����/������ ����� 1 ����, 2- ���� ���� ���������� ����/������ ����� 1 ����
     * 
     * @param temporaryImportCode
     */
    public void setTemporaryImportCode(String temporaryImportCode) {
        this.temporaryImportCode = temporaryImportCode;
    }

    /** 
     * Get the 'TemporaryStorageImportDate' element value. ���������� ���� ���������� �����/������./���� �������� �������/������������� ���� �����������
     * 
     * @return value
     */
    public LocalDate getTemporaryStorageImportDate() {
        return temporaryStorageImportDate;
    }

    /** 
     * Set the 'TemporaryStorageImportDate' element value. ���������� ���� ���������� �����/������./���� �������� �������/������������� ���� �����������
     * 
     * @param temporaryStorageImportDate
     */
    public void setTemporaryStorageImportDate(
            LocalDate temporaryStorageImportDate) {
        this.temporaryStorageImportDate = temporaryStorageImportDate;
    }

    /** 
     * Get the 'CustomsPaymentModeCodeType' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @return value
     */
    public String getCustomsPaymentModeCodeType() {
        return customsPaymentModeCodeType;
    }

    /** 
     * Set the 'CustomsPaymentModeCodeType' element value. ��� ���� ����������� ������� �� �������������� ����� �������, ������ � ���� ��������, �������� ������� ��������� �� ���������� ������
     * 
     * @param customsPaymentModeCodeType
     */
    public void setCustomsPaymentModeCodeType(String customsPaymentModeCodeType) {
        this.customsPaymentModeCodeType = customsPaymentModeCodeType;
    }

    /** 
     * Get the 'SupplyStatus' element value. 11 - ����������� ��������. ����������� ���� �������� ����������� �������� ������, ��� ����������� ����� ������� �� ����������� ��� ���������� ����������. � ��������� ������� �� �����������
     * 
     * @return value
     */
    public String getSupplyStatus() {
        return supplyStatus;
    }

    /** 
     * Set the 'SupplyStatus' element value. 11 - ����������� ��������. ����������� ���� �������� ����������� �������� ������, ��� ����������� ����� ������� �� ����������� ��� ���������� ����������. � ��������� ������� �� �����������
     * 
     * @param supplyStatus
     */
    public void setSupplyStatus(String supplyStatus) {
        this.supplyStatus = supplyStatus;
    }

    /** 
     * Get the 'CountryCode' element value. ��� ������ � ������������ � ��������������� ����� ����, � ������� ����� ����������
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ��� ������ � ������������ � ��������������� ����� ����, � ������� ����� ����������
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'SpecialSimplifiedCode' element value. ��� ���� ����������� ��������� � ������������ � ��������������� ����� ����������� ���������
     * 
     * @return value
     */
    public String getSpecialSimplifiedCode() {
        return specialSimplifiedCode;
    }

    /** 
     * Set the 'SpecialSimplifiedCode' element value. ��� ���� ����������� ��������� � ������������ � ��������������� ����� ����������� ���������
     * 
     * @param specialSimplifiedCode
     */
    public void setSpecialSimplifiedCode(String specialSimplifiedCode) {
        this.specialSimplifiedCode = specialSimplifiedCode;
    }

    /** 
     * Get the 'TotalDocuments' element value. ����� ���������� ���������� (��, ����������) ��� ��
     * 
     * @return value
     */
    public String getTotalDocuments() {
        return totalDocuments;
    }

    /** 
     * Set the 'TotalDocuments' element value. ����� ���������� ���������� (��, ����������) ��� ��
     * 
     * @param totalDocuments
     */
    public void setTotalDocuments(String totalDocuments) {
        this.totalDocuments = totalDocuments;
    }

    /** 
     * Get the 'PreferenciiCountryCode' element value. ��� ������ ������������� ����������, �������������� ������� ����� ��� ������������ �� ������ ���������� ��������. ��� ��
     * 
     * @return value
     */
    public String getPreferenciiCountryCode() {
        return preferenciiCountryCode;
    }

    /** 
     * Set the 'PreferenciiCountryCode' element value. ��� ������ ������������� ����������, �������������� ������� ����� ��� ������������ �� ������ ���������� ��������. ��� ��
     * 
     * @param preferenciiCountryCode
     */
    public void setPreferenciiCountryCode(String preferenciiCountryCode) {
        this.preferenciiCountryCode = preferenciiCountryCode;
    }

    /** 
     * Get the 'PreferenciiDocID' element value. ������������� ���������, �� ������������� �������������� ����������, ����������� ��� �������������� ������� � ������������ � ��������������� ����� �������������� ���������� � ����������. ��� ��
     * 
     * @return value
     */
    public String getPreferenciiDocID() {
        return preferenciiDocID;
    }

    /** 
     * Set the 'PreferenciiDocID' element value. ������������� ���������, �� ������������� �������������� ����������, ����������� ��� �������������� ������� � ������������ � ��������������� ����� �������������� ���������� � ����������. ��� ��
     * 
     * @param preferenciiDocID
     */
    public void setPreferenciiDocID(String preferenciiDocID) {
        this.preferenciiDocID = preferenciiDocID;
    }

    /** 
     * Get the 'ProcessingGoodsCost' element value. ��������� �������� �� ����������� �������, ���������� ��� ���������� ��������� ����������� ������� ��� ���������� ����������
     * 
     * @return value
     */
    public String getProcessingGoodsCost() {
        return processingGoodsCost;
    }

    /** 
     * Set the 'ProcessingGoodsCost' element value. ��������� �������� �� ����������� �������, ���������� ��� ���������� ��������� ����������� ������� ��� ���������� ����������
     * 
     * @param processingGoodsCost
     */
    public void setProcessingGoodsCost(String processingGoodsCost) {
        this.processingGoodsCost = processingGoodsCost;
    }

    /** 
     * Get the 'LicenseGoods' element value. �������� � ������������� ������ �� ��������
     * 
     * @return value
     */
    public LicenseGoodsType getLicenseGoods() {
        return licenseGoods;
    }

    /** 
     * Set the 'LicenseGoods' element value. �������� � ������������� ������ �� ��������
     * 
     * @param licenseGoods
     */
    public void setLicenseGoods(LicenseGoodsType licenseGoods) {
        this.licenseGoods = licenseGoods;
    }
}
