
package ru.acs.fts.schemas.album.archadddocrequest;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseType;

/** 
 * ������ �� ��������� ��������� � �����
 */
public class ArchAddDocRequestType extends ArchBaseType
{
    private LocalDate documentBeginDate;
    private LocalDate documentEndDate;
    private String docCode;
    private ArchDocType archDoc;
    private DocumentBaseType docBaseInfo;
    private String documentModeID;

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
     * Get the 'DocCode' element value. ��� ���� �������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. ��� ���� �������������� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'ArchDoc' element value. ��������, ���������� � �����
     * 
     * @return value
     */
    public ArchDocType getArchDoc() {
        return archDoc;
    }

    /** 
     * Set the 'ArchDoc' element value. ��������, ���������� � �����
     * 
     * @param archDoc
     */
    public void setArchDoc(ArchDocType archDoc) {
        this.archDoc = archDoc;
    }

    /** 
     * Get the 'DocBaseInfo' element value. ������� �������� � ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocBaseInfo() {
        return docBaseInfo;
    }

    /** 
     * Set the 'DocBaseInfo' element value. ������� �������� � ���������
     * 
     * @param docBaseInfo
     */
    public void setDocBaseInfo(DocumentBaseType docBaseInfo) {
        this.docBaseInfo = docBaseInfo;
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
