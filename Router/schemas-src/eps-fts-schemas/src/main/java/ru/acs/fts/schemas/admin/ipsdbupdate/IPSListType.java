
package ru.acs.fts.schemas.admin.ipsdbupdate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/** 
 * Справочник ИПС
 */
public class IPSListType
{
    private String IPSID;
    private String IPSDescription;
    private String IPSProgrammerOrg;
    private String comments;
    private LocalDate createDate;
    private DateTime chDateTime;
    private List<IPSTechType> IPSTechInfoList = new ArrayList<IPSTechType>();

    /** 
     * Get the 'IPSID' element value. Идентификатор ИПС ВЭД
     * 
     * @return value
     */
    public String getIPSID() {
        return IPSID;
    }

    /** 
     * Set the 'IPSID' element value. Идентификатор ИПС ВЭД
     * 
     * @param IPSID
     */
    public void setIPSID(String IPSID) {
        this.IPSID = IPSID;
    }

    /** 
     * Get the 'IPSDescription' element value. Наименование ИПС ВЭД
     * 
     * @return value
     */
    public String getIPSDescription() {
        return IPSDescription;
    }

    /** 
     * Set the 'IPSDescription' element value. Наименование ИПС ВЭД
     * 
     * @param IPSDescription
     */
    public void setIPSDescription(String IPSDescription) {
        this.IPSDescription = IPSDescription;
    }

    /** 
     * Get the 'IPS_ProgrammerOrg' element value. Наименование  организации-разработчика
     * 
     * @return value
     */
    public String getIPSProgrammerOrg() {
        return IPSProgrammerOrg;
    }

    /** 
     * Set the 'IPS_ProgrammerOrg' element value. Наименование  организации-разработчика
     * 
     * @param IPSProgrammerOrg
     */
    public void setIPSProgrammerOrg(String IPSProgrammerOrg) {
        this.IPSProgrammerOrg = IPSProgrammerOrg;
    }

    /** 
     * Get the 'Comments' element value. Комментарий
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарий
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'CreateDate' element value. Дата создания записи
     * 
     * @return value
     */
    public LocalDate getCreateDate() {
        return createDate;
    }

    /** 
     * Set the 'CreateDate' element value. Дата создания записи
     * 
     * @param createDate
     */
    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    /** 
     * Get the 'ChDateTime' element value. Дата/время последнего изменения записи
     * 
     * @return value
     */
    public DateTime getChDateTime() {
        return chDateTime;
    }

    /** 
     * Set the 'ChDateTime' element value. Дата/время последнего изменения записи
     * 
     * @param chDateTime
     */
    public void setChDateTime(DateTime chDateTime) {
        this.chDateTime = chDateTime;
    }

    /** 
     * Get the list of 'IPSTechInfo' element items. Информафия  о поддерживаемых  технологиях
     * 
     * @return list
     */
    public List<IPSTechType> getIPSTechInfoList() {
        return IPSTechInfoList;
    }

    /** 
     * Set the list of 'IPSTechInfo' element items. Информафия  о поддерживаемых  технологиях
     * 
     * @param list
     */
    public void setIPSTechInfoList(List<IPSTechType> list) {
        IPSTechInfoList = list;
    }
}
