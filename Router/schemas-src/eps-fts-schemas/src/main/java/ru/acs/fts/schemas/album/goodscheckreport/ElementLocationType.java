
package ru.acs.fts.schemas.album.goodscheckreport;

/** 
 * Идентификация атрибута сверки (номера графы ДТ)
 */
public class ElementLocationType
{
    private String columnNumber;
    private String GTDGoodsNumber;
    private String lineNumber;
    private String subLineNumber;
    private String recordNumber;
    private String fieldName;

    /** 
     * Get the 'ColumnNumber' element value. Номер графы ДТ
     * 
     * @return value
     */
    public String getColumnNumber() {
        return columnNumber;
    }

    /** 
     * Set the 'ColumnNumber' element value. Номер графы ДТ
     * 
     * @param columnNumber
     */
    public void setColumnNumber(String columnNumber) {
        this.columnNumber = columnNumber;
    }

    /** 
     * Get the 'GTDGoodsNumber' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. Номер товара по ДТ
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
    }

    /** 
     * Get the 'LineNumber' element value. Номер строки
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. Номер строки
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the 'SubLineNumber' element value. Номер подстроки
     * 
     * @return value
     */
    public String getSubLineNumber() {
        return subLineNumber;
    }

    /** 
     * Set the 'SubLineNumber' element value. Номер подстроки
     * 
     * @param subLineNumber
     */
    public void setSubLineNumber(String subLineNumber) {
        this.subLineNumber = subLineNumber;
    }

    /** 
     * Get the 'RecordNumber' element value. Номер записи по графе
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Номер записи по графе
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    /** 
     * Get the 'FieldName' element value. Название атрибута информации в графе (номер, дата, марка и т.д.)
     * 
     * @return value
     */
    public String getFieldName() {
        return fieldName;
    }

    /** 
     * Set the 'FieldName' element value. Название атрибута информации в графе (номер, дата, марка и т.д.)
     * 
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
