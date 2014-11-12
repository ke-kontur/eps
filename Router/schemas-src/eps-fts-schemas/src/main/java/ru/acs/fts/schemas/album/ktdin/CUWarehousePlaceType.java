
package ru.acs.fts.schemas.album.ktdin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о документе свидетельствующем о включении в реестры уполномоченных экономических операторов либо реестры владельцев складов хранения собственных товаров, владельцев складов временного хранения, владельцев таможенных складов либо свободных складов, разрешение на временное хранение на складе получателя.
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
