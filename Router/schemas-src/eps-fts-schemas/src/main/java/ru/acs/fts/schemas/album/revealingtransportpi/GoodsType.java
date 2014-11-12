
package ru.acs.fts.schemas.album.revealingtransportpi;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.PackingInformationType;
import ru.acs.fts.schemas.album.priorcommonaggregatetypescust.PresentedDocumentsType;

/** 
 * Сведения о товаре
 */
public class GoodsType
{
    private String goodsNumber;
    private String TNVEDCode;
    private String grossWeight;
    private String netWeight;
    private String goodsDescription;
    private List<String> containerIDList = new ArrayList<String>();
    private List<String> cargoDescriptionList = new ArrayList<String>();
    private SupplementaryQuantityType supplementaryQuantity;
    private List<PresentedDocumentsType> presentedDocumentList = new ArrayList<PresentedDocumentsType>();
    private PackingInformationType packingInformation;

    /** 
     * Get the 'GoodsNumber' element value. Порядковый номер товара
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Порядковый номер товара
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the 'TNVEDCode' element value. Код товара по ТНВЭД
     * 
     * @return value
     */
    public String getTNVEDCode() {
        return TNVEDCode;
    }

    /** 
     * Set the 'TNVEDCode' element value. Код товара по ТНВЭД
     * 
     * @param TNVEDCode
     */
    public void setTNVEDCode(String TNVEDCode) {
        this.TNVEDCode = TNVEDCode;
    }

    /** 
     * Get the 'GrossWeight' element value. Вес брутто, кг
     * 
     * @return value
     */
    public String getGrossWeight() {
        return grossWeight;
    }

    /** 
     * Set the 'GrossWeight' element value. Вес брутто, кг
     * 
     * @param grossWeight
     */
    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    /** 
     * Get the 'NetWeight' element value. Вес нетто, кг
     * 
     * @return value
     */
    public String getNetWeight() {
        return netWeight;
    }

    /** 
     * Set the 'NetWeight' element value. Вес нетто, кг
     * 
     * @param netWeight
     */
    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    /** 
     * Get the 'GoodsDescription' element value. Наименование товара
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Наименование товара
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the list of 'ContainerID' element items. Номер контейнера
     * 
     * @return list
     */
    public List<String> getContainerIDList() {
        return containerIDList;
    }

    /** 
     * Set the list of 'ContainerID' element items. Номер контейнера
     * 
     * @param list
     */
    public void setContainerIDList(List<String> list) {
        containerIDList = list;
    }

    /** 
     * Get the list of 'CargoDescription' element items. Описание вида грузовых мест
     * 
     * @return list
     */
    public List<String> getCargoDescriptionList() {
        return cargoDescriptionList;
    }

    /** 
     * Set the list of 'CargoDescription' element items. Описание вида грузовых мест
     * 
     * @param list
     */
    public void setCargoDescriptionList(List<String> list) {
        cargoDescriptionList = list;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество в дополнительной единице измерения
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'PresentedDocument' element items. Представленные документы
     * 
     * @return list
     */
    public List<PresentedDocumentsType> getPresentedDocumentList() {
        return presentedDocumentList;
    }

    /** 
     * Set the list of 'PresentedDocument' element items. Представленные документы
     * 
     * @param list
     */
    public void setPresentedDocumentList(List<PresentedDocumentsType> list) {
        presentedDocumentList = list;
    }

    /** 
     * Get the 'PackingInformation' element value. Сведения об упаковке товаров. Код, Количество. Маркировка
     * 
     * @return value
     */
    public PackingInformationType getPackingInformation() {
        return packingInformation;
    }

    /** 
     * Set the 'PackingInformation' element value. Сведения об упаковке товаров. Код, Количество. Маркировка
     * 
     * @param packingInformation
     */
    public void setPackingInformation(PackingInformationType packingInformation) {
        this.packingInformation = packingInformation;
    }
}
