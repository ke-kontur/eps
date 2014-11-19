
package ru.acs.fts.schemas.album.archdocumentlist;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � ���������
 */
public class ArchDocumentType extends DocumentBaseType
{
    private String archDocID;
    private String archDocumentID;
    private String archDocStatus;
    private String documentCode;
    private LocalDate docBeginDate;
    private LocalDate docEndDate;
    private String archDocDate;

    /** 
     * Get the 'ArchDocID' element value. �������� ������������� ���������
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. �������� ������������� ���������
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'ArchDocumentID' element value. ���������� ������������� ���������
     * 
     * @return value
     */
    public String getArchDocumentID() {
        return archDocumentID;
    }

    /** 
     * Set the 'ArchDocumentID' element value. ���������� ������������� ���������
     * 
     * @param archDocumentID
     */
    public void setArchDocumentID(String archDocumentID) {
        this.archDocumentID = archDocumentID;
    }

    /** 
     * Get the 'ArchDocStatus' element value. ������ ��������� � ������
     * 
     * @return value
     */
    public String getArchDocStatus() {
        return archDocStatus;
    }

    /** 
     * Set the 'ArchDocStatus' element value. ������ ��������� � ������
     * 
     * @param archDocStatus
     */
    public void setArchDocStatus(String archDocStatus) {
        this.archDocStatus = archDocStatus;
    }

    /** 
     * Get the 'DocumentCode' element value. ������������� ���� ��������� �� ������� ��������
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. ������������� ���� ��������� �� ������� ��������
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    /** 
     * Get the 'DocBeginDate' element value. ���� ������ �������� ���������
     * 
     * @return value
     */
    public LocalDate getDocBeginDate() {
        return docBeginDate;
    }

    /** 
     * Set the 'DocBeginDate' element value. ���� ������ �������� ���������
     * 
     * @param docBeginDate
     */
    public void setDocBeginDate(LocalDate docBeginDate) {
        this.docBeginDate = docBeginDate;
    }

    /** 
     * Get the 'DocEndDate' element value. ���� ��������� �������� ���������
     * 
     * @return value
     */
    public LocalDate getDocEndDate() {
        return docEndDate;
    }

    /** 
     * Set the 'DocEndDate' element value. ���� ��������� �������� ���������
     * 
     * @param docEndDate
     */
    public void setDocEndDate(LocalDate docEndDate) {
        this.docEndDate = docEndDate;
    }

    /** 
     * Get the 'ArchDocDate' element value. ����/����� ��������� ��������� � ����� ( ���������� ��������� ���������)
     * 
     * @return value
     */
    public String getArchDocDate() {
        return archDocDate;
    }

    /** 
     * Set the 'ArchDocDate' element value. ����/����� ��������� ��������� � ����� ( ���������� ��������� ���������)
     * 
     * @param archDocDate
     */
    public void setArchDocDate(String archDocDate) {
        this.archDocDate = archDocDate;
    }
}
