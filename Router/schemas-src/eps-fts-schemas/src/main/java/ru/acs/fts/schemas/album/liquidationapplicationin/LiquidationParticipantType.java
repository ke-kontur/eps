
package ru.acs.fts.schemas.album.liquidationapplicationin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Участник мероприятий по уничтожению товаров, пришедших в негодность
 */
public class LiquidationParticipantType extends CUOrganizationType
{
    private String personPost;
    private DocumentBaseType OEZResidentCertif;

    /** 
     * Get the 'PersonPost' element value. Должность
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. Должность
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }

    /** 
     * Get the 'OEZ_ResidentCertif' element value. Свидетельство, удостоверяющее регистрацию лица в качестве резидента ОЭЗ
     * 
     * @return value
     */
    public DocumentBaseType getOEZResidentCertif() {
        return OEZResidentCertif;
    }

    /** 
     * Set the 'OEZ_ResidentCertif' element value. Свидетельство, удостоверяющее регистрацию лица в качестве резидента ОЭЗ
     * 
     * @param OEZResidentCertif
     */
    public void setOEZResidentCertif(DocumentBaseType OEZResidentCertif) {
        this.OEZResidentCertif = OEZResidentCertif;
    }
}
