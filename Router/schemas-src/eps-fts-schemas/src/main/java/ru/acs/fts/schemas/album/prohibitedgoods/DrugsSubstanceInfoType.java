
package ru.acs.fts.schemas.album.prohibitedgoods;

/** 
 * —ведени€ о наличии лекарственных средств
 */
public class DrugsSubstanceInfoType extends ProhibitedSubjectInfoType
{
    private String drugsType;

    /** 
     * Get the 'DrugsType' element value. “ип лекарственного средства. 1 - наркотические; 2 - сильнодействующие; 3 - психотропные; 4 - €довитые
     * 
     * @return value
     */
    public String getDrugsType() {
        return drugsType;
    }

    /** 
     * Set the 'DrugsType' element value. “ип лекарственного средства. 1 - наркотические; 2 - сильнодействующие; 3 - психотропные; 4 - €довитые
     * 
     * @param drugsType
     */
    public void setDrugsType(String drugsType) {
        this.drugsType = drugsType;
    }
}
