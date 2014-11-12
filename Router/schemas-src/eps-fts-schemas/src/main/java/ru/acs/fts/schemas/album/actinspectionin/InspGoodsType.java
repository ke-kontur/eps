
package ru.acs.fts.schemas.album.actinspectionin;

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
    private String countrySrcDesc;
    private String docBruttoWeight;
    private String goodsDamageFlag;
    private String damageDesc;
    private String goodsViolationFlag;
    private String goodsViolationDesc;
    private String goodsTestFlag;
    private String recordNumber;
    private String goodsNumericDT;
    private List<InspPackageType> packageInfoList = new ArrayList<InspPackageType>();
    private SupplementaryQuantityType supplementaryQuantity;
    private List<InspPackageType> cargoInfoList = new ArrayList<InspPackageType>();
    private List<InspPackageType> placeInfoList = new ArrayList<InspPackageType>();
    private List<InspPackageType> palleteInfoList = new ArrayList<InspPackageType>();

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
     * Get the 'CountrySrcDesc' element value. Описание источника информации о стране изготовления. Заполняется  при CountrySrcFlag =  4- другие источники
     * 
     * @return value
     */
    public String getCountrySrcDesc() {
        return countrySrcDesc;
    }

    /** 
     * Set the 'CountrySrcDesc' element value. Описание источника информации о стране изготовления. Заполняется  при CountrySrcFlag =  4- другие источники
     * 
     * @param countrySrcDesc
     */
    public void setCountrySrcDesc(String countrySrcDesc) {
        this.countrySrcDesc = countrySrcDesc;
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
     * Get the 'GoodsDamageFlag' element value. Признак повреждения товара 0 -  повреждения отсутствуют; 1 - товар поврежден
     * 
     * @return value
     */
    public String getGoodsDamageFlag() {
        return goodsDamageFlag;
    }

    /** 
     * Set the 'GoodsDamageFlag' element value. Признак повреждения товара 0 -  повреждения отсутствуют; 1 - товар поврежден
     * 
     * @param goodsDamageFlag
     */
    public void setGoodsDamageFlag(String goodsDamageFlag) {
        this.goodsDamageFlag = goodsDamageFlag;
    }

    /** 
     * Get the 'DamageDesc' element value. Описание повреждения товаров и упаковки
     * 
     * @return value
     */
    public String getDamageDesc() {
        return damageDesc;
    }

    /** 
     * Set the 'DamageDesc' element value. Описание повреждения товаров и упаковки
     * 
     * @param damageDesc
     */
    public void setDamageDesc(String damageDesc) {
        this.damageDesc = damageDesc;
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
     * Get the 'GoodsViolationDesc' element value. Описание иных  признаков несоответствия. Заполняется при GoodsViolationFlag = 4 - по иным признакам
     * 
     * @return value
     */
    public String getGoodsViolationDesc() {
        return goodsViolationDesc;
    }

    /** 
     * Set the 'GoodsViolationDesc' element value. Описание иных  признаков несоответствия. Заполняется при GoodsViolationFlag = 4 - по иным признакам
     * 
     * @param goodsViolationDesc
     */
    public void setGoodsViolationDesc(String goodsViolationDesc) {
        this.goodsViolationDesc = goodsViolationDesc;
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
     * Get the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. Порядковый номер записи в таблице БД
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
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
     * Get the list of 'PackageInfo' element items. АТД - сведения об упаковках
     * 
     * @return list
     */
    public List<InspPackageType> getPackageInfoList() {
        return packageInfoList;
    }

    /** 
     * Set the list of 'PackageInfo' element items. АТД - сведения об упаковках
     * 
     * @param list
     */
    public void setPackageInfoList(List<InspPackageType> list) {
        packageInfoList = list;
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
}
