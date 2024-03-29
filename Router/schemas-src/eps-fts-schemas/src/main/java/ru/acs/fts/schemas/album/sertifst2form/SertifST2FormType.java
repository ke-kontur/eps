
package ru.acs.fts.schemas.album.sertifst2form;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.sertifcommonaggregatetypescust.SertifOrgBaseType;

/** 
 * ���������� � ������������� ������� �� ����� ��-2
 */
public class SertifST2FormType extends BaseDocType
{
    private String sertifNumber;
    private String regNumber;
    private String issueCountryCode;
    private String destinCountryCode;
    private List<String> transportMeansRouteList = new ArrayList<String>();
    private List<String> specialCommentList = new ArrayList<String>();
    private String LNPSign;
    private String issueCountryName;
    private String destinCountryName;
    private SertifOrgBaseType senderInformation;
    private SertifOrgBaseType recipient;
    private SertifOrgBaseType importer;
    private SertifInfType sertifInf;
    private AppDeclarationType appDeclaration;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private SertifOrgBaseType exporterInformation;
    private String documentModeID;

    /** 
     * Get the 'SertifNumber' element value. ����� � ����� �����������
     * 
     * @return value
     */
    public String getSertifNumber() {
        return sertifNumber;
    }

    /** 
     * Set the 'SertifNumber' element value. ����� � ����� �����������
     * 
     * @param sertifNumber
     */
    public void setSertifNumber(String sertifNumber) {
        this.sertifNumber = sertifNumber;
    }

    /** 
     * Get the 'RegNumber' element value. ��������������� ����� ���������. � ������ ���������� ������ �������� "�/�"
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. ��������������� ����� ���������. � ������ ���������� ������ �������� "�/�"
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the 'IssueCountryCode' element value. ��� ������, � ������� ����� ����������
     * 
     * @return value
     */
    public String getIssueCountryCode() {
        return issueCountryCode;
    }

    /** 
     * Set the 'IssueCountryCode' element value. ��� ������, � ������� ����� ����������
     * 
     * @param issueCountryCode
     */
    public void setIssueCountryCode(String issueCountryCode) {
        this.issueCountryCode = issueCountryCode;
    }

    /** 
     * Get the 'DestinCountryCode' element value. ��� ������, ���� ��������������� ����������
     * 
     * @return value
     */
    public String getDestinCountryCode() {
        return destinCountryCode;
    }

    /** 
     * Set the 'DestinCountryCode' element value. ��� ������, ���� ��������������� ����������
     * 
     * @param destinCountryCode
     */
    public void setDestinCountryCode(String destinCountryCode) {
        this.destinCountryCode = destinCountryCode;
    }

    /** 
     * Get the list of 'TransportMeansRoute' element items. �������� ���������� � �������� � �������� ��������������� ������� � ������������ ��������� (��������� ��� ��������)
     * 
     * @return list
     */
    public List<String> getTransportMeansRouteList() {
        return transportMeansRouteList;
    }

    /** 
     * Set the list of 'TransportMeansRoute' element items. �������� ���������� � �������� � �������� ��������������� ������� � ������������ ��������� (��������� ��� ��������)
     * 
     * @param list
     */
    public void setTransportMeansRouteList(List<String> list) {
        transportMeansRouteList = list;
    }

    /** 
     * Get the list of 'SpecialComments' element items. ��������� �������
     * 
     * @return list
     */
    public List<String> getSpecialCommentList() {
        return specialCommentList;
    }

    /** 
     * Set the list of 'SpecialComments' element items. ��������� �������
     * 
     * @param list
     */
    public void setSpecialCommentList(List<String> list) {
        specialCommentList = list;
    }

    /** 
     * Get the 'LNPSign' element value. ������� ������� ������� ������
     * 
     * @return value
     */
    public String getLNPSign() {
        return LNPSign;
    }

    /** 
     * Set the 'LNPSign' element value. ������� ������� ������� ������
     * 
     * @param LNPSign
     */
    public void setLNPSign(String LNPSign) {
        this.LNPSign = LNPSign;
    }

    /** 
     * Get the 'IssueCountryName' element value. ������������ ������ � ������� ����� ����������
     * 
     * @return value
     */
    public String getIssueCountryName() {
        return issueCountryName;
    }

    /** 
     * Set the 'IssueCountryName' element value. ������������ ������ � ������� ����� ����������
     * 
     * @param issueCountryName
     */
    public void setIssueCountryName(String issueCountryName) {
        this.issueCountryName = issueCountryName;
    }

    /** 
     * Get the 'DestinCountryName' element value. ������������ ������ ��� ������� ����� ����������
     * 
     * @return value
     */
    public String getDestinCountryName() {
        return destinCountryName;
    }

    /** 
     * Set the 'DestinCountryName' element value. ������������ ������ ��� ������� ����� ����������
     * 
     * @param destinCountryName
     */
    public void setDestinCountryName(String destinCountryName) {
        this.destinCountryName = destinCountryName;
    }

    /** 
     * Get the 'SenderInformation' element value. ���������� � ����, ������� �������� ������������
     * 
     * @return value
     */
    public SertifOrgBaseType getSenderInformation() {
        return senderInformation;
    }

    /** 
     * Set the 'SenderInformation' element value. ���������� � ����, ������� �������� ������������
     * 
     * @param senderInformation
     */
    public void setSenderInformation(SertifOrgBaseType senderInformation) {
        this.senderInformation = senderInformation;
    }

    /** 
     * Get the 'Recipient' element value. ���������� � ����������
     * 
     * @return value
     */
    public SertifOrgBaseType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. ���������� � ����������
     * 
     * @param recipient
     */
    public void setRecipient(SertifOrgBaseType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'Importer' element value. ������������ � ����� ���������. ����������� ���� ���������� � �������� - ������ ����������� ����
     * 
     * @return value
     */
    public SertifOrgBaseType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. ������������ � ����� ���������. ����������� ���� ���������� � �������� - ������ ����������� ����
     * 
     * @param importer
     */
    public void setImporter(SertifOrgBaseType importer) {
        this.importer = importer;
    }

    /** 
     * Get the 'SertifInf' element value. �������� �� ������������� �����������
     * 
     * @return value
     */
    public SertifInfType getSertifInf() {
        return sertifInf;
    }

    /** 
     * Set the 'SertifInf' element value. �������� �� ������������� �����������
     * 
     * @param sertifInf
     */
    public void setSertifInf(SertifInfType sertifInf) {
        this.sertifInf = sertifInf;
    }

    /** 
     * Get the 'AppDeclaration' element value. ���������� ���������
     * 
     * @return value
     */
    public AppDeclarationType getAppDeclaration() {
        return appDeclaration;
    }

    /** 
     * Set the 'AppDeclaration' element value. ���������� ���������
     * 
     * @param appDeclaration
     */
    public void setAppDeclaration(AppDeclarationType appDeclaration) {
        this.appDeclaration = appDeclaration;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'ExporterInformation' element value. ���������� � ����, ������� �������� �����������. ����������� ���� ��������� � ����������� �������� ������� ������������ ������
     * 
     * @return value
     */
    public SertifOrgBaseType getExporterInformation() {
        return exporterInformation;
    }

    /** 
     * Set the 'ExporterInformation' element value. ���������� � ����, ������� �������� �����������. ����������� ���� ��������� � ����������� �������� ������� ������������ ������
     * 
     * @param exporterInformation
     */
    public void setExporterInformation(SertifOrgBaseType exporterInformation) {
        this.exporterInformation = exporterInformation;
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
