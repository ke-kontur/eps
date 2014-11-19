
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * ������� ����� ��� �������� ����������. ������������, �����, ����
 */
public class DocumentBaseType
{
    private String prDocumentName;
    private String prDocumentNumber;
    private LocalDate prDocumentDate;

    /** 
     * Get the 'PrDocumentName' element value. ������������ ���������
     * 
     * @return value
     */
    public String getPrDocumentName() {
        return prDocumentName;
    }

    /** 
     * Set the 'PrDocumentName' element value. ������������ ���������
     * 
     * @param prDocumentName
     */
    public void setPrDocumentName(String prDocumentName) {
        this.prDocumentName = prDocumentName;
    }

    /** 
     * Get the 'PrDocumentNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getPrDocumentNumber() {
        return prDocumentNumber;
    }

    /** 
     * Set the 'PrDocumentNumber' element value. ����� ���������
     * 
     * @param prDocumentNumber
     */
    public void setPrDocumentNumber(String prDocumentNumber) {
        this.prDocumentNumber = prDocumentNumber;
    }

    /** 
     * Get the 'PrDocumentDate' element value. ���� ���������
     * 
     * @return value
     */
    public LocalDate getPrDocumentDate() {
        return prDocumentDate;
    }

    /** 
     * Set the 'PrDocumentDate' element value. ���� ���������
     * 
     * @param prDocumentDate
     */
    public void setPrDocumentDate(LocalDate prDocumentDate) {
        this.prDocumentDate = prDocumentDate;
    }
}
