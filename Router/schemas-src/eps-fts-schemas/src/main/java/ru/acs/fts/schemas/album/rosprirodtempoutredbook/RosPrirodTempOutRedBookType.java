
package ru.acs.fts.schemas.album.rosprirodtempoutredbook;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Ответ на запрос сведений из заключения (разрешения) о возможности временного вывоза диких животных и дикорастущих растений, относящихся к видам, занесенным в Красную книгу Российской Федерации
 */
public class RosPrirodTempOutRedBookType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String removalTime;
    private String authorizedPerson;
    private DocumentBaseType conclusion;
    private CUOrganizationType person;
    private CUOrganizationType recipient;
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
     * Get the 'RemovalTime' element value. Срок вывоза
     * 
     * @return value
     */
    public String getRemovalTime() {
        return removalTime;
    }

    /** 
     * Set the 'RemovalTime' element value. Срок вывоза
     * 
     * @param removalTime
     */
    public void setRemovalTime(String removalTime) {
        this.removalTime = removalTime;
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
    public DocumentBaseType getConclusion() {
        return conclusion;
    }

    /** 
     * Set the 'Conclusion' element value. Сведения о заключении
     * 
     * @param conclusion
     */
    public void setConclusion(DocumentBaseType conclusion) {
        this.conclusion = conclusion;
    }

    /** 
     * Get the 'Person' element value. Реквизиты получателя заключения
     * 
     * @return value
     */
    public CUOrganizationType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Реквизиты получателя заключения
     * 
     * @param person
     */
    public void setPerson(CUOrganizationType person) {
        this.person = person;
    }

    /** 
     * Get the 'Recipient' element value. Получатель диких животных и дикорастущих растений, относящихся к видам, занесенным в Красную книгу
     * 
     * @return value
     */
    public CUOrganizationType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. Получатель диких животных и дикорастущих растений, относящихся к видам, занесенным в Красную книгу
     * 
     * @param recipient
     */
    public void setRecipient(CUOrganizationType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the list of 'Object' element items. Животные или растения, занесённые в Красную книгу
     * 
     * @return list
     */
    public List<ObjectType> getObjectList() {
        return objectList;
    }

    /** 
     * Set the list of 'Object' element items. Животные или растения, занесённые в Красную книгу
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
