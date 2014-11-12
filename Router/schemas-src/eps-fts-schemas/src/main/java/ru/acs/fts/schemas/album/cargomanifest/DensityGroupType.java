
package ru.acs.fts.schemas.album.cargomanifest;

/** 
 * Группа объемного веса
 */
public class DensityGroupType
{
    private String densityIndicator;
    private String densityGroup;

    /** 
     * Get the 'DensityIndicator' element value.
     * 
     * @return value
     */
    public String getDensityIndicator() {
        return densityIndicator;
    }

    /** 
     * Set the 'DensityIndicator' element value.
     * 
     * @param densityIndicator
     */
    public void setDensityIndicator(String densityIndicator) {
        this.densityIndicator = densityIndicator;
    }

    /** 
     * Get the 'DensityGroup' element value.
     * 
     * @return value
     */
    public String getDensityGroup() {
        return densityGroup;
    }

    /** 
     * Set the 'DensityGroup' element value.
     * 
     * @param densityGroup
     */
    public void setDensityGroup(String densityGroup) {
        this.densityGroup = densityGroup;
    }
}
