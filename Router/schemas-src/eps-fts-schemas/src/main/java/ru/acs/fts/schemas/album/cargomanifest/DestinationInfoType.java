
package ru.acs.fts.schemas.album.cargomanifest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.AirportType;

/** 
 * ���������� � ��������� ������
 */
public class DestinationInfoType
{
    private String nilCargoCode;
    private AirportType destinationAirport;
    private List<GoodsInfoType> bulkGargoList = new ArrayList<GoodsInfoType>();
    private List<ULDGoodsType> ULDCargoList = new ArrayList<ULDGoodsType>();

    /** 
     * Get the 'NilCargoCode' element value. NilCargoCode. ��������� ����
     * 
     * @return value
     */
    public String getNilCargoCode() {
        return nilCargoCode;
    }

    /** 
     * Set the 'NilCargoCode' element value. NilCargoCode. ��������� ����
     * 
     * @param nilCargoCode
     */
    public void setNilCargoCode(String nilCargoCode) {
        this.nilCargoCode = nilCargoCode;
    }

    /** 
     * Get the 'DestinationAirport' element value. �������� ����������
     * 
     * @return value
     */
    public AirportType getDestinationAirport() {
        return destinationAirport;
    }

    /** 
     * Set the 'DestinationAirport' element value. �������� ����������
     * 
     * @param destinationAirport
     */
    public void setDestinationAirport(AirportType destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    /** 
     * Get the list of 'BulkGargo' element items. �������� ����� �������
     * 
     * @return list
     */
    public List<GoodsInfoType> getBulkGargoList() {
        return bulkGargoList;
    }

    /** 
     * Set the list of 'BulkGargo' element items. �������� ����� �������
     * 
     * @param list
     */
    public void setBulkGargoList(List<GoodsInfoType> list) {
        bulkGargoList = list;
    }

    /** 
     * Get the list of 'ULDCargo' element items. ������, ����������� � ����������
     * 
     * @return list
     */
    public List<ULDGoodsType> getULDCargoList() {
        return ULDCargoList;
    }

    /** 
     * Set the list of 'ULDCargo' element items. ������, ����������� � ����������
     * 
     * @param list
     */
    public void setULDCargoList(List<ULDGoodsType> list) {
        ULDCargoList = list;
    }
}
