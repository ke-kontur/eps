
package ru.acs.fts.schemas.album.ktsin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;
import ru.acs.fts.schemas.album.cuesadktscommonaggregatetypescust.KTSPaymentsReCalcType;

/** 
 * ������������� ���������� ��������� � ���������� ��������. ���������� ������
 */
public class KTSinType extends BaseDocType
{
    private String GTDDocumentID;
    private LocalDate KTSPresentDate;
    private String decisionCode;
    private LocalDate deadLineDate;
    private String KTSNumber;
    private String adjustment;
    private String declarationKind;
    private String currencyCode;
    private String electronicDocumentSign;
    private LocalDate executionDate;
    private KTSinGoodsShipmentType KTSinGoodsShipment;
    private ESADFilledPersonType KTSinFilledPerson;
    private KTSinTechMarksType KTSinTechMarks;
    private List<KTSPaymentsReCalcType> KTSPaymentsReCalcList = new ArrayList<KTSPaymentsReCalcType>();
    private GTDIDType GTDNumber;
    private CUESADCustomsRepresentativeType customsRepresentative;
    private String documentModeID;

    /** 
     * Get the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'KTSPresentDate' element value. ���� ������������� ���������� �����������, ���� �������������.
     * 
     * @return value
     */
    public LocalDate getKTSPresentDate() {
        return KTSPresentDate;
    }

    /** 
     * Set the 'KTSPresentDate' element value. ���� ������������� ���������� �����������, ���� �������������.
     * 
     * @param KTSPresentDate
     */
    public void setKTSPresentDate(LocalDate KTSPresentDate) {
        this.KTSPresentDate = KTSPresentDate;
    }

    /** 
     * Get the 'DecisionCode' element value. ��� ������� �� ������������� ��� ������ ���
     * 
     * @return value
     */
    public String getDecisionCode() {
        return decisionCode;
    }

    /** 
     * Set the 'DecisionCode' element value. ��� ������� �� ������������� ��� ������ ���
     * 
     * @param decisionCode
     */
    public void setDecisionCode(String decisionCode) {
        this.decisionCode = decisionCode;
    }

    /** 
     * Get the 'DeadLineDate' element value. ���� ��������� ����� �������������� �������������� ���������� � �������� � ������������ � �������� ����������� ������.
     * 
     * @return value
     */
    public LocalDate getDeadLineDate() {
        return deadLineDate;
    }

    /** 
     * Set the 'DeadLineDate' element value. ���� ��������� ����� �������������� �������������� ���������� � �������� � ������������ � �������� ����������� ������.
     * 
     * @param deadLineDate
     */
    public void setDeadLineDate(LocalDate deadLineDate) {
        this.deadLineDate = deadLineDate;
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
     * Get the 'CurrencyCode' element value. ��������� ��� ������������ ������ � ������������ � ��������������� �����.
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��������� ��� ������������ ������ � ������������ � ��������������� �����.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ���������. ��.
     * 
     * @return value
     */
    public String getElectronicDocumentSign() {
        return electronicDocumentSign;
    }

    /** 
     * Set the 'ElectronicDocumentSign' element value. ������� ������������� ��� � ����� ������������ ���������. ��.
     * 
     * @param electronicDocumentSign
     */
    public void setElectronicDocumentSign(String electronicDocumentSign) {
        this.electronicDocumentSign = electronicDocumentSign;
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
     * Get the 'KTSinGoodsShipment' element value. ���. ���������� ������. �������� � �������� ������.
     * 
     * @return value
     */
    public KTSinGoodsShipmentType getKTSinGoodsShipment() {
        return KTSinGoodsShipment;
    }

    /** 
     * Set the 'KTSinGoodsShipment' element value. ���. ���������� ������. �������� � �������� ������.
     * 
     * @param KTSinGoodsShipment
     */
    public void setKTSinGoodsShipment(KTSinGoodsShipmentType KTSinGoodsShipment) {
        this.KTSinGoodsShipment = KTSinGoodsShipment;
    }

    /** 
     * Get the 'KTSinFilledPerson' element value. ���. ���������� ������. �������� � ����, ����������� ���.
     * 
     * @return value
     */
    public ESADFilledPersonType getKTSinFilledPerson() {
        return KTSinFilledPerson;
    }

    /** 
     * Set the 'KTSinFilledPerson' element value. ���. ���������� ������. �������� � ����, ����������� ���.
     * 
     * @param KTSinFilledPerson
     */
    public void setKTSinFilledPerson(ESADFilledPersonType KTSinFilledPerson) {
        this.KTSinFilledPerson = KTSinFilledPerson;
    }

    /** 
     * Get the 'KTSinTechMarks' element value. ���. ���������� ������. ��������������� �������.
     * 
     * @return value
     */
    public KTSinTechMarksType getKTSinTechMarks() {
        return KTSinTechMarks;
    }

    /** 
     * Set the 'KTSinTechMarks' element value. ���. ���������� ������. ��������������� �������.
     * 
     * @param KTSinTechMarks
     */
    public void setKTSinTechMarks(KTSinTechMarksType KTSinTechMarks) {
        this.KTSinTechMarks = KTSinTechMarks;
    }

    /** 
     * Get the list of 'KTSPaymentsReCalc' element items. ���������� ��������
     * 
     * @return list
     */
    public List<KTSPaymentsReCalcType> getKTSPaymentsReCalcList() {
        return KTSPaymentsReCalcList;
    }

    /** 
     * Set the list of 'KTSPaymentsReCalc' element items. ���������� ��������
     * 
     * @param list
     */
    public void setKTSPaymentsReCalcList(List<KTSPaymentsReCalcType> list) {
        KTSPaymentsReCalcList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. ��������������� ����� ��. ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��.
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. ��������������� ����� ��. ������������ ��� �������� � �� ��� ������������� ��� �������� �� ��.
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
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
