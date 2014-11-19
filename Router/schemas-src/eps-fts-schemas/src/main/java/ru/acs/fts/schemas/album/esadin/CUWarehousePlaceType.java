
package ru.acs.fts.schemas.album.esadin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о местонахождении товаров: разрешение таможенного органа на временное хранение товаров, склад временного хранения, таможенный склад, свободный склад, магазин беспошлинной торговли, помещение, открытые площадки и иные территории уполномоченного экономического оператора, склад хранения собственных товаров, склад получателя товаров
 */
public class CUWarehousePlaceType extends DocumentBaseType
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
