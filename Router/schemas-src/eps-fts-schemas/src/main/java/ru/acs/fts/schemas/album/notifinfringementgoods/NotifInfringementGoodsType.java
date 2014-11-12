
package ru.acs.fts.schemas.album.notifinfringementgoods;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Уведомление о соответствии/несоответствии товаров заявленным сведениям
 */
public class NotifInfringementGoodsType extends BaseDocType
{
    private LocalDate date;
    private String time;
    private String docSign;
    private CUOrganizationType economicOperator;
    private PersonSignatureType authorizedPerson;
    private List<FoundDiscrepancyType> foundDiscrepancyList = new ArrayList<FoundDiscrepancyType>();
    private String documentModeID;

    /** 
     * Get the 'Date' element value. Дата создания уведомления
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата создания уведомления
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. Время создания уведомления
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. Время создания уведомления
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'DocSign' element value. Признак уведомления: 0 - о несоответствии прибывших товаров заявленным сведениям; 1 - о соответствии прибывших товаров заявленным сведениям
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак уведомления: 0 - о несоответствии прибывших товаров заявленным сведениям; 1 - о соответствии прибывших товаров заявленным сведениям
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'EconomicOperator' element value. Уполномоченный экономический оператор
     * 
     * @return value
     */
    public CUOrganizationType getEconomicOperator() {
        return economicOperator;
    }

    /** 
     * Set the 'EconomicOperator' element value. Уполномоченный экономический оператор
     * 
     * @param economicOperator
     */
    public void setEconomicOperator(CUOrganizationType economicOperator) {
        this.economicOperator = economicOperator;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Лицо, установившее факт соответствия/несоответствия товаров заявленным сведениям
     * 
     * @return value
     */
    public PersonSignatureType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Лицо, установившее факт соответствия/несоответствия товаров заявленным сведениям
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonSignatureType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the list of 'FoundDiscrepancy' element items. Выявленное несоответствие прибывших товаров заявленным сведениям
     * 
     * @return list
     */
    public List<FoundDiscrepancyType> getFoundDiscrepancyList() {
        return foundDiscrepancyList;
    }

    /** 
     * Set the list of 'FoundDiscrepancy' element items. Выявленное несоответствие прибывших товаров заявленным сведениям
     * 
     * @param list
     */
    public void setFoundDiscrepancyList(List<FoundDiscrepancyType> list) {
        foundDiscrepancyList = list;
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
