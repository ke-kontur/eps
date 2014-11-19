
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GoodsBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ��� - �������� � �����e
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
     * Get the 'CountryCode' element value. ���������� ��������� �����-2 ��� ������ ������������ (������������) ������ �� ��������������� �������������� ����� ���� (�������� ����������)
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'CountryCode' element value. ���������� ��������� �����-2 ��� ������ ������������ (������������) ������ �� ��������������� �������������� ����� ���� (�������� ����������)
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'CountryName' element value. ������� ������������ ������ ������������ (������������) ������ �� ��������������� �������������� ����� ���� (�������� ����������)
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. ������� ������������ ������ ������������ (������������) ������ �� ��������������� �������������� ����� ���� (�������� ����������)
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'CountrySrcFlag' element value. ��� ��������� ���������� � ������ ������������: 1 - ���������� �� ������ 2- ���������� �� ��������  3 -�������� �� ���������� 4- ������ ���������
     * 
     * @return value
     */
    public String getCountrySrcFlag() {
        return countrySrcFlag;
    }

    /** 
     * Set the 'CountrySrcFlag' element value. ��� ��������� ���������� � ������ ������������: 1 - ���������� �� ������ 2- ���������� �� ��������  3 -�������� �� ���������� 4- ������ ���������
     * 
     * @param countrySrcFlag
     */
    public void setCountrySrcFlag(String countrySrcFlag) {
        this.countrySrcFlag = countrySrcFlag;
    }

    /** 
     * Get the list of 'CountrySrcDesc' element items. �������� ��������� ���������� � ������ ������������. �����������  ��� CountrySrcFlag =  4- ������ ���������
     * 
     * @return list
     */
    public List<String> getCountrySrcDescList() {
        return countrySrcDescList;
    }

    /** 
     * Set the list of 'CountrySrcDesc' element items. �������� ��������� ���������� � ������ ������������. �����������  ��� CountrySrcFlag =  4- ������ ���������
     * 
     * @param list
     */
    public void setCountrySrcDescList(List<String> list) {
        countrySrcDescList = list;
    }

    /** 
     * Get the 'DocBruttoWeight' element value. ��� ������ ������� �� ���������� (��.)
     * 
     * @return value
     */
    public String getDocBruttoWeight() {
        return docBruttoWeight;
    }

    /** 
     * Set the 'DocBruttoWeight' element value. ��� ������ ������� �� ���������� (��.)
     * 
     * @param docBruttoWeight
     */
    public void setDocBruttoWeight(String docBruttoWeight) {
        this.docBruttoWeight = docBruttoWeight;
    }

    /** 
     * Get the 'GoodsDamageFlag' element value. ������� ����������� ������
     * 
     * @return value
     */
    public String getGoodsDamageFlag() {
        return goodsDamageFlag;
    }

    /** 
     * Set the 'GoodsDamageFlag' element value. ������� ����������� ������
     * 
     * @param goodsDamageFlag
     */
    public void setGoodsDamageFlag(String goodsDamageFlag) {
        this.goodsDamageFlag = goodsDamageFlag;
    }

    /** 
     * Get the list of 'DamageDesc' element items. �������� ����������� ������� � ��������
     * 
     * @return list
     */
    public List<String> getDamageDescList() {
        return damageDescList;
    }

    /** 
     * Set the list of 'DamageDesc' element items. �������� ����������� ������� � ��������
     * 
     * @param list
     */
    public void setDamageDescList(List<String> list) {
        damageDescList = list;
    }

    /** 
     * Get the 'GoodsViolationFlag' element value. ������� ���������� �������������� ������������ ��������� � ���������� ����������: 1 - �� ���� �����; 2 -�� ���������� �������, � �������� ���������, �������� �� ��; 3 - �� ��������; 4 - �� ���� ���������
     * 
     * @return value
     */
    public String getGoodsViolationFlag() {
        return goodsViolationFlag;
    }

    /** 
     * Set the 'GoodsViolationFlag' element value. ������� ���������� �������������� ������������ ��������� � ���������� ����������: 1 - �� ���� �����; 2 -�� ���������� �������, � �������� ���������, �������� �� ��; 3 - �� ��������; 4 - �� ���� ���������
     * 
     * @param goodsViolationFlag
     */
    public void setGoodsViolationFlag(String goodsViolationFlag) {
        this.goodsViolationFlag = goodsViolationFlag;
    }

    /** 
     * Get the list of 'GoodsViolationDesc' element items. �������� ����  ��������� ��������������. ����������� ��� GoodsViolationFlag = 4 - �� ���� ���������
     * 
     * @return list
     */
    public List<String> getGoodsViolationDescList() {
        return goodsViolationDescList;
    }

    /** 
     * Set the list of 'GoodsViolationDesc' element items. �������� ����  ��������� ��������������. ����������� ��� GoodsViolationFlag = 4 - �� ���� ���������
     * 
     * @param list
     */
    public void setGoodsViolationDescList(List<String> list) {
        goodsViolationDescList = list;
    }

    /** 
     * Get the 'GoodsTestFlag' element value. ������� ������ ���� � ��������: 0 - ����� � ������� ������ �� ����������; 1- ����� � ������� ������ ����������
     * 
     * @return value
     */
    public String getGoodsTestFlag() {
        return goodsTestFlag;
    }

    /** 
     * Set the 'GoodsTestFlag' element value. ������� ������ ���� � ��������: 0 - ����� � ������� ������ �� ����������; 1- ����� � ������� ������ ����������
     * 
     * @param goodsTestFlag
     */
    public void setGoodsTestFlag(String goodsTestFlag) {
        this.goodsTestFlag = goodsTestFlag;
    }

    /** 
     * Get the 'GoodsNumericDT' element value. ����� ������ �� ��
     * 
     * @return value
     */
    public String getGoodsNumericDT() {
        return goodsNumericDT;
    }

    /** 
     * Set the 'GoodsNumericDT' element value. ����� ������ �� ��
     * 
     * @param goodsNumericDT
     */
    public void setGoodsNumericDT(String goodsNumericDT) {
        this.goodsNumericDT = goodsNumericDT;
    }

    /** 
     * Get the 'SupplementaryQuantity' element value. ���������� ������� �  ������� ���������, �������� �� ��
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryQuantity() {
        return supplementaryQuantity;
    }

    /** 
     * Set the 'SupplementaryQuantity' element value. ���������� ������� �  ������� ���������, �������� �� ��
     * 
     * @param supplementaryQuantity
     */
    public void setSupplementaryQuantity(
            SupplementaryQuantityType supplementaryQuantity) {
        this.supplementaryQuantity = supplementaryQuantity;
    }

    /** 
     * Get the list of 'CargoInfo' element items. �������� � ���� �����
     * 
     * @return list
     */
    public List<InspPackageType> getCargoInfoList() {
        return cargoInfoList;
    }

    /** 
     * Set the list of 'CargoInfo' element items. �������� � ���� �����
     * 
     * @param list
     */
    public void setCargoInfoList(List<InspPackageType> list) {
        cargoInfoList = list;
    }

    /** 
     * Get the list of 'PlaceInfo' element items. �������� � ���� (��������������� / ��������������)
     * 
     * @return list
     */
    public List<InspPackageType> getPlaceInfoList() {
        return placeInfoList;
    }

    /** 
     * Set the list of 'PlaceInfo' element items. �������� � ���� (��������������� / ��������������)
     * 
     * @param list
     */
    public void setPlaceInfoList(List<InspPackageType> list) {
        placeInfoList = list;
    }

    /** 
     * Get the list of 'PalleteInfo' element items. �������� � �������� / �������
     * 
     * @return list
     */
    public List<InspPackageType> getPalleteInfoList() {
        return palleteInfoList;
    }

    /** 
     * Set the list of 'PalleteInfo' element items. �������� � �������� / �������
     * 
     * @param list
     */
    public void setPalleteInfoList(List<InspPackageType> list) {
        palleteInfoList = list;
    }

    /** 
     * Get the list of 'PackageInfo' element items. C������� �� �������e
     * 
     * @return list
     */
    public List<InspPackageType> getPackageInfoList() {
        return packageInfoList;
    }

    /** 
     * Set the list of 'PackageInfo' element items. C������� �� �������e
     * 
     * @param list
     */
    public void setPackageInfoList(List<InspPackageType> list) {
        packageInfoList = list;
    }
}
