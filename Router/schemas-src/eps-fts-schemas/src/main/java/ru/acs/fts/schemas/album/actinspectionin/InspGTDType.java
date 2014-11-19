
package ru.acs.fts.schemas.album.actinspectionin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Номер ДТ в которой заявлены сведения о досматриваемых  товарах
 */
public class InspGTDType extends GTDIDType
{
    private String recordNumber;

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
}
