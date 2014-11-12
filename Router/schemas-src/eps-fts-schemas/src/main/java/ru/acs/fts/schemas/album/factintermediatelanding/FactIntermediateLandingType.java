
package ru.acs.fts.schemas.album.factintermediatelanding;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * Уведомление о факте совершения посадки
 */
public class FactIntermediateLandingType extends BaseDocType
{
    private String UIN;
    private CUCustomsType customs;
    private FlightType flight;
    private String documentModeID;

    /** 
     * Get the 'UIN' element value. УИН
     * 
     * @return value
     */
    public String getUIN() {
        return UIN;
    }

    /** 
     * Set the 'UIN' element value. УИН
     * 
     * @param UIN
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /** 
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Flight' element value. Сведения о рейсе
     * 
     * @return value
     */
    public FlightType getFlight() {
        return flight;
    }

    /** 
     * Set the 'Flight' element value. Сведения о рейсе
     * 
     * @param flight
     */
    public void setFlight(FlightType flight) {
        this.flight = flight;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
