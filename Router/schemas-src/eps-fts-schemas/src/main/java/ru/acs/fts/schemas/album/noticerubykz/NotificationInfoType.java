
package ru.acs.fts.schemas.album.noticerubykz;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Уведомление
 */
public class NotificationInfoType extends DocumentBaseType
{
    private String createTime;
    private LocalDate modificationDate;
    private String IDreestr;
    private String ID;

    /** 
     * Get the 'CreateTime' element value. Время создания уведомления
     * 
     * @return value
     */
    public String getCreateTime() {
        return createTime;
    }

    /** 
     * Set the 'CreateTime' element value. Время создания уведомления
     * 
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /** 
     * Get the 'ModificationDate' element value. Дата обновления
     * 
     * @return value
     */
    public LocalDate getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. Дата обновления
     * 
     * @param modificationDate
     */
    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'IDreestr' element value. Идентификатор уведомления в реестре уведомлений
     * 
     * @return value
     */
    public String getIDreestr() {
        return IDreestr;
    }

    /** 
     * Set the 'IDreestr' element value. Идентификатор уведомления в реестре уведомлений
     * 
     * @param IDreestr
     */
    public void setIDreestr(String IDreestr) {
        this.IDreestr = IDreestr;
    }

    /** 
     * Get the 'ID' element value. Идентификатор уведомления, как документа
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. Идентификатор уведомления, как документа
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
