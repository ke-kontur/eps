
package ru.acs.fts.schemas.album.kdtout_cu;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * ����������� ����� ������������� ���������� �� ������
 */
public class KDToutCUType extends BaseDocType
{
    private String KDTNumber;
    private String customsProcedure;
    private String customsModeCode;
    private String declarationKind;
    private String subsoilSign;
    private String languageCUESAD;
    private String electronicDocumentSign;
    private String regNumberDoc;
    private LocalDate executionDate;
    private String securityLabelCode;
    private KDTGoodsShipmentType KDToutGoodsShipment;
    private GTDIDType gtdRegistryNumber;
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType customsRepresentative;
    private KDTFilledInfoType KDTFilledInfo;
    private ChangeCodeType changeCode;
    private String documentModeID;

    /** 
     * Get the 'KDTNumber' element value. ����� ��� �� �������
     * 
     * @return value
     */
    public String getKDTNumber() {
        return KDTNumber;
    }

    /** 
     * Set the 'KDTNumber' element value. ����� ��� �� �������
     * 
     * @param KDTNumber
     */
    public void setKDTNumber(String KDTNumber) {
        this.KDTNumber = KDTNumber;
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
     * Get the 'CustomsModeCode' element value. ��� ���������� ��������� � ������������ � ��������������� ����� ���������� �������� ��. 1. ������ ��������� ��. ������ ������� ������� ���������� ��. 37/�00� � ��� ��������
     * 
     * @return value
     */
    public String getCustomsModeCode() {
        return customsModeCode;
    }

    /** 
     * Set the 'CustomsModeCode' element value. ��� ���������� ��������� � ������������ � ��������������� ����� ���������� �������� ��. 1. ������ ��������� ��. ������ ������� ������� ���������� ��. 37/�00� � ��� ��������
     * 
     * @param customsModeCode
     */
    public void setCustomsModeCode(String customsModeCode) {
        this.customsModeCode = customsModeCode;
    }

    /** 
     * Get the 'DeclarationKind' element value. ��� ����������� �������������� ������� �� �������������� ������������ ����������� �������������� �������
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. ��� ����������� �������������� ������� �� �������������� ������������ ����������� �������������� �������
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }

    /** 
     * Get the 'SubsoilSign' element value. ������� �����������������. ��� ��
     * 
     * @return value
     */
    public String getSubsoilSign() {
        return subsoilSign;
    }

    /** 
     * Set the 'SubsoilSign' element value. ������� �����������������. ��� ��
     * 
     * @param subsoilSign
     */
    public void setSubsoilSign(String subsoilSign) {
        this.subsoilSign = subsoilSign;
    }

    /** 
     * Get the 'LanguageCUESAD' element value. ��� ����� ���������� ���������
     * 
     * @return value
     */
    public String getLanguageCUESAD() {
        return languageCUESAD;
    }

    /** 
     * Set the 'LanguageCUESAD' element value. ��� ����� ���������� ���������
     * 
     * @param languageCUESAD
     */
    public void setLanguageCUESAD(String languageCUESAD) {
        this.languageCUESAD = languageCUESAD;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ��������� "��"
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ��������� "��"
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
     * Get the 'KDToutGoodsShipment' element value. �������� � �������� ������
     * 
     * @return value
     */
    public KDTGoodsShipmentType getKDToutGoodsShipment() {
        return KDToutGoodsShipment;
    }

    /** 
     * Set the 'KDToutGoodsShipment' element value. �������� � �������� ������
     * 
     * @param KDToutGoodsShipment
     */
    public void setKDToutGoodsShipment(KDTGoodsShipmentType KDToutGoodsShipment) {
        this.KDToutGoodsShipment = KDToutGoodsShipment;
    }

    /** 
     * Get the 'GtdRegistryNumber' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public GTDIDType getGtdRegistryNumber() {
        return gtdRegistryNumber;
    }

    /** 
     * Set the 'GtdRegistryNumber' element value. ��������������� ����� ��
     * 
     * @param gtdRegistryNumber
     */
    public void setGtdRegistryNumber(GTDIDType gtdRegistryNumber) {
        this.gtdRegistryNumber = gtdRegistryNumber;
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
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������. ��� ��������� � ������� ��������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������. ��� ��������� � ������� ��������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
