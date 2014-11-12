
package ru.acs.fts.schemas.album.atdclosecontrol;

import org.joda.time.LocalDate;

/** 
 * Причины закрытия
 */
public class CloseReasonType
{
    private String reasonCode;
    private String inspectorNotice;
    private String LNP;
    private LocalDate closeDate;
    private NormativeDocumentType checkNormativeDocument;

    /** 
     * Get the 'ReasonCode' element value. Код причины закрытия в соответствии со Справочником причин закрытия
     * 
     * @return value
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /** 
     * Set the 'ReasonCode' element value. Код причины закрытия в соответствии со Справочником причин закрытия
     * 
     * @param reasonCode
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /** 
     * Get the 'InspectorNotice' element value. Примечания инспектора
     * 
     * @return value
     */
    public String getInspectorNotice() {
        return inspectorNotice;
    }

    /** 
     * Set the 'InspectorNotice' element value. Примечания инспектора
     * 
     * @param inspectorNotice
     */
    public void setInspectorNotice(String inspectorNotice) {
        this.inspectorNotice = inspectorNotice;
    }

    /** 
     * Get the 'LNP' element value. ЛНП инспектора, закрывшего ПЗК
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ЛНП инспектора, закрывшего ПЗК
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'CloseDate' element value. Дата закрытия ошибки по ПЗК
     * 
     * @return value
     */
    public LocalDate getCloseDate() {
        return closeDate;
    }

    /** 
     * Set the 'CloseDate' element value. Дата закрытия ошибки по ПЗК
     * 
     * @param closeDate
     */
    public void setCloseDate(LocalDate closeDate) {
        this.closeDate = closeDate;
    }

    /** 
     * Get the 'CheckNormativeDocument' element value. Нормативный документ, в соответствии с которым выполняется закрытие
     * 
     * @return value
     */
    public NormativeDocumentType getCheckNormativeDocument() {
        return checkNormativeDocument;
    }

    /** 
     * Set the 'CheckNormativeDocument' element value. Нормативный документ, в соответствии с которым выполняется закрытие
     * 
     * @param checkNormativeDocument
     */
    public void setCheckNormativeDocument(
            NormativeDocumentType checkNormativeDocument) {
        this.checkNormativeDocument = checkNormativeDocument;
    }
}
