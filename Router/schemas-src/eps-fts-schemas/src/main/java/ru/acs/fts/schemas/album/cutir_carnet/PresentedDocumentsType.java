
package ru.acs.fts.schemas.album.cutir_carnet;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������� ���������
 */
public class PresentedDocumentsType extends DocumentBaseType
{
    private String customsCode;
    private String presentedDocumentModeCode;
    private LocalDate documentBeginActionsDate;
    private LocalDate documentEndActionsDate;
    private String countryCode;

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
}
