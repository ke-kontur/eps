
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �������������� ���������. ��. 44. �.1 - 7.0, �.10 ������������.
 */
public class ESADBasicPresentedDocumentType extends PresentedDocumentType
{
    private String presentedDocumentModeCode;
    private String actNumber;
    private LocalDate actDate;
    private String temporaryImportCode;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. ��� ���� ��������������� ���������. ����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'ActNumber' element value. ����� ���� � ����������� ����������� ������� ���������� �������
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. ����� ���� � ����������� ����������� ������� ���������� �������
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the 'ActDate' element value. ���� ���� � ����������� ����������� ������� ���������� ������� / ���� ������������ ������
     * 
     * @return value
     */
    public LocalDate getActDate() {
        return actDate;
    }

    /** 
     * Set the 'ActDate' element value. ���� ���� � ����������� ����������� ������� ���������� ������� / ���� ������������ ������
     * 
     * @param actDate
     */
    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    /** 
     * Get the 'TemporaryImportCode' element value. ��� ����� ���������� �����. 1- ���� ���� ���������� ����/������ ����� 1 ����, 2- ���� ���� ���������� ����/������ ����� 1 ����.
     * 
     * @return value
     */
    public String getTemporaryImportCode() {
        return temporaryImportCode;
    }

    /** 
     * Set the 'TemporaryImportCode' element value. ��� ����� ���������� �����. 1- ���� ���� ���������� ����/������ ����� 1 ����, 2- ���� ���� ���������� ����/������ ����� 1 ����.
     * 
     * @param temporaryImportCode
     */
    public void setTemporaryImportCode(String temporaryImportCode) {
        this.temporaryImportCode = temporaryImportCode;
    }
}
