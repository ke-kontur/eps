
package ru.acs.fts.schemas.album.goodsexportreq;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.GTDInqType;

/** 
 * Запрос сведений о фактически вывезенных товарах по декларации
 */
public class GoodsExportReqType extends BaseDocType
{
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private String borderPointCode;
    private CustomsType customs;
    private CustomsPersonType customsPerson;
    private List<GTDInqType> DTIDList = new ArrayList<GTDInqType>();
    private String documentModeID;

    /** 
     * Get the 'DateBegin' element value. Дата начала периода, за который запрашивается информация
     * 
     * @return value
     */
    public LocalDate getDateBegin() {
        return dateBegin;
    }

    /** 
     * Set the 'DateBegin' element value. Дата начала периода, за который запрашивается информация
     * 
     * @param dateBegin
     */
    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    /** 
     * Get the 'DateEnd' element value. Дата окончания периода, за который запрашивается информация
     * 
     * @return value
     */
    public LocalDate getDateEnd() {
        return dateEnd;
    }

    /** 
     * Set the 'DateEnd' element value. Дата окончания периода, за который запрашивается информация
     * 
     * @param dateEnd
     */
    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    /** 
     * Get the 'BorderPointCode' element value. Код пограничного пункта пропуска.
     * 
     * @return value
     */
    public String getBorderPointCode() {
        return borderPointCode;
    }

    /** 
     * Set the 'BorderPointCode' element value. Код пограничного пункта пропуска.
     * 
     * @param borderPointCode
     */
    public void setBorderPointCode(String borderPointCode) {
        this.borderPointCode = borderPointCode;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the list of 'DTID' element items. Регистрационный номер ДТ.
     * 
     * @return list
     */
    public List<GTDInqType> getDTIDList() {
        return DTIDList;
    }

    /** 
     * Set the list of 'DTID' element items. Регистрационный номер ДТ.
     * 
     * @param list
     */
    public void setDTIDList(List<GTDInqType> list) {
        DTIDList = list;
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
