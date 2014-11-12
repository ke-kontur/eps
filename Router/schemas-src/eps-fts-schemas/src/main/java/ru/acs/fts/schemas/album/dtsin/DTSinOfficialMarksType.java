
package ru.acs.fts.schemas.album.dtsin;

import ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust.DTSOfficialMarkType;

/** 
 * Внутренний формат  ДТС. Служебные отметки.
 */
public class DTSinOfficialMarksType extends DTSOfficialMarkType
{
    private String recordSerialNumber;

    /** 
     * Get the 'RecordSerialNumber' element value. Порядковый номер записи
     * 
     * @return value
     */
    public String getRecordSerialNumber() {
        return recordSerialNumber;
    }

    /** 
     * Set the 'RecordSerialNumber' element value. Порядковый номер записи
     * 
     * @param recordSerialNumber
     */
    public void setRecordSerialNumber(String recordSerialNumber) {
        this.recordSerialNumber = recordSerialNumber;
    }
}
