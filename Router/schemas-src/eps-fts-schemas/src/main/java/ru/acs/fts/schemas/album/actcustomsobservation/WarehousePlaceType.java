
package ru.acs.fts.schemas.album.actcustomsobservation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Место погрузки/разгрузки. Сведения о лицензии/ свидетельстве склада.
 */
public class WarehousePlaceType extends DocumentBaseType
{
    private String documentModeCode;

    /** 
     * Get the 'DocumentModeCode' element value. Тип документа:1-Лицензия 2-Свидетельство
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Тип документа:1-Лицензия 2-Свидетельство
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
