
package ru.acs.fts.schemas.album.exportcancellation;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.ShipmentBaseInfoType;

/** 
 * ����������� �� ������������� ������������ ������ �������.
 */
public class ExportCancellationType extends BaseDocType
{
    private LocalDate exportCancelDate;
    private String addInfo;
    private String processNumber;
    private CustomsType customsOffice;
    private CustomsPersonType customsOfficial;
    private List<ShipmentBaseInfoType> shipmentInfoList = new ArrayList<ShipmentBaseInfoType>();
    private String documentModeID;

    /** 
     * Get the 'ExportCancelDate' element value. ���� ������������� ������������ ������ �������
     * 
     * @return value
     */
    public LocalDate getExportCancelDate() {
        return exportCancelDate;
    }

    /** 
     * Set the 'ExportCancelDate' element value. ���� ������������� ������������ ������ �������
     * 
     * @param exportCancelDate
     */
    public void setExportCancelDate(LocalDate exportCancelDate) {
        this.exportCancelDate = exportCancelDate;
    }

    /** 
     * Get the 'AddInfo' element value. ����������
     * 
     * @return value
     */
    public String getAddInfo() {
        return addInfo;
    }

    /** 
     * Set the 'AddInfo' element value. ����������
     * 
     * @param addInfo
     */
    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    /** 
     * Get the 'ProcessNumber' element value. ���������� ������������� ��������.
     * 
     * @return value
     */
    public String getProcessNumber() {
        return processNumber;
    }

    /** 
     * Set the 'ProcessNumber' element value. ���������� ������������� ��������.
     * 
     * @param processNumber
     */
    public void setProcessNumber(String processNumber) {
        this.processNumber = processNumber;
    }

    /** 
     * Get the 'CustomsOffice' element value. ���������� �����, ���������� ������������� �������
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. ���������� �����, ���������� ������������� �������
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'CustomsOfficial' element value. �������� � ����������� ����, ���������� ������������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsOfficial() {
        return customsOfficial;
    }

    /** 
     * Set the 'CustomsOfficial' element value. �������� � ����������� ����, ���������� ������������� ������
     * 
     * @param customsOfficial
     */
    public void setCustomsOfficial(CustomsPersonType customsOfficial) {
        this.customsOfficial = customsOfficial;
    }

    /** 
     * Get the list of 'ShipmentInfo' element items. ���������� � �������� ������, ����� �� ������� �����������
     * 
     * @return list
     */
    public List<ShipmentBaseInfoType> getShipmentInfoList() {
        return shipmentInfoList;
    }

    /** 
     * Set the list of 'ShipmentInfo' element items. ���������� � �������� ������, ����� �� ������� �����������
     * 
     * @param list
     */
    public void setShipmentInfoList(List<ShipmentBaseInfoType> list) {
        shipmentInfoList = list;
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
