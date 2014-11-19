
package ru.acs.fts.schemas.album.cardcommonaggregatetypes;

/** 
 * Код и наименование таможенного органа
 */
public class CustomsTypeType
{
    private String code;
    private String officeName;

    /** 
     * Get the 'Code' element value. Код таможенного органа
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'Code' element value. Код таможенного органа
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'OfficeName' element value. Наименование таможенного органа
     * 
     * @return value
     */
    public String getOfficeName() {
        return officeName;
    }

    /** 
     * Set the 'OfficeName' element value. Наименование таможенного органа
     * 
     * @param officeName
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
}
