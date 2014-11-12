
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Выписка из Единого государственного реестра прав на объект недвижимого имущества и сделок с ним
 */
public class RealEstateResponseType extends BaseDocType
{
    private String docSign;
    private String recipient;
    private LocalDate excerptDate;
    private String refusalReasons;
    private List<ExcerptObjectType> excerptObjectList = new ArrayList<ExcerptObjectType>();
    private List<ResourceOrgType> resourceOrgList = new ArrayList<ResourceOrgType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Признак документа: 1 - выписка из ЕГРП; 2 - отсутствие сведений по запросу; 3 - отказ в выдаче сведений
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 1 - выписка из ЕГРП; 2 - отсутствие сведений по запросу; 3 - отказ в выдаче сведений
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'Recipient' element value. Описание получателя информации
     * 
     * @return value
     */
    public String getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. Описание получателя информации
     * 
     * @param recipient
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'ExcerptDate' element value. Дата выписки/справки/сообщения
     * 
     * @return value
     */
    public LocalDate getExcerptDate() {
        return excerptDate;
    }

    /** 
     * Set the 'ExcerptDate' element value. Дата выписки/справки/сообщения
     * 
     * @param excerptDate
     */
    public void setExcerptDate(LocalDate excerptDate) {
        this.excerptDate = excerptDate;
    }

    /** 
     * Get the 'RefusalReasons' element value. Текст отказа
     * 
     * @return value
     */
    public String getRefusalReasons() {
        return refusalReasons;
    }

    /** 
     * Set the 'RefusalReasons' element value. Текст отказа
     * 
     * @param refusalReasons
     */
    public void setRefusalReasons(String refusalReasons) {
        this.refusalReasons = refusalReasons;
    }

    /** 
     * Get the list of 'ExcerptObject' element items. Информация из ЕГРП
     * 
     * @return list
     */
    public List<ExcerptObjectType> getExcerptObjectList() {
        return excerptObjectList;
    }

    /** 
     * Set the list of 'ExcerptObject' element items. Информация из ЕГРП
     * 
     * @param list
     */
    public void setExcerptObjectList(List<ExcerptObjectType> list) {
        excerptObjectList = list;
    }

    /** 
     * Get the list of 'ResourceOrg' element items. Орган - источник информации
     * 
     * @return list
     */
    public List<ResourceOrgType> getResourceOrgList() {
        return resourceOrgList;
    }

    /** 
     * Set the list of 'ResourceOrg' element items. Орган - источник информации
     * 
     * @param list
     */
    public void setResourceOrgList(List<ResourceOrgType> list) {
        resourceOrgList = list;
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
