
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADDecisionType;

/** 
 * ����������� �����  ���������� �� ������/���������� ����������. ���������� ������
 */
public class ESADinType extends BaseDocType
{
    private String customsProcedure;
    private String customsModeCode;
    private String declarationKind;
    private String SDSSRV;
    private String SDSNUM;
    private String electronicDocumentSign;
    private String executionPlace;
    private String railwayStationCode;
    private String regNumberDoc;
    private LocalDate executionDate;
    private String securityLabelCode;
    private ESADinGoodsShipmentType ESADinGoodsShipment;
    private ESADFilledPersonType ESADFilledPerson;
    private ESADinTechMarksType ESADinTechMarks;
    private RUESADDecisionType ESADinDeclarationDecision;
    private List<ESADinCommonOfficialMarkType> ESADinCommonOfficialMarkList = new ArrayList<ESADinCommonOfficialMarkType>();
    private GTDIDType GTDNumber;
    private CUESADCustomsRepresentativeType CUESADCustomsRepresentative;
    private String documentModeID;

    /** 
     * Get the 'CustomsProcedure' element value.  ��, ��. ��. ������ ��������� ��.1 ��
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value.  ��, ��. ��. ������ ��������� ��.1 ��
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'CustomsModeCode' element value. ��� ���������� ��������� � ������������ � ��������������� ����� ���������� �������� ��. 1. ������ ��������� ��. ������ ������� ������� ���������� ��. 37/�00� � ��� ��������. G012
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. ��� ���������� ��������� � ������������ � ��������������� ����� ���������� �������� ��. 1. ������ ��������� ��. ������ ������� ������� ���������� ��. 37/�00� � ��� ��������. G012
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'DeclarationKind' element value. ��� ����������� �������������� ������� �� �������������� ������������ ����������� �������������� �������. ��.7 ��
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. ��� ����������� �������������� ������� �� �������������� ������������ ����������� �������������� �������. ��.7 ��
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'SDS_SRV' element value. ��������� ���� ��� ����� ������������ �������������� (������)
     * 
     * @return value
     */
    public String getSDSSRV() {
        return SDSSRV;
    }

    /** 
     * Set the 'SDS_SRV' element value. ��������� ���� ��� ����� ������������ �������������� (������)
     * 
     * @param SDSSRV
     */
    public void setSDSSRV(String SDSSRV) {
        this.SDSSRV = SDSSRV;
    }

    /** 
     * Get the 'SDS_NUM' element value. ��������� ���� ��� ����� ������������ �������������� (������)
     * 
     * @return value
     */
    public String getSDSNUM() {
        return SDSNUM;
    }

    /** 
     * Set the 'SDS_NUM' element value. ��������� ���� ��� ����� ������������ �������������� (������)
     * 
     * @param SDSNUM
     */
    public void setSDSNUM(String SDSNUM) {
        this.SDSNUM = SDSNUM;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. ������� ������������� �� � ����� ������������ ���������. ��. ��. 1 ��. ������ ���������. G0131
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. ������� ������������� �� � ����� ������������ ���������. ��. ��. 1 ��. ������ ���������. G0131
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
    }

    /** 
     * Get the 'ExecutionPlace' element value. ����� ������������� ��
     * 
     * @return value
     */
    public String getExecutionPlace() {
        return executionPlace;
    }

    /** 
     * Set the 'ExecutionPlace' element value. ����� ������������� ��
     * 
     * @param executionPlace
     */
    public void setExecutionPlace(String executionPlace) {
        this.executionPlace = executionPlace;
    }

    /** 
     * Get the 'RailwayStationCode' element value. ��� �/� �������. ��.50 ��
     * 
     * @return value
     */
    public String getRailwayStationCode() {
        return railwayStationCode;
    }

    /** 
     * Set the 'RailwayStationCode' element value. ��� �/� �������. ��.50 ��
     * 
     * @param railwayStationCode
     */
    public void setRailwayStationCode(String railwayStationCode) {
        this.railwayStationCode = railwayStationCode;
    }

    /** 
     * Get the 'RegNumberDoc' element value. ��������� ����� ����������� ���������� � ������������ � �������� (�����������) ����� ��������� ���������� ���������� ��� ����������� �������������  � ���������� ��������
     * 
     * @return value
     */
    public String getRegNumberDoc() {
        return regNumberDoc;
    }

    /** 
     * Set the 'RegNumberDoc' element value. ��������� ����� ����������� ���������� � ������������ � �������� (�����������) ����� ��������� ���������� ���������� ��� ����������� �������������  � ���������� ��������
     * 
     * @param regNumberDoc
     */
    public void setRegNumberDoc(String regNumberDoc) {
        this.regNumberDoc = regNumberDoc;
    }

    /** 
     * Get the 'ExecutionDate' element value. ���� ����������� (�������������)
     * 
     * @return value
     */
    public LocalDate getExecutionDate() {
        return executionDate;
    }

    /** 
     * Set the 'ExecutionDate' element value. ���� ����������� (�������������)
     * 
     * @param executionDate
     */
    public void setExecutionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
    }

    /** 
     * Get the 'SecurityLabelCode' element value. ��� �������� �������� ��� ��
     * 
     * @return value
     */
    public String getSecurityLabelCode() {
        return securityLabelCode;
    }

    /** 
     * Set the 'SecurityLabelCode' element value. ��� �������� �������� ��� ��
     * 
     * @param securityLabelCode
     */
    public void setSecurityLabelCode(String securityLabelCode) {
        this.securityLabelCode = securityLabelCode;
    }

    /** 
     * Get the 'ESADinGoodsShipment' element value. �� � ��. ���������� ������. �������� � �������� ������.
     * 
     * @return value
     */
    public ESADinGoodsShipmentType getESADinGoodsShipment() {
        return ESADinGoodsShipment;
    }

    /** 
     * Set the 'ESADinGoodsShipment' element value. �� � ��. ���������� ������. �������� � �������� ������.
     * 
     * @param ESADinGoodsShipment
     */
    public void setESADinGoodsShipment(
            ESADinGoodsShipmentType ESADinGoodsShipment) {
        this.ESADinGoodsShipment = ESADinGoodsShipment;
    }

    /** 
     * Get the 'ESADFilledPerson' element value. �������� � ����, ����������� ��������
     * 
     * @return value
     */
    public ESADFilledPersonType getESADFilledPerson() {
        return ESADFilledPerson;
    }

    /** 
     * Set the 'ESADFilledPerson' element value. �������� � ����, ����������� ��������
     * 
     * @param ESADFilledPerson
     */
    public void setESADFilledPerson(ESADFilledPersonType ESADFilledPerson) {
        this.ESADFilledPerson = ESADFilledPerson;
    }

    /** 
     * Get the 'ESADinTechMarks' element value. �� � ��. ���������� ������.  ��������������� �������.
     * 
     * @return value
     */
    public ESADinTechMarksType getESADinTechMarks() {
        return ESADinTechMarks;
    }

    /** 
     * Set the 'ESADinTechMarks' element value. �� � ��. ���������� ������.  ��������������� �������.
     * 
     * @param ESADinTechMarks
     */
    public void setESADinTechMarks(ESADinTechMarksType ESADinTechMarks) {
        this.ESADinTechMarks = ESADinTechMarks;
    }

    /** 
     * Get the 'ESADinDeclarationDecision' element value. �� � ��. ���������� ������. �������� ������� �� ����������
     * 
     * @return value
     */
    public RUESADDecisionType getESADinDeclarationDecision() {
        return ESADinDeclarationDecision;
    }

    /** 
     * Set the 'ESADinDeclarationDecision' element value. �� � ��. ���������� ������. �������� ������� �� ����������
     * 
     * @param ESADinDeclarationDecision
     */
    public void setESADinDeclarationDecision(
            RUESADDecisionType ESADinDeclarationDecision) {
        this.ESADinDeclarationDecision = ESADinDeclarationDecision;
    }

    /** 
     * Get the list of 'ESADinCommonOfficialMark' element items. �� � ��. ���������� ������. ��������� ������� �� ��.
     * 
     * @return list
     */
    public List<ESADinCommonOfficialMarkType> getESADinCommonOfficialMarkList() {
        return ESADinCommonOfficialMarkList;
    }

    /** 
     * Set the list of 'ESADinCommonOfficialMark' element items. �� � ��. ���������� ������. ��������� ������� �� ��.
     * 
     * @param list
     */
    public void setESADinCommonOfficialMarkList(
            List<ESADinCommonOfficialMarkType> list) {
        ESADinCommonOfficialMarkList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. ��������������� ����� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ��������������� ����� ��.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'CUESADCustomsRepresentative' element value. ���������� �������������
     * 
     * @return value
     */
    public CUESADCustomsRepresentativeType getCUESADCustomsRepresentative() {
        return CUESADCustomsRepresentative;
    }

    /** 
     * Set the 'CUESADCustomsRepresentative' element value. ���������� �������������
     * 
     * @param CUESADCustomsRepresentative
     */
    public void setCUESADCustomsRepresentative(
            CUESADCustomsRepresentativeType CUESADCustomsRepresentative) {
        this.CUESADCustomsRepresentative = CUESADCustomsRepresentative;
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
