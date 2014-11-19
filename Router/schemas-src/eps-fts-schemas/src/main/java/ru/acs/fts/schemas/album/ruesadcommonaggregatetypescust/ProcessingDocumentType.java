
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * Сведения о процедурах переработки на таможенной территории и вне таможенной территории. 
 */
public class ProcessingDocumentType extends PresentedDocumentType
{
    private String informationCode;
    private LocalDate periodDate;
    private String supplyStatus;
    private AddressType placeProcessing;
    private CUOrganizationType processingOrganization;

    /** 
     * Get the 'InformationCode' element value. Код информации ( 1- разрешение на переработку  2 - ДТ)
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. Код информации ( 1- разрешение на переработку  2 - ДТ)
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the 'PeriodDate' element value. Срок действия разрешения.
     * 
     * @return value
     */
    public LocalDate getPeriodDate() {
        return periodDate;
    }

    /** 
     * Set the 'PeriodDate' element value. Срок действия разрешения.
     * 
     * @param periodDate
     */
    public void setPeriodDate(LocalDate periodDate) {
        this.periodDate = periodDate;
    }

    /** 
     * Get the 'SupplyStatus' element value. 11 - ОПЕРЕЖАЮЩАЯ ПОСТАВКА. Заполняется если продукты переработки ввозятся раньше, чем осуществлен вывоз товаров на переработку вне таможенной территории. в остальных случаях не заполняется. 
     * 
     * @return value
     */
    public String getSupplyStatus() {
        return supplyStatus;
    }

    /** 
     * Set the 'SupplyStatus' element value. 11 - ОПЕРЕЖАЮЩАЯ ПОСТАВКА. Заполняется если продукты переработки ввозятся раньше, чем осуществлен вывоз товаров на переработку вне таможенной территории. в остальных случаях не заполняется. 
     * 
     * @param supplyStatus
     */
    public void setSupplyStatus(String supplyStatus) {
        this.supplyStatus = supplyStatus;
    }

    /** 
     * Get the 'PlaceProcessing' element value. Место проведения операций по переработке
     * 
     * @return value
     */
    public AddressType getPlaceProcessing() {
        return placeProcessing;
    }

    /** 
     * Set the 'PlaceProcessing' element value. Место проведения операций по переработке
     * 
     * @param placeProcessing
     */
    public void setPlaceProcessing(AddressType placeProcessing) {
        this.placeProcessing = placeProcessing;
    }

    /** 
     * Get the 'ProcessingOrganization' element value. Наименование лица, осуществляющего операции по переработке товаров
     * 
     * @return value
     */
    public CUOrganizationType getProcessingOrganization() {
        return processingOrganization;
    }

    /** 
     * Set the 'ProcessingOrganization' element value. Наименование лица, осуществляющего операции по переработке товаров
     * 
     * @param processingOrganization
     */
    public void setProcessingOrganization(
            CUOrganizationType processingOrganization) {
        this.processingOrganization = processingOrganization;
    }
}
