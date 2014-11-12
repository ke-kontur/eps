
package ru.acs.fts.schemas.album.archadddocrequest;

/** 
 * Документ, помещаемый в архив
 */
public class ArchDocType
{
    private Object any;

    /** 
     * Get the 'ArchDocType' complexType value. Тело документа
     * 
     * @return value
     */
    public Object getAny() {
        return any;
    }

    /** 
     * Set the 'ArchDocType' complexType value. Тело документа
     * 
     * @param any
     */
    public void setAny(Object any) {
        this.any = any;
    }
}
