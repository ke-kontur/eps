
package ru.acs.fts.schemas.album.graphicdocrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Обращение за разрешением представить документы в виде графических документов
 */
public class GraphicDocRequestType extends BaseDocType
{
    private GTDIDType regNumberDT;
    private CUOrganizationType requestPerson;
    private List<DocumentType> documentList = new ArrayList<DocumentType>();
    private String documentModeID;

    /** 
     * Get the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. Регистрационный номер ДТ
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }

    /** 
     * Get the 'RequestPerson' element value. Сведения о лице, подающем документ(ы)
     * 
     * @return value
     */
    public CUOrganizationType getRequestPerson() {
        return requestPerson;
    }

    /** 
     * Set the 'RequestPerson' element value. Сведения о лице, подающем документ(ы)
     * 
     * @param requestPerson
     */
    public void setRequestPerson(CUOrganizationType requestPerson) {
        this.requestPerson = requestPerson;
    }

    /** 
     * Get the list of 'Document' element items. Документ
     * 
     * @return list
     */
    public List<DocumentType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items. Документ
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentType> list) {
        documentList = list;
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
