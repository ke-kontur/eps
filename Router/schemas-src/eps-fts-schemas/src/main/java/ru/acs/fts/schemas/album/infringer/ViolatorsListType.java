
package ru.acs.fts.schemas.album.infringer;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

public class ViolatorsListType
{
    private String violatorID;
    private String resolutionOrgName;
    private String inspectionDateTime;
    private String penaltySum;
    private String isPaid;
    private String autoLawName;
    private CUOrganizationType carrier;
    private DriverType driverName;
    private DocumentBaseType resolution;
    private PersonBaseType resolutionEmployee;
    private TransportMeansBaseType TSInfo;

    /** 
     * Get the 'ViolatorID' element value. Идентификатор записи в реестре нарушителей
     * 
     * @return value
     */
    public String getViolatorID() {
        return violatorID;
    }

    /** 
     * Set the 'ViolatorID' element value. Идентификатор записи в реестре нарушителей
     * 
     * @param violatorID
     */
    public void setViolatorID(String violatorID) {
        this.violatorID = violatorID;
    }

    /** 
     * Get the 'ResolutionOrgName' element value. Наименование ПК, на котором составлено постановление
     * 
     * @return value
     */
    public String getResolutionOrgName() {
        return resolutionOrgName;
    }

    /** 
     * Set the 'ResolutionOrgName' element value. Наименование ПК, на котором составлено постановление
     * 
     * @param resolutionOrgName
     */
    public void setResolutionOrgName(String resolutionOrgName) {
        this.resolutionOrgName = resolutionOrgName;
    }

    /** 
     * Get the 'InspectionDateTime' element value. Дата/время контроля (проверки)
     * 
     * @return value
     */
    public String getInspectionDateTime() {
        return inspectionDateTime;
    }

    /** 
     * Set the 'InspectionDateTime' element value. Дата/время контроля (проверки)
     * 
     * @param inspectionDateTime
     */
    public void setInspectionDateTime(String inspectionDateTime) {
        this.inspectionDateTime = inspectionDateTime;
    }

    /** 
     * Get the 'PenaltySum' element value. Сумма штрафа
     * 
     * @return value
     */
    public String getPenaltySum() {
        return penaltySum;
    }

    /** 
     * Set the 'PenaltySum' element value. Сумма штрафа
     * 
     * @param penaltySum
     */
    public void setPenaltySum(String penaltySum) {
        this.penaltySum = penaltySum;
    }

    /** 
     * Get the 'IsPaid' element value. Отметка об оплате
     * 
     * @return value
     */
    public String getIsPaid() {
        return isPaid;
    }

    /** 
     * Set the 'IsPaid' element value. Отметка об оплате
     * 
     * @param isPaid
     */
    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    /** 
     * Get the 'AutoLawName' element value. Статья нарушения
     * 
     * @return value
     */
    public String getAutoLawName() {
        return autoLawName;
    }

    /** 
     * Set the 'AutoLawName' element value. Статья нарушения
     * 
     * @param autoLawName
     */
    public void setAutoLawName(String autoLawName) {
        this.autoLawName = autoLawName;
    }

    /** 
     * Get the 'Carrier' element value. Перевозчик
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. Перевозчик
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'DriverName' element value. Водитель
     * 
     * @return value
     */
    public DriverType getDriverName() {
        return driverName;
    }

    /** 
     * Set the 'DriverName' element value. Водитель
     * 
     * @param driverName
     */
    public void setDriverName(DriverType driverName) {
        this.driverName = driverName;
    }

    /** 
     * Get the 'Resolution' element value. Постановление
     * 
     * @return value
     */
    public DocumentBaseType getResolution() {
        return resolution;
    }

    /** 
     * Set the 'Resolution' element value. Постановление
     * 
     * @param resolution
     */
    public void setResolution(DocumentBaseType resolution) {
        this.resolution = resolution;
    }

    /** 
     * Get the 'ResolutionEmployee' element value. Инспектор, составивший постановление (утвердивший постановление)
     * 
     * @return value
     */
    public PersonBaseType getResolutionEmployee() {
        return resolutionEmployee;
    }

    /** 
     * Set the 'ResolutionEmployee' element value. Инспектор, составивший постановление (утвердивший постановление)
     * 
     * @param resolutionEmployee
     */
    public void setResolutionEmployee(PersonBaseType resolutionEmployee) {
        this.resolutionEmployee = resolutionEmployee;
    }

    /** 
     * Get the 'TSInfo' element value. Регистрационные данные ТС
     * 
     * @return value
     */
    public TransportMeansBaseType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. Регистрационные данные ТС
     * 
     * @param TSInfo
     */
    public void setTSInfo(TransportMeansBaseType TSInfo) {
        this.TSInfo = TSInfo;
    }
}
