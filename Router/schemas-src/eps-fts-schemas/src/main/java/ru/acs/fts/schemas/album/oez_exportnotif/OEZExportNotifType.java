
package ru.acs.fts.schemas.album.oez_exportnotif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ��������������� ����������� � ������ ������� � ���������� ���/����
 */
public class OEZExportNotifType extends BaseDocType
{
    private LocalDate exportDate;
    private String addInformation;
    private LocalDate provisionalDateBegin;
    private LocalDate provisionalDateEnd;
    private String docSign;
    private IncidentNotifType incidentNotif;
    private CustomsType customs;
    private ConsignorType consignor;
    private RegistrationNumberType registrationNumber;
    private TransportMeansType transportMeans;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'ExportDate' element value. ����������� ���� ������ �������
     * 
     * @return value
     */
    public LocalDate getExportDate() {
        return exportDate;
    }

    /** 
     * Set the 'ExportDate' element value. ����������� ���� ������ �������
     * 
     * @param exportDate
     */
    public void setExportDate(LocalDate exportDate) {
        this.exportDate = exportDate;
    }

    /** 
     * Get the 'AddInformation' element value. �������������� ����������
     * 
     * @return value
     */
    public String getAddInformation() {
        return addInformation;
    }

    /** 
     * Set the 'AddInformation' element value. �������������� ����������
     * 
     * @param addInformation
     */
    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation;
    }

    /** 
     * Get the 'ProvisionalDateBegin' element value. ��������������� ���� ������ �
     * 
     * @return value
     */
    public LocalDate getProvisionalDateBegin() {
        return provisionalDateBegin;
    }

    /** 
     * Set the 'ProvisionalDateBegin' element value. ��������������� ���� ������ �
     * 
     * @param provisionalDateBegin
     */
    public void setProvisionalDateBegin(LocalDate provisionalDateBegin) {
        this.provisionalDateBegin = provisionalDateBegin;
    }

    /** 
     * Get the 'ProvisionalDateEnd' element value. ��������������� ���� ������ ��
     * 
     * @return value
     */
    public LocalDate getProvisionalDateEnd() {
        return provisionalDateEnd;
    }

    /** 
     * Set the 'ProvisionalDateEnd' element value. ��������������� ���� ������ ��
     * 
     * @param provisionalDateEnd
     */
    public void setProvisionalDateEnd(LocalDate provisionalDateEnd) {
        this.provisionalDateEnd = provisionalDateEnd;
    }

    /** 
     * Get the 'DocSign' element value. ������� ����������� � ������ ������� � ����������: 0 - ���; 1 - ����
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ����������� � ������ ������� � ����������: 0 - ���; 1 - ����
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'IncidentNotif' element value. ����, �������� ����������� (��������/����������)
     * 
     * @return value
     */
    public IncidentNotifType getIncidentNotif() {
        return incidentNotif;
    }

    /** 
     * Set the 'IncidentNotif' element value. ����, �������� ����������� (��������/����������)
     * 
     * @param incidentNotif
     */
    public void setIncidentNotif(IncidentNotifType incidentNotif) {
        this.incidentNotif = incidentNotif;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Consignor' element value. �����������
     * 
     * @return value
     */
    public ConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �����������
     * 
     * @param consignor
     */
    public void setConsignor(ConsignorType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ���������������� �����������
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ���������������� �����������
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the 'TransportMeans' element value. �������� ������������� �������� 
     * 
     * @return value
     */
    public TransportMeansType getTransportMeans() {
        return transportMeans;
    }

    /** 
     * Set the 'TransportMeans' element value. �������� ������������� �������� 
     * 
     * @param transportMeans
     */
    public void setTransportMeans(TransportMeansType transportMeans) {
        this.transportMeans = transportMeans;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. �������� � ������
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. �������� � ������
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
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
