
package ru.acs.fts.schemas.album.oez_importnotif;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о товаре
 */
public class GoodsInfoType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String goodsStatus;
    private String customsModeCode;
    private List<String> goodsIdentificationList = new ArrayList<String>();
    private List<String> noteList = new ArrayList<String>();
    private String packagesQuantity;
    private String packagingKind;
    private String goodsTNVEDCode;
    private SupplementaryQuantityType supplementaryQuantity;
    private CUOrganizationType consignParticipant;

    /** 
     * Get the list of 'GoodsDescription' element items. Описание товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GoodsStatus' element value. Статус товара
     * 
     * @return value
     */
    public String getGoodsStatus() {
        return goodsStatus;
    }

    /** 
     * Set the 'GoodsStatus' element value. Статус товара
     * 
     * @param goodsStatus
     */
    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    /** 
     * Get the 'CustomsModeCode' element value. Код таможенной процедуры
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. Код таможенной процедуры
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the list of 'GoodsIdentification' element items. Идентификационные признаки товара
     * 
     * @return list
     */
    public List<String> getGoodsIdentificationList() {
        return goodsIdentificationList;
    }

    /** 
     * Set the list of 'GoodsIdentification' element items. Идентификационные признаки товара
     * 
     * @param list
     */
    public void setGoodsIdentificationList(List<String> list) {
        goodsIdentificationList = list;
    }

    /** 
     * Get the list of 'Note' element items. Примечание
     * 
     * @return list
     */
    public List<String> getNoteList() {
        return noteList;
    }

    /** 
     * Set the list of 'Note' element items. Примечание
     * 
     * @param list
     */
    public void setNoteList(List<String> list) {
        noteList = list;
    }

    /** 
     * Get the 'PackagesQuantity' element value. Количество грузовых мест
     * 
     * @return value
     */
    public String getPackagesQuantity() {
        return packagesQuantity;
    }

    /** 
     * Set the 'PackagesQuantity' element value. Количество грузовых мест
     * 
     * @param packagesQuantity
     */
    public void setPackagesQuantity(String packagesQuantity) {
        this.packagesQuantity = packagesQuantity;
    }

    /** 
     * Get the 'PackagingKind' element value. Вид упаковки
     * 
     * @return value
     */
    public String getPackagingKind() {
        return packagingKind;
    }

    /** 
     * Set the 'PackagingKind' element value. Вид упаковки
     * 
     * @param packagingKind
     */
    public void setPackagingKind(String packagingKind) {
        this.packagingKind = packagingKind;
    }

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТНВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТНВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. Количество  товара
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество  товара
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the 'ConsignParticipant' element value. Отправитель/получатель товаров (ПОЭЗ)
     * 
     * @return value
     */
    public CUOrganizationType getConsignParticipant() {
        return consignParticipant;
    }

    /** 
     * Set the 'ConsignParticipant' element value. Отправитель/получатель товаров (ПОЭЗ)
     * 
     * @param consignParticipant
     */
    public void setConsignParticipant(CUOrganizationType consignParticipant) {
        this.consignParticipant = consignParticipant;
    }
}
