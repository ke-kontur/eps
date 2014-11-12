
package ru.acs.fts.schemas.album.representativeapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ��������� ����������� �������������, ������������ � �������� ������������ ���������� ����������
 */
public class RepresentativeApplicationType extends BaseDocType
{
    private String destinationCountry;
    private String totalGoodsNumber;
    private RepresentativeType representative;
    private List<ConsignmentType> consignmentList = new ArrayList<ConsignmentType>();
    private String documentModeID;

    /** 
     * Get the 'DestinationCountry' element value. ������ ����������. ��������� ��� �� �������������� ����� ����
     * 
     * @return value
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /** 
     * Set the 'DestinationCountry' element value. ������ ����������. ��������� ��� �� �������������� ����� ����
     * 
     * @param destinationCountry
     */
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    /** 
     * Get the 'TotalGoodsNumber' element value. ����� ������������ �������
     * 
     * @return value
     */
    public String getTotalGoodsNumber() {
        return totalGoodsNumber;
    }

    /** 
     * Set the 'TotalGoodsNumber' element value. ����� ������������ �������
     * 
     * @param totalGoodsNumber
     */
    public void setTotalGoodsNumber(String totalGoodsNumber) {
        this.totalGoodsNumber = totalGoodsNumber;
    }

    /** 
     * Get the 'Representative' element value. ���������� �������������
     * 
     * @return value
     */
    public RepresentativeType getRepresentative() {
        return representative;
    }

    /** 
     * Set the 'Representative' element value. ���������� �������������
     * 
     * @param representative
     */
    public void setRepresentative(RepresentativeType representative) {
        this.representative = representative;
    }

    /** 
     * Get the list of 'Consignment' element items. �������� � ������
     * 
     * @return list
     */
    public List<ConsignmentType> getConsignmentList() {
        return consignmentList;
    }

    /** 
     * Set the list of 'Consignment' element items. �������� � ������
     * 
     * @param list
     */
    public void setConsignmentList(List<ConsignmentType> list) {
        consignmentList = list;
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
