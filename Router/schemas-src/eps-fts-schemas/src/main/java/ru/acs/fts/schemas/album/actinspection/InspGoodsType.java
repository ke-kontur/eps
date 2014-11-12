
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * АТД - сведения о товарe
 */
public class InspGoodsType extends GoodsBaseType
{
    private String countryCode;
    private String countryName;
    private String countrySrcFlag;
    private List<String> countrySrcDescList = new ArrayList<String>();
    private String docBruttoWeight;
    private String goodsDamageFlag;
    private List<String> damageDescList = new ArrayList<String>();
    private String goodsViolationFlag;
    private List<String> goodsViolationDescList = new ArrayList<String>();
    private String goodsTestFlag;
    private String goodsNumericDT;
    private SupplementaryQuantityType supplementaryQuantity;
    private List<InspPackageType> cargoInfoList = new ArrayList<InspPackageType>();
    private List<InspPackageType> placeInfoList = new ArrayList<InspPackageType>();
    private List<InspPackageType> palleteInfoList = new ArrayList<InspPackageType>();
    private List<InspPackageType> packageInfoList = new ArrayList<InspPackageType>();

    /** 
     * Get the 'CountryCode' element value. Двузначный буквенный альфа-2 код страны изготовления (производства) товара по общероссийскому классификатору стран мира (согласно маркировке)
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. Двузначный буквенный альфа-2 код страны изготовления (производства) товара по общероссийскому классификатору стран мира (согласно маркировке)
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. Краткое наименование страны изготовления (производства) товара по общероссийскому классификатору стран мира (согласно маркировке)
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Краткое наименование страны изготовления (производства) товара по общероссийскому классификатору стран мира (согласно маркировке)
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'CountrySrcFlag' element value. Код источника информации о стране изготовления: 1 - маркировка на товаре 2- маркировка на упаковке  3 -сведения из документов 4- другие источники
     * 
     * @return value
     */
    public String getCountrySrcFlag() {
        return countrySrcFlag;
    }

    /** 
     * Set the 'CountrySrcFlag' element value. Код источника информации о стране изготовления: 1 - маркировка на товаре 2- маркировка на упаковке  3 -сведения из документов 4- другие источники
     * 
     * @param countrySrcFlag
     */
    public void setCountrySrcFlag(String countrySrcFlag) {
        this.countrySrcFlag = countrySrcFlag;
    }

    /** 
     * Get the list of 'CountrySrcDesc' element items. Описание источника информации о стране изготовления. Заполняется  при CountrySrcFlag =  4- другие источники
     * 
     * @return list
     */
    public List<String> getCountrySrcDescList() {
        return countrySrcDescList;
    }

    /** 
     * Set the list of 'CountrySrcDesc' element items. Описание источника информации о стране изготовления. Заполняется  при CountrySrcFlag =  4- другие источники
     * 
     * @param list
     */
    public void setCountrySrcDescList(List<String> list) {
        countrySrcDescList = list;
    }

    /** 
     * Get the 'DocBruttoWeight' element value. Вес брутто товаров по документам (кг.)
     * 
     * @return value
     */
    public String getDocBruttoWeight() {
        return docBruttoWeight;
    }

    /** 
     * Set the 'DocBruttoWeight' element value. Вес брутто товаров по документам (кг.)
     * 
     * @param docBruttoWeight
     */
    public void setDocBruttoWeight(String docBruttoWeight) {
        this.docBruttoWeight = docBruttoWeight;
    }

    /** 
     * Get the 'GoodsDamageFlag' element value. Признак повреждения товара
     * 
     * @return value
     */
    public String getGoodsDamageFlag() {
        return goodsDamageFlag;
    }

    /** 
     * Set the 'GoodsDamageFlag' element value. Признак повреждения товара
     * 
     * @param goodsDamageFlag
     */
    public void setGoodsDamageFlag(String goodsDamageFlag) {
        this.goodsDamageFlag = goodsDamageFlag;
    }

    /** 
     * Get the list of 'DamageDesc' element items. Описание повреждения товаров и упаковки
     * 
     * @return list
     */
    public List<String> getDamageDescList() {
        return damageDescList;
    }

    /** 
     * Set the list of 'DamageDesc' element items. Описание повреждения товаров и упаковки
     * 
     * @param list
     */
    public void setDamageDescList(List<String> list) {
        damageDescList = list;
    }

    /** 
     * Get the 'GoodsViolationFlag' element value. Признак выявленных несоответствий относительно имеющихся у инспектора документов: 1 - по весу нетто; 2 -по количеству товаров, в единицах измерения, отличных от кг; 3 - по описанию; 4 - по иным признакам
     * 
     * @return value
     */
    public String getGoodsViolationFlag() {
        return goodsViolationFlag;
    }

    /** 
     * Set the 'GoodsViolationFlag' element value. Признак выявленных несоответствий относительно имеющихся у инспектора документов: 1 - по весу нетто; 2 -по количеству товаров, в единицах измерения, отличных от кг; 3 - по описанию; 4 - по иным признакам
     * 
     * @param goodsViolationFlag
     */
    public void setGoodsViolationFlag(String goodsViolationFlag) {
        this.goodsViolationFlag = goodsViolationFlag;
    }

    /** 
     * Get the list of 'GoodsViolationDesc' element items. Описание иных  признаков несоответствия. Заполняется при GoodsViolationFlag = 4 - по иным признакам
     * 
     * @return list
     */
    public List<String> getGoodsViolationDescList() {
        return goodsViolationDescList;
    }

    /** 
     * Set the list of 'GoodsViolationDesc' element items. Описание иных  признаков несоответствия. Заполняется при GoodsViolationFlag = 4 - по иным признакам
     * 
     * @param list
     */
    public void setGoodsViolationDescList(List<String> list) {
        goodsViolationDescList = list;
    }

    /** 
     * Get the 'GoodsTestFlag' element value. Признак взятия проб и образцов: 0 - пробы и образцы товара не отбирались; 1- пробы и образцы товара отбирались
     * 
     * @return value
     */
    public String getGoodsTestFlag() {
        return goodsTestFlag;
    }

    /** 
     * Set the 'GoodsTestFlag' element value. Признак взятия проб и образцов: 0 - пробы и образцы товара не отбирались; 1- пробы и образцы товара отбирались
     * 
     * @param goodsTestFlag
     */
    public void setGoodsTestFlag(String goodsTestFlag) {
        this.goodsTestFlag = goodsTestFlag;
    }

    /** 
     * Get the 'GoodsNumericDT' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGoodsNumericDT() {
        return goodsNumericDT;
    }

    /** 
     * Set the 'GoodsNumericDT' element value. Номер товара по ДТ
     * 
     * @param goodsNumericDT
     */
    public void setGoodsNumericDT(String goodsNumericDT) {
        this.goodsNumericDT = goodsNumericDT;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. Количество товаров в  единице измерения, отличной от кг
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. Количество товаров в  единице измерения, отличной от кг
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'CargoInfo' element items. Сведения о виде груза
     * 
     * @return list
     */
    public List<InspPackageType> getCargoInfoList() {
        return cargoInfoList;
    }

    /** 
     * Set the list of 'CargoInfo' element items. Сведения о виде груза
     * 
     * @param list
     */
    public void setCargoInfoList(List<InspPackageType> list) {
        cargoInfoList = list;
    }

    /** 
     * Get the list of 'PlaceInfo' element items. Сведения о таре (потребительской / индивидуальной)
     * 
     * @return list
     */
    public List<InspPackageType> getPlaceInfoList() {
        return placeInfoList;
    }

    /** 
     * Set the list of 'PlaceInfo' element items. Сведения о таре (потребительской / индивидуальной)
     * 
     * @param list
     */
    public void setPlaceInfoList(List<InspPackageType> list) {
        placeInfoList = list;
    }

    /** 
     * Get the list of 'PalleteInfo' element items. Сведения о поддонах / палетах
     * 
     * @return list
     */
    public List<InspPackageType> getPalleteInfoList() {
        return palleteInfoList;
    }

    /** 
     * Set the list of 'PalleteInfo' element items. Сведения о поддонах / палетах
     * 
     * @param list
     */
    public void setPalleteInfoList(List<InspPackageType> list) {
        palleteInfoList = list;
    }

    /** 
     * Get the list of 'PackageInfo' element items. Cведения об упаковкe
     * 
     * @return list
     */
    public List<InspPackageType> getPackageInfoList() {
        return packageInfoList;
    }

    /** 
     * Set the list of 'PackageInfo' element items. Cведения об упаковкe
     * 
     * @param list
     */
    public void setPackageInfoList(List<InspPackageType> list) {
        packageInfoList = list;
    }
}
