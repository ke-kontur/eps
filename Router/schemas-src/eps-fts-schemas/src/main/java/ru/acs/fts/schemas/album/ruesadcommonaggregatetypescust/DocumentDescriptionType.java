
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �������� ����������, ������� �������������� ����������� � ������������ ����
 */
public class DocumentDescriptionType
{
    private String position;
    private String docCode;
    private String docName;
    private LocalDate suggDate;
    private String note;

    /** 
     * Get the 'Position' element value. ���������� ����� ������
     * 
     * @return value
     */
    public String getPosition() {
        return position;
    }

    /** 
     * Set the 'Position' element value. ���������� ����� ������
     * 
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /** 
     * Get the 'DocCode' element value. ��� ���� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. ��� ���� ��������� (����������� � ������������ � ��������������� ����� ����������, ������������ ��� ��������� �������� � ����� 44)
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'DocName' element value. ��� ���������
     * 
     * @return value
     */
    public String getDocName() {
        return docName;
    }

    /** 
     * Set the 'DocName' element value. ��� ���������
     * 
     * @param docName
     */
    public void setDocName(String docName) {
        this.docName = docName;
    }

    /** 
     * Get the 'SuggDate' element value. ���� �������������� ���������
     * 
     * @return value
     */
    public LocalDate getSuggDate() {
        return suggDate;
    }

    /** 
     * Set the 'SuggDate' element value. ���� �������������� ���������
     * 
     * @param suggDate
     */
    public void setSuggDate(LocalDate suggDate) {
        this.suggDate = suggDate;
    }

    /** 
     * Get the 'Note' element value. ����������
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. ����������
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }
}
