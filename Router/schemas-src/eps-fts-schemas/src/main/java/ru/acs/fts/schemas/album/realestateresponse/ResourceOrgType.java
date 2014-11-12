
package ru.acs.fts.schemas.album.realestateresponse;

/** 
 * Орган - источник информации
 */
public class ResourceOrgType
{
    private String orgCode;
    private String region;

    /** 
     * Get the 'OrgCode' element value. Код органа - источника информации
     * 
     * @return value
     */
    public String getOrgCode() {
        return orgCode;
    }

    /** 
     * Set the 'OrgCode' element value. Код органа - источника информации
     * 
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /** 
     * Get the 'Region' element value. Наименование органа - источника информации
     * 
     * @return value
     */
    public String getRegion() {
        return region;
    }

    /** 
     * Set the 'Region' element value. Наименование органа - источника информации
     * 
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }
}
