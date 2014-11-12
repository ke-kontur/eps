
package ru.acs.fts.schemas.album.archadddocrequest;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.electronicarchivecommonaggregatetypescust.ArchBaseType;

/** 
 * Запрос на помещение документа в архив
 */
public class ArchAddDocRequestType extends ArchBaseType
{
    private LocalDate documentBeginDate;
    private LocalDate documentEndDate;
    private String docCode;
    private ArchDocType archDoc;
    private DocumentBaseType docBaseInfo;
    private String documentModeID;

    /** 
     * Get the 'DocumentBeginDate' element value. Дата начала действия документа
     * 
     * @return value
     */
    public LocalDate getDocumentBeginDate() {
        return documentBeginDate;
    }

    /** 
     * Set the 'DocumentBeginDate' element value. Дата начала действия документа
     * 
     * @param documentBeginDate
     */
    public void setDocumentBeginDate(LocalDate documentBeginDate) {
        this.documentBeginDate = documentBeginDate;
    }

    /** 
     * Get the 'DocumentEndDate' element value. Дата окончания действия документа
     * 
     * @return value
     */
    public LocalDate getDocumentEndDate() {
        return documentEndDate;
    }

    /** 
     * Set the 'DocumentEndDate' element value. Дата окончания действия документа
     * 
     * @param documentEndDate
     */
    public void setDocumentEndDate(LocalDate documentEndDate) {
        this.documentEndDate = documentEndDate;
    }

    /** 
     * Get the 'DocCode' element value. Код вида запрашиваемого документа (заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @return value
     */
    public String getDocCode() {
        return docCode;
    }

    /** 
     * Set the 'DocCode' element value. Код вида запрашиваемого документа (заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44)
     * 
     * @param docCode
     */
    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    /** 
     * Get the 'ArchDoc' element value. Документ, помещаемый в архив
     * 
     * @return value
     */
    public ArchDocType getArchDoc() {
        return archDoc;
    }

    /** 
     * Set the 'ArchDoc' element value. Документ, помещаемый в архив
     * 
     * @param archDoc
     */
    public void setArchDoc(ArchDocType archDoc) {
        this.archDoc = archDoc;
    }

    /** 
     * Get the 'DocBaseInfo' element value. Базовые сведения о документе
     * 
     * @return value
     */
    public DocumentBaseType getDocBaseInfo() {
        return docBaseInfo;
    }

    /** 
     * Set the 'DocBaseInfo' element value. Базовые сведения о документе
     * 
     * @param docBaseInfo
     */
    public void setDocBaseInfo(DocumentBaseType docBaseInfo) {
        this.docBaseInfo = docBaseInfo;
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
