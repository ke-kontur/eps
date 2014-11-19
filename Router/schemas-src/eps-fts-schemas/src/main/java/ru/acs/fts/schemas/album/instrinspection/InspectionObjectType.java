
package ru.acs.fts.schemas.album.instrinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.InspectionPlaceType;

/** 
 * �������� �� ������� ��������
 */
public class InspectionObjectType
{
    private String objectType;
    private String consigCountryCode;
    private String consigCountryName;
    private String deliveryPlace;
    private String inspCustCode;
    private List<String> inspDescriptionList = new ArrayList<String>();
    private String delivCountryCode;
    private String delivCountryName;
    private CUOrganizationType personInspection;
    private InspTransportMeansType inspTransportMeans;
    private List<InspDocumentsType> inspDocumentList = new ArrayList<InspDocumentsType>();
    private InspGoodsType inspGoods;
    private InspDetailsType inspDetails;
    private InspectionPlaceType inspGoodsLocation;
    private List<RiskProfileType> riskProfileList = new ArrayList<RiskProfileType>();
    private List<PresenceNecessityListType> presenceNecessityList = new ArrayList<PresenceNecessityListType>();

    /** 
     * Get the 'ObjectType' element value. ��� �������: 1-�����; 2-������������ ��������
     * 
     * @return value
     */
    public String getObjectType() {
        return objectType;
    }

    /** 
     * Set the 'ObjectType' element value. ��� �������: 1-�����; 2-������������ ��������
     * 
     * @param objectType
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /** 
     * Get the 'ConsigCountryCode' element value. ��������� ��� ������ �����������
     * 
     * @return value
     */
    public String getConsigCountryCode() {
        return consigCountryCode;
    }

    /** 
     * Set the 'ConsigCountryCode' element value. ��������� ��� ������ �����������
     * 
     * @param consigCountryCode
     */
    public void setConsigCountryCode(String consigCountryCode) {
        this.consigCountryCode = consigCountryCode;
    }

    /** 
     * Get the 'ConsigCountryName' element value. ������������ ������ �����������
     * 
     * @return value
     */
    public String getConsigCountryName() {
        return consigCountryName;
    }

    /** 
     * Set the 'ConsigCountryName' element value. ������������ ������ �����������
     * 
     * @param consigCountryName
     */
    public void setConsigCountryName(String consigCountryName) {
        this.consigCountryName = consigCountryName;
    }

    /** 
     * Get the 'DeliveryPlace' element value. ������������ ����� ��������
     * 
     * @return value
     */
    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    /** 
     * Set the 'DeliveryPlace' element value. ������������ ����� ��������
     * 
     * @param deliveryPlace
     */
    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    /** 
     * Get the 'InspCustCode' element value. ��� ����������� ������ ��������
     * 
     * @return value
     */
    public String getInspCustCode() {
        return inspCustCode;
    }

    /** 
     * Set the 'InspCustCode' element value. ��� ����������� ������ ��������
     * 
     * @param inspCustCode
     */
    public void setInspCustCode(String inspCustCode) {
        this.inspCustCode = inspCustCode;
    }

    /** 
     * Get the list of 'InspDescription' element items. �������������� ��������/�����������
     * 
     * @return list
     */
    public List<String> getInspDescriptionList() {
        return inspDescriptionList;
    }

    /** 
     * Set the list of 'InspDescription' element items. �������������� ��������/�����������
     * 
     * @param list
     */
    public void setInspDescriptionList(List<String> list) {
        inspDescriptionList = list;
    }

    /** 
     * Get the 'DelivCountryCode' element value. ��������� ��� ������ ����������
     * 
     * @return value
     */
    public String getDelivCountryCode() {
        return delivCountryCode;
    }

    /** 
     * Set the 'DelivCountryCode' element value. ��������� ��� ������ ����������
     * 
     * @param delivCountryCode
     */
    public void setDelivCountryCode(String delivCountryCode) {
        this.delivCountryCode = delivCountryCode;
    }

    /** 
     * Get the 'DelivCountryName' element value. ������������ ������ ����������
     * 
     * @return value
     */
    public String getDelivCountryName() {
        return delivCountryName;
    }

    /** 
     * Set the 'DelivCountryName' element value. ������������ ������ ����������
     * 
     * @param delivCountryName
     */
    public void setDelivCountryName(String delivCountryName) {
        this.delivCountryName = delivCountryName;
    }

    /** 
     * Get the 'PersonInspection' element value. ����,����������� ������������ � ��������� ������� � (���) ������������ �������.
     * 
     * @return value
     */
    public CUOrganizationType getPersonInspection() {
        return personInspection;
    }

    /** 
     * Set the 'PersonInspection' element value. ����,����������� ������������ � ��������� ������� � (���) ������������ �������.
     * 
     * @param personInspection
     */
    public void setPersonInspection(CUOrganizationType personInspection) {
        this.personInspection = personInspection;
    }

    /** 
     * Get the 'InspTransportMeans' element value. ������������ ��������/����������
     * 
     * @return value
     */
    public InspTransportMeansType getInspTransportMeans() {
        return inspTransportMeans;
    }

    /** 
     * Set the 'InspTransportMeans' element value. ������������ ��������/����������
     * 
     * @param inspTransportMeans
     */
    public void setInspTransportMeans(InspTransportMeansType inspTransportMeans) {
        this.inspTransportMeans = inspTransportMeans;
    }

    /** 
     * Get the list of 'InspDocuments' element items. �������� � ����������
     * 
     * @return list
     */
    public List<InspDocumentsType> getInspDocumentList() {
        return inspDocumentList;
    }

    /** 
     * Set the list of 'InspDocuments' element items. �������� � ����������
     * 
     * @param list
     */
    public void setInspDocumentList(List<InspDocumentsType> list) {
        inspDocumentList = list;
    }

    /** 
     * Get the 'InspGoods' element value. �������� � ������
     * 
     * @return value
     */
    public InspGoodsType getInspGoods() {
        return inspGoods;
    }

    /** 
     * Set the 'InspGoods' element value. �������� � ������
     * 
     * @param inspGoods
     */
    public void setInspGoods(InspGoodsType inspGoods) {
        this.inspGoods = inspGoods;
    }

    /** 
     * Get the 'InspDetails' element value. �������� �� ������������ ��������
     * 
     * @return value
     */
    public InspDetailsType getInspDetails() {
        return inspDetails;
    }

    /** 
     * Set the 'InspDetails' element value. �������� �� ������������ ��������
     * 
     * @param inspDetails
     */
    public void setInspDetails(InspDetailsType inspDetails) {
        this.inspDetails = inspDetails;
    }

    /** 
     * Get the 'InspGoodsLocation' element value. ��������������� �������
     * 
     * @return value
     */
    public InspectionPlaceType getInspGoodsLocation() {
        return inspGoodsLocation;
    }

    /** 
     * Set the 'InspGoodsLocation' element value. ��������������� �������
     * 
     * @param inspGoodsLocation
     */
    public void setInspGoodsLocation(InspectionPlaceType inspGoodsLocation) {
        this.inspGoodsLocation = inspGoodsLocation;
    }

    /** 
     * Get the list of 'RiskProfile' element items. ����� ������� �����
     * 
     * @return list
     */
    public List<RiskProfileType> getRiskProfileList() {
        return riskProfileList;
    }

    /** 
     * Set the list of 'RiskProfile' element items. ����� ������� �����
     * 
     * @param list
     */
    public void setRiskProfileList(List<RiskProfileType> list) {
        riskProfileList = list;
    }

    /** 
     * Get the list of 'PresenceNecessityList' element items. �������� ���, ����������� (�������) ������� ���������� ��� (�) ���������� ����������� ��������
     * 
     * @return list
     */
    public List<PresenceNecessityListType> getPresenceNecessityList() {
        return presenceNecessityList;
    }

    /** 
     * Set the list of 'PresenceNecessityList' element items. �������� ���, ����������� (�������) ������� ���������� ��� (�) ���������� ����������� ��������
     * 
     * @param list
     */
    public void setPresenceNecessityList(List<PresenceNecessityListType> list) {
        presenceNecessityList = list;
    }
}
