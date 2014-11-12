
package ru.acs.fts.schemas.album.requestdatard;

import org.joda.time.LocalDate;

/** 
 * Контракт
 */
public class ContractType
{
    private String conNumber;
    private LocalDate conDateSignature;

    /** 
     * Get the 'ConNumber' element value. Номер контракта
     * 
     * @return value
     */
    public String getConNumber() {
        return conNumber;
    }

    /** 
     * Set the 'ConNumber' element value. Номер контракта
     * 
     * @param conNumber
     */
    public void setConNumber(String conNumber) {
        this.conNumber = conNumber;
    }

    /** 
     * Get the 'ConDateSignature' element value. Дата подписания контракта
     * 
     * @return value
     */
    public LocalDate getConDateSignature() {
        return conDateSignature;
    }

    /** 
     * Set the 'ConDateSignature' element value. Дата подписания контракта
     * 
     * @param conDateSignature
     */
    public void setConDateSignature(LocalDate conDateSignature) {
        this.conDateSignature = conDateSignature;
    }
}
