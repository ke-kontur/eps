
package ru.acs.fts.schemas.album.rospriroddangerouswaste;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.DocumentType;

/** 
 * Ответ на запрос сведений  из заключения на транзит  опасных отходов по таможенной территории Таможенного союза
 */
public class RosPrirodDangerousWasteType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String authorizedPerson;
    private DocumentType conclusion;
    private CUOrganizationType receiver;
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
    public DocumentType getConclusion() {
        return conclusion;
    }

    /** 
     * Set the 'Conclusion' element value. Сведения о заключении
     * 
     * @param conclusion
     */
    public void setConclusion(DocumentType conclusion) {
        this.conclusion = conclusion;
    }

    /** 
     * Get the 'Receiver' element value. Реквизиты получателя заключения
     * 
     * @return value
     */
    public CUOrganizationType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Реквизиты получателя заключения
     * 
     * @param receiver
     */
    public void setReceiver(CUOrganizationType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the list of 'Object' element items. Опасный отход, на транзит которого выдано разрешение
     * 
     * @return list
     */
    public List<ObjectType> getObjectList() {
        return objectList;
    }

    /** 
     * Set the list of 'Object' element items. Опасный отход, на транзит которого выдано разрешение
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
