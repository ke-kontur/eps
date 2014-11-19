
package ru.acs.fts.schemas.album.eps_docresponse;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Предоставление документа по запросу ТО
 */
public class EPSDocResponseType extends BaseDocType
{
    private ArchDocInfoType archDocumentInfo;
    private DocResponseType docResponse;
    private PersonBaseType responcePerson;
    private ArchiveInformationType archiveInformation;
    private String documentModeID;

    /** 
     * Get the 'ArchDocumentInfo' element value. Информация архива декларанта
     * 
     * @return value
     */
    public ArchDocInfoType getArchDocumentInfo() {
        return archDocumentInfo;
    }

    /** 
     * Set the 'ArchDocumentInfo' element value. Информация архива декларанта
     * 
     * @param archDocumentInfo
     */
    public void setArchDocumentInfo(ArchDocInfoType archDocumentInfo) {
        this.archDocumentInfo = archDocumentInfo;
    }

    /** 
     * Get the 'DocResponse' element value. Запрошенный документ
     * 
     * @return value
     */
    public DocResponseType getDocResponse() {
        return docResponse;
    }

    /** 
     * Set the 'DocResponse' element value. Запрошенный документ
     * 
     * @param docResponse
     */
    public void setDocResponse(DocResponseType docResponse) {
        this.docResponse = docResponse;
    }

    /** 
     * Get the 'ResponcePerson' element value. Лицо, предоставляющее запрошенный документ.
     * 
     * @return value
     */
    public PersonBaseType getResponcePerson() {
        return responcePerson;
    }

    /** 
     * Set the 'ResponcePerson' element value. Лицо, предоставляющее запрошенный документ.
     * 
     * @param responcePerson
     */
    public void setResponcePerson(PersonBaseType responcePerson) {
        this.responcePerson = responcePerson;
    }

    /** 
     * Get the 'ArchiveInformation' element value. Информация из архива
     * 
     * @return value
     */
    public ArchiveInformationType getArchiveInformation() {
        return archiveInformation;
    }

    /** 
     * Set the 'ArchiveInformation' element value. Информация из архива
     * 
     * @param archiveInformation
     */
    public void setArchiveInformation(ArchiveInformationType archiveInformation) {
        this.archiveInformation = archiveInformation;
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
