
package ru.acs.fts.schemas.album.inventory;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Документ из описи.
 */
public class InventDocumentType
{
    private String invDocCode;
    private String invDocName;
    private String invDocNumber;
    private LocalDate invDocDate;
    private String invDocLists;
    private String invDocCopies;
    private String note;
    private String archID;
    private String archDocID;
    private String inventDocumentID;
    private String inventLineID;
    private String documentFormSign;
    private String reason;
    private String serialNumber;
    private String serialNumberSign;
    private RequestDescriptionType requestDescription;
    private GoodsPresentDateType goodsPresentDate;
    private GTDIDType prevGTDNumber;
    private AddControlDescriptionType addControlDescription;

    /** 
     * Get the 'InvDocCode' element value. Код вида представляемого документа. Заполняется согласно Классификатору видов документов, используемых при заявлении сведений в графе 44 ДТ. 
     * 
     * @return value
     */
    public String getInvDocCode() {
        return invDocCode;
    }

    /** 
     * Set the 'InvDocCode' element value. Код вида представляемого документа. Заполняется согласно Классификатору видов документов, используемых при заявлении сведений в графе 44 ДТ. 
     * 
     * @param invDocCode
     */
    public void setInvDocCode(String invDocCode) {
        this.invDocCode = invDocCode;
    }

    /** 
     * Get the 'InvDocName' element value. Вид документа
     * 
     * @return value
     */
    public String getInvDocName() {
        return invDocName;
    }

    /** 
     * Set the 'InvDocName' element value. Вид документа
     * 
     * @param invDocName
     */
    public void setInvDocName(String invDocName) {
        this.invDocName = invDocName;
    }

    /** 
     * Get the 'InvDocNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getInvDocNumber() {
        return invDocNumber;
    }

    /** 
     * Set the 'InvDocNumber' element value. Номер документа
     * 
     * @param invDocNumber
     */
    public void setInvDocNumber(String invDocNumber) {
        this.invDocNumber = invDocNumber;
    }

    /** 
     * Get the 'InvDocDate' element value. Дата документа
     * 
     * @return value
     */
    public LocalDate getInvDocDate() {
        return invDocDate;
    }

    /** 
     * Set the 'InvDocDate' element value. Дата документа
     * 
     * @param invDocDate
     */
    public void setInvDocDate(LocalDate invDocDate) {
        this.invDocDate = invDocDate;
    }

    /** 
     * Get the 'InvDocLists' element value. Количество листов в документе
     * 
     * @return value
     */
    public String getInvDocLists() {
        return invDocLists;
    }

    /** 
     * Set the 'InvDocLists' element value. Количество листов в документе
     * 
     * @param invDocLists
     */
    public void setInvDocLists(String invDocLists) {
        this.invDocLists = invDocLists;
    }

    /** 
     * Get the 'InvDocCopies' element value. Количество экземпляров
     * 
     * @return value
     */
    public String getInvDocCopies() {
        return invDocCopies;
    }

    /** 
     * Set the 'InvDocCopies' element value. Количество экземпляров
     * 
     * @param invDocCopies
     */
    public void setInvDocCopies(String invDocCopies) {
        this.invDocCopies = invDocCopies;
    }

    /** 
     * Get the 'Note' element value. Примечание
     * 
     * @return value
     */
    public String getNote() {
        return note;
    }

    /** 
     * Set the 'Note' element value. Примечание
     * 
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /** 
     * Get the 'ArchID' element value. Идентификатор электронного архива декларанта
     * 
     * @return value
     */
    public String getArchID() {
        return archID;
    }

    /** 
     * Set the 'ArchID' element value. Идентификатор электронного архива декларанта
     * 
     * @param archID
     */
    public void setArchID(String archID) {
        this.archID = archID;
    }

    /** 
     * Get the 'ArchDocID' element value. Идентификатор документа в электронном архиве декларанта
     * 
     * @return value
     */
    public String getArchDocID() {
        return archDocID;
    }

    /** 
     * Set the 'ArchDocID' element value. Идентификатор документа в электронном архиве декларанта
     * 
     * @param archDocID
     */
    public void setArchDocID(String archDocID) {
        this.archDocID = archDocID;
    }

    /** 
     * Get the 'InventDocumentID' element value. Уникальный идентификатор документа, представленного в описи. Заполняется при использовании в системах электронного декларирования в случае наличия на момент составления описи указанного документа в электронном виде.
     * 
     * @return value
     */
    public String getInventDocumentID() {
        return inventDocumentID;
    }

    /** 
     * Set the 'InventDocumentID' element value. Уникальный идентификатор документа, представленного в описи. Заполняется при использовании в системах электронного декларирования в случае наличия на момент составления описи указанного документа в электронном виде.
     * 
     * @param inventDocumentID
     */
    public void setInventDocumentID(String inventDocumentID) {
        this.inventDocumentID = inventDocumentID;
    }

    /** 
     * Get the 'InventLineID' element value. Уникальный идентификатор строки в описи. GUID. Обязателен для заполнения при использовании в системах электронного декларирования.
     * 
     * @return value
     */
    public String getInventLineID() {
        return inventLineID;
    }

    /** 
     * Set the 'InventLineID' element value. Уникальный идентификатор строки в описи. GUID. Обязателен для заполнения при использовании в системах электронного декларирования.
     * 
     * @param inventLineID
     */
    public void setInventLineID(String inventLineID) {
        this.inventLineID = inventLineID;
    }

    /** 
     * Get the 'DocumentFormSign' element value. Признак формы представления документа. 0 - в электронной форме, 1 - в виде бумажного документа
     * 
     * @return value
     */
    public String getDocumentFormSign() {
        return documentFormSign;
    }

    /** 
     * Set the 'DocumentFormSign' element value. Признак формы представления документа. 0 - в электронной форме, 1 - в виде бумажного документа
     * 
     * @param documentFormSign
     */
    public void setDocumentFormSign(String documentFormSign) {
        this.documentFormSign = documentFormSign;
    }

    /** 
     * Get the 'Reason' element value. Причины, по которым невозможно предоставить документ
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. Причины, по которым невозможно предоставить документ
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'SerialNumber' element value. Порядковый номер ЭПДТ в последовательности ЭПДТ, подаваемых на одну ЭВДТ
     * 
     * @return value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** 
     * Set the 'SerialNumber' element value. Порядковый номер ЭПДТ в последовательности ЭПДТ, подаваемых на одну ЭВДТ
     * 
     * @param serialNumber
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /** 
     * Get the 'SerialNumberSign' element value. Признак того, что данный документ (ЭПДТ) является последним в последовательности
     * 
     * @return value
     */
    public String getSerialNumberSign() {
        return serialNumberSign;
    }

    /** 
     * Set the 'SerialNumberSign' element value. Признак того, что данный документ (ЭПДТ) является последним в последовательности
     * 
     * @param serialNumberSign
     */
    public void setSerialNumberSign(String serialNumberSign) {
        this.serialNumberSign = serialNumberSign;
    }

    /** 
     * Get the 'RequestDescription' element value. Описание запроса, по которому предоставляется документ
     * 
     * @return value
     */
    public RequestDescriptionType getRequestDescription() {
        return requestDescription;
    }

    /** 
     * Set the 'RequestDescription' element value. Описание запроса, по которому предоставляется документ
     * 
     * @param requestDescription
     */
    public void setRequestDescription(RequestDescriptionType requestDescription) {
        this.requestDescription = requestDescription;
    }

    /** 
     * Get the 'GoodsPresentDate' element value. Дата представления товарной партии
     * 
     * @return value
     */
    public GoodsPresentDateType getGoodsPresentDate() {
        return goodsPresentDate;
    }

    /** 
     * Set the 'GoodsPresentDate' element value. Дата представления товарной партии
     * 
     * @param goodsPresentDate
     */
    public void setGoodsPresentDate(GoodsPresentDateType goodsPresentDate) {
        this.goodsPresentDate = goodsPresentDate;
    }

    /** 
     * Get the 'PrevGTDNumber' element value. Номер предшествующей ДТ, к которой ранее был приложен документ.
     * 
     * @return value
     */
    public GTDIDType getPrevGTDNumber() {
        return prevGTDNumber;
    }

    /** 
     * Set the 'PrevGTDNumber' element value. Номер предшествующей ДТ, к которой ранее был приложен документ.
     * 
     * @param prevGTDNumber
     */
    public void setPrevGTDNumber(GTDIDType prevGTDNumber) {
        this.prevGTDNumber = prevGTDNumber;
    }

    /** 
     * Get the 'AddControlDescription' element value. Описание решения о проведении дополнительной проверки, по которому предоставляется документ.
     * 
     * @return value
     */
    public AddControlDescriptionType getAddControlDescription() {
        return addControlDescription;
    }

    /** 
     * Set the 'AddControlDescription' element value. Описание решения о проведении дополнительной проверки, по которому предоставляется документ.
     * 
     * @param addControlDescription
     */
    public void setAddControlDescription(
            AddControlDescriptionType addControlDescription) {
        this.addControlDescription = addControlDescription;
    }
}
