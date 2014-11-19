
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.AutomobileType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUCustomsPaymentCalculationType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPrecedingDocumentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADExciseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ProcessingGoodsDeclarationType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.RUESADDecisionType;

/** 
 * �� � ��. ���������� ������. �������� ����� ��. ��. 31-47.
 */
public class ESADinGoodsType extends ESADGoodsType
{
    private String originDigitCountryCode;
    private String destinationDigitCountryCode;
    private String customsCostCorrectMark;
    private String STAT;
    private String KODSTR;
    private String KODSTRC;
    private LocalDate DSTAT;
    private String customsCostMethodCode;
    private List<ESADinPresentedDocumentType> ESADinPresentedDocumentList = new ArrayList<ESADinPresentedDocumentType>();
    private List<CUPrecedingDocumentType> ESADinPrecedingDocumentList = new ArrayList<CUPrecedingDocumentType>();
    private List<CUCustomsPaymentCalculationType> ESADinCustomsPaymentCalculationList = new ArrayList<CUCustomsPaymentCalculationType>();
    private List<AutomobileType> ESADinAutomobileList = new ArrayList<AutomobileType>();
    private ESADinConsignorType ESADinGoodsOrganization;
    private ProcessingGoodsDeclarationType customConditionDocuments;
    private RUESADDecisionType ESADinGoodsDecision;
    private List<ESADinGoodsOfficialMarkType> ESADinGoodsOfficialMarkList = new ArrayList<ESADinGoodsOfficialMarkType>();
    private List<ESADExciseType> ESADExciseList = new ArrayList<ESADExciseType>();

    /** 
     * Get the 'OriginDigitCountryCode' element value. �������� ��� ������ �������������.
     * 
     * @return value
     */
    public String getOriginDigitCountryCode() {
        return originDigitCountryCode;
    }

    /** 
     * Set the 'OriginDigitCountryCode' element value. �������� ��� ������ �������������.
     * 
     * @param originDigitCountryCode
     */
    public void setOriginDigitCountryCode(String originDigitCountryCode) {
        this.originDigitCountryCode = originDigitCountryCode;
    }

    /** 
     * Get the 'DestinationDigitCountryCode' element value. �������� ��� ������ ����������.
     * 
     * @return value
     */
    public String getDestinationDigitCountryCode() {
        return destinationDigitCountryCode;
    }

    /** 
     * Set the 'DestinationDigitCountryCode' element value. �������� ��� ������ ����������.
     * 
     * @param destinationDigitCountryCode
     */
    public void setDestinationDigitCountryCode(
            String destinationDigitCountryCode) {
        this.destinationDigitCountryCode = destinationDigitCountryCode;
    }

    /** 
     * Get the 'CustomsCostCorrectMark' element value. ������� ������������� ���������� ���������.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMark() {
        return customsCostCorrectMark;
    }

    /** 
     * Set the 'CustomsCostCorrectMark' element value. ������� ������������� ���������� ���������.
     * 
     * @param customsCostCorrectMark
     */
    public void setCustomsCostCorrectMark(String customsCostCorrectMark) {
        this.customsCostCorrectMark = customsCostCorrectMark;
    }

    /** 
     * Get the 'STAT' element value. ������� ����� � ���������� ���������� ������� �������� (0 -  ����� �� �����������  � ���������� ������� ��������, 1 - ����� ����������� � ���������� ������� ��������)
     * 
     * @return value
     */
    public String getSTAT() {
        return STAT;
    }

    /** 
     * Set the 'STAT' element value. ������� ����� � ���������� ���������� ������� �������� (0 -  ����� �� �����������  � ���������� ������� ��������, 1 - ����� ����������� � ���������� ������� ��������)
     * 
     * @param STAT
     */
    public void setSTAT(String STAT) {
        this.STAT = STAT;
    }

    /** 
     * Get the 'KOD_STR' element value. ��������� �������� ������ ������������� / ����������. ����������� � ������������ � ������������� ���������� ��� ����� ����������. ��������� ���.
     * 
     * @return value
     */
    public String getKODSTR() {
        return KODSTR;
    }

    /** 
     * Set the 'KOD_STR' element value. ��������� �������� ������ ������������� / ����������. ����������� � ������������ � ������������� ���������� ��� ����� ����������. ��������� ���.
     * 
     * @param KODSTR
     */
    public void setKODSTR(String KODSTR) {
        this.KODSTR = KODSTR;
    }

    /** 
     * Get the 'KOD_STRC' element value. ��������� �������� ������ ������������� / ����������. ����������� � ������������ � ������������� ���������� ��� ����� ����������. �������� ���.
     * 
     * @return value
     */
    public String getKODSTRC() {
        return KODSTRC;
    }

    /** 
     * Set the 'KOD_STRC' element value. ��������� �������� ������ ������������� / ����������. ����������� � ������������ � ������������� ���������� ��� ����� ����������. �������� ���.
     * 
     * @param KODSTRC
     */
    public void setKODSTRC(String KODSTRC) {
        this.KODSTRC = KODSTRC;
    }

    /** 
     * Get the 'DSTAT' element value. ���� ����� (�� �����) ������ � ���������� ������� ��������.
     * 
     * @return value
     */
    public LocalDate getDSTAT() {
        return DSTAT;
    }

    /** 
     * Set the 'DSTAT' element value. ���� ����� (�� �����) ������ � ���������� ������� ��������.
     * 
     * @param DSTAT
     */
    public void setDSTAT(LocalDate DSTAT) {
        this.DSTAT = DSTAT;
    }

    /** 
     * Get the 'CustomsCostMethodCode' element value. ��� ������ ����������� ���������� ���������. � ������������ � ��������������� ������� ����������� ���������� ���������.
     * 
     * @return value
     */
    public String getCustomsCostMethodCode() {
        return customsCostMethodCode;
    }

    /** 
     * Set the 'CustomsCostMethodCode' element value. ��� ������ ����������� ���������� ���������. � ������������ � ��������������� ������� ����������� ���������� ���������.
     * 
     * @param customsCostMethodCode
     */
    public void setCustomsCostMethodCode(String customsCostMethodCode) {
        this.customsCostMethodCode = customsCostMethodCode;
    }

    /** 
     * Get the list of 'ESADinPresentedDocument' element items. �� � ��. ���������� ������. �������������� ��������� ��. 44.
     * 
     * @return list
     */
    public List<ESADinPresentedDocumentType> getESADinPresentedDocumentList() {
        return ESADinPresentedDocumentList;
    }

    /** 
     * Set the list of 'ESADinPresentedDocument' element items. �� � ��. ���������� ������. �������������� ��������� ��. 44.
     * 
     * @param list
     */
    public void setESADinPresentedDocumentList(
            List<ESADinPresentedDocumentType> list) {
        ESADinPresentedDocumentList = list;
    }

    /** 
     * Get the list of 'ESADinPrecedingDocument' element items. �� � ��. ���������� ������. �������������� ���������.
     * 
     * @return list
     */
    public List<CUPrecedingDocumentType> getESADinPrecedingDocumentList() {
        return ESADinPrecedingDocumentList;
    }

    /** 
     * Set the list of 'ESADinPrecedingDocument' element items. �� � ��. ���������� ������. �������������� ���������.
     * 
     * @param list
     */
    public void setESADinPrecedingDocumentList(
            List<CUPrecedingDocumentType> list) {
        ESADinPrecedingDocumentList = list;
    }

    /** 
     * Get the list of 'ESADinCustomsPaymentCalculation' element items. �� � ��. ���������� ������. ���������� ���������� ��������.
     * 
     * @return list
     */
    public List<CUCustomsPaymentCalculationType> getESADinCustomsPaymentCalculationList() {
        return ESADinCustomsPaymentCalculationList;
    }

    /** 
     * Set the list of 'ESADinCustomsPaymentCalculation' element items. �� � ��. ���������� ������. ���������� ���������� ��������.
     * 
     * @param list
     */
    public void setESADinCustomsPaymentCalculationList(
            List<CUCustomsPaymentCalculationType> list) {
        ESADinCustomsPaymentCalculationList = list;
    }

    /** 
     * Get the list of 'ESADinAutomobile' element items. �� � ��. ���������� ������. ��������  �� �����������. ��. 31
     * 
     * @return list
     */
    public List<AutomobileType> getESADinAutomobileList() {
        return ESADinAutomobileList;
    }

    /** 
     * Set the list of 'ESADinAutomobile' element items. �� � ��. ���������� ������. ��������  �� �����������. ��. 31
     * 
     * @param list
     */
    public void setESADinAutomobileList(List<AutomobileType> list) {
        ESADinAutomobileList = list;
    }

    /** 
     * Get the 'ESADinGoodsOrganization' element value. �������� �� ����������� � �������� ����� ��
     * 
     * @return value
     */
    public ESADinConsignorType getESADinGoodsOrganization() {
        return ESADinGoodsOrganization;
    }

    /** 
     * Set the 'ESADinGoodsOrganization' element value. �������� �� ����������� � �������� ����� ��
     * 
     * @param ESADinGoodsOrganization
     */
    public void setESADinGoodsOrganization(
            ESADinConsignorType ESADinGoodsOrganization) {
        this.ESADinGoodsOrganization = ESADinGoodsOrganization;
    }

    /** 
     * Get the 'CustomConditionDocuments' element value. ��������, ����������� � ������, ���� �� ������������ � �������� ��������� �� ��������� ���������� �� ����������� �������������� 6 �� 31, �� 44
     * 
     * @return value
     */
    public ProcessingGoodsDeclarationType getCustomConditionDocuments() {
        return customConditionDocuments;
    }

    /** 
     * Set the 'CustomConditionDocuments' element value. ��������, ����������� � ������, ���� �� ������������ � �������� ��������� �� ��������� ���������� �� ����������� �������������� 6 �� 31, �� 44
     * 
     * @param customConditionDocuments
     */
    public void setCustomConditionDocuments(
            ProcessingGoodsDeclarationType customConditionDocuments) {
        this.customConditionDocuments = customConditionDocuments;
    }

    /** 
     * Get the 'ESADinGoodsDecision' element value. �� � ��. ���������� �����. �������� ������� �� ������.
     * 
     * @return value
     */
    public RUESADDecisionType getESADinGoodsDecision() {
        return ESADinGoodsDecision;
    }

    /** 
     * Set the 'ESADinGoodsDecision' element value. �� � ��. ���������� �����. �������� ������� �� ������.
     * 
     * @param ESADinGoodsDecision
     */
    public void setESADinGoodsDecision(RUESADDecisionType ESADinGoodsDecision) {
        this.ESADinGoodsDecision = ESADinGoodsDecision;
    }

    /** 
     * Get the list of 'ESADinGoodsOfficialMark' element items. �� � ��. ���������� ������. ��������� ������� �� ������.
     * 
     * @return list
     */
    public List<ESADinGoodsOfficialMarkType> getESADinGoodsOfficialMarkList() {
        return ESADinGoodsOfficialMarkList;
    }

    /** 
     * Set the list of 'ESADinGoodsOfficialMark' element items. �� � ��. ���������� ������. ��������� ������� �� ������.
     * 
     * @param list
     */
    public void setESADinGoodsOfficialMarkList(
            List<ESADinGoodsOfficialMarkType> list) {
        ESADinGoodsOfficialMarkList = list;
    }

    /** 
     * Get the list of 'ESADExcise' element items. �������� �� �������� ������.
     * 
     * @return list
     */
    public List<ESADExciseType> getESADExciseList() {
        return ESADExciseList;
    }

    /** 
     * Set the list of 'ESADExcise' element items. �������� �� �������� ������.
     * 
     * @param list
     */
    public void setESADExciseList(List<ESADExciseType> list) {
        ESADExciseList = list;
    }
}
