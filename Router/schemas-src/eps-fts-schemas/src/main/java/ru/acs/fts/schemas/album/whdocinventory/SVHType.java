
package ru.acs.fts.schemas.album.whdocinventory;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.warehousecommonleaftypescust.WareHouseCertificateKind;

/** 
 * СВХ
 */
public class SVHType
{
    private WareHouseCertificateKind documentModeCode;
    private String documentNumber;
    private LocalDate DO1PresentDocumentDate;
    private String DO1PresentDocumentTime;

    /** 
     * Get the 'DocumentModeCode' element value. Тип документа.
     * 
     * @return value
     */
    public WareHouseCertificateKind getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. Тип документа.
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(WareHouseCertificateKind documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'DO1PresentDocumentDate' element value. Дата представления ДО1
     * 
     * @return value
     */
    public LocalDate getDO1PresentDocumentDate() {
        return DO1PresentDocumentDate;
    }

    /** 
     * Set the 'DO1PresentDocumentDate' element value. Дата представления ДО1
     * 
     * @param DO1PresentDocumentDate
     */
    public void setDO1PresentDocumentDate(LocalDate DO1PresentDocumentDate) {
        this.DO1PresentDocumentDate = DO1PresentDocumentDate;
    }

    /** 
     * Get the 'DO1PresentDocumentTime' element value. Время представления ДО1
     * 
     * @return value
     */
    public String getDO1PresentDocumentTime() {
        return DO1PresentDocumentTime;
    }

    /** 
     * Set the 'DO1PresentDocumentTime' element value. Время представления ДО1
     * 
     * @param DO1PresentDocumentTime
     */
    public void setDO1PresentDocumentTime(String DO1PresentDocumentTime) {
        this.DO1PresentDocumentTime = DO1PresentDocumentTime;
    }
}
