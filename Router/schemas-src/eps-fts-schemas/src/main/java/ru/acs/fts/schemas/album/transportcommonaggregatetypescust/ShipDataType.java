
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * Данные судна
 */
public class ShipDataType
{
    private String IDVessel;
    private String name;
    private String regNumder;
    private List<String> typeFunctionList = new ArrayList<String>();
    private String _Class;
    private String project;
    private LocalDate year;
    private String place;
    private String housingMaterial;
    private String capacity;
    private String passenger;
    private String previousName;
    private MainMachineType mainMachine;
    private DimensionsType dimensions;
    private AddressType previousPlaceResidence;

    /** 
     * Get the 'IDVessel' element value. Идентификационный номер судна
     * 
     * @return value
     */
    public String getIDVessel() {
        return IDVessel;
    }

    /** 
     * Set the 'IDVessel' element value. Идентификационный номер судна
     * 
     * @param IDVessel
     */
    public void setIDVessel(String IDVessel) {
        this.IDVessel = IDVessel;
    }

    /** 
     * Get the 'Name' element value. Наименование судна
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование судна
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'RegNumder' element value. Номер судна
     * 
     * @return value
     */
    public String getRegNumder() {
        return regNumder;
    }

    /** 
     * Set the 'RegNumder' element value. Номер судна
     * 
     * @param regNumder
     */
    public void setRegNumder(String regNumder) {
        this.regNumder = regNumder;
    }

    /** 
     * Get the list of 'TypeFunction' element items. Тип и назначение
     * 
     * @return list
     */
    public List<String> getTypeFunctionList() {
        return typeFunctionList;
    }

    /** 
     * Set the list of 'TypeFunction' element items. Тип и назначение
     * 
     * @param list
     */
    public void setTypeFunctionList(List<String> list) {
        typeFunctionList = list;
    }

    /** 
     * Get the 'Class' element value. Класс судна
     * 
     * @return value
     */
    public String get_Class() {
        return _Class;
    }

    /** 
     * Set the 'Class' element value. Класс судна
     * 
     * @param _class
     */
    public void set_Class(String _class) {
        _Class = _class;
    }

    /** 
     * Get the 'Project' element value. Номер проекта
     * 
     * @return value
     */
    public String getProject() {
        return project;
    }

    /** 
     * Set the 'Project' element value. Номер проекта
     * 
     * @param project
     */
    public void setProject(String project) {
        this.project = project;
    }

    /** 
     * Get the 'Year' element value. Год выпуска
     * 
     * @return value
     */
    public LocalDate getYear() {
        return year;
    }

    /** 
     * Set the 'Year' element value. Год выпуска
     * 
     * @param year
     */
    public void setYear(LocalDate year) {
        this.year = year;
    }

    /** 
     * Get the 'Place' element value. Место постройки
     * 
     * @return value
     */
    public String getPlace() {
        return place;
    }

    /** 
     * Set the 'Place' element value. Место постройки
     * 
     * @param place
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /** 
     * Get the 'HousingMaterial' element value. Материал корпуса
     * 
     * @return value
     */
    public String getHousingMaterial() {
        return housingMaterial;
    }

    /** 
     * Set the 'HousingMaterial' element value. Материал корпуса
     * 
     * @param housingMaterial
     */
    public void setHousingMaterial(String housingMaterial) {
        this.housingMaterial = housingMaterial;
    }

    /** 
     * Get the 'Capacity' element value. Грузоподъемность
     * 
     * @return value
     */
    public String getCapacity() {
        return capacity;
    }

    /** 
     * Set the 'Capacity' element value. Грузоподъемность
     * 
     * @param capacity
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /** 
     * Get the 'Passenger' element value. Пассажировместимость
     * 
     * @return value
     */
    public String getPassenger() {
        return passenger;
    }

    /** 
     * Set the 'Passenger' element value. Пассажировместимость
     * 
     * @param passenger
     */
    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }

    /** 
     * Get the 'PreviousName' element value. Прежнее наименование судна.
     * 
     * @return value
     */
    public String getPreviousName() {
        return previousName;
    }

    /** 
     * Set the 'PreviousName' element value. Прежнее наименование судна.
     * 
     * @param previousName
     */
    public void setPreviousName(String previousName) {
        this.previousName = previousName;
    }

    /** 
     * Get the 'MainMachine' element value. Сведения о главных машинах
     * 
     * @return value
     */
    public MainMachineType getMainMachine() {
        return mainMachine;
    }

    /** 
     * Set the 'MainMachine' element value. Сведения о главных машинах
     * 
     * @param mainMachine
     */
    public void setMainMachine(MainMachineType mainMachine) {
        this.mainMachine = mainMachine;
    }

    /** 
     * Get the 'Dimensions' element value. Габаритные размеры судна
     * 
     * @return value
     */
    public DimensionsType getDimensions() {
        return dimensions;
    }

    /** 
     * Set the 'Dimensions' element value. Габаритные размеры судна
     * 
     * @param dimensions
     */
    public void setDimensions(DimensionsType dimensions) {
        this.dimensions = dimensions;
    }

    /** 
     * Get the 'PreviousPlaceResidence' element value. Прежнее место приписки
     * 
     * @return value
     */
    public AddressType getPreviousPlaceResidence() {
        return previousPlaceResidence;
    }

    /** 
     * Set the 'PreviousPlaceResidence' element value. Прежнее место приписки
     * 
     * @param previousPlaceResidence
     */
    public void setPreviousPlaceResidence(AddressType previousPlaceResidence) {
        this.previousPlaceResidence = previousPlaceResidence;
    }
}
