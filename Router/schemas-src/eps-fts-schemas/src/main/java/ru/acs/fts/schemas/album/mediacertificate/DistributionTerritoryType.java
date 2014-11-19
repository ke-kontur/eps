
package ru.acs.fts.schemas.album.mediacertificate;

/** 
 * Территория распространения
 */
public class DistributionTerritoryType
{
    private String regionCode;
    private String regionName;
    private String comment;

    /** 
     * Get the 'RegionCode' element value. Код региона РФ
     * 
     * @return value
     */
    public String getRegionCode() {
        return regionCode;
    }

    /** 
     * Set the 'RegionCode' element value. Код региона РФ
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /** 
     * Get the 'RegionName' element value. Наименование региона РФ
     * 
     * @return value
     */
    public String getRegionName() {
        return regionName;
    }

    /** 
     * Set the 'RegionName' element value. Наименование региона РФ
     * 
     * @param regionName
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /** 
     * Get the 'Comment' element value. Комментарий
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. Комментарий
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
