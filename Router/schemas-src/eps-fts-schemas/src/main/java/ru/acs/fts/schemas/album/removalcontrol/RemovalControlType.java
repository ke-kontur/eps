
package ru.acs.fts.schemas.album.removalcontrol;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Подтверждение снятия с контроля
 */
public class RemovalControlType extends BaseDocType
{
    private LocalDate remDate;
    private String remTime;
    private LocalDate createDocDate;
    private String createDocTime;
    private String coordReqNumber;
    private CustomsPersonType person;
    private GTDIDType DTNumber;
    private String documentModeID;

    /** 
     * Get the 'RemDate' element value. Дата снятия с контроля
     * 
     * @return value
     */
    public LocalDate getRemDate() {
        return remDate;
    }

    /** 
     * Set the 'RemDate' element value. Дата снятия с контроля
     * 
     * @param remDate
     */
    public void setRemDate(LocalDate remDate) {
        this.remDate = remDate;
    }

    /** 
     * Get the 'RemTime' element value. Время снятия с контроля
     * 
     * @return value
     */
    public String getRemTime() {
        return remTime;
    }

    /** 
     * Set the 'RemTime' element value. Время снятия с контроля
     * 
     * @param remTime
     */
    public void setRemTime(String remTime) {
        this.remTime = remTime;
    }

    /** 
     * Get the 'CreateDocDate' element value. Дата создания документа
     * 
     * @return value
     */
    public LocalDate getCreateDocDate() {
        return createDocDate;
    }

    /** 
     * Set the 'CreateDocDate' element value. Дата создания документа
     * 
     * @param createDocDate
     */
    public void setCreateDocDate(LocalDate createDocDate) {
        this.createDocDate = createDocDate;
    }

    /** 
     * Get the 'CreateDocTime' element value. Время создания документа
     * 
     * @return value
     */
    public String getCreateDocTime() {
        return createDocTime;
    }

    /** 
     * Set the 'CreateDocTime' element value. Время создания документа
     * 
     * @param createDocTime
     */
    public void setCreateDocTime(String createDocTime) {
        this.createDocTime = createDocTime;
    }

    /** 
     * Get the 'CoordReqNumber' element value. Порядковый номер Направления, сформированного по ДТ в процессе ее оформления
     * 
     * @return value
     */
    public String getCoordReqNumber() {
        return coordReqNumber;
    }

    /** 
     * Set the 'CoordReqNumber' element value. Порядковый номер Направления, сформированного по ДТ в процессе ее оформления
     * 
     * @param coordReqNumber
     */
    public void setCoordReqNumber(String coordReqNumber) {
        this.coordReqNumber = coordReqNumber;
    }

    /** 
     * Get the 'Person' element value. Инспектора ОПСУР
     * 
     * @return value
     */
    public CustomsPersonType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Инспектора ОПСУР
     * 
     * @param person
     */
    public void setPerson(CustomsPersonType person) {
        this.person = person;
    }

    /** 
     * Get the 'DTNumber' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. Регистрационный номер ДТ
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
