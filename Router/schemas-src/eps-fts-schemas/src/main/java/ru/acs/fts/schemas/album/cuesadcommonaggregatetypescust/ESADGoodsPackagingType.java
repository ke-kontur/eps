
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о грузовых местах, поддонах и упаковке товаров
 */
public class ESADGoodsPackagingType
{
    private String pakageQuantity;
    private String pakageTypeCode;
    private String pakagePartQuantity;
    private String RBCargoKind;
    private String packageCode;
    private List<PackingInformationType> packingInformationList = new ArrayList<PackingInformationType>();
    private List<PalleteInformationType> palleteInformationList = new ArrayList<PalleteInformationType>();
    private List<PackingInformationType> unitPackInfoList = new ArrayList<PackingInformationType>();
    private List<PackingInformationType> cargoInfoList = new ArrayList<PackingInformationType>();

    /** 
     * Get the 'PakageQuantity' element value. Общее количество грузовых мест, занятых товаром
     * 
     * @return value
     */
    public String getPakageQuantity() {
        return pakageQuantity;
    }

    /** 
     * Set the 'PakageQuantity' element value. Общее количество грузовых мест, занятых товаром
     * 
     * @param pakageQuantity
     */
    public void setPakageQuantity(String pakageQuantity) {
        this.pakageQuantity = pakageQuantity;
    }

    /** 
     * Get the 'PakageTypeCode' element value. Код наличия упаковки товара: 0 - Без упаковки; 1 - С упаковкой;  2 - Без упаковки в оборудованных емкостях транспортного средства
     * 
     * @return value
     */
    public String getPakageTypeCode() {
        return pakageTypeCode;
    }

    /** 
     * Set the 'PakageTypeCode' element value. Код наличия упаковки товара: 0 - Без упаковки; 1 - С упаковкой;  2 - Без упаковки в оборудованных емкостях транспортного средства
     * 
     * @param pakageTypeCode
     */
    public void setPakageTypeCode(String pakageTypeCode) {
        this.pakageTypeCode = pakageTypeCode;
    }

    /** 
     * Get the 'PakagePartQuantity' element value. Количество грузовых мест, частично занятых товаром
     * 
     * @return value
     */
    public String getPakagePartQuantity() {
        return pakagePartQuantity;
    }

    /** 
     * Set the 'PakagePartQuantity' element value. Количество грузовых мест, частично занятых товаром
     * 
     * @param pakagePartQuantity
     */
    public void setPakagePartQuantity(String pakagePartQuantity) {
        this.pakagePartQuantity = pakagePartQuantity;
    }

    /** 
     * Get the 'RBCargoKind' element value. Вид грузовых мест (элемент 2 гр. 31 ДТ)
     * 
     * @return value
     */
    public String getRBCargoKind() {
        return RBCargoKind;
    }

    /** 
     * Set the 'RBCargoKind' element value. Вид грузовых мест (элемент 2 гр. 31 ДТ)
     * 
     * @param RBCargoKind
     */
    public void setRBCargoKind(String RBCargoKind) {
        this.RBCargoKind = RBCargoKind;
    }

    /** 
     * Get the 'PackageCode' element value. Код вида груза в соответствии с  классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @return value
     */
    public String getPackageCode() {
        return packageCode;
    }

    /** 
     * Set the 'PackageCode' element value. Код вида груза в соответствии с  классификатором видов груза, упаковки и упаковочных материалов
     * 
     * @param packageCode
     */
    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    /** 
     * Get the list of 'PackingInformation' element items. Сведения об упаковке товаров
     * 
     * @return list
     */
    public List<PackingInformationType> getPackingInformationList() {
        return packingInformationList;
    }

    /** 
     * Set the list of 'PackingInformation' element items. Сведения об упаковке товаров
     * 
     * @param list
     */
    public void setPackingInformationList(List<PackingInformationType> list) {
        packingInformationList = list;
    }

    /** 
     * Get the list of 'PalleteInformation' element items. Сведения о поддонах и паллетах (элемент 2 гр 31)
     * 
     * @return list
     */
    public List<PalleteInformationType> getPalleteInformationList() {
        return palleteInformationList;
    }

    /** 
     * Set the list of 'PalleteInformation' element items. Сведения о поддонах и паллетах (элемент 2 гр 31)
     * 
     * @param list
     */
    public void setPalleteInformationList(List<PalleteInformationType> list) {
        palleteInformationList = list;
    }

    /** 
     * Get the list of 'UnitPackInfo' element items. Сведения об индивидуальной упаковке товара
     * 
     * @return list
     */
    public List<PackingInformationType> getUnitPackInfoList() {
        return unitPackInfoList;
    }

    /** 
     * Set the list of 'UnitPackInfo' element items. Сведения об индивидуальной упаковке товара
     * 
     * @param list
     */
    public void setUnitPackInfoList(List<PackingInformationType> list) {
        unitPackInfoList = list;
    }

    /** 
     * Get the list of 'CargoInfo' element items. Сведения о виде груза (при перевозе товара без упаковки)
     * 
     * @return list
     */
    public List<PackingInformationType> getCargoInfoList() {
        return cargoInfoList;
    }

    /** 
     * Set the list of 'CargoInfo' element items. Сведения о виде груза (при перевозе товара без упаковки)
     * 
     * @param list
     */
    public void setCargoInfoList(List<PackingInformationType> list) {
        cargoInfoList = list;
    }
}
