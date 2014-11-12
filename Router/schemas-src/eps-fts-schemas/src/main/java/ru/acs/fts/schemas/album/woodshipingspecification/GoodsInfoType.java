
package ru.acs.fts.schemas.album.woodshipingspecification;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � �������
 */
public class GoodsInfoType
{
    private String packNum;
    private String species;
    private String grade;
    private String depth;
    private String width;
    private String quantity;
    private String volume;
    private List<String> requisiteList = new ArrayList<String>();
    private List<String> detailList = new ArrayList<String>();
    private List<LenghtInfoType> lengthList = new ArrayList<LenghtInfoType>();

    /** 
     * Get the 'PackNum' element value. ����� ������
     * 
     * @return value
     */
    public String getPackNum() {
        return packNum;
    }

    /** 
     * Set the 'PackNum' element value. ����� ������
     * 
     * @param packNum
     */
    public void setPackNum(String packNum) {
        this.packNum = packNum;
    }

    /** 
     * Get the 'Species' element value. ������
     * 
     * @return value
     */
    public String getSpecies() {
        return species;
    }

    /** 
     * Set the 'Species' element value. ������
     * 
     * @param species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /** 
     * Get the 'Grade' element value. ����
     * 
     * @return value
     */
    public String getGrade() {
        return grade;
    }

    /** 
     * Set the 'Grade' element value. ����
     * 
     * @param grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /** 
     * Get the 'Depth' element value. �������
     * 
     * @return value
     */
    public String getDepth() {
        return depth;
    }

    /** 
     * Set the 'Depth' element value. �������
     * 
     * @param depth
     */
    public void setDepth(String depth) {
        this.depth = depth;
    }

    /** 
     * Get the 'Width' element value. ������
     * 
     * @return value
     */
    public String getWidth() {
        return width;
    }

    /** 
     * Set the 'Width' element value. ������
     * 
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /** 
     * Get the 'Quantity' element value. ���������� � ����������� �������� (��.)
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� � ����������� �������� (��.)
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'Volume' element value. ����� � ���. ������
     * 
     * @return value
     */
    public String getVolume() {
        return volume;
    }

    /** 
     * Set the 'Volume' element value. ����� � ���. ������
     * 
     * @param volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /** 
     * Get the list of 'Requisites' element items. ���������
     * 
     * @return list
     */
    public List<String> getRequisiteList() {
        return requisiteList;
    }

    /** 
     * Set the list of 'Requisites' element items. ���������
     * 
     * @param list
     */
    public void setRequisiteList(List<String> list) {
        requisiteList = list;
    }

    /** 
     * Get the list of 'Details' element items. �������������� �������� � ������������� �� ������, ��� ������
     * 
     * @return list
     */
    public List<String> getDetailList() {
        return detailList;
    }

    /** 
     * Set the list of 'Details' element items. �������������� �������� � ������������� �� ������, ��� ������
     * 
     * @param list
     */
    public void setDetailList(List<String> list) {
        detailList = list;
    }

    /** 
     * Get the list of 'Length' element items. �����
     * 
     * @return list
     */
    public List<LenghtInfoType> getLengthList() {
        return lengthList;
    }

    /** 
     * Set the list of 'Length' element items. �����
     * 
     * @param list
     */
    public void setLengthList(List<LenghtInfoType> list) {
        lengthList = list;
    }
}
