
package ru.acs.fts.schemas.album.bdrd_request;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Запрос сведений РД
 */
public class BDRDRequestType extends BaseDocType
{
    private CustomsDocumentType customsDocument;
    private List<RequestedDataType> requestedDataList = new ArrayList<RequestedDataType>();
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private String documentModeID;

    /** 
     * Get the 'CustomsDocument' element value. Таможенный документ, при оформлении которого использован разрешительный документ
     * 
     * @return value
     */
    public CustomsDocumentType getCustomsDocument() {
        return customsDocument;
    }

    /** 
     * Set the 'CustomsDocument' element value. Таможенный документ, при оформлении которого использован разрешительный документ
     * 
     * @param customsDocument
     */
    public void setCustomsDocument(CustomsDocumentType customsDocument) {
        this.customsDocument = customsDocument;
    }

    /** 
     * Get the list of 'RequestedData' element items. Запрашиваемые сведения
     * 
     * @return list
     */
    public List<RequestedDataType> getRequestedDataList() {
        return requestedDataList;
    }

    /** 
     * Set the list of 'RequestedData' element items. Запрашиваемые сведения
     * 
     * @param list
     */
    public void setRequestedDataList(List<RequestedDataType> list) {
        requestedDataList = list;
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
