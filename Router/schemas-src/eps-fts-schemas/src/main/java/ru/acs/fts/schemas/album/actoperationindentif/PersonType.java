
package ru.acs.fts.schemas.album.actoperationindentif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * �������� � ����
 */
public class PersonType extends PersonSignatureType
{
    private String job;

    /** 
     * Get the 'Job' element value. ����� ������
     * 
     * @return value
     */
    public String getJob() {
        return job;
    }

    /** 
     * Set the 'Job' element value. ����� ������
     * 
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }
}
