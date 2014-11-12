
package ru.acs.fts.schemas.album.pi_seaarrive;

/** 
 * Сведения о наличии лекарственных средств
 */
public class DrugsSubstanceInfoType extends ProhibitedSubjectInfoType
{
    private String drugsType;

    /** 
     * Get the 'DrugsType' element value. Тип лекарственного средства: 1 - наркотические; 2 - сильнодействующие; 3 - психотропные; 4 - ядовитые
     * 
     * @return value
     */
    public String getDrugsType() {
        return drugsType;
    }

    /** 
     * Set the 'DrugsType' element value. Тип лекарственного средства: 1 - наркотические; 2 - сильнодействующие; 3 - психотропные; 4 - ядовитые
     * 
     * @param drugsType
     */
    public void setDrugsType(String drugsType) {
        this.drugsType = drugsType;
    }
}
