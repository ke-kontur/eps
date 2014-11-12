
package ru.acs.fts.schemas.album.measuringprotocol;

/** 
 * Фактическая длина измеренного бревна
 */
public class LogFactLengthType
{
    private String logNumber;
    private String factLength;

    /** 
     * Get the 'LogNumber' element value. Номер бревна
     * 
     * @return value
     */
    public String getLogNumber() {
        return logNumber;
    }

    /** 
     * Set the 'LogNumber' element value. Номер бревна
     * 
     * @param logNumber
     */
    public void setLogNumber(String logNumber) {
        this.logNumber = logNumber;
    }

    /** 
     * Get the 'FactLength' element value. Измеренная фактическая длина, м
     * 
     * @return value
     */
    public String getFactLength() {
        return factLength;
    }

    /** 
     * Set the 'FactLength' element value. Измеренная фактическая длина, м
     * 
     * @param factLength
     */
    public void setFactLength(String factLength) {
        this.factLength = factLength;
    }
}
