
package ru.acs.fts.schemas.album.atdclosecontrol;

/** 
 * Проверенный электронный таможенный документ
 */
public class DocumentType
{
    private String kind;
    private String EDCode;
    private String EDRef;

    /** 
     * Get the 'Kind' element value. Способ указания проверяемого документа
     * 
     * @return value
     */
    public String getKind() {
        return kind;
    }

    /** 
     * Set the 'Kind' element value. Способ указания проверяемого документа
     * 
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /** 
     * Get the 'EDCode' element value. Код типа электронного таможенного документа (2 -АТД)
     * 
     * @return value
     */
    public String getEDCode() {
        return EDCode;
    }

    /** 
     * Set the 'EDCode' element value. Код типа электронного таможенного документа (2 -АТД)
     * 
     * @param EDCode
     */
    public void setEDCode(String EDCode) {
        this.EDCode = EDCode;
    }

    /** 
     * Get the 'EDRef' element value. Ссылка на документ: GUID | валовый номер | таможенный номер
     * 
     * @return value
     */
    public String getEDRef() {
        return EDRef;
    }

    /** 
     * Set the 'EDRef' element value. Ссылка на документ: GUID | валовый номер | таможенный номер
     * 
     * @param EDRef
     */
    public void setEDRef(String EDRef) {
        this.EDRef = EDRef;
    }
}
