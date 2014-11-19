
package ru.acs.fts.schemas.album.commissioninspection;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.WarehousePlaceType;

/** 
 * Место погрузки/разгрузки. Сведения о лицензии/ свидетельстве склада.
 */
public class CIWarehousePlaceType extends WarehousePlaceType
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
