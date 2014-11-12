
package ru.acs.fts.schemas.album.ktdin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * ������������� ���������� �� ������.���������� ������
 */
public class KTDinType extends BaseDocType
{
    private String declarationKind;
    private String COMPLECTBL;
    private String g0131;
    private String KTDNumber;
    private String customsModeCode;
    private String electronicDocumentSign;
    private String regNumberDoc;
    private LocalDate executionDate;
    private String securityLabelCode;
    private String customsProcedure;
    private DocumentBaseType reason;
    private KTDinGoodsShipmentType KTDinGoodsShipment;
    private List<KTDinCommonOfficialMarkType> KTDinCommonOfficialMarkList = new ArrayList<KTDinCommonOfficialMarkType>();
    private GTDIDType GTDNumber;
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType customsRepresentative;
    private ChangeCodeType changeCode;
    private KDTFilledInfoType KDTFilledInfo;
    private String documentModeID;

    /** 
     * Get the 'DeclarationKind' element value. ��� ���������� ���������� �� �������������� ����� ���������� ����������.
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. ��� ���������� ���������� �� �������������� ����� ���������� ����������.
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'COMPLECTBL' element value. ������. ������� ������������� ��� �� ���������� �������. 1 -���1, 2 - ���2
     * 
     * @return value
     */
    public String getCOMPLECTBL() {
        return COMPLECTBL;
    }

    /** 
     * Set the 'COMPLECTBL' element value. ������. ������� ������������� ��� �� ���������� �������. 1 -���1, 2 - ���2
     * 
     * @param COMPLECTBL
     */
    public void setCOMPLECTBL(String COMPLECTBL) {
        this.COMPLECTBL = COMPLECTBL;
    }

    /** 
     * Get the 'G0131' element value. ������. �������������� �������.
     * 
     * @return value
     */
    public String getG0131() {
        return g0131;
    }

    /** 
     * Set the 'G0131' element value. ������. �������������� �������.
     * 
     * @param g0131
     */
    public void setG0131(String g0131) {
        this.g0131 = g0131;
    }

    /** 
     * Get the 'KTDNumber' element value. ����� ��� �� �������
     * 
     * @return value
     */
    public String getKTDNumber() {
        return KTDNumber;
    }

    /** 
     * Set the 'KTDNumber' element value. ����� ��� �� �������
     * 
     * @param KTDNumber
     */
    public void setKTDNumber(String KTDNumber) {
        this.KTDNumber = KTDNumber;
    }

    /** 
     * Get the 'CustomsModeCode' element value. ��� ���������� ��������� � ������������ � ��������������� ����� ���������� ��������.  ��. 1. ������ ��������� ��. ������ ������� ������� ���������� ��. 37./ "00" - ��� ��������
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. ��� ���������� ��������� � ������������ � ��������������� ����� ���������� ��������.  ��. 1. ������ ��������� ��. ������ ������� ������� ���������� ��. 37./ "00" - ��� ��������
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ��������� "��". 
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ��������� "��". 
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
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
     * Get the 'CustomsProcedure' element value. ��, ��. ����� ��������� ��.1 ���
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. ��, ��. ����� ��������� ��.1 ���
     * 
     * @param customsProcedure
     */
    public void setCustomsProcedure(String customsProcedure) {
        this.customsProcedure = customsProcedure;
    }

    /** 
     * Get the 'Reason' element value. ������. ��������� ��� �������� ���������: �������������� ��������� ���������� (����������� �������������)/������� ���������� ����������� �����/������� ���������� ������� ��� ����, �� ���������������/������� ��������� ������������ ������������� �������/������� ������������ ����������� ������ (���, ��� ������)/ ������� ��������� ������������  ������������� ���, ��� ������
     * 
     * @return value
     */
    public DocumentBaseType getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. ������. ��������� ��� �������� ���������: �������������� ��������� ���������� (����������� �������������)/������� ���������� ����������� �����/������� ���������� ������� ��� ����, �� ���������������/������� ��������� ������������ ������������� �������/������� ������������ ����������� ������ (���, ��� ������)/ ������� ��������� ������������  ������������� ���, ��� ������
     * 
     * @param reason
     */
    public void setReason(DocumentBaseType reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'KTDinGoodsShipment' element value. ���. ���������� ������. �������� � �������� ������
     * 
     * @return value
     */
    public KTDinGoodsShipmentType getKTDinGoodsShipment() {
        return KTDinGoodsShipment;
    }

    /** 
     * Set the 'KTDinGoodsShipment' element value. ���. ���������� ������. �������� � �������� ������
     * 
     * @param KTDinGoodsShipment
     */
    public void setKTDinGoodsShipment(KTDinGoodsShipmentType KTDinGoodsShipment) {
        this.KTDinGoodsShipment = KTDinGoodsShipment;
    }

    /** 
     * Get the list of 'KTDinCommonOfficialMark' element items. ���. ���������� ������. ��������� ������� �� ���.
     * 
     * @return list
     */
    public List<KTDinCommonOfficialMarkType> getKTDinCommonOfficialMarkList() {
        return KTDinCommonOfficialMarkList;
    }

    /** 
     * Set the list of 'KTDinCommonOfficialMark' element items. ���. ���������� ������. ��������� ������� �� ���.
     * 
     * @param list
     */
    public void setKTDinCommonOfficialMarkList(
            List<KTDinCommonOfficialMarkType> list) {
        KTDinCommonOfficialMarkList = list;
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
     * Get the 'FilledPerson' element value. �������� � ����, ����������� �������� (��)
     * 
     * @return value
     */
    public ESADFilledPersonType getFilledPerson() {
        return filledPerson;
    }

    /** 
     * Set the 'FilledPerson' element value. �������� � ����, ����������� �������� (��)
     * 
     * @param filledPerson
     */
    public void setFilledPerson(ESADFilledPersonType filledPerson) {
        this.filledPerson = filledPerson;
    }

    /** 
     * Get the 'CustomsRepresentative' element value. ���������� �������������
     * 
     * @return value
     */
    public CUESADCustomsRepresentativeType getCustomsRepresentative() {
        return customsRepresentative;
    }

    /** 
     * Set the 'CustomsRepresentative' element value. ���������� �������������
     * 
     * @param customsRepresentative
     */
    public void setCustomsRepresentative(
            CUESADCustomsRepresentativeType customsRepresentative) {
        this.customsRepresentative = customsRepresentative;
    }

    /** 
     * Get the 'ChangeCode' element value. ��� ��������� �� 45� ��� ���������� ��������� � (���) ���������� �������� � ��������� �������
     * 
     * @return value
     */
    public ChangeCodeType getChangeCode() {
        return changeCode;
    }

    /** 
     * Set the 'ChangeCode' element value. ��� ��������� �� 45� ��� ���������� ��������� � (���) ���������� �������� � ��������� �������
     * 
     * @param changeCode
     */
    public void setChangeCode(ChangeCodeType changeCode) {
        this.changeCode = changeCode;
    }

    /** 
     * Get the 'KDTFilledInfo' element value. �������� � ���������� ���
     * 
     * @return value
     */
    public KDTFilledInfoType getKDTFilledInfo() {
        return KDTFilledInfo;
    }

    /** 
     * Set the 'KDTFilledInfo' element value. �������� � ���������� ���
     * 
     * @param KDTFilledInfo
     */
    public void setKDTFilledInfo(KDTFilledInfoType KDTFilledInfo) {
        this.KDTFilledInfo = KDTFilledInfo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
