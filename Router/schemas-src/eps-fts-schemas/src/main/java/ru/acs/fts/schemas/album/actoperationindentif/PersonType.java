
package ru.acs.fts.schemas.album.actoperationindentif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Сведения о лице
 */
public class PersonType extends PersonSignatureType
{
    private String job;

    /** 
     * Get the 'Job' element value. Место работы
     * 
     * @return value
     */
    public String getJob() {
        return job;
    }

    /** 
     * Set the 'Job' element value. Место работы
     * 
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }
}
