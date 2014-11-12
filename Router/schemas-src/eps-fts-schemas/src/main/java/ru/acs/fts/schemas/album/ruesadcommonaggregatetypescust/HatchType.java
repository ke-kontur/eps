
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Люк
 */
public class HatchType
{
    private String hatchKind;
    private String hatchDescription;

    /** 
     * Get the 'HatchKind' element value. Тип люка: "0" - механический, "1" - электрический
     * 
     * @return value
     */
    public String getHatchKind() {
        return hatchKind;
    }

    /** 
     * Set the 'HatchKind' element value. Тип люка: "0" - механический, "1" - электрический
     * 
     * @param hatchKind
     */
    public void setHatchKind(String hatchKind) {
        this.hatchKind = hatchKind;
    }

    /** 
     * Get the 'HatchDescription' element value. Описание
     * 
     * @return value
     */
    public String getHatchDescription() {
        return hatchDescription;
    }

    /** 
     * Set the 'HatchDescription' element value. Описание
     * 
     * @param hatchDescription
     */
    public void setHatchDescription(String hatchDescription) {
        this.hatchDescription = hatchDescription;
    }
}
