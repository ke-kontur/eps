
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ���������� ���������.
 */
public class FinancialDocumentsType
{
    private String finDocumentCode;
    private String finDocumentNumber;
    private LocalDate presentingDate;
    private ReExpFinDocumentType reExpFinDocument;
    private GTDIDType gtdRegNumber;

    /** 
     * Get the 'FinDocumentCode' element value. ��� ��������������� ���������. 1- ��; 2 - ���; 3 - �� .
     * 
     * @return value
     */
    public String getFinDocumentCode() {
        return finDocumentCode;
    }

    /** 
     * Set the 'FinDocumentCode' element value. ��� ��������������� ���������. 1- ��; 2 - ���; 3 - �� .
     * 
     * @param finDocumentCode
     */
    public void setFinDocumentCode(String finDocumentCode) {
        this.finDocumentCode = finDocumentCode;
    }

    /** 
     * Get the 'FinDocumentNumber' element value. ����� ��������������� ��/���.
     * 
     * @return value
     */
    public String getFinDocumentNumber() {
        return finDocumentNumber;
    }

    /** 
     * Set the 'FinDocumentNumber' element value. ����� ��������������� ��/���.
     * 
     * @param finDocumentNumber
     */
    public void setFinDocumentNumber(String finDocumentNumber) {
        this.finDocumentNumber = finDocumentNumber;
    }

    /** 
     * Get the 'PresentingDate' element value. ���� ������������� ������������ ��������� / ��������; ���� ������������� ����� ���������� ����������, ��������� ��� ������� 1.3 (���� ��� �� ����� ���� ������������ ������������ � ��) 
     * 
     * @return value
     */
    public LocalDate getPresentingDate() {
        return presentingDate;
    }

    /** 
     * Set the 'PresentingDate' element value. ���� ������������� ������������ ��������� / ��������; ���� ������������� ����� ���������� ����������, ��������� ��� ������� 1.3 (���� ��� �� ����� ���� ������������ ������������ � ��) 
     * 
     * @param presentingDate
     */
    public void setPresentingDate(LocalDate presentingDate) {
        this.presentingDate = presentingDate;
    }

    /** 
     * Get the 'ReExpFinDocument' element value. �������� � �������� ������ ��� ����� ������� � ������ ���������� ��� ���������������� ��������� ��� ������ ���������� �����
     * 
     * @return value
     */
    public ReExpFinDocumentType getReExpFinDocument() {
        return reExpFinDocument;
    }

    /** 
     * Set the 'ReExpFinDocument' element value. �������� � �������� ������ ��� ����� ������� � ������ ���������� ��� ���������������� ��������� ��� ������ ���������� �����
     * 
     * @param reExpFinDocument
     */
    public void setReExpFinDocument(ReExpFinDocumentType reExpFinDocument) {
        this.reExpFinDocument = reExpFinDocument;
    }

    /** 
     * Get the 'GtdRegNumber' element value. ��������������� ����� ��, � ������� ��������������� �������� ������.
     * 
     * @return value
     */
    public GTDIDType getGtdRegNumber() {
        return gtdRegNumber;
    }

    /** 
     * Set the 'GtdRegNumber' element value. ��������������� ����� ��, � ������� ��������������� �������� ������.
     * 
     * @param gtdRegNumber
     */
    public void setGtdRegNumber(GTDIDType gtdRegNumber) {
        this.gtdRegNumber = gtdRegNumber;
    }
}
