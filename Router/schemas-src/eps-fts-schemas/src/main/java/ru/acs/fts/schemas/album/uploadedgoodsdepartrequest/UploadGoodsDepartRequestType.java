
package ru.acs.fts.schemas.album.uploadedgoodsdepartrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.FlightInfoType;

/** 
 * ������ �� ������ ���������� ����������� �� ���� �������
 */
public class UploadGoodsDepartRequestType extends BaseDocType
{
    private FlightInfoType flight;
    private List<GoodsType> uploadedGoodList = new ArrayList<GoodsType>();
    private String documentModeID;

    /** 
     * Get the 'Flight' element value. �������� � �����
     * 
     * @return value
     */
    public FlightInfoType getFlight() {
        return flight;
    }

    /** 
     * Set the 'Flight' element value. �������� � �����
     * 
     * @param flight
     */
    public void setFlight(FlightInfoType flight) {
        this.flight = flight;
    }

    /** 
     * Get the list of 'UploadedGoods' element items. ������, ���������� ����������� �� ����
     * 
     * @return list
     */
    public List<GoodsType> getUploadedGoodList() {
        return uploadedGoodList;
    }

    /** 
     * Set the list of 'UploadedGoods' element items. ������, ���������� ����������� �� ����
     * 
     * @param list
     */
    public void setUploadedGoodList(List<GoodsType> list) {
        uploadedGoodList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
