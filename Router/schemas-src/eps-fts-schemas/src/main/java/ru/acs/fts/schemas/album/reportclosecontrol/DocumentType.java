
package ru.acs.fts.schemas.album.reportclosecontrol;

/** 
 * Проверенный электронный таможенный документ
 */
public class DocumentType
{
    private String kind;
    private String EDCode;
    private String EDType;
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
     * Get the 'EDCode' element value. Код типа электронного таможенного документа (1-ДТ)
     * 
     * @return value
     */
    public String getEDCode() {
        return EDCode;
    }

    /** 
     * Set the 'EDCode' element value. Код типа электронного таможенного документа (1-ДТ)
     * 
     * @param EDCode
     */
    public void setEDCode(String EDCode) {
        this.EDCode = EDCode;
    }

    /** 
     * Get the 'EDType' element value. Тип электронного таможенного документа
     * 
     * @return value
     */
    public String getEDType() {
        return EDType;
    }

    /** 
     * Set the 'EDType' element value. Тип электронного таможенного документа
     * 
     * @param EDType
     */
    public void setEDType(String EDType) {
        this.EDType = EDType;
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
