
package ru.acs.fts.schemas.album.archdocupdate;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseType;

/** 
 * ������ �� ������ ��������� � ������
 */
public class ArchDocUpdateType extends ArchBaseType
{
    private String archDocID;
    private String archDocumentID;
    private LocalDate documentBeginDate;
    private LocalDate documentEndDate;
    private ArcDocType archDoc;
    private String documentModeID;

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
     * Get the 'ArchDocumentID' element value. ���������� ������������� ����������� ���������
     * 
     * @return value
     */
    public String getArchDocumentID() {
        return archDocumentID;
    }

    /** 
     * Set the 'ArchDocumentID' element value. ���������� ������������� ����������� ���������
     * 
     * @param archDocumentID
     */
    public void setArchDocumentID(String archDocumentID) {
        this.archDocumentID = archDocumentID;
    }

    /** 
     * Get the 'DocumentBeginDate' element value. ���� ������ �������� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentBeginDate() {
        return documentBeginDate;
    }

    /** 
     * Set the 'DocumentBeginDate' element value. ���� ������ �������� ���������
     * 
     * @param documentBeginDate
     */
    public void setDocumentBeginDate(LocalDate documentBeginDate) {
        this.documentBeginDate = documentBeginDate;
    }

    /** 
     * Get the 'DocumentEndDate' element value. ���� ��������� �������� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentEndDate() {
        return documentEndDate;
    }

    /** 
     * Set the 'DocumentEndDate' element value. ���� ��������� �������� ���������
     * 
     * @param documentEndDate
     */
    public void setDocumentEndDate(LocalDate documentEndDate) {
        this.documentEndDate = documentEndDate;
    }

    /** 
     * Get the 'ArchDoc' element value. ���������� ��������
     * 
     * @return value
     */
    public ArcDocType getArchDoc() {
        return archDoc;
    }

    /** 
     * Set the 'ArchDoc' element value. ���������� ��������
     * 
     * @param archDoc
     */
    public void setArchDoc(ArcDocType archDoc) {
        this.archDoc = archDoc;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
