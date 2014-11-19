
package ru.acs.fts.schemas.album.fitosanitarycertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Обеззараживание
 */
public class DesinfestationType
{
    private LocalDate dateDesinfestation;
    private String treatmentMethod;
    private String chemical;
    private String duration;
    private String temperature;
    private String concentration;
    private List<String> addInfoList = new ArrayList<String>();

    /** 
     * Get the 'DateDesinfestation' element value. Дата обеззараживания
     * 
     * @return value
     */
    public LocalDate getDateDesinfestation() {
        return dateDesinfestation;
    }

    /** 
     * Set the 'DateDesinfestation' element value. Дата обеззараживания
     * 
     * @param dateDesinfestation
     */
    public void setDateDesinfestation(LocalDate dateDesinfestation) {
        this.dateDesinfestation = dateDesinfestation;
    }

    /** 
     * Get the 'TreatmentMethod' element value. Способ обработки
     * 
     * @return value
     */
    public String getTreatmentMethod() {
        return treatmentMethod;
    }

    /** 
     * Set the 'TreatmentMethod' element value. Способ обработки
     * 
     * @param treatmentMethod
     */
    public void setTreatmentMethod(String treatmentMethod) {
        this.treatmentMethod = treatmentMethod;
    }

    /** 
     * Get the 'Chemical' element value. Химикат (действующее вещество)
     * 
     * @return value
     */
    public String getChemical() {
        return chemical;
    }

    /** 
     * Set the 'Chemical' element value. Химикат (действующее вещество)
     * 
     * @param chemical
     */
    public void setChemical(String chemical) {
        this.chemical = chemical;
    }

    /** 
     * Get the 'Duration' element value. Экспозиция
     * 
     * @return value
     */
    public String getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' element value. Экспозиция
     * 
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /** 
     * Get the 'Temperature' element value. Температура
     * 
     * @return value
     */
    public String getTemperature() {
        return temperature;
    }

    /** 
     * Set the 'Temperature' element value. Температура
     * 
     * @param temperature
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /** 
     * Get the 'Concentration' element value. Концентрация
     * 
     * @return value
     */
    public String getConcentration() {
        return concentration;
    }

    /** 
     * Set the 'Concentration' element value. Концентрация
     * 
     * @param concentration
     */
    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    /** 
     * Get the list of 'AddInfo' element items. Дополнительная информация
     * 
     * @return list
     */
    public List<String> getAddInfoList() {
        return addInfoList;
    }

    /** 
     * Set the list of 'AddInfo' element items. Дополнительная информация
     * 
     * @param list
     */
    public void setAddInfoList(List<String> list) {
        addInfoList = list;
    }
}
