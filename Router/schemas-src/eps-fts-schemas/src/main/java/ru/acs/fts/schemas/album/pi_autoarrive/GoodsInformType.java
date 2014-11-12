
package ru.acs.fts.schemas.album.pi_autoarrive;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.PIGoodsType;

/** 
 * ���������� � ����������� �������
 */
public class GoodsInformType
{
    private String totalGoodsNameQuantity;
    private String shipSpecifQuantity;
    private String shipSpecifGoodsQuantity;
    private LocalDate dateExpectedArrival;
    private String timeExpectedArrival;
    private List<PIGoodsType> goodList = new ArrayList<PIGoodsType>();
    private CUCustomsType borderCustoms;

    /** 
     * Get the 'TotalGoodsNameQuantity' element value. ����� ������������ �������
     * 
     * @return value
     */
    public String getTotalGoodsNameQuantity() {
        return totalGoodsNameQuantity;
    }

    /** 
     * Set the 'TotalGoodsNameQuantity' element value. ����� ������������ �������
     * 
     * @param totalGoodsNameQuantity
     */
    public void setTotalGoodsNameQuantity(String totalGoodsNameQuantity) {
        this.totalGoodsNameQuantity = totalGoodsNameQuantity;
    }

    /** 
     * Get the 'ShipSpecifQuantity' element value. ���������� ����������� ������������
     * 
     * @return value
     */
    public String getShipSpecifQuantity() {
        return shipSpecifQuantity;
    }

    /** 
     * Set the 'ShipSpecifQuantity' element value. ���������� ����������� ������������
     * 
     * @param shipSpecifQuantity
     */
    public void setShipSpecifQuantity(String shipSpecifQuantity) {
        this.shipSpecifQuantity = shipSpecifQuantity;
    }

    /** 
     * Get the 'ShipSpecifGoodsQuantity' element value. ���������� ������� �� ����������� �������������
     * 
     * @return value
     */
    public String getShipSpecifGoodsQuantity() {
        return shipSpecifGoodsQuantity;
    }

    /** 
     * Set the 'ShipSpecifGoodsQuantity' element value. ���������� ������� �� ����������� �������������
     * 
     * @param shipSpecifGoodsQuantity
     */
    public void setShipSpecifGoodsQuantity(String shipSpecifGoodsQuantity) {
        this.shipSpecifGoodsQuantity = shipSpecifGoodsQuantity;
    }

    /** 
     * Get the 'DateExpectedArrival' element value. ���� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������
     * 
     * @return value
     */
    public LocalDate getDateExpectedArrival() {
        return dateExpectedArrival;
    }

    /** 
     * Set the 'DateExpectedArrival' element value. ���� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������
     * 
     * @param dateExpectedArrival
     */
    public void setDateExpectedArrival(LocalDate dateExpectedArrival) {
        this.dateExpectedArrival = dateExpectedArrival;
    }

    /** 
     * Get the 'TimeExpectedArrival' element value. ����� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������
     * 
     * @return value
     */
    public String getTimeExpectedArrival() {
        return timeExpectedArrival;
    }

    /** 
     * Set the 'TimeExpectedArrival' element value. ����� ���������� �������� ������� � ������������ ������� � ����������� ����� ��������
     * 
     * @param timeExpectedArrival
     */
    public void setTimeExpectedArrival(String timeExpectedArrival) {
        this.timeExpectedArrival = timeExpectedArrival;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<PIGoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<PIGoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'BorderCustoms' element value. ���������� ����� (����������� ����� ��������), � ������� ��������� �������� ������� � ������������ �������.
     * 
     * @return value
     */
    public CUCustomsType getBorderCustoms() {
        return borderCustoms;
    }

    /** 
     * Set the 'BorderCustoms' element value. ���������� ����� (����������� ����� ��������), � ������� ��������� �������� ������� � ������������ �������.
     * 
     * @param borderCustoms
     */
    public void setBorderCustoms(CUCustomsType borderCustoms) {
        this.borderCustoms = borderCustoms;
    }
}
