
package ru.acs.fts.schemas.album.datard;

/** 
 * ����������������� �����
 */
public class StructuredTextType
{
    private String recordNumber;
    private String text;

    /** 
     * Get the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'Text' element value. �����
     * 
     * @return value
     */
    public String getText() {
        return text;
    }

    /** 
     * Set the 'Text' element value. �����
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }
}
