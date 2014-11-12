
package ru.acs.fts.schemas.album.oez_exportnotif;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * Сведения о товаре
 */
public class GoodsInfoType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String packagesQuantity;
    private String packagingKind;
    private String weighQuantity;
    private List<String> noteList = new ArrayList<String>();
    private SupplementaryQuantityType supplementaryQuantity;
    private List<GoodsStatusType> goodsStatuList = new ArrayList<GoodsStatusType>();

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
     * Get the 'PackagesQuantity' element value. Количество грузовых мест.
     * 
     * @return value
     */
    public String getPackagesQuantity() {
        return packagesQuantity;
    }

    /** 
     * Set the 'PackagesQuantity' element value. Количество грузовых мест.
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
     * Get the 'WeighQuantity' element value. Вес товара в кг. 
     * 
     * @return value
     */
    public String getWeighQuantity() {
        return weighQuantity;
    }

    /** 
     * Set the 'WeighQuantity' element value. Вес товара в кг. 
     * 
     * @param weighQuantity
     */
    public void setWeighQuantity(String weighQuantity) {
        this.weighQuantity = weighQuantity;
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
     * Get the 'SupplementaryQuantity' element value. Количество товара
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество товара
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'GoodsStatus' element items. Статус товара гр 7
     * 
     * @return list
     */
    public List<GoodsStatusType> getGoodsStatuList() {
        return goodsStatuList;
    }

    /** 
     * Set the list of 'GoodsStatus' element items. Статус товара гр 7
     * 
     * @param list
     */
    public void setGoodsStatuList(List<GoodsStatusType> list) {
        goodsStatuList = list;
    }
}
