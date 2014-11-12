
package ru.acs.fts.schemas.album.correctiondecision;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����� ������ �� ���������, �������� ���������������� ��������� ������� ��� �������� ������� �� ����
 */
public class RefDocumentListType extends DocumentBaseType
{
    private String cusDesDocumentID;
    private String docCode;
    private String docName;
    private String sectionNumber;
    private String recordNumber;
    private String note;

    /** 
     * Get the 'CusDesDocumentID' element value. ������ �� DocumentID ���� ���������, ������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @return value
     */
    public String getCusDesDocumentID() {
        return cusDesDocumentID;
    }

    /** 
     * Set the 'CusDesDocumentID' element value. ������ �� DocumentID ���� ���������, ������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @param cusDesDocumentID
     */
    public void setCusDesDocumentID(String cusDesDocumentID) {
        this.cusDesDocumentID = cusDesDocumentID;
    }

    /** 
     * Get the 'DocCode' element value. ��� ���� ���������. ��� ������� ��������� � �������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44 ��, ����������� ���� ���.
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. ��� ���� ���������. ��� ������� ��������� � �������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44 ��, ����������� ���� ���.
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'DocName' element value. ��� ���������, ������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @return value
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * Set the 'DocName' element value. ��� ���������, ������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @param docName
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /** 
     * Get the 'SectionNumber' element value. ����� ������� ���������, ������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @return value
     */
    public String getSectionNumber() {
        return sectionNumber;
    }

    /** 
     * Set the 'SectionNumber' element value. ����� ������� ���������, ������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @param sectionNumber
     */
    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    /** 
     * Get the 'RecordNumber' element value. ���������� ����� ������ � ������� ���������, ������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � ������� ���������, ������� ���������������� ��������� ������� ��� �������� ������� �� ����
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'Note' element value. ����������� ����������
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. ����������� ����������
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }
}
