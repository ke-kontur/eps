
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ��������� ������.
 */
public class AUDDocumentInfoType extends AUDArchiveDocumentInfoType
{
    private boolean isActualDocumentIndicator;
    private String archiveContainerDocumentId;
    private String customsCode;
    private AUDSignatureEvidenceType documentSignatureEvidence;
    private AUDAppliedDocumentWithBodyType appliedDocumentWithBody;

    /** 
     * Get the 'IsActualDocumentIndicator' element value. �������: �������� �� �������� ���������� (true) ��� ��� (false).
     * 
     * @return value
     */
    public boolean isIsActualDocumentIndicator() {
        return isActualDocumentIndicator;
    }

    /** 
     * Set the 'IsActualDocumentIndicator' element value. �������: �������� �� �������� ���������� (true) ��� ��� (false).
     * 
     * @param isActualDocumentIndicator
     */
    public void setIsActualDocumentIndicator(boolean isActualDocumentIndicator) {
        this.isActualDocumentIndicator = isActualDocumentIndicator;
    }

    /** 
     * Get the 'ArchiveContainerDocumentId' element value. �������� ������������� ���������-����������, ����������� ������ ��������. ����������� � ������, ���� �������� ��� ������� � ����� �� �������� �� � ���� ���������������� ���������, � � ������� ���������-���������� (��������� ���� 'ED_Container').
     * 
     * @return value
     */
    public String getArchiveContainerDocumentId() {
        return archiveContainerDocumentId;
    }

    /** 
     * Set the 'ArchiveContainerDocumentId' element value. �������� ������������� ���������-����������, ����������� ������ ��������. ����������� � ������, ���� �������� ��� ������� � ����� �� �������� �� � ���� ���������������� ���������, � � ������� ���������-���������� (��������� ���� 'ED_Container').
     * 
     * @param archiveContainerDocumentId
     */
    public void setArchiveContainerDocumentId(String archiveContainerDocumentId) {
        this.archiveContainerDocumentId = archiveContainerDocumentId;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, � �������� ��������� ��������.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, � �������� ��������� ��������.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'DocumentSignatureEvidence' element value. �������������� �����������  ��� �� ��������.
     * 
     * @return value
     */
    public AUDSignatureEvidenceType getDocumentSignatureEvidence() {
        return documentSignatureEvidence;
    }

    /** 
     * Set the 'DocumentSignatureEvidence' element value. �������������� �����������  ��� �� ��������.
     * 
     * @param documentSignatureEvidence
     */
    public void setDocumentSignatureEvidence(
            AUDSignatureEvidenceType documentSignatureEvidence) {
        this.documentSignatureEvidence = documentSignatureEvidence;
    }

    /** 
     * Get the 'AppliedDocumentWithBody' element value. ���������� ���������� ������� � ��������� �, ��������, ���� ���������.
     * 
     * @return value
     */
    public AUDAppliedDocumentWithBodyType getAppliedDocumentWithBody() {
        return appliedDocumentWithBody;
    }

    /** 
     * Set the 'AppliedDocumentWithBody' element value. ���������� ���������� ������� � ��������� �, ��������, ���� ���������.
     * 
     * @param appliedDocumentWithBody
     */
    public void setAppliedDocumentWithBody(
            AUDAppliedDocumentWithBodyType appliedDocumentWithBody) {
        this.appliedDocumentWithBody = appliedDocumentWithBody;
    }
}
