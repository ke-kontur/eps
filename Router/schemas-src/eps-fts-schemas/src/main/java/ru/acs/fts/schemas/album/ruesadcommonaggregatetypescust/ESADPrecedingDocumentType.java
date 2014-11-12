
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.PrecedingDocumentType;

/** 
 * ESAD. Предшествующие документы.
 */
public class ESADPrecedingDocumentType extends PrecedingDocumentType
{
    private String addNumberPart;

    /** 
     * Get the 'AddNumberPart' element value. Предшествующий документ - дополнительная составляющая номера (заполняется при указании номера обязательства о подаче таможенной декларации ("ОБ")) 
     * 
     * @return value
     */
    public String getAddNumberPart() {
        return addNumberPart;
    }

    /** 
     * Set the 'AddNumberPart' element value. Предшествующий документ - дополнительная составляющая номера (заполняется при указании номера обязательства о подаче таможенной декларации ("ОБ")) 
     * 
     * @param addNumberPart
     */
    public void setAddNumberPart(String addNumberPart) {
        this.addNumberPart = addNumberPart;
    }
}
