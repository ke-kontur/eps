
package ru.acs.fts.schemas.album.airwaybill;

/** 
 * Агент выпускающего перевозчика
 */
public class IssueAgentType extends AirOrganizationType
{
    private String IATACode;
    private String commissionFlag;

    /** 
     * Get the 'IATACode' element value. Код ИАТА агента
     * 
     * @return value
     */
    public String getIATACode() {
        return IATACode;
    }

    /** 
     * Set the 'IATACode' element value. Код ИАТА агента
     * 
     * @param IATACode
     */
    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    /** 
     * Get the 'CommissionFlag' element value. Сведения о  комиссионных для агента: 1 - агенту полагаются комиссионные; 0 - запись отсутствует
     * 
     * @return value
     */
    public String getCommissionFlag() {
        return commissionFlag;
    }

    /** 
     * Set the 'CommissionFlag' element value. Сведения о  комиссионных для агента: 1 - агенту полагаются комиссионные; 0 - запись отсутствует
     * 
     * @param commissionFlag
     */
    public void setCommissionFlag(String commissionFlag) {
        this.commissionFlag = commissionFlag;
    }
}
