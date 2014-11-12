
package ru.acs.fts.schemas.album.reportclosecontrol;

/** 
 * Информация в таблице внутреннего формата электронной копии ДТ (формат DBF)
 */
public class GTDinTableType
{
    private String tableName;
    private String attributeName;
    private String recordNumber;

    /** 
     * Get the 'TableName' element value. Имя таблицы внутреннего формата электронной копии ДТ (формат DBF)
     * 
     * @return value
     */
    public String getTableName() {
        return tableName;
    }

    /** 
     * Set the 'TableName' element value. Имя таблицы внутреннего формата электронной копии ДТ (формат DBF)
     * 
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /** 
     * Get the 'AttributeName' element value. Наименование атрибута таблицы
     * 
     * @return value
     */
    public String getAttributeName() {
        return attributeName;
    }

    /** 
     * Set the 'AttributeName' element value. Наименование атрибута таблицы
     * 
     * @param attributeName
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /** 
     * Get the 'RecordNumber' element value. Номер записи, соответствующий значению поля NZP в таблице
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Номер записи, соответствующий значению поля NZP в таблице
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
