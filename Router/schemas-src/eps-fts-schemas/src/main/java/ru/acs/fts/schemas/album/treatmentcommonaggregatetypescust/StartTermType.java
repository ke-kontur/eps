
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������ ����� �����������
 */
public class StartTermType
{
    private LocalDate startWith;
    private LocalDate termTo;
    private PersonSignatureType personSignature;
    private GTDIDType GTDID;

    /** 
     * Get the 'StartWith' element value. ������ �
     * 
     * @return value
     */
    public LocalDate getStartWith() {
        return startWith;
    }

    /** 
     * Set the 'StartWith' element value. ������ �
     * 
     * @param startWith
     */
    public void setStartWith(LocalDate startWith) {
        this.startWith = startWith;
    }

    /** 
     * Get the 'TermTo' element value. ���� ��
     * 
     * @return value
     */
    public LocalDate getTermTo() {
        return termTo;
    }

    /** 
     * Set the 'TermTo' element value. ���� ��
     * 
     * @param termTo
     */
    public void setTermTo(LocalDate termTo) {
        this.termTo = termTo;
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

    /** 
     * Get the 'GTDID' element value. ��������������� ����� ����������� ���������.
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. ��������������� ����� ����������� ���������.
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }
}
