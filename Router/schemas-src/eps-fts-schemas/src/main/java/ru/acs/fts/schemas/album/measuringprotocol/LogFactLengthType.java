
package ru.acs.fts.schemas.album.measuringprotocol;

/** 
 * ����������� ����� ����������� ������
 */
public class LogFactLengthType
{
    private String logNumber;
    private String factLength;

    /** 
     * Get the 'LogNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getLogNumber() {
        return logNumber;
    }

    /** 
     * Set the 'LogNumber' element value. ����� ������
     * 
     * @param logNumber
     */
    public void setLogNumber(String logNumber) {
        this.logNumber = logNumber;
    }

    /** 
     * Get the 'FactLength' element value. ���������� ����������� �����, �
     * 
     * @return value
     */
    public String getFactLength() {
        return factLength;
    }

    /** 
     * Set the 'FactLength' element value. ���������� ����������� �����, �
     * 
     * @param factLength
     */
    public void setFactLength(String factLength) {
        this.factLength = factLength;
    }
}
