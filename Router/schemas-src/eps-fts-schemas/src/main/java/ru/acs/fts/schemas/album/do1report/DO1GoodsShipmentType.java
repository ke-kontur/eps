
package ru.acs.fts.schemas.album.do1report;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHShipmentInfoType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhCustomDocumentType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhPresentDocType;

/** 
 * �������� � �������� ������, ���������� �� ��������
 */
public class DO1GoodsShipmentType
{
    private String totalPackageNumber;
    private String MPOSign;
    private List<WHShipmentInfoType> transportDocList = new ArrayList<WHShipmentInfoType>();
    private List<WhCustomDocumentType> customsDocList = new ArrayList<WhCustomDocumentType>();
    private List<WhPresentDocType> commerceDocList = new ArrayList<WhPresentDocType>();
    private GTDIDType presentedDocuments;

    /** 
     * Get the 'TotalPackageNumber' element value. ����� ���������� �������� ����
     * 
     * @return value
     */
    public String getTotalPackageNumber() {
        return totalPackageNumber;
    }

    /** 
     * Set the 'TotalPackageNumber' element value. ����� ���������� �������� ����
     * 
     * @param totalPackageNumber
     */
    public void setTotalPackageNumber(String totalPackageNumber) {
        this.totalPackageNumber = totalPackageNumber;
    }

    /** 
     * Get the 'MPOSign' element value. ������� ���������� ������������� �������� �����������
     * 
     * @return value
     */
    public String getMPOSign() {
        return MPOSign;
    }

    /** 
     * Set the 'MPOSign' element value. ������� ���������� ������������� �������� �����������
     * 
     * @param MPOSign
     */
    public void setMPOSign(String MPOSign) {
        this.MPOSign = MPOSign;
    }

    /** 
     * Get the list of 'TransportDocs' element items. ������������  ��������� -  ������ �������, ���������� �� ��
     * 
     * @return list
     */
    public List<WHShipmentInfoType> getTransportDocList() {
        return transportDocList;
    }

    /** 
     * Set the list of 'TransportDocs' element items. ������������  ��������� -  ������ �������, ���������� �� ��
     * 
     * @param list
     */
    public void setTransportDocList(List<WHShipmentInfoType> list) {
        transportDocList = list;
    }

    /** 
     * Get the list of 'CustomsDocs' element items. ���������� ���������
     * 
     * @return list
     */
    public List<WhCustomDocumentType> getCustomsDocList() {
        return customsDocList;
    }

    /** 
     * Set the list of 'CustomsDocs' element items. ���������� ���������
     * 
     * @param list
     */
    public void setCustomsDocList(List<WhCustomDocumentType> list) {
        customsDocList = list;
    }

    /** 
     * Get the list of 'CommerceDocs' element items. ������������ ���������
     * 
     * @return list
     */
    public List<WhPresentDocType> getCommerceDocList() {
        return commerceDocList;
    }

    /** 
     * Set the list of 'CommerceDocs' element items. ������������ ���������
     * 
     * @param list
     */
    public void setCommerceDocList(List<WhPresentDocType> list) {
        commerceDocList = list;
    }

    /** 
     * Get the 'PresentedDocuments' element value. ��������������� ����� ������������� ���������� ��� ��������� ������� �� ��
     * 
     * @return value
     */
    public GTDIDType getPresentedDocuments() {
        return presentedDocuments;
    }

    /** 
     * Set the 'PresentedDocuments' element value. ��������������� ����� ������������� ���������� ��� ��������� ������� �� ��
     * 
     * @param presentedDocuments
     */
    public void setPresentedDocuments(GTDIDType presentedDocuments) {
        this.presentedDocuments = presentedDocuments;
    }
}
