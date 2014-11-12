
package ru.acs.fts.schemas.album.confirmdecldocsrecip;

import org.joda.time.LocalDate;

/** 
 * Решение декларанта
 */
public class DeclDecisionType
{
    private String declAgree;
    private LocalDate declDate;
    private String declTime;
    private InspectionPlaceType inspectionPlace;

    /** 
     * Get the 'DeclAgree' element value. Признак согласия декларанта прибыть на досмотр
     * 
     * @return value
     */
    public String getDeclAgree() {
        return declAgree;
    }

    /** 
     * Set the 'DeclAgree' element value. Признак согласия декларанта прибыть на досмотр
     * 
     * @param declAgree
     */
    public void setDeclAgree(String declAgree) {
        this.declAgree = declAgree;
    }

    /** 
     * Get the 'DeclDate' element value. Дата прибытия декларанта на досмотр
     * 
     * @return value
     */
    public LocalDate getDeclDate() {
        return declDate;
    }

    /** 
     * Set the 'DeclDate' element value. Дата прибытия декларанта на досмотр
     * 
     * @param declDate
     */
    public void setDeclDate(LocalDate declDate) {
        this.declDate = declDate;
    }

    /** 
     * Get the 'DeclTime' element value. Время прибытия декларанта на досмотр
     * 
     * @return value
     */
    public String getDeclTime() {
        return declTime;
    }

    /** 
     * Set the 'DeclTime' element value. Время прибытия декларанта на досмотр
     * 
     * @param declTime
     */
    public void setDeclTime(String declTime) {
        this.declTime = declTime;
    }

    /** 
     * Get the 'InspectionPlace' element value. Описание места проведения досмотра
     * 
     * @return value
     */
    public InspectionPlaceType getInspectionPlace() {
        return inspectionPlace;
    }

    /** 
     * Set the 'InspectionPlace' element value. Описание места проведения досмотра
     * 
     * @param inspectionPlace
     */
    public void setInspectionPlace(InspectionPlaceType inspectionPlace) {
        this.inspectionPlace = inspectionPlace;
    }
}
