
package ru.acs.fts.schemas.album.previousconviction;

import org.joda.time.LocalDate;

/** 
 * Сведения о постановке лица на учет
 */
public class ResultInfoType
{
    private String orgCode;
    private String orgName;
    private String resultSign;
    private LocalDate resultDate;

    /** 
     * Get the 'OrgCode' element value. Код подразделения из справочника "Список кодов региона ФКУ "ГИАЦ МВД России" 
     * 
     * @return value
     */
    public String getOrgCode() {
        return orgCode;
    }

    /** 
     * Set the 'OrgCode' element value. Код подразделения из справочника "Список кодов региона ФКУ "ГИАЦ МВД России" 
     * 
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /** 
     * Get the 'OrgName' element value. Наименование подразделения
     * 
     * @return value
     */
    public String getOrgName() {
        return orgName;
    }

    /** 
     * Set the 'OrgName' element value. Наименование подразделения
     * 
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /** 
     * Get the 'ResultSign' element value. Признак наличия сведений в учете: 1 - в случае наличия сведений в учете; 2 - в случае отсутствия сведений в учете; 3 - в случае мотивированного отказа в предоставлении сведений
     * 
     * @return value
     */
    public String getResultSign() {
        return resultSign;
    }

    /** 
     * Set the 'ResultSign' element value. Признак наличия сведений в учете: 1 - в случае наличия сведений в учете; 2 - в случае отсутствия сведений в учете; 3 - в случае мотивированного отказа в предоставлении сведений
     * 
     * @param resultSign
     */
    public void setResultSign(String resultSign) {
        this.resultSign = resultSign;
    }

    /** 
     * Get the 'ResultDate' element value. Дата предоставления сведений
     * 
     * @return value
     */
    public LocalDate getResultDate() {
        return resultDate;
    }

    /** 
     * Set the 'ResultDate' element value. Дата предоставления сведений
     * 
     * @param resultDate
     */
    public void setResultDate(LocalDate resultDate) {
        this.resultDate = resultDate;
    }
}
