
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * ����������� ��� �������
 */
public class FactWeightType
{
    private String netto;
    private String brutto;
    private String FWMethod;
    private String WFMetodsComments;
    private String weighPlacesNumber;
    private List<String> placeWeightList = new ArrayList<String>();

    /** 
     * Get the 'Netto' element value. ��� ������ ������, ��
     * 
     * @return value
     */
    public String getNetto() {
        return netto;
    }

    /** 
     * Set the 'Netto' element value. ��� ������ ������, ��
     * 
     * @param netto
     */
    public void setNetto(String netto) {
        this.netto = netto;
    }

    /** 
     * Get the 'Brutto' element value. ��� ������ ������, ��
     * 
     * @return value
     */
    public String getBrutto() {
        return brutto;
    }

    /** 
     * Set the 'Brutto' element value. ��� ������ ������, ��
     * 
     * @param brutto
     */
    public void setBrutto(String brutto) {
        this.brutto = brutto;
    }

    /** 
     * Get the 'FWMethod' element value. ������ ����������� ������������ ���� �������: "0" - ����������� �����������,  "1" - ����������� �������� ���� ������ ����� ������������ ���������� ����, "2" - ��������� �����, "3" - ������.
     * 
     * @return value
     */
    public String getFWMethod() {
        return FWMethod;
    }

    /** 
     * Set the 'FWMethod' element value. ������ ����������� ������������ ���� �������: "0" - ����������� �����������,  "1" - ����������� �������� ���� ������ ����� ������������ ���������� ����, "2" - ��������� �����, "3" - ������.
     * 
     * @param FWMethod
     */
    public void setFWMethod(String FWMethod) {
        this.FWMethod = FWMethod;
    }

    /** 
     * Get the 'WFMetodsComments' element value. �������� "�������" ������ ����������� ������������ ���� �������
     * 
     * @return value
     */
    public String getWFMetodsComments() {
        return WFMetodsComments;
    }

    /** 
     * Set the 'WFMetodsComments' element value. �������� "�������" ������ ����������� ������������ ���� �������
     * 
     * @param WFMetodsComments
     */
    public void setWFMetodsComments(String WFMetodsComments) {
        this.WFMetodsComments = WFMetodsComments;
    }

    /** 
     * Get the 'WeighPlacesNumber' element value. ���������� ���������� ����
     * 
     * @return value
     */
    public String getWeighPlacesNumber() {
        return weighPlacesNumber;
    }

    /** 
     * Set the 'WeighPlacesNumber' element value. ���������� ���������� ����
     * 
     * @param weighPlacesNumber
     */
    public void setWeighPlacesNumber(String weighPlacesNumber) {
        this.weighPlacesNumber = weighPlacesNumber;
    }

    /** 
     * Get the list of 'PlaceWeight' element items. ��� ������ �����
     * 
     * @return list
     */
    public List<String> getPlaceWeightList() {
        return placeWeightList;
    }

    /** 
     * Set the list of 'PlaceWeight' element items. ��� ������ �����
     * 
     * @param list
     */
    public void setPlaceWeightList(List<String> list) {
        placeWeightList = list;
    }
}
