
package ru.acs.fts.schemas.album.goodsearchresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * �������� ������
 */
public class GoodsInfoType
{
    private String goodsTNVEDCode;
    private List<String> containerList = new ArrayList<String>();
    private String ETSNG;
    private LocalDate issuanceDate;
    private PlaceType factStation;

    /** 
     * Get the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. ��� ������ �� �� ��� ��
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the list of 'Container' element items. ���������
     * 
     * @return list
     */
    public List<String> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. ���������
     * 
     * @param list
     */
    public void setContainerList(List<String> list) {
        containerList = list;
    }

    /** 
     * Get the 'ETSNG' element value. ��� �����
     * 
     * @return value
     */
    public String getETSNG() {
        return ETSNG;
    }

    /** 
     * Set the 'ETSNG' element value. ��� �����
     * 
     * @param ETSNG
     */
    public void setETSNG(String ETSNG) {
        this.ETSNG = ETSNG;
    }

    /** 
     * Get the 'IssuanceDate' element value. ���� ������ �����
     * 
     * @return value
     */
    public LocalDate getIssuanceDate() {
        return issuanceDate;
    }

    /** 
     * Set the 'IssuanceDate' element value. ���� ������ �����
     * 
     * @param issuanceDate
     */
    public void setIssuanceDate(LocalDate issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    /** 
     * Get the 'FactStation' element value. ������� ������������ ��������
     * 
     * @return value
     */
    public PlaceType getFactStation() {
        return factStation;
    }

    /** 
     * Set the 'FactStation' element value. ������� ������������ ��������
     * 
     * @param factStation
     */
    public void setFactStation(PlaceType factStation) {
        this.factStation = factStation;
    }
}
