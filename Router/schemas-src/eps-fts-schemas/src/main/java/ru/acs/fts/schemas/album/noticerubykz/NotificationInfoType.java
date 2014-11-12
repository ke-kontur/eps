
package ru.acs.fts.schemas.album.noticerubykz;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �����������
 */
public class NotificationInfoType extends DocumentBaseType
{
    private String createTime;
    private LocalDate modificationDate;
    private String IDreestr;
    private String ID;

    /** 
     * Get the 'CreateTime' element value. ����� �������� �����������
     * 
     * @return value
     */
    public String getCreateTime() {
        return createTime;
    }

    /** 
     * Set the 'CreateTime' element value. ����� �������� �����������
     * 
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /** 
     * Get the 'ModificationDate' element value. ���� ����������
     * 
     * @return value
     */
    public LocalDate getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. ���� ����������
     * 
     * @param modificationDate
     */
    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'IDreestr' element value. ������������� ����������� � ������� �����������
     * 
     * @return value
     */
    public String getIDreestr() {
        return IDreestr;
    }

    /** 
     * Set the 'IDreestr' element value. ������������� ����������� � ������� �����������
     * 
     * @param IDreestr
     */
    public void setIDreestr(String IDreestr) {
        this.IDreestr = IDreestr;
    }

    /** 
     * Get the 'ID' element value. ������������� �����������, ��� ���������
     * 
     * @return value
     */
    public String getID() {
        return ID;
    }

    /** 
     * Set the 'ID' element value. ������������� �����������, ��� ���������
     * 
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }
}
