
package ru.acs.fts.schemas.album.rosprirodtranzitnodrugs;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.ConclusionType;

/** 
 * Ответ на запрос разрешений на транзит ядовитых веществ, выдаваемые согласно п.13 Положения к разделу 2.13 Единого перечня "О порядке ввоза, вывоза и транзита ядовитых веществ, не являющихся прекурсорами наркотических средств и психотропных веществ, по таможенной территории Таможенного союза"
 */
public class RosPrirodTranzitNoDrugsType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String authorizedPerson;
    private ConclusionType conclusion;
    private List<ObjectType> objectList = new ArrayList<ObjectType>();
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocumentId' element value. Id документа
     * 
     * @return value
     */
    public String getDocumentId() {
        return documentId;
    }

    /** 
     * Set the 'DocumentId' element value. Id документа
     * 
     * @param documentId
     */
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. Уполномоченное должностное лицо, подписавшее заключение
     * 
     * @return value
     */
    public String getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Уполномоченное должностное лицо, подписавшее заключение
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(String authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'Conclusion' element value. Сведения о заключении
     * 
     * @return value
     */
    public ConclusionType getConclusion() {
        return conclusion;
    }

    /** 
     * Set the 'Conclusion' element value. Сведения о заключении
     * 
     * @param conclusion
     */
    public void setConclusion(ConclusionType conclusion) {
        this.conclusion = conclusion;
    }

    /** 
     * Get the list of 'Object' element items. Ядовитое вещество, на транзит которого выдано разрешение
     * 
     * @return list
     */
    public List<ObjectType> getObjectList() {
        return objectList;
    }

    /** 
     * Set the list of 'Object' element items. Ядовитое вещество, на транзит которого выдано разрешение
     * 
     * @param list
     */
    public void setObjectList(List<ObjectType> list) {
        objectList = list;
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
