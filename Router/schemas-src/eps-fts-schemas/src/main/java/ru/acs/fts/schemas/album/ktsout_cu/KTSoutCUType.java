
package ru.acs.fts.schemas.album.ktsout_cu;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSPaymentsReCalcType;

/** 
 * ����������� ����� ����� ������������� ���������� ��������� � ���������� ��������
 */
public class KTSoutCUType extends BaseDocType
{
    private String DTDocumentID;
    private String declarationKind;
    private String subsoilSign;
    private String KTSNumber;
    private String currencyCode;
    private String electronicDocumentSign;
    private String adjustment;
    private String regNumberDoc;
    private LocalDate executionDate;
    private String securityLabelCode;
    private KTSoutCUGoodsShipmentType KTSoutCUGoodsShipment;
    private GTDIDType DTNumber;
    private List<KTSPaymentsReCalcType> KTSoutPaymentsReCalcList = new ArrayList<KTSPaymentsReCalcType>();
    private KTSCUConsignorType KTSCUConsignor;
    private KTSCUConsigneeType KTSCUConsignee;
    private KTSCUDeclarantType KTSCUDeclarant;
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType customsRepresentative;
    private String documentModeID;

    /** 
     * Get the 'DTDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��
     * 
     * @return value
     */
    public String getDTDocumentID() {
        return DTDocumentID;
    }

    /** 
     * Set the 'DTDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��
     * 
     * @param DTDocumentID
     */
    public void setDTDocumentID(String DTDocumentID) {
        this.DTDocumentID = DTDocumentID;
    }

    /** 
     * Get the 'DeclarationKind' element value. ��� ����������� �������������� ������� �� �������������� ������������ ����������� �������������� �������. ��.7 
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. ��� ����������� �������������� ������� �� �������������� ������������ ����������� �������������� �������. ��.7 
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
     * Get the 'KTSNumber' element value. ����� ��� �� �������
     * 
     * @return value
     */
    public String getKTSNumber() {
        return KTSNumber;
    }

    /** 
     * Set the 'KTSNumber' element value. ����� ��� �� �������
     * 
     * @param KTSNumber
     */
    public void setKTSNumber(String KTSNumber) {
        this.KTSNumber = KTSNumber;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��������� ��� ������������ ������ � ������������ � ��������������� �����
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������������ ������ � ������������ � ��������������� �����
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ���������. ��
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ���������. ��
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
    }

    /** 
     * Get the 'Adjustment' element value. ��� �������������. 1- ��� ������������� ��������� ��� ���� �������, 0 - �� ���������
     * 
     * @return value
     */
    public String getAdjustment() {
        return adjustment;
    }

    /** 
     * Set the 'Adjustment' element value. ��� �������������. 1- ��� ������������� ��������� ��� ���� �������, 0 - �� ���������
     * 
     * @param adjustment
     */
    public void setAdjustment(String adjustment) {
        this.adjustment = adjustment;
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
     * Get the 'KTSout_CUGoodsShipment' element value. �������� � �������� ������
     * 
     * @return value
     */
    public KTSoutCUGoodsShipmentType getKTSoutCUGoodsShipment() {
        return KTSoutCUGoodsShipment;
    }

    /** 
     * Set the 'KTSout_CUGoodsShipment' element value. �������� � �������� ������
     * 
     * @param KTSoutCUGoodsShipment
     */
    public void setKTSoutCUGoodsShipment(
            KTSoutCUGoodsShipmentType KTSoutCUGoodsShipment) {
        this.KTSoutCUGoodsShipment = KTSoutCUGoodsShipment;
    }

    /** 
     * Get the 'DTNumber' element value. ��������������� ����� ��. ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��
     * 
     * @return value
     */
    public GTDIDType getDTNumber() {
        return DTNumber;
    }

    /** 
     * Set the 'DTNumber' element value. ��������������� ����� ��. ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��
     * 
     * @param DTNumber
     */
    public void setDTNumber(GTDIDType DTNumber) {
        this.DTNumber = DTNumber;
    }

    /** 
     * Get the list of 'KTSoutPaymentsReCalc' element items. ���������� �������� �� �
     * 
     * @return list
     */
    public List<KTSPaymentsReCalcType> getKTSoutPaymentsReCalcList() {
        return KTSoutPaymentsReCalcList;
    }

    /** 
     * Set the list of 'KTSoutPaymentsReCalc' element items. ���������� �������� �� �
     * 
     * @param list
     */
    public void setKTSoutPaymentsReCalcList(List<KTSPaymentsReCalcType> list) {
        KTSoutPaymentsReCalcList = list;
    }

    /** 
     * Get the 'KTSCUConsignor' element value. �������� �� ����������� �������.(�� ����������� ��) �� 2
     * 
     * @return value
     */
    public KTSCUConsignorType getKTSCUConsignor() {
        return KTSCUConsignor;
    }

    /** 
     * Set the 'KTSCUConsignor' element value. �������� �� ����������� �������.(�� ����������� ��) �� 2
     * 
     * @param KTSCUConsignor
     */
    public void setKTSCUConsignor(KTSCUConsignorType KTSCUConsignor) {
        this.KTSCUConsignor = KTSCUConsignor;
    }

    /** 
     * Get the 'KTSCUConsignee' element value. �������� � ���������� �������.(�� ����������� ��) �� 8
     * 
     * @return value
     */
    public KTSCUConsigneeType getKTSCUConsignee() {
        return KTSCUConsignee;
    }

    /** 
     * Set the 'KTSCUConsignee' element value. �������� � ���������� �������.(�� ����������� ��) �� 8
     * 
     * @param KTSCUConsignee
     */
    public void setKTSCUConsignee(KTSCUConsigneeType KTSCUConsignee) {
        this.KTSCUConsignee = KTSCUConsignee;
    }

    /** 
     * Get the 'KTSCUDeclarant' element value. �������� � ���������� �������.(�� ����������� ��) �� 14
     * 
     * @return value
     */
    public KTSCUDeclarantType getKTSCUDeclarant() {
        return KTSCUDeclarant;
    }

    /** 
     * Set the 'KTSCUDeclarant' element value. �������� � ���������� �������.(�� ����������� ��) �� 14
     * 
     * @param KTSCUDeclarant
     */
    public void setKTSCUDeclarant(KTSCUDeclarantType KTSCUDeclarant) {
        this.KTSCUDeclarant = KTSCUDeclarant;
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
     * Get the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� �� ������� ��������)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ��������� (��� ��������� �� ������� ��������)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
