
package ru.acs.fts.schemas.admin.ptdscancmd;

import java.math.BigInteger;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * ������� �� ����� ������������ ���
 */
public class PTDScanCmdType extends BaseDocType
{
    private BigInteger intervalDay;
    private String documentModeID;

    /** 
     * Get the 'IntervalDay' element value. �������� � ����
     * 
     * @return value
     */
    public BigInteger getIntervalDay() {
        return intervalDay;
    }

    /** 
     * Set the 'IntervalDay' element value. �������� � ����
     * 
     * @param intervalDay
     */
    public void setIntervalDay(BigInteger intervalDay) {
        this.intervalDay = intervalDay;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
