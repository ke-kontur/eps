
package ru.acs.fts.schemas.album.transferpersonexplanation;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Пояснение лица, имеющего отношение к перемещению товаров и транспортных средств через таможенную границу Российской Федерации
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
     * Get the 'DocumentDate' element value. Дата предоставления документа
     * 
     * @return value
     */
    public LocalDate getDocumentDate() {
        return documentDate;
    }

    /** 
     * Set the 'DocumentDate' element value. Дата предоставления документа
     * 
     * @param documentDate
     */
    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    /** 
     * Get the 'CustomsOffice' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. Таможенный орган
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'ExplanationPerson' element value. Лицо,  дающее пояснения
     * 
     * @return value
     */
    public ExplanationPersonType getExplanationPerson() {
        return explanationPerson;
    }

    /** 
     * Set the 'ExplanationPerson' element value. Лицо,  дающее пояснения
     * 
     * @param explanationPerson
     */
    public void setExplanationPerson(ExplanationPersonType explanationPerson) {
        this.explanationPerson = explanationPerson;
    }

    /** 
     * Get the 'Declarant' element value. Декларант или иное лицо, имеющее отношение к перемещению товаров и транспортных средств через таможенную границу Российской Федерации
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Декларант или иное лицо, имеющее отношение к перемещению товаров и транспортных средств через таможенную границу Российской Федерации
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'TransferDocs' element value. Документы, на основании которых перемещается товар
     * 
     * @return value
     */
    public TransferDocsType getTransferDocs() {
        return transferDocs;
    }

    /** 
     * Set the 'TransferDocs' element value. Документы, на основании которых перемещается товар
     * 
     * @param transferDocs
     */
    public void setTransferDocs(TransferDocsType transferDocs) {
        this.transferDocs = transferDocs;
    }

    /** 
     * Get the 'ExplanationText' element value. Текст пояснения
     * 
     * @return value
     */
    public ExplanationTextType getExplanationText() {
        return explanationText;
    }

    /** 
     * Set the 'ExplanationText' element value. Текст пояснения
     * 
     * @param explanationText
     */
    public void setExplanationText(ExplanationTextType explanationText) {
        this.explanationText = explanationText;
    }

    /** 
     * Get the 'CustomsMark' element value. Отметки таможни
     * 
     * @return value
     */
    public CustomsMarkType getCustomsMark() {
        return customsMark;
    }

    /** 
     * Set the 'CustomsMark' element value. Отметки таможни
     * 
     * @param customsMark
     */
    public void setCustomsMark(CustomsMarkType customsMark) {
        this.customsMark = customsMark;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
