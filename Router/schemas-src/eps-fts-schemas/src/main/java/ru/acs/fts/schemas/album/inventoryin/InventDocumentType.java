
package ru.acs.fts.schemas.album.inventoryin;

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
    private String documentFormSign;
    private String presentDocumentType;
    private String serialNumber;
    private String serialNumberSign;
    private RequestDescriptionType requestDescription;
    private GTDIDType prevGTDNumber;
    private AddControlDescriptionType addControlDescription;

    /** 
     * Get the 'InvDocCode' element value. Код вида представляемого документа. Заполняется согласно Классификатору видов документов, используемых при заявлении сведений в графе 44 ДТ
     * 
     * @return value
     */
    public String getInvDocCode() {
        return invDocCode;
    }

    /** 
     * Set the 'InvDocCode' element value. Код вида представляемого документа. Заполняется согласно Классификатору видов документов, используемых при заявлении сведений в графе 44 ДТ
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
     * Get the 'DocumentFormSign' element value. Признак формы представления документа. 0 - в электронной форме, 1 - в виде бумажного документа.
     * 
     * @return value
     */
    public String getDocumentFormSign() {
        return documentFormSign;
    }

    /** 
     * Set the 'DocumentFormSign' element value. Признак формы представления документа. 0 - в электронной форме, 1 - в виде бумажного документа.
     * 
     * @param documentFormSign
     */
    public void setDocumentFormSign(String documentFormSign) {
        this.documentFormSign = documentFormSign;
    }

    /** 
     * Get the 'PresentDocumentType' element value. Признак представления документа в формализованном виде: "0" - в произвольном виде; "1" - в формализованном виде.
     * 
     * @return value
     */
    public String getPresentDocumentType() {
        return presentDocumentType;
    }

    /** 
     * Set the 'PresentDocumentType' element value. Признак представления документа в формализованном виде: "0" - в произвольном виде; "1" - в формализованном виде.
     * 
     * @param presentDocumentType
     */
    public void setPresentDocumentType(String presentDocumentType) {
        this.presentDocumentType = presentDocumentType;
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
     * Get the 'RequestDescription' element value. Описание запроса, по которому предоставляется документ.
     * 
     * @return value
     */
    public RequestDescriptionType getRequestDescription() {
        return requestDescription;
    }

    /** 
     * Set the 'RequestDescription' element value. Описание запроса, по которому предоставляется документ.
     * 
     * @param requestDescription
     */
    public void setRequestDescription(RequestDescriptionType requestDescription) {
        this.requestDescription = requestDescription;
    }

    /** 
     * Get the 'PrevGTDNumber' element value. Справочный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getPrevGTDNumber() {
        return prevGTDNumber;
    }

    /** 
     * Set the 'PrevGTDNumber' element value. Справочный номер ДТ
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
