
package ru.acs.fts.schemas.album.transferpersonexplanation;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ��������� ����, �������� ��������� � ����������� ������� � ������������ ������� ����� ���������� ������� ���������� ���������
 */
public class TransferPersonExplanationType extends BaseDocType
{
    private LocalDate documentDate;
    private CustomsType customsOffice;
    private ExplanationPersonType explanationPerson;
    private DeclarantType declarant;
    private TransferDocsType transferDocs;
    private ExplanationTextType explanationText;
    private CustomsMarkType customsMark;
    private String documentModeID;

    /** 
     * Get the 'DocumentDate' element value. ���� �������������� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. ���� �������������� ���������
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'CustomsOffice' element value. ���������� �����
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. ���������� �����
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'ExplanationPerson' element value. ����,  ������ ���������
     * 
     * @return value
     */
    public ExplanationPersonType getExplanationPerson() {
        return explanationPerson;
    }

    /** 
     * Set the 'ExplanationPerson' element value. ����,  ������ ���������
     * 
     * @param explanationPerson
     */
    public void setExplanationPerson(ExplanationPersonType explanationPerson) {
        this.explanationPerson = explanationPerson;
    }

    /** 
     * Get the 'Declarant' element value. ��������� ��� ���� ����, ������� ��������� � ����������� ������� � ������������ ������� ����� ���������� ������� ���������� ���������
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. ��������� ��� ���� ����, ������� ��������� � ����������� ������� � ������������ ������� ����� ���������� ������� ���������� ���������
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'TransferDocs' element value. ���������, �� ��������� ������� ������������ �����
     * 
     * @return value
     */
    public TransferDocsType getTransferDocs() {
        return transferDocs;
    }

    /** 
     * Set the 'TransferDocs' element value. ���������, �� ��������� ������� ������������ �����
     * 
     * @param transferDocs
     */
    public void setTransferDocs(TransferDocsType transferDocs) {
        this.transferDocs = transferDocs;
    }

    /** 
     * Get the 'ExplanationText' element value. ����� ���������
     * 
     * @return value
     */
    public ExplanationTextType getExplanationText() {
        return explanationText;
    }

    /** 
     * Set the 'ExplanationText' element value. ����� ���������
     * 
     * @param explanationText
     */
    public void setExplanationText(ExplanationTextType explanationText) {
        this.explanationText = explanationText;
    }

    /** 
     * Get the 'CustomsMark' element value. ������� �������
     * 
     * @return value
     */
    public CustomsMarkType getCustomsMark() {
        return customsMark;
    }

    /** 
     * Set the 'CustomsMark' element value. ������� �������
     * 
     * @param customsMark
     */
    public void setCustomsMark(CustomsMarkType customsMark) {
        this.customsMark = customsMark;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
