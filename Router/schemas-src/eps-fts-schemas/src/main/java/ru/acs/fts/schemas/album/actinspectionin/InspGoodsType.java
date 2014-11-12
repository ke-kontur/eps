
package ru.acs.fts.schemas.album.actinspectionin;

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
     * Get the 'CountrySrcDesc' element value. �������� ��������� ���������� � ������ ������������. �����������  ��� CountrySrcFlag =  4- ������ ���������
     * 
     * @return value
     */
    public String getCountrySrcDesc() {
        return countrySrcDesc;
    }

    /** 
     * Set the 'CountrySrcDesc' element value. �������� ��������� ���������� � ������ ������������. �����������  ��� CountrySrcFlag =  4- ������ ���������
     * 
     * @param countrySrcDesc
     */
    public void setCountrySrcDesc(String countrySrcDesc) {
        this.countrySrcDesc = countrySrcDesc;
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
     * Get the 'GoodsDamageFlag' element value. ������� ����������� ������ 0 -  ����������� �����������; 1 - ����� ���������
     * 
     * @return value
     */
    public String getGoodsDamageFlag() {
        return goodsDamageFlag;
    }

    /** 
     * Set the 'GoodsDamageFlag' element value. ������� ����������� ������ 0 -  ����������� �����������; 1 - ����� ���������
     * 
     * @param goodsDamageFlag
     */
    public void setGoodsDamageFlag(String goodsDamageFlag) {
        this.goodsDamageFlag = goodsDamageFlag;
    }

    /** 
     * Get the 'DamageDesc' element value. �������� ����������� ������� � ��������
     * 
     * @return value
     */
    public String getDamageDesc() {
        return damageDesc;
    }

    /** 
     * Set the 'DamageDesc' element value. �������� ����������� ������� � ��������
     * 
     * @param damageDesc
     */
    public void setDamageDesc(String damageDesc) {
        this.damageDesc = damageDesc;
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
     * Get the 'GoodsViolationDesc' element value. �������� ����  ��������� ��������������. ����������� ��� GoodsViolationFlag = 4 - �� ���� ���������
     * 
     * @return value
     */
    public String getGoodsViolationDesc() {
        return goodsViolationDesc;
    }

    /** 
     * Set the 'GoodsViolationDesc' element value. �������� ����  ��������� ��������������. ����������� ��� GoodsViolationFlag = 4 - �� ���� ���������
     * 
     * @param goodsViolationDesc
     */
    public void setGoodsViolationDesc(String goodsViolationDesc) {
        this.goodsViolationDesc = goodsViolationDesc;
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
     * Get the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
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
     * Get the list of 'PackageInfo' element items. ��� - �������� �� ���������
     * 
     * @return list
     */
    public List<InspPackageType> getPackageInfoList() {
        return packageInfoList;
    }

    /** 
     * Set the list of 'PackageInfo' element items. ��� - �������� �� ���������
     * 
     * @param list
     */
    public void setPackageInfoList(List<InspPackageType> list) {
        packageInfoList = list;
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
}
