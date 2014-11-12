
package ru.acs.fts.schemas.album.applicationadmintransport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * ������ �� ������������� ������������� �������� 
 */
public class ApplicationAdminTransportType extends BaseDocType
{
    private String aim;
    private String volume;
    private String measureUnitQualifierName;
    private String quantityStore;
    private List<String> routeList = new ArrayList<String>();
    private String quantityOperation;
    private LocalDate filingDate;
    private String measureUnitOperation;
    private String measureUnitStore;
    private PersonBaseType adminTransport;
    private TransportMeansBaseType transportMeans;
    private OrganizationBaseType foreignCustomer;
    private OrganizationBaseType translator;
    private String documentModeID;

    /** 
     * Get the 'Aim' element value. ���� �������� �� ���������� ���������� ���������� ���������
     * 
     * @return value
     */
    public String getAim() {
        return aim;
    }

    /** 
     * Set the 'Aim' element value. ���� �������� �� ���������� ���������� ���������� ���������
     * 
     * @param aim
     */
    public void setAim(String aim) {
        this.aim = aim;
    }

    /** 
     * Get the 'Volume' element value. ����� (� �������� �������� ���������) ��������������� �������������� �������� � ������� ���������� ���������� ������� ����, ��������������� ��� �������� �������� �� ������������ ��������
     * 
     * @return value
     */
    public String getVolume() {
        return volume;
    }

    /** 
     * Set the 'Volume' element value. ����� (� �������� �������� ���������) ��������������� �������������� �������� � ������� ���������� ���������� ������� ����, ��������������� ��� �������� �������� �� ������������ ��������
     * 
     * @param volume
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /** 
     * Get the 'MeasureUnitQualifierName' element value. ������������ ������� ��������� ������
     * 
     * @return value
     */
    public String getMeasureUnitQualifierName() {
        return measureUnitQualifierName;
    }

    /** 
     * Set the 'MeasureUnitQualifierName' element value. ������������ ������� ��������� ������
     * 
     * @param measureUnitQualifierName
     */
    public void setMeasureUnitQualifierName(String measureUnitQualifierName) {
        this.measureUnitQualifierName = measureUnitQualifierName;
    }

    /** 
     * Get the 'QuantityStore' element value. ���������� ��������, ����������� �� ����� ������������� �������� �� ������ ������ ���������;
     * 
     * @return value
     */
    public String getQuantityStore() {
        return quantityStore;
    }

    /** 
     * Set the 'QuantityStore' element value. ���������� ��������, ����������� �� ����� ������������� �������� �� ������ ������ ���������;
     * 
     * @param quantityStore
     */
    public void setQuantityStore(String quantityStore) {
        this.quantityStore = quantityStore;
    }

    /** 
     * Get the list of 'Route' element items. ��������������� �������� ���������� ������������� �������� ����� ������ � ���������� ���������� ���������� ���������
     * 
     * @return list
     */
    public List<String> getRouteList() {
        return routeList;
    }

    /** 
     * Set the list of 'Route' element items. ��������������� �������� ���������� ������������� �������� ����� ������ � ���������� ���������� ���������� ���������
     * 
     * @param list
     */
    public void setRouteList(List<String> list) {
        routeList = list;
    }

    /** 
     * Get the 'QuantityOperation' element value. ���������� ��������, ����������� ��� ����������� ������������ ������������� ��������
     * 
     * @return value
     */
    public String getQuantityOperation() {
        return quantityOperation;
    }

    /** 
     * Set the 'QuantityOperation' element value. ���������� ��������, ����������� ��� ����������� ������������ ������������� ��������
     * 
     * @param quantityOperation
     */
    public void setQuantityOperation(String quantityOperation) {
        this.quantityOperation = quantityOperation;
    }

    /** 
     * Get the 'FilingDate' element value. ���� ������ ������
     * 
     * @return value
     */
    public LocalDate getFilingDate() {
        return filingDate;
    }

    /** 
     * Set the 'FilingDate' element value. ���� ������ ������
     * 
     * @param filingDate
     */
    public void setFilingDate(LocalDate filingDate) {
        this.filingDate = filingDate;
    }

    /** 
     * Get the 'MeasureUnitOperation' element value. ������������ ������� ��������� ���������� ��������, ����������� ��� ����������� ������������ ������������� ��������
     * 
     * @return value
     */
    public String getMeasureUnitOperation() {
        return measureUnitOperation;
    }

    /** 
     * Set the 'MeasureUnitOperation' element value. ������������ ������� ��������� ���������� ��������, ����������� ��� ����������� ������������ ������������� ��������
     * 
     * @param measureUnitOperation
     */
    public void setMeasureUnitOperation(String measureUnitOperation) {
        this.measureUnitOperation = measureUnitOperation;
    }

    /** 
     * Get the 'MeasureUnitStore' element value. ������������ ������� ��������� ���������� ��������, ����������� �� ����� ������������� �������� �� ������ ������ ���������
     * 
     * @return value
     */
    public String getMeasureUnitStore() {
        return measureUnitStore;
    }

    /** 
     * Set the 'MeasureUnitStore' element value. ������������ ������� ��������� ���������� ��������, ����������� �� ����� ������������� �������� �� ������ ������ ���������
     * 
     * @param measureUnitStore
     */
    public void setMeasureUnitStore(String measureUnitStore) {
        this.measureUnitStore = measureUnitStore;
    }

    /** 
     * Get the 'AdminTransport' element value. �������� �� ������������� ����������
     * 
     * @return value
     */
    public PersonBaseType getAdminTransport() {
        return adminTransport;
    }

    /** 
     * Set the 'AdminTransport' element value. �������� �� ������������� ����������
     * 
     * @param adminTransport
     */
    public void setAdminTransport(PersonBaseType adminTransport) {
        this.adminTransport = adminTransport;
    }

    /** 
     * Get the 'TransportMeans' element value. �������� � ������������ ��������
     * 
     * @return value
     */
    public TransportMeansBaseType getTransportMeans() {
        return transportMeans;
    }

    /** 
     * Set the 'TransportMeans' element value. �������� � ������������ ��������
     * 
     * @param transportMeans
     */
    public void setTransportMeans(TransportMeansBaseType transportMeans) {
        this.transportMeans = transportMeans;
    }

    /** 
     * Get the 'ForeignCustomer' element value. ����, �������������� ����������� ���������� �� �������� ��������
     * 
     * @return value
     */
    public OrganizationBaseType getForeignCustomer() {
        return foreignCustomer;
    }

    /** 
     * Set the 'ForeignCustomer' element value. ����, �������������� ����������� ���������� �� �������� ��������
     * 
     * @param foreignCustomer
     */
    public void setForeignCustomer(OrganizationBaseType foreignCustomer) {
        this.foreignCustomer = foreignCustomer;
    }

    /** 
     * Get the 'Translator' element value. �������� � ����, ������������� ������� ������ �� ������� ���� � ������, ���� ��� ������������ �� ����������� �����
     * 
     * @return value
     */
    public OrganizationBaseType getTranslator() {
        return translator;
    }

    /** 
     * Set the 'Translator' element value. �������� � ����, ������������� ������� ������ �� ������� ���� � ������, ���� ��� ������������ �� ����������� �����
     * 
     * @param translator
     */
    public void setTranslator(OrganizationBaseType translator) {
        this.translator = translator;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
