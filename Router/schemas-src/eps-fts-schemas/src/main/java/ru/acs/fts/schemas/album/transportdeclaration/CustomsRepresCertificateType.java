
package ru.acs.fts.schemas.album.transportdeclaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Свидетельство о включении лица в Реестр таможенных представителей
 */
public class CustomsRepresCertificateType extends DocumentBaseType
{
    private String documentModeCode;

    /** 
     * Get the 'DocumentModeCode' element value. Тип документа:2 - свидетельство таможенного  представителя (брокера ); 3 - свидетельство таможенного представителя.
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Тип документа:2 - свидетельство таможенного  представителя (брокера ); 3 - свидетельство таможенного представителя.
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
