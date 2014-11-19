
package ru.acs.fts.schemas.album.shippingmanifest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Путевой лист грузового автомобиля
 */
public class ShippingManifestType extends BaseDocType
{
    private String series;
    private String number;
    private LocalDate date;
    private String notes;
    private LocalDate expire;
    private OrganizationCreatedManifestType organizationCreatedManifest;
    private DriverType driver;
    private VehicleType vehicle;
    private EscortType escort;
    private List<RouteType> routeList = new ArrayList<RouteType>();
    private WorkingDayType workingDay;
    private String documentModeID;

    /** 
     * Get the 'Series' element value. Серия путевого листа 
     * 
     * @return value
     */
    public String getSeries() {
        return series;
    }

    /** 
     * Set the 'Series' element value. Серия путевого листа 
     * 
     * @param series
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /** 
     * Get the 'Number' element value. Номер путевого листа 
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер путевого листа 
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'Date' element value. Дата путевого листа 
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. Дата путевого листа 
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'Notes' element value. Особые отметки 
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. Особые отметки 
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /** 
     * Get the 'Expire' element value. Дата окончания действия путевого листа
     * 
     * @return value
     */
    public LocalDate getExpire() {
        return expire;
    }

    /** 
     * Set the 'Expire' element value. Дата окончания действия путевого листа
     * 
     * @param expire
     */
    public void setExpire(LocalDate expire) {
        this.expire = expire;
    }

    /** 
     * Get the 'OrganizationCreatedManifest' element value. Организация, выдавшая путевой лист 
     * 
     * @return value
     */
    public OrganizationCreatedManifestType getOrganizationCreatedManifest() {
        return organizationCreatedManifest;
    }

    /** 
     * Set the 'OrganizationCreatedManifest' element value. Организация, выдавшая путевой лист 
     * 
     * @param organizationCreatedManifest
     */
    public void setOrganizationCreatedManifest(
            OrganizationCreatedManifestType organizationCreatedManifest) {
        this.organizationCreatedManifest = organizationCreatedManifest;
    }

    /** 
     * Get the 'Driver' element value. Сведения о водителе 
     * 
     * @return value
     */
    public DriverType getDriver() {
        return driver;
    }

    /** 
     * Set the 'Driver' element value. Сведения о водителе 
     * 
     * @param driver
     */
    public void setDriver(DriverType driver) {
        this.driver = driver;
    }

    /** 
     * Get the 'Vehicle' element value. Сведения об автомобиле 
     * 
     * @return value
     */
    public VehicleType getVehicle() {
        return vehicle;
    }

    /** 
     * Set the 'Vehicle' element value. Сведения об автомобиле 
     * 
     * @param vehicle
     */
    public void setVehicle(VehicleType vehicle) {
        this.vehicle = vehicle;
    }

    /** 
     * Get the 'Escort' element value. Сопровождение 
     * 
     * @return value
     */
    public EscortType getEscort() {
        return escort;
    }

    /** 
     * Set the 'Escort' element value. Сопровождение 
     * 
     * @param escort
     */
    public void setEscort(EscortType escort) {
        this.escort = escort;
    }

    /** 
     * Get the list of 'Route' element items. Участок маршрута 
     * 
     * @return list
     */
    public List<RouteType> getRouteList() {
        return routeList;
    }

    /** 
     * Set the list of 'Route' element items. Участок маршрута 
     * 
     * @param list
     */
    public void setRouteList(List<RouteType> list) {
        routeList = list;
    }

    /** 
     * Get the 'WorkingDay' element value. Режим работы
     * 
     * @return value
     */
    public WorkingDayType getWorkingDay() {
        return workingDay;
    }

    /** 
     * Set the 'WorkingDay' element value. Режим работы
     * 
     * @param workingDay
     */
    public void setWorkingDay(WorkingDayType workingDay) {
        this.workingDay = workingDay;
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
