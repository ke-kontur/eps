
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документ, свидетельствующий о включении лица  в Реестр таможенных представителей
 */
public class CUESADCustomsRepresCertificateType extends DocumentBaseType
{
    private String documentModeCode;

    /** 
     * Get the 'DocumentModeCode' element value. Тип документа:2 - свидетельство таможенного  представителя (брокера); 3 - свидетельство таможенного представителя
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Тип документа:2 - свидетельство таможенного  представителя (брокера); 3 - свидетельство таможенного представителя
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }
}
