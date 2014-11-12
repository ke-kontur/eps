
package ru.acs.fts.schemas.admin.ptdscancmd;

import java.math.BigInteger;
import ru.acs.fts.schemas.admin.intexchcommonaggregatetypescust.BaseDocType;

/** 
 * Команды на поиск просроченных ПТД
 */
public class PTDScanCmdType extends BaseDocType
{
    private BigInteger intervalDay;
    private String documentModeID;

    /** 
     * Get the 'IntervalDay' element value. Интервал в днях
     * 
     * @return value
     */
    public BigInteger getIntervalDay() {
        return intervalDay;
    }

    /** 
     * Set the 'IntervalDay' element value. Интервал в днях
     * 
     * @param intervalDay
     */
    public void setIntervalDay(BigInteger intervalDay) {
        this.intervalDay = intervalDay;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
