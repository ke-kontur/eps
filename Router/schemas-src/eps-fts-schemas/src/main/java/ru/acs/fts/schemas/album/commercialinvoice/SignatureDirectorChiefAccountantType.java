
package ru.acs.fts.schemas.album.commercialinvoice;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� ������������ ����������� � �������� ����������.
 */
public class SignatureDirectorChiefAccountantType
{
    private PersonSignatureType director;
    private PersonSignatureType chiefAccountant;

    /** 
     * Get the 'Director' element value. ������������ �����������
     * 
     * @return value
     */
    public PersonSignatureType getDirector() {
        return director;
    }

    /** 
     * Set the 'Director' element value. ������������ �����������
     * 
     * @param director
     */
    public void setDirector(PersonSignatureType director) {
        this.director = director;
    }

    /** 
     * Get the 'ChiefAccountant' element value. ������� ���������
     * 
     * @return value
     */
    public PersonSignatureType getChiefAccountant() {
        return chiefAccountant;
    }

    /** 
     * Set the 'ChiefAccountant' element value. ������� ���������
     * 
     * @param chiefAccountant
     */
    public void setChiefAccountant(PersonSignatureType chiefAccountant) {
        this.chiefAccountant = chiefAccountant;
    }
}
