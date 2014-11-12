
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Финансовые документы.
 */
public class FinancialDocumentsType
{
    private String finDocumentCode;
    private String finDocumentNumber;
    private LocalDate presentingDate;
    private ReExpFinDocumentType reExpFinDocument;
    private GTDIDType gtdRegNumber;

    /** 
     * Get the 'FinDocumentCode' element value. Вид представленного документа. 1- ПС; 2 - ПСб; 3 - ДТ .
     * 
     * @return value
     */
    public String getFinDocumentCode() {
        return finDocumentCode;
    }

    /** 
     * Set the 'FinDocumentCode' element value. Вид представленного документа. 1- ПС; 2 - ПСб; 3 - ДТ .
     * 
     * @param finDocumentCode
     */
    public void setFinDocumentCode(String finDocumentCode) {
        this.finDocumentCode = finDocumentCode;
    }

    /** 
     * Get the 'FinDocumentNumber' element value. Номер представленного ПС/ПСб.
     * 
     * @return value
     */
    public String getFinDocumentNumber() {
        return finDocumentNumber;
    }

    /** 
     * Set the 'FinDocumentNumber' element value. Номер представленного ПС/ПСб.
     * 
     * @param finDocumentNumber
     */
    public void setFinDocumentNumber(String finDocumentNumber) {
        this.finDocumentNumber = finDocumentNumber;
    }

    /** 
     * Get the 'PresentingDate' element value. Дата представления недостающего документа / сведений; Дата представления копии таможенной декларации, указанной под номером 1.3 (если она не может быть представлена одновременно с ДТ) 
     * 
     * @return value
     */
    public LocalDate getPresentingDate() {
        return presentingDate;
    }

    /** 
     * Set the 'PresentingDate' element value. Дата представления недостающего документа / сведений; Дата представления копии таможенной декларации, указанной под номером 1.3 (если она не может быть представлена одновременно с ДТ) 
     * 
     * @param presentingDate
     */
    public void setPresentingDate(LocalDate presentingDate) {
        this.presentingDate = presentingDate;
    }

    /** 
     * Get the 'ReExpFinDocument' element value. Сведения о паспорте сделки при ввозе товаров в режиме реэкспорта без предварительного помещения под другой таможенный режим
     * 
     * @return value
     */
    public ReExpFinDocumentType getReExpFinDocument() {
        return reExpFinDocument;
    }

    /** 
     * Set the 'ReExpFinDocument' element value. Сведения о паспорте сделки при ввозе товаров в режиме реэкспорта без предварительного помещения под другой таможенный режим
     * 
     * @param reExpFinDocument
     */
    public void setReExpFinDocument(ReExpFinDocumentType reExpFinDocument) {
        this.reExpFinDocument = reExpFinDocument;
    }

    /** 
     * Get the 'GtdRegNumber' element value. Регистрационный номер ДТ, в которой предоставлялись паспорта сделок.
     * 
     * @return value
     */
    public GTDIDType getGtdRegNumber() {
        return gtdRegNumber;
    }

    /** 
     * Set the 'GtdRegNumber' element value. Регистрационный номер ДТ, в которой предоставлялись паспорта сделок.
     * 
     * @param gtdRegNumber
     */
    public void setGtdRegNumber(GTDIDType gtdRegNumber) {
        this.gtdRegNumber = gtdRegNumber;
    }
}
