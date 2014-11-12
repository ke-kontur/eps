
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * »нформаци€ о документе архива.
 */
public class AUDDocumentInfoType extends AUDArchiveDocumentInfoType
{
    private boolean isActualDocumentIndicator;
    private String archiveContainerDocumentId;
    private String customsCode;
    private AUDSignatureEvidenceType documentSignatureEvidence;
    private AUDAppliedDocumentWithBodyType appliedDocumentWithBody;

    /** 
     * Get the 'IsActualDocumentIndicator' element value. ѕризнак: €вл€етс€ ли документ актуальным (true) или нет (false).
     * 
     * @return value
     */
    public boolean isIsActualDocumentIndicator() {
        return isActualDocumentIndicator;
    }

    /** 
     * Set the 'IsActualDocumentIndicator' element value. ѕризнак: €вл€етс€ ли документ актуальным (true) или нет (false).
     * 
     * @param isActualDocumentIndicator
     */
    public void setIsActualDocumentIndicator(boolean isActualDocumentIndicator) {
        this.isActualDocumentIndicator = isActualDocumentIndicator;
    }

    /** 
     * Get the 'ArchiveContainerDocumentId' element value. јрхивный идентификатор документа-контейнера, содержащего данный документ. ”казываетс€ в случае, если документ был передан в архив на хранение не в виде самосто€тельного документа, а в составе документа-контейнера (документа вида 'ED_Container').
     * 
     * @return value
     */
    public String getArchiveContainerDocumentId() {
        return archiveContainerDocumentId;
    }

    /** 
     * Set the 'ArchiveContainerDocumentId' element value. јрхивный идентификатор документа-контейнера, содержащего данный документ. ”казываетс€ в случае, если документ был передан в архив на хранение не в виде самосто€тельного документа, а в составе документа-контейнера (документа вида 'ED_Container').
     * 
     * @param archiveContainerDocumentId
     */
    public void setArchiveContainerDocumentId(String archiveContainerDocumentId) {
        this.archiveContainerDocumentId = archiveContainerDocumentId;
    }

    /** 
     * Get the 'CustomsCode' element value.  од таможенного органа, к которому относитс€ документ.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value.  од таможенного органа, к которому относитс€ документ.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'DocumentSignatureEvidence' element value. ƒоказательства подлинности  Ё÷ѕ на документ.
     * 
     * @return value
     */
    public AUDSignatureEvidenceType getDocumentSignatureEvidence() {
        return documentSignatureEvidence;
    }

    /** 
     * Set the 'DocumentSignatureEvidence' element value. ƒоказательства подлинности  Ё÷ѕ на документ.
     * 
     * @param documentSignatureEvidence
     */
    public void setDocumentSignatureEvidence(
            AUDSignatureEvidenceType documentSignatureEvidence) {
        this.documentSignatureEvidence = documentSignatureEvidence;
    }

    /** 
     * Get the 'AppliedDocumentWithBody' element value. »нформаци€ прикладной системы о документе и, возможно, тело документа.
     * 
     * @return value
     */
    public AUDAppliedDocumentWithBodyType getAppliedDocumentWithBody() {
        return appliedDocumentWithBody;
    }

    /** 
     * Set the 'AppliedDocumentWithBody' element value. »нформаци€ прикладной системы о документе и, возможно, тело документа.
     * 
     * @param appliedDocumentWithBody
     */
    public void setAppliedDocumentWithBody(
            AUDAppliedDocumentWithBodyType appliedDocumentWithBody) {
        this.appliedDocumentWithBody = appliedDocumentWithBody;
    }
}
