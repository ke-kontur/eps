
package ru.acs.fts.schemas.album.notifinfringementgoods;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ”ведомление о соответствии/несоответствии товаров за€вленным сведени€м
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
     * Get the 'Date' element value. ƒата создани€ уведомлени€
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ƒата создани€ уведомлени€
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Time' element value. ¬рем€ создани€ уведомлени€
     * 
     * @return value
     */
    public String getTime() {
        return time;
    }

    /** 
     * Set the 'Time' element value. ¬рем€ создани€ уведомлени€
     * 
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /** 
     * Get the 'DocSign' element value. ѕризнак уведомлени€: 0 - о несоответствии прибывших товаров за€вленным сведени€м; 1 - о соответствии прибывших товаров за€вленным сведени€м
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ѕризнак уведомлени€: 0 - о несоответствии прибывших товаров за€вленным сведени€м; 1 - о соответствии прибывших товаров за€вленным сведени€м
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'EconomicOperator' element value. ”полномоченный экономический оператор
     * 
     * @return value
     */
    public CUOrganizationType getEconomicOperator() {
        return economicOperator;
    }

    /** 
     * Set the 'EconomicOperator' element value. ”полномоченный экономический оператор
     * 
     * @param economicOperator
     */
    public void setEconomicOperator(CUOrganizationType economicOperator) {
        this.economicOperator = economicOperator;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Ћицо, установившее факт соответстви€/несоответстви€ товаров за€вленным сведени€м
     * 
     * @return value
     */
    public PersonSignatureType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Ћицо, установившее факт соответстви€/несоответстви€ товаров за€вленным сведени€м
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonSignatureType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the list of 'FoundDiscrepancy' element items. ¬ы€вленное несоответствие прибывших товаров за€вленным сведени€м
     * 
     * @return list
     */
    public List<FoundDiscrepancyType> getFoundDiscrepancyList() {
        return foundDiscrepancyList;
    }

    /** 
     * Set the list of 'FoundDiscrepancy' element items. ¬ы€вленное несоответствие прибывших товаров за€вленным сведени€м
     * 
     * @param list
     */
    public void setFoundDiscrepancyList(List<FoundDiscrepancyType> list) {
        foundDiscrepancyList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. »дентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. »дентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
