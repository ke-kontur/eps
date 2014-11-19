
package ru.acs.fts.schemas.album.whdocinventory;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WarehouseCertificateType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhTransportType;

/** 
 * �������������� ����� ���������� ����������� ������, ��������������� �������� �� ����������������� ���./�������� ����������� ����������
 */
public class WHDocInventoryType extends BaseDocType
{
    private LocalDate inventoryInstanceDate;
    private List<InventDocumentType> inventDocumentList = new ArrayList<InventDocumentType>();
    private SenderType sender;
    private ReceiverType receiver;
    private GTDIDType regNumberDoc;
    private WarehouseCertificateType warehouseLicense;
    private List<WhTransportType> transportList = new ArrayList<WhTransportType>();
    private List<GoodsShipmentType> goodsShipmentList = new ArrayList<GoodsShipmentType>();
    private String documentModeID;

    /** 
     * Get the 'InventoryInstanceDate' element value. ���� �������������� �����.
     * 
     * @return value
     */
    public LocalDate getInventoryInstanceDate() {
        return inventoryInstanceDate;
    }

    /** 
     * Set the 'InventoryInstanceDate' element value. ���� �������������� �����.
     * 
     * @param inventoryInstanceDate
     */
    public void setInventoryInstanceDate(LocalDate inventoryInstanceDate) {
        this.inventoryInstanceDate = inventoryInstanceDate;
    }

    /** 
     * Get the list of 'InventDocument' element items. �������� �� �����
     * 
     * @return list
     */
    public List<InventDocumentType> getInventDocumentList() {
        return inventDocumentList;
    }

    /** 
     * Set the list of 'InventDocument' element items. �������� �� �����
     * 
     * @param list
     */
    public void setInventDocumentList(List<InventDocumentType> list) {
        inventDocumentList = list;
    }

    /** 
     * Get the 'Sender' element value. �����������
     * 
     * @return value
     */
    public SenderType getSender() {
        return sender;
    }

    /** 
     * Set the 'Sender' element value. �����������
     * 
     * @param sender
     */
    public void setSender(SenderType sender) {
        this.sender = sender;
    }

    /** 
     * Get the 'Receiver' element value. ����������
     * 
     * @return value
     */
    public ReceiverType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. ����������
     * 
     * @param receiver
     */
    public void setReceiver(ReceiverType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the 'RegNumberDoc' element value. ��������������� ����� ���������
     * 
     * @return value
     */
    public GTDIDType getRegNumberDoc() {
        return regNumberDoc;
    }

    /** 
     * Set the 'RegNumberDoc' element value. ��������������� ����� ���������
     * 
     * @param regNumberDoc
     */
    public void setRegNumberDoc(GTDIDType regNumberDoc) {
        this.regNumberDoc = regNumberDoc;
    }

    /** 
     * Get the 'WarehouseLicense' element value. �������������� �������� (�������������, ����������) ������, �� ������� �������������� ��������� �������. ����� ���� ��������� ��� ������ ����� ������������ � ��
     * 
     * @return value
     */
    public WarehouseCertificateType getWarehouseLicense() {
        return warehouseLicense;
    }

    /** 
     * Set the 'WarehouseLicense' element value. �������������� �������� (�������������, ����������) ������, �� ������� �������������� ��������� �������. ����� ���� ��������� ��� ������ ����� ������������ � ��
     * 
     * @param warehouseLicense
     */
    public void setWarehouseLicense(WarehouseCertificateType warehouseLicense) {
        this.warehouseLicense = warehouseLicense;
    }

    /** 
     * Get the list of 'Transports' element items. �������� ������������  �������
     * 
     * @return list
     */
    public List<WhTransportType> getTransportList() {
        return transportList;
    }

    /** 
     * Set the list of 'Transports' element items. �������� ������������  �������
     * 
     * @param list
     */
    public void setTransportList(List<WhTransportType> list) {
        transportList = list;
    }

    /** 
     * Get the list of 'GoodsShipment' element items. �������� ������-������������ ��������� (�������� ������), �������������� ��� ��������� ������� �� ��������� ��������
     * 
     * @return list
     */
    public List<GoodsShipmentType> getGoodsShipmentList() {
        return goodsShipmentList;
    }

    /** 
     * Set the list of 'GoodsShipment' element items. �������� ������-������������ ��������� (�������� ������), �������������� ��� ��������� ������� �� ��������� ��������
     * 
     * @param list
     */
    public void setGoodsShipmentList(List<GoodsShipmentType> list) {
        goodsShipmentList = list;
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
