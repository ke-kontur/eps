
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������� ����� �����������
 */
public class ExtensionTermType
{
    private String termExtensionAt;
    private String generalTermAfterExtension;
    private PersonSignatureType personSignature;

    /** 
     * Get the 'TermExtensionAt' element value. ���� ������� ��
     * 
     * @return value
     */
    public String getTermExtensionAt() {
        return termExtensionAt;
    }

    /** 
     * Set the 'TermExtensionAt' element value. ���� ������� ��
     * 
     * @param termExtensionAt
     */
    public void setTermExtensionAt(String termExtensionAt) {
        this.termExtensionAt = termExtensionAt;
    }

    /** 
     * Get the 'GeneralTermAfterExtension' element value. ����� ���� ����������� ����� ���������
     * 
     * @return value
     */
    public String getGeneralTermAfterExtension() {
        return generalTermAfterExtension;
    }

    /** 
     * Set the 'GeneralTermAfterExtension' element value. ����� ���� ����������� ����� ���������
     * 
     * @param generalTermAfterExtension
     */
    public void setGeneralTermAfterExtension(String generalTermAfterExtension) {
        this.generalTermAfterExtension = generalTermAfterExtension;
    }

    /** 
     * Get the 'PersonSignature' element value. �������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. �������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }
}
