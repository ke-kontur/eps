
package ru.acs.fts.schemas.album.detailquotadatard;

import org.joda.time.LocalDate;

/** 
 * �������� � �������� ���������
 */
public class PaperCarrierType
{
    private String formNumber;
    private String formSeries;
    private LocalDate formPrintDate;

    /** 
     * Get the 'FormNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. ����� ������
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'FormSeries' element value. ����� ������
     * 
     * @return value
     */
    public String getFormSeries() {
        return formSeries;
    }

    /** 
     * Set the 'FormSeries' element value. ����� ������
     * 
     * @param formSeries
     */
    public void setFormSeries(String formSeries) {
        this.formSeries = formSeries;
    }

    /** 
     * Get the 'FormPrintDate' element value. ���� ������ �����
     * 
     * @return value
     */
    public LocalDate getFormPrintDate() {
        return formPrintDate;
    }

    /** 
     * Set the 'FormPrintDate' element value. ���� ������ �����
     * 
     * @param formPrintDate
     */
    public void setFormPrintDate(LocalDate formPrintDate) {
        this.formPrintDate = formPrintDate;
    }
}
