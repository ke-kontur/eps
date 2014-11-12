
package ru.acs.fts.schemas.album.notifgoodswharrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о местонахождении товаров: таможенный склад, склад временного хранения, свободный склад, склад получателя, иные
 */
public class GoodsLocationWarehouseType extends DocumentBaseType
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
