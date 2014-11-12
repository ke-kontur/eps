
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;

/** 
 * Объект недвижимости
 */
public class EstateObjectType
{
    private String objectName;
    private String cadastrNumber;
    private String conditionNum;
    private String inventoryNumber;
    private String floorNumber;
    private List<String> floorPlanNumList = new ArrayList<String>();
    private List<String> complexList = new ArrayList<String>();
    private AddDescriptionType objectType;
    private AddDescriptionType assignation;
    private AddDescriptionType groundCategory;
    private ObjectAreaType objectArea;
    private AddressType address;
    private List<RightType> rightList = new ArrayList<RightType>();
    private List<ShareHoldingType> shareHoldingList = new ArrayList<ShareHoldingType>();

    /** 
     * Get the 'ObjectName' element value. Наименование  объекта недвижимости
     * 
     * @return value
     */
    public String getObjectName() {
        return objectName;
    }

    /** 
     * Set the 'ObjectName' element value. Наименование  объекта недвижимости
     * 
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /** 
     * Get the 'CadastrNumber' element value. Кадастровый номер
     * 
     * @return value
     */
    public String getCadastrNumber() {
        return cadastrNumber;
    }

    /** 
     * Set the 'CadastrNumber' element value. Кадастровый номер
     * 
     * @param cadastrNumber
     */
    public void setCadastrNumber(String cadastrNumber) {
        this.cadastrNumber = cadastrNumber;
    }

    /** 
     * Get the 'ConditionNum' element value. Условный номер
     * 
     * @return value
     */
    public String getConditionNum() {
        return conditionNum;
    }

    /** 
     * Set the 'ConditionNum' element value. Условный номер
     * 
     * @param conditionNum
     */
    public void setConditionNum(String conditionNum) {
        this.conditionNum = conditionNum;
    }

    /** 
     * Get the 'InventoryNumber' element value. Инвентарный номер, литер
     * 
     * @return value
     */
    public String getInventoryNumber() {
        return inventoryNumber;
    }

    /** 
     * Set the 'InventoryNumber' element value. Инвентарный номер, литер
     * 
     * @param inventoryNumber
     */
    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    /** 
     * Get the 'FloorNumber' element value. Этажность (этаж)
     * 
     * @return value
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /** 
     * Set the 'FloorNumber' element value. Этажность (этаж)
     * 
     * @param floorNumber
     */
    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    /** 
     * Get the list of 'FloorPlanNum' element items. Номера на поэтажном плане. Элемент экспликации
     * 
     * @return list
     */
    public List<String> getFloorPlanNumList() {
        return floorPlanNumList;
    }

    /** 
     * Set the list of 'FloorPlanNum' element items. Номера на поэтажном плане. Элемент экспликации
     * 
     * @param list
     */
    public void setFloorPlanNumList(List<String> list) {
        floorPlanNumList = list;
    }

    /** 
     * Get the list of 'Complex' element items. Элемент сложной вещи
     * 
     * @return list
     */
    public List<String> getComplexList() {
        return complexList;
    }

    /** 
     * Set the list of 'Complex' element items. Элемент сложной вещи
     * 
     * @param list
     */
    public void setComplexList(List<String> list) {
        complexList = list;
    }

    /** 
     * Get the 'ObjectType' element value. Тип объекта недвижимости
     * 
     * @return value
     */
    public AddDescriptionType getObjectType() {
        return objectType;
    }

    /** 
     * Set the 'ObjectType' element value. Тип объекта недвижимости
     * 
     * @param objectType
     */
    public void setObjectType(AddDescriptionType objectType) {
        this.objectType = objectType;
    }

    /** 
     * Get the 'Assignation' element value. Назначение объекта недвижимости
     * 
     * @return value
     */
    public AddDescriptionType getAssignation() {
        return assignation;
    }

    /** 
     * Set the 'Assignation' element value. Назначение объекта недвижимости
     * 
     * @param assignation
     */
    public void setAssignation(AddDescriptionType assignation) {
        this.assignation = assignation;
    }

    /** 
     * Get the 'GroundCategory' element value. Целевое назначение (категория) земель
     * 
     * @return value
     */
    public AddDescriptionType getGroundCategory() {
        return groundCategory;
    }

    /** 
     * Set the 'GroundCategory' element value. Целевое назначение (категория) земель
     * 
     * @param groundCategory
     */
    public void setGroundCategory(AddDescriptionType groundCategory) {
        this.groundCategory = groundCategory;
    }

    /** 
     * Get the 'ObjectArea' element value. Площадь объекта недвижимости
     * 
     * @return value
     */
    public ObjectAreaType getObjectArea() {
        return objectArea;
    }

    /** 
     * Set the 'ObjectArea' element value. Площадь объекта недвижимости
     * 
     * @param objectArea
     */
    public void setObjectArea(ObjectAreaType objectArea) {
        this.objectArea = objectArea;
    }

    /** 
     * Get the 'Address' element value. Адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the list of 'Right' element items. Права
     * 
     * @return list
     */
    public List<RightType> getRightList() {
        return rightList;
    }

    /** 
     * Set the list of 'Right' element items. Права
     * 
     * @param list
     */
    public void setRightList(List<RightType> list) {
        rightList = list;
    }

    /** 
     * Get the list of 'ShareHolding' element items. Описание объектов долевого строительства
     * 
     * @return list
     */
    public List<ShareHoldingType> getShareHoldingList() {
        return shareHoldingList;
    }

    /** 
     * Set the list of 'ShareHolding' element items. Описание объектов долевого строительства
     * 
     * @param list
     */
    public void setShareHoldingList(List<ShareHoldingType> list) {
        shareHoldingList = list;
    }
}
