
package ru.acs.fts.schemas.album.docreestrreq;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ������ �� ����������
 */
public class PermissionInfoType
{
    private String minNumber;
    private String maxNumber;
    private String count;
    private String country;
    private String information;
    private String restrictCondition;
    private String shipmentKind;
    private String countryRestriction;
    private String transitTransportation;
    private String isTransit;
    private String TSRoute;
    private PermitDocumentType permitDocument;
    private CustomsType APP;
    private List<CarrierType> carrierList = new ArrayList<CarrierType>();

    /** 
     * Get the 'MinNumber' element value. ������ ��������� �������
     * 
     * @return value
     */
    public String getMinNumber() {
        return minNumber;
    }

    /** 
     * Set the 'MinNumber' element value. ������ ��������� �������
     * 
     * @param minNumber
     */
    public void setMinNumber(String minNumber) {
        this.minNumber = minNumber;
    }

    /** 
     * Get the 'MaxNumber' element value. ����� ��������� �������
     * 
     * @return value
     */
    public String getMaxNumber() {
        return maxNumber;
    }

    /** 
     * Set the 'MaxNumber' element value. ����� ��������� �������
     * 
     * @param maxNumber
     */
    public void setMaxNumber(String maxNumber) {
        this.maxNumber = maxNumber;
    }

    /** 
     * Get the 'Count' element value. ���������� ������� � ���������
     * 
     * @return value
     */
    public String getCount() {
        return count;
    }

    /** 
     * Set the 'Count' element value. ���������� ������� � ���������
     * 
     * @param count
     */
    public void setCount(String count) {
        this.count = count;
    }

    /** 
     * Get the 'Country' element value. ������
     * 
     * @return value
     */
    public String getCountry() {
        return country;
    }

    /** 
     * Set the 'Country' element value. ������
     * 
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /** 
     * Get the 'Information' element value. ����������
     * 
     * @return value
     */
    public String getInformation() {
        return information;
    }

    /** 
     * Set the 'Information' element value. ����������
     * 
     * @param information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /** 
     * Get the 'RestrictCondition' element value. �����������, ������ ������� �� ������������� ������ 
     * 
     * @return value
     */
    public String getRestrictCondition() {
        return restrictCondition;
    }

    /** 
     * Set the 'RestrictCondition' element value. �����������, ������ ������� �� ������������� ������ 
     * 
     * @param restrictCondition
     */
    public void setRestrictCondition(String restrictCondition) {
        this.restrictCondition = restrictCondition;
    }

    /** 
     * Get the 'ShipmentKind' element value. ��� ���������: 1 - ������������ ���������  (���� ��� ���������� "�������������� ��������� ������"); 2 - ���������� ������ (���� ��� ���������� "�������������� ��������� ������"); 3 - ��������� �/�� ������� ����� (���� ��� ���������� "�������������� ��������� ������")
     * 
     * @return value
     */
    public String getShipmentKind() {
        return shipmentKind;
    }

    /** 
     * Set the 'ShipmentKind' element value. ��� ���������: 1 - ������������ ���������  (���� ��� ���������� "�������������� ��������� ������"); 2 - ���������� ������ (���� ��� ���������� "�������������� ��������� ������"); 3 - ��������� �/�� ������� ����� (���� ��� ���������� "�������������� ��������� ������")
     * 
     * @param shipmentKind
     */
    public void setShipmentKind(String shipmentKind) {
        this.shipmentKind = shipmentKind;
    }

    /** 
     * Get the 'CountryRestriction' element value. �����������, ������ ������� �� �������, ��������� �/�� ������� �� ��������� 
     * 
     * @return value
     */
    public String getCountryRestriction() {
        return countryRestriction;
    }

    /** 
     * Set the 'CountryRestriction' element value. �����������, ������ ������� �� �������, ��������� �/�� ������� �� ��������� 
     * 
     * @param countryRestriction
     */
    public void setCountryRestriction(String countryRestriction) {
        this.countryRestriction = countryRestriction;
    }

    /** 
     * Get the 'TransitTransportation' element value. ������� ������ ����������� �������
     * 
     * @return value
     */
    public String getTransitTransportation() {
        return transitTransportation;
    }

    /** 
     * Set the 'TransitTransportation' element value. ������� ������ ����������� �������
     * 
     * @param transitTransportation
     */
    public void setTransitTransportation(String transitTransportation) {
        this.transitTransportation = transitTransportation;
    }

    /** 
     * Get the 'IsTransit' element value. ������� ������� ������� "�������"
     * 
     * @return value
     */
    public String getIsTransit() {
        return isTransit;
    }

    /** 
     * Set the 'IsTransit' element value. ������� ������� ������� "�������"
     * 
     * @param isTransit
     */
    public void setIsTransit(String isTransit) {
        this.isTransit = isTransit;
    }

    /** 
     * Get the 'TSRoute' element value. ������� �� 
     * 
     * @return value
     */
    public String getTSRoute() {
        return TSRoute;
    }

    /** 
     * Set the 'TSRoute' element value. ������� �� 
     * 
     * @param TSRoute
     */
    public void setTSRoute(String TSRoute) {
        this.TSRoute = TSRoute;
    }

    /** 
     * Get the 'PermitDocument' element value. ����������
     * 
     * @return value
     */
    public PermitDocumentType getPermitDocument() {
        return permitDocument;
    }

    /** 
     * Set the 'PermitDocument' element value. ����������
     * 
     * @param permitDocument
     */
    public void setPermitDocument(PermitDocumentType permitDocument) {
        this.permitDocument = permitDocument;
    }

    /** 
     * Get the 'APP' element value. ���, ����� ������� �������� ������� ��
     * 
     * @return value
     */
    public CustomsType getAPP() {
        return APP;
    }

    /** 
     * Set the 'APP' element value. ���, ����� ������� �������� ������� ��
     * 
     * @param APP
     */
    public void setAPP(CustomsType APP) {
        this.APP = APP;
    }

    /** 
     * Get the list of 'Carrier' element items. ����������
     * 
     * @return list
     */
    public List<CarrierType> getCarrierList() {
        return carrierList;
    }

    /** 
     * Set the list of 'Carrier' element items. ����������
     * 
     * @param list
     */
    public void setCarrierList(List<CarrierType> list) {
        carrierList = list;
    }
}
