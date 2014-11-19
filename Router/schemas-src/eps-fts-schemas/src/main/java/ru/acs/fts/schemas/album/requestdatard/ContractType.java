
package ru.acs.fts.schemas.album.requestdatard;

import org.joda.time.LocalDate;

/** 
 * ��������
 */
public class ContractType
{
    private String conNumber;
    private LocalDate conDateSignature;

    /** 
     * Get the 'ConNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getConNumber() {
        return conNumber;
    }

    /** 
     * Set the 'ConNumber' element value. ����� ���������
     * 
     * @param conNumber
     */
    public void setConNumber(String conNumber) {
        this.conNumber = conNumber;
    }

    /** 
     * Get the 'ConDateSignature' element value. ���� ���������� ���������
     * 
     * @return value
     */
    public LocalDate getConDateSignature() {
        return conDateSignature;
    }

    /** 
     * Set the 'ConDateSignature' element value. ���� ���������� ���������
     * 
     * @param conDateSignature
     */
    public void setConDateSignature(LocalDate conDateSignature) {
        this.conDateSignature = conDateSignature;
    }
}
