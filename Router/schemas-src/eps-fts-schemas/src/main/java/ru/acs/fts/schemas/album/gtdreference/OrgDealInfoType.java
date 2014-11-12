
package ru.acs.fts.schemas.album.gtdreference;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������ �� �����������, ����������� � ������
 */
public class OrgDealInfoType extends CUOrganizationType
{
    private PersonSignatureType directorSignature;

    /** 
     * Get the 'DirectorSignature' element value. ������� ������������ � ���� ������
     * 
     * @return value
     */
    public PersonSignatureType getDirectorSignature() {
        return directorSignature;
    }

    /** 
     * Set the 'DirectorSignature' element value. ������� ������������ � ���� ������
     * 
     * @param directorSignature
     */
    public void setDirectorSignature(PersonSignatureType directorSignature) {
        this.directorSignature = directorSignature;
    }
}
