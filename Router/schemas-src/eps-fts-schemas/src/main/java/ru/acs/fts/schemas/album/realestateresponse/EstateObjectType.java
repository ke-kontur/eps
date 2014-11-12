
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������ ������������
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
     * Get the 'ObjectName' element value. ������������  ������� ������������
     * 
     * @return value
     */
    public String getObjectName() {
        return objectName;
    }

    /** 
     * Set the 'ObjectName' element value. ������������  ������� ������������
     * 
     * @param objectName
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /** 
     * Get the 'CadastrNumber' element value. ����������� �����
     * 
     * @return value
     */
    public String getCadastrNumber() {
        return cadastrNumber;
    }

    /** 
     * Set the 'CadastrNumber' element value. ����������� �����
     * 
     * @param cadastrNumber
     */
    public void setCadastrNumber(String cadastrNumber) {
        this.cadastrNumber = cadastrNumber;
    }

    /** 
     * Get the 'ConditionNum' element value. �������� �����
     * 
     * @return value
     */
    public String getConditionNum() {
        return conditionNum;
    }

    /** 
     * Set the 'ConditionNum' element value. �������� �����
     * 
     * @param conditionNum
     */
    public void setConditionNum(String conditionNum) {
        this.conditionNum = conditionNum;
    }

    /** 
     * Get the 'InventoryNumber' element value. ����������� �����, �����
     * 
     * @return value
     */
    public String getInventoryNumber() {
        return inventoryNumber;
    }

    /** 
     * Set the 'InventoryNumber' element value. ����������� �����, �����
     * 
     * @param inventoryNumber
     */
    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    /** 
     * Get the 'FloorNumber' element value. ��������� (����)
     * 
     * @return value
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /** 
     * Set the 'FloorNumber' element value. ��������� (����)
     * 
     * @param floorNumber
     */
    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    /** 
     * Get the list of 'FloorPlanNum' element items. ������ �� ��������� �����. ������� �����������
     * 
     * @return list
     */
    public List<String> getFloorPlanNumList() {
        return floorPlanNumList;
    }

    /** 
     * Set the list of 'FloorPlanNum' element items. ������ �� ��������� �����. ������� �����������
     * 
     * @param list
     */
    public void setFloorPlanNumList(List<String> list) {
        floorPlanNumList = list;
    }

    /** 
     * Get the list of 'Complex' element items. ������� ������� ����
     * 
     * @return list
     */
    public List<String> getComplexList() {
        return complexList;
    }

    /** 
     * Set the list of 'Complex' element items. ������� ������� ����
     * 
     * @param list
     */
    public void setComplexList(List<String> list) {
        complexList = list;
    }

    /** 
     * Get the 'ObjectType' element value. ��� ������� ������������
     * 
     * @return value
     */
    public AddDescriptionType getObjectType() {
        return objectType;
    }

    /** 
     * Set the 'ObjectType' element value. ��� ������� ������������
     * 
     * @param objectType
     */
    public void setObjectType(AddDescriptionType objectType) {
        this.objectType = objectType;
    }

    /** 
     * Get the 'Assignation' element value. ���������� ������� ������������
     * 
     * @return value
     */
    public AddDescriptionType getAssignation() {
        return assignation;
    }

    /** 
     * Set the 'Assignation' element value. ���������� ������� ������������
     * 
     * @param assignation
     */
    public void setAssignation(AddDescriptionType assignation) {
        this.assignation = assignation;
    }

    /** 
     * Get the 'GroundCategory' element value. ������� ���������� (���������) ������
     * 
     * @return value
     */
    public AddDescriptionType getGroundCategory() {
        return groundCategory;
    }

    /** 
     * Set the 'GroundCategory' element value. ������� ���������� (���������) ������
     * 
     * @param groundCategory
     */
    public void setGroundCategory(AddDescriptionType groundCategory) {
        this.groundCategory = groundCategory;
    }

    /** 
     * Get the 'ObjectArea' element value. ������� ������� ������������
     * 
     * @return value
     */
    public ObjectAreaType getObjectArea() {
        return objectArea;
    }

    /** 
     * Set the 'ObjectArea' element value. ������� ������� ������������
     * 
     * @param objectArea
     */
    public void setObjectArea(ObjectAreaType objectArea) {
        this.objectArea = objectArea;
    }

    /** 
     * Get the 'Address' element value. �����
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. �����
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the list of 'Right' element items. �����
     * 
     * @return list
     */
    public List<RightType> getRightList() {
        return rightList;
    }

    /** 
     * Set the list of 'Right' element items. �����
     * 
     * @param list
     */
    public void setRightList(List<RightType> list) {
        rightList = list;
    }

    /** 
     * Get the list of 'ShareHolding' element items. �������� �������� �������� �������������
     * 
     * @return list
     */
    public List<ShareHoldingType> getShareHoldingList() {
        return shareHoldingList;
    }

    /** 
     * Set the list of 'ShareHolding' element items. �������� �������� �������� �������������
     * 
     * @param list
     */
    public void setShareHoldingList(List<ShareHoldingType> list) {
        shareHoldingList = list;
    }
}
