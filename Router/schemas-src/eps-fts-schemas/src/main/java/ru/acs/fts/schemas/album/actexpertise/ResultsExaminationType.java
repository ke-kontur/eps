
package ru.acs.fts.schemas.album.actexpertise;

import java.util.ArrayList;
import java.util.List;

/** 
 * ��������� ����������
 */
public class ResultsExaminationType
{
    private List<String> nameProductionList = new ArrayList<String>();
    private String quantity;
    private String weighQuantity;
    private List<String> nameMetalList = new ArrayList<String>();
    private List<String> sampleList = new ArrayList<String>();

    /** 
     * Get the list of 'NameProduction' element items. ������������ ������� (����������)
     * 
     * @return list
     */
    public List<String> getNameProductionList() {
        return nameProductionList;
    }

    /** 
     * Set the list of 'NameProduction' element items. ������������ ������� (����������)
     * 
     * @param list
     */
    public void setNameProductionList(List<String> list) {
        nameProductionList = list;
    }

    /** 
     * Get the 'Quantity' element value. ����������, ��.
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ����������, ��.
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'WeighQuantity' element value. �����, �
     * 
     * @return value
     */
    public String getWeighQuantity() {
        return weighQuantity;
    }

    /** 
     * Set the 'WeighQuantity' element value. �����, �
     * 
     * @param weighQuantity
     */
    public void setWeighQuantity(String weighQuantity) {
        this.weighQuantity = weighQuantity;
    }

    /** 
     * Get the list of 'NameMetal' element items. ������������ ������������ ������� (�������������)
     * 
     * @return list
     */
    public List<String> getNameMetalList() {
        return nameMetalList;
    }

    /** 
     * Set the list of 'NameMetal' element items. ������������ ������������ ������� (�������������)
     * 
     * @param list
     */
    public void setNameMetalList(List<String> list) {
        nameMetalList = list;
    }

    /** 
     * Get the list of 'Sample' element items. �����
     * 
     * @return list
     */
    public List<String> getSampleList() {
        return sampleList;
    }

    /** 
     * Set the list of 'Sample' element items. �����
     * 
     * @param list
     */
    public void setSampleList(List<String> list) {
        sampleList = list;
    }
}
