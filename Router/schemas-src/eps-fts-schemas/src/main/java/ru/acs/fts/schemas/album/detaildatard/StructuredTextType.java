
package ru.acs.fts.schemas.album.detaildatard;

/** 
 * Структурированный текст
 */
public class StructuredTextType
{
    private String recordNumber;
    private String text;

    /** 
     * Get the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'Text' element value. Текст
     * 
     * @return value
     */
    public String getText() {
        return text;
    }

    /** 
     * Set the 'Text' element value. Текст
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }
}
