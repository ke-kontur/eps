
package ru.acs.fts.schemas.album.esadout_cu;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * ����������� ����� ���������� �� ������ (���������� ����������)
 */
public class ESADoutCUType extends BaseDocType
{
    private String customsProcedure;
    private String customsModeCode;
    private String customsModeCodeMPO;
    private String transitDirectionCode;
    private String electronicDocumentSign;
    private String declarationKind;
    private String subsoilSign;
    private String sealNumber;
    private String sealQuantity;
    private String languageCUESAD;
    private String recipientCountryCode;
    private String movementCode;
    private String executionPlace;
    private String railwayStationCode;
    private String regNumberDoc;
    private LocalDate executionDate;
    private String securityLabelCode;
    private ESADoutCUGoodsShipmentType ESADoutCUGoodsShipment;
    private RBTechMarKType RBTechMarK;
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType CUESADCustomsRepresentative;
    private String documentModeID;

    /** 
     * Get the 'CustomsProcedure' element value. ��, ��, ��. ������ ��������� ��.1 ��/��
     * 
     * @return value
     */
    public String getCustomsProcedure() {
        return customsProcedure;
    }

    /** 
     * Set the 'CustomsProcedure' element value. ��, ��, ��. ������ ��������� ��.1 ��/��
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
     * Get the 'CustomsModeCodeMPO' element value. ��� ��. 1. ������ ��������� ��
     * 
     * @return value
     */
    public String getCustomsModeCodeMPO() {
        return customsModeCodeMPO;
    }

    /** 
     * Set the 'CustomsModeCodeMPO' element value. ��� ��. 1. ������ ��������� ��
     * 
     * @param customsModeCodeMPO
     */
    public void setCustomsModeCodeMPO(String customsModeCodeMPO) {
        this.customsModeCodeMPO = customsModeCodeMPO;
    }

    /** 
     * Get the 'TransitDirectionCode' element value.  ��, ��, ��, ��, ��. ��. 1 ��. ������ ���������
     * 
     * @return value
     */
    public String getTransitDirectionCode() {
        return transitDirectionCode;
    }

    /** 
     * Set the 'TransitDirectionCode' element value.  ��, ��, ��, ��, ��. ��. 1 ��. ������ ���������
     * 
     * @param transitDirectionCode
     */
    public void setTransitDirectionCode(String transitDirectionCode) {
        this.transitDirectionCode = transitDirectionCode;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. ������� ������������� �� � ����� ������������ ���������. ��. ��. 1 ��. ������ ���������
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. ������� ������������� �� � ����� ������������ ���������. ��. ��. 1 ��. ������ ���������
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
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
     * Get the 'SealNumber' element value. ����� ������������ � ��
     * 
     * @return value
     */
    public String getSealNumber() {
        return sealNumber;
    }

    /** 
     * Set the 'SealNumber' element value. ����� ������������ � ��
     * 
     * @param sealNumber
     */
    public void setSealNumber(String sealNumber) {
        this.sealNumber = sealNumber;
    }

    /** 
     * Get the 'SealQuantity' element value. ���������� ���������� ����� � ��
     * 
     * @return value
     */
    public String getSealQuantity() {
        return sealQuantity;
    }

    /** 
     * Set the 'SealQuantity' element value. ���������� ���������� ����� � ��
     * 
     * @param sealQuantity
     */
    public void setSealQuantity(String sealQuantity) {
        this.sealQuantity = sealQuantity;
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
     * Get the 'RecipientCountryCode' element value. ��� ������, � ����������� � ��������������� ����� ����, ����������� ������, �������� �������������� ��������
     * 
     * @return value
     */
    public String getRecipientCountryCode() {
        return recipientCountryCode;
    }

    /** 
     * Set the 'RecipientCountryCode' element value. ��� ������, � ����������� � ��������������� ����� ����, ����������� ������, �������� �������������� ��������
     * 
     * @param recipientCountryCode
     */
    public void setRecipientCountryCode(String recipientCountryCode) {
        this.recipientCountryCode = recipientCountryCode;
    }

    /** 
     * Get the 'MovementCode' element value. ��� ���� ����������� � ��
     * 
     * @return value
     */
    public String getMovementCode() {
        return movementCode;
    }

    /** 
     * Set the 'MovementCode' element value. ��� ���� ����������� � ��
     * 
     * @param movementCode
     */
    public void setMovementCode(String movementCode) {
        this.movementCode = movementCode;
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
     * Get the 'ESADout_CUGoodsShipment' element value. �������� � �������� ������
     * 
     * @return value
     */
    public ESADoutCUGoodsShipmentType getESADoutCUGoodsShipment() {
        return ESADoutCUGoodsShipment;
    }

    /** 
     * Set the 'ESADout_CUGoodsShipment' element value. �������� � �������� ������
     * 
     * @param ESADoutCUGoodsShipment
     */
    public void setESADoutCUGoodsShipment(
            ESADoutCUGoodsShipmentType ESADoutCUGoodsShipment) {
        this.ESADoutCUGoodsShipment = ESADoutCUGoodsShipment;
    }

    /** 
     * Get the 'RBTechMarK' element value. ����������� ������� ��� ��
     * 
     * @return value
     */
    public RBTechMarKType getRBTechMarK() {
        return RBTechMarK;
    }

    /** 
     * Set the 'RBTechMarK' element value. ����������� ������� ��� ��
     * 
     * @param RBTechMarK
     */
    public void setRBTechMarK(RBTechMarKType RBTechMarK) {
        this.RBTechMarK = RBTechMarK;
    }

    /** 
     * Get the 'FilledPerson' element value. �������� � ����, ����������� ��������
     * 
     * @return value
     */
    public ESADFilledPersonType getFilledPerson() {
        return filledPerson;
    }

    /** 
     * Set the 'FilledPerson' element value. �������� � ����, ����������� ��������
     * 
     * @param filledPerson
     */
    public void setFilledPerson(ESADFilledPersonType filledPerson) {
        this.filledPerson = filledPerson;
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
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������. (��� ��������� � ������� �������� ��� ��)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������. (��� ��������� � ������� �������� ��� ��)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
