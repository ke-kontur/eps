
package ru.acs.fts.schemas.album.roskomradio;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.DocumentType;

/** 
 * �������� � ���������
 */
public class DocInfoType extends DocumentType
{
    private String docId;
    private String docType;
    private LocalDate changeDate;
    private String status;

    /** 
     * Get the 'DocId' element value. ������������� ���������
     * 
     * @return value
     */
    public String getDocId() {
        return docId;
    }

    /** 
     * Set the 'DocId' element value. ������������� ���������
     * 
     * @param docId
     */
    public void setDocId(String docId) {
        this.docId = docId;
    }

    /** 
     * Get the 'DocType' element value. ��� ���������. 1 -  ��������� ���� ���; 2 - ���� ��� ��� ������� �������������;
     * 
     * @return value
     */
    public String getDocType() {
        return docType;
    }

    /** 
     * Set the 'DocType' element value. ��� ���������. 1 -  ��������� ���� ���; 2 - ���� ��� ��� ������� �������������;
     * 
     * @param docType
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /** 
     * Get the 'ChangeDate' element value. ���� ��������� ����������� ���������� �� ����
     * 
     * @return value
     */
    public LocalDate getChangeDate() {
        return changeDate;
    }

    /** 
     * Set the 'ChangeDate' element value. ���� ��������� ����������� ���������� �� ����
     * 
     * @param changeDate
     */
    public void setChangeDate(LocalDate changeDate) {
        this.changeDate = changeDate;
    }

    /** 
     * Get the 'Status' element value. ������ ���������� �� ����
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������ ���������� �� ����
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
