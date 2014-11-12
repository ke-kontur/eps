
package ru.acs.fts.schemas.album.do1report;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WHShipmentInfoType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhCustomDocumentType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhPresentDocType;

/** 
 * Сведения о товарной партии, помещаемой на хранение
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
     * Get the 'TotalPackageNumber' element value. Общее количество грузовых мест
     * 
     * @return value
     */
    public String getTotalPackageNumber() {
        return totalPackageNumber;
    }

    /** 
     * Set the 'TotalPackageNumber' element value. Общее количество грузовых мест
     * 
     * @param totalPackageNumber
     */
    public void setTotalPackageNumber(String totalPackageNumber) {
        this.totalPackageNumber = totalPackageNumber;
    }

    /** 
     * Get the 'MPOSign' element value. Признак оформления международных постовых отправлений
     * 
     * @return value
     */
    public String getMPOSign() {
        return MPOSign;
    }

    /** 
     * Set the 'MPOSign' element value. Признак оформления международных постовых отправлений
     * 
     * @param MPOSign
     */
    public void setMPOSign(String MPOSign) {
        this.MPOSign = MPOSign;
    }

    /** 
     * Get the list of 'TransportDocs' element items. Транспортные  документы -  партии товаров, помещаемых на ВХ
     * 
     * @return list
     */
    public List<WHShipmentInfoType> getTransportDocList() {
        return transportDocList;
    }

    /** 
     * Set the list of 'TransportDocs' element items. Транспортные  документы -  партии товаров, помещаемых на ВХ
     * 
     * @param list
     */
    public void setTransportDocList(List<WHShipmentInfoType> list) {
        transportDocList = list;
    }

    /** 
     * Get the list of 'CustomsDocs' element items. Таможенные документы
     * 
     * @return list
     */
    public List<WhCustomDocumentType> getCustomsDocList() {
        return customsDocList;
    }

    /** 
     * Set the list of 'CustomsDocs' element items. Таможенные документы
     * 
     * @param list
     */
    public void setCustomsDocList(List<WhCustomDocumentType> list) {
        customsDocList = list;
    }

    /** 
     * Get the list of 'CommerceDocs' element items. Коммерческие документы
     * 
     * @return list
     */
    public List<WhPresentDocType> getCommerceDocList() {
        return commerceDocList;
    }

    /** 
     * Set the list of 'CommerceDocs' element items. Коммерческие документы
     * 
     * @param list
     */
    public void setCommerceDocList(List<WhPresentDocType> list) {
        commerceDocList = list;
    }

    /** 
     * Get the 'PresentedDocuments' element value. Регистрационный номер представления документов для помещения товаров на ВХ
     * 
     * @return value
     */
    public GTDIDType getPresentedDocuments() {
        return presentedDocuments;
    }

    /** 
     * Set the 'PresentedDocuments' element value. Регистрационный номер представления документов для помещения товаров на ВХ
     * 
     * @param presentedDocuments
     */
    public void setPresentedDocuments(GTDIDType presentedDocuments) {
        this.presentedDocuments = presentedDocuments;
    }
}
