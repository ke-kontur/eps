
package ru.acs.fts.schemas.album.oez_exportpass;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������� �� ����� �������� ���������� � ���������� ���/���������� �� ����� ������� � ���������� ����
 */
public class OEZExportPassType extends BaseDocType
{
    private LocalDate limitDate;
    private String docSign;
    private RegistrationNumberType registrationNumber;
    private ConsignorType consignor;
    private TransportMeansType transportMeans;
    private List<GoodsListType> goodsList = new ArrayList<GoodsListType>();
    private List<DocumentBaseType> documentExpList = new ArrayList<DocumentBaseType>();
    private CustomsPersonType customsPerson;
    private CUOrganizationType resident;
    private String documentModeID;

    /** 
     * Get the 'LimitDate' element value. ���� �������� �������� 
     * 
     * @return value
     */
    public LocalDate getLimitDate() {
        return limitDate;
    }

    /** 
     * Set the 'LimitDate' element value. ���� �������� �������� 
     * 
     * @param limitDate
     */
    public void setLimitDate(LocalDate limitDate) {
        this.limitDate = limitDate;
    }

    /** 
     * Get the 'DocSign' element value. ������� ���������: 0 - ������� �� ����� �������� ���������� � ���������� ���; 1 - ���������� �� ����� ������� � ���������� ����
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� ���������: 0 - ������� �� ����� �������� ���������� � ���������� ���; 1 - ���������� �� ����� ������� � ���������� ����
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ����������
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ����������
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
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
     * Get the list of 'GoodsList' element items. �������� �������
     * 
     * @return list
     */
    public List<GoodsListType> getGoodsList() {
        return goodsList;
    }

    /** 
     * Set the list of 'GoodsList' element items. �������� �������
     * 
     * @param list
     */
    public void setGoodsList(List<GoodsListType> list) {
        goodsList = list;
    }

    /** 
     * Get the list of 'DocumentExp' element items. ��������� �� ���������, ������� �������� �����
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentExpList() {
        return documentExpList;
    }

    /** 
     * Set the list of 'DocumentExp' element items. ��������� �� ���������, ������� �������� �����
     * 
     * @param list
     */
    public void setDocumentExpList(List<DocumentBaseType> list) {
        documentExpList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Resident' element value. �������� (����)
     * 
     * @return value
     */
    public CUOrganizationType getResident() {
        return resident;
    }

    /** 
     * Set the 'Resident' element value. �������� (����)
     * 
     * @param resident
     */
    public void setResident(CUOrganizationType resident) {
        this.resident = resident;
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
