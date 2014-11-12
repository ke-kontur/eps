
package ru.acs.fts.schemas.album.rosprirodcollectionmaterial;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.ConclusionType;

/** 
 * Ответ на запрос сведений из заключения (разрешительного документа) о возможности осуществления вывоза коллекционных материалов по минералогии, палеонтологии, костей ископаемых животных
 */
public class RosPrirodCollectionMaterialType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String documentId;
    private String countryDestionation;
    private String purposeExport;
    private String removalTime;
    private String authorizedPerson;
    private ConclusionType conclusion;
    private CUOrganizationType receiver;
    private List<ItemType> itemList = new ArrayList<ItemType>();
    private DocumentBaseType documentBase;
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
     * Get the 'CountryDestionation' element value. Страна назначения
     * 
     * @return value
     */
    public String getCountryDestionation() {
        return countryDestionation;
    }

    /** 
     * Set the 'CountryDestionation' element value. Страна назначения
     * 
     * @param countryDestionation
     */
    public void setCountryDestionation(String countryDestionation) {
        this.countryDestionation = countryDestionation;
    }

    /** 
     * Get the 'PurposeExport' element value. Цель вывоза
     * 
     * @return value
     */
    public String getPurposeExport() {
        return purposeExport;
    }

    /** 
     * Set the 'PurposeExport' element value. Цель вывоза
     * 
     * @param purposeExport
     */
    public void setPurposeExport(String purposeExport) {
        this.purposeExport = purposeExport;
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
     * Get the 'AuthorizedPerson' element value. Уполномоченное должностное лицо
     * 
     * @return value
     */
    public String getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. Уполномоченное должностное лицо
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(String authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the 'Conclusion' element value. Заключение
     * 
     * @return value
     */
    public ConclusionType getConclusion() {
        return conclusion;
    }

    /** 
     * Set the 'Conclusion' element value. Заключение
     * 
     * @param conclusion
     */
    public void setConclusion(ConclusionType conclusion) {
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
     * Get the list of 'Items' element items. Список предметов и их количество
     * 
     * @return list
     */
    public List<ItemType> getItemList() {
        return itemList;
    }

    /** 
     * Set the list of 'Items' element items. Список предметов и их количество
     * 
     * @param list
     */
    public void setItemList(List<ItemType> list) {
        itemList = list;
    }

    /** 
     * Get the 'DocumentBase' element value. Основание
     * 
     * @return value
     */
    public DocumentBaseType getDocumentBase() {
        return documentBase;
    }

    /** 
     * Set the 'DocumentBase' element value. Основание
     * 
     * @param documentBase
     */
    public void setDocumentBase(DocumentBaseType documentBase) {
        this.documentBase = documentBase;
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
