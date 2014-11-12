
package ru.acs.fts.schemas.album.goodstranshipment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.PackingInformationType;

/** 
 * Информация об утрате (отсутствии/уничтожении) части товара
 */
public class LostGoodsInfoType
{
    private String goodsNumber;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String packageKindSequence;
    private String absenceKind;
    private String grossMass;
    private PackingInformationType lostPackages;
    private SupplementaryQuantityType lostGoodsQuantity;

    /** 
     * Get the 'GoodsNumber' element value. Порядковый номер товара по ТД/МДП.
     * 
     * @return value
     */
    public String getGoodsNumber() {
        return goodsNumber;
    }

    /** 
     * Set the 'GoodsNumber' element value. Порядковый номер товара по ТД/МДП.
     * 
     * @param goodsNumber
     */
    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Наименование товара
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'PackageKindSequence' element value. Порядковый номер вида упаковки, утраченной части товара
     * 
     * @return value
     */
    public String getPackageKindSequence() {
        return packageKindSequence;
    }

    /** 
     * Set the 'PackageKindSequence' element value. Порядковый номер вида упаковки, утраченной части товара
     * 
     * @param packageKindSequence
     */
    public void setPackageKindSequence(String packageKindSequence) {
        this.packageKindSequence = packageKindSequence;
    }

    /** 
     * Get the 'AbsenceKind' element value. Вид утраты товара или его части: 1 - Утерян; 2 - Уничтожен; 3 - Частично утерян, частично уничтожен
     * 
     * @return value
     */
    public String getAbsenceKind() {
        return absenceKind;
    }

    /** 
     * Set the 'AbsenceKind' element value. Вид утраты товара или его части: 1 - Утерян; 2 - Уничтожен; 3 - Частично утерян, частично уничтожен
     * 
     * @param absenceKind
     */
    public void setAbsenceKind(String absenceKind) {
        this.absenceKind = absenceKind;
    }

    /** 
     * Get the 'GrossMass' element value. Вес брутто утраченной части товара.
     * 
     * @return value
     */
    public String getGrossMass() {
        return grossMass;
    }

    /** 
     * Set the 'GrossMass' element value. Вес брутто утраченной части товара.
     * 
     * @param grossMass
     */
    public void setGrossMass(String grossMass) {
        this.grossMass = grossMass;
    }

    /** 
     * Get the 'LostPackages' element value. Сведения об утраченных упаковках
     * 
     * @return value
     */
    public PackingInformationType getLostPackages() {
        return lostPackages;
    }

    /** 
     * Set the 'LostPackages' element value. Сведения об утраченных упаковках
     * 
     * @param lostPackages
     */
    public void setLostPackages(PackingInformationType lostPackages) {
        this.lostPackages = lostPackages;
    }

    /** 
     * Get the 'LostGoodsQuantity' element value. Количество утраченной части товара.
     * 
     * @return value
     */
    public SupplementaryQuantityType getLostGoodsQuantity() {
        return lostGoodsQuantity;
    }

    /** 
     * Set the 'LostGoodsQuantity' element value. Количество утраченной части товара.
     * 
     * @param lostGoodsQuantity
     */
    public void setLostGoodsQuantity(SupplementaryQuantityType lostGoodsQuantity) {
        this.lostGoodsQuantity = lostGoodsQuantity;
    }
}
