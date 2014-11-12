
package ru.acs.fts.schemas.album.rosprirodpoisonoussubstances;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.ConclusionType;

/** 
 * Ответ на запрос сведений  из заключения на ввоз / вывоз / транзит образцов ядовитых веществ
 */
public class RosPrirodPoisonousSubstancesType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String info;
    private String TNVED;
    private String authorizedPerson;
    private ConclusionType conclusion;
    private CUOrganizationType sender;
    private CUOrganizationType receiver;
    private SupplementaryQuantityType count;
    private DocumentBaseType contract;
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
     * Get the 'Info' element value. Описание ядовитых веществ
     * 
     * @return value
     */
    public String getInfo() {
        return info;
    }

    /** 
     * Set the 'Info' element value. Описание ядовитых веществ
     * 
     * @param info
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /** 
     * Get the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @return value
     */
    public String getTNVED() {
        return TNVED;
    }

    /** 
     * Set the 'TNVED' element value. Код ТН ВЭД ТС
     * 
     * @param TNVED
     */
    public void setTNVED(String TNVED) {
        this.TNVED = TNVED;
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
     * Get the 'Sender' element value. Отправитель
     * 
     * @return value
     */
    public CUOrganizationType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. Отправитель
     * 
     * @param sender
     */
    public void setSender(CUOrganizationType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Receiver' element value. Получатель
     * 
     * @return value
     */
    public CUOrganizationType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Получатель
     * 
     * @param receiver
     */
    public void setReceiver(CUOrganizationType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'Count' element value. Количество
     * 
     * @return value
     */
    public SupplementaryQuantityType getCount() {
        return count;
    }

    /** 
     * Set the 'Count' element value. Количество
     * 
     * @param count
     */
    public void setCount(SupplementaryQuantityType count) {
        this.count = count;
    }

    /** 
     * Get the 'Contract' element value. Реквизиты контракта
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. Реквизиты контракта
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
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
