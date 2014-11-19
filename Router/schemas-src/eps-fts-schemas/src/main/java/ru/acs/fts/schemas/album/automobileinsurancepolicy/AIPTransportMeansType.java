
package ru.acs.fts.schemas.album.automobileinsurancepolicy;

import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansPassportType;

/** 
 * Сведения о транспортном средстве 
 */
public class AIPTransportMeansType
{
    private String transportStateSignID;
    private String model;
    private String mark;
    private String markCode;
    private String VINID;
    private String offtakeYear;
    private TransportMeansPassportType AIPTransportMeansPassport;

    /** 
     * Get the 'TransportStateSignID' element value. Государственный знак транспортного средства
     * 
     * @return value
     */
    public String getTransportStateSignID() {
        return transportStateSignID;
    }

    /** 
     * Set the 'TransportStateSignID' element value. Государственный знак транспортного средства
     * 
     * @param transportStateSignID
     */
    public void setTransportStateSignID(String transportStateSignID) {
        this.transportStateSignID = transportStateSignID;
    }

    /** 
     * Get the 'Model' element value. Марка, модель
     * 
     * @return value
     */
    public String getModel() {
        return model;
    }

    /** 
     * Set the 'Model' element value. Марка, модель
     * 
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /** 
     * Get the 'Mark' element value. Наименование марки в оригинале
     * 
     * @return value
     */
    public String getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. Наименование марки в оригинале
     * 
     * @param mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /** 
     * Get the 'MarkCode' element value. Код марки 
     * 
     * @return value
     */
    public String getMarkCode() {
        return markCode;
    }

    /** 
     * Set the 'MarkCode' element value. Код марки 
     * 
     * @param markCode
     */
    public void setMarkCode(String markCode) {
        this.markCode = markCode;
    }

    /** 
     * Get the 'VINID' element value. Идентификационный номер (VIN)
     * 
     * @return value
     */
    public String getVINID() {
        return VINID;
    }

    /** 
     * Set the 'VINID' element value. Идентификационный номер (VIN)
     * 
     * @param VINID
     */
    public void setVINID(String VINID) {
        this.VINID = VINID;
    }

    /** 
     * Get the 'OfftakeYear' element value. Год изготовления транспортного средства
     * 
     * @return value
     */
    public String getOfftakeYear() {
        return offtakeYear;
    }

    /** 
     * Set the 'OfftakeYear' element value. Год изготовления транспортного средства
     * 
     * @param offtakeYear
     */
    public void setOfftakeYear(String offtakeYear) {
        this.offtakeYear = offtakeYear;
    }

    /** 
     * Get the 'AIPTransportMeansPassport' element value. Серия и номер Паспорта транспортного средства
     * 
     * @return value
     */
    public TransportMeansPassportType getAIPTransportMeansPassport() {
        return AIPTransportMeansPassport;
    }

    /** 
     * Set the 'AIPTransportMeansPassport' element value. Серия и номер Паспорта транспортного средства
     * 
     * @param AIPTransportMeansPassport
     */
    public void setAIPTransportMeansPassport(
            TransportMeansPassportType AIPTransportMeansPassport) {
        this.AIPTransportMeansPassport = AIPTransportMeansPassport;
    }
}
