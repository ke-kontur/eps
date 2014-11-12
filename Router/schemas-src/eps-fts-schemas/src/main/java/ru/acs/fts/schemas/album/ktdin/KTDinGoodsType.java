
package ru.acs.fts.schemas.album.ktdin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.AutomobileType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUCustomsPaymentCalculationType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsItemType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADPresentedDocumentsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUElectricalEnergyType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPrecedingDocumentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADCustomsProcedureType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADExciseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsQuotaType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ProcessingGoodsDeclarationType;

/** 
 * �������� ����� ���. ��. 31-47
 */
public class KTDinGoodsType extends CUESADGoodsItemType
{
    private String originDigitCountryCode;
    private String destinationDigitCountryCode;
    private String customsCostMethodCode;
    private String languageGoods;
    private String previousCustomsCost;
    private String KDTGoodsNumeric;
    private List<CUESADPresentedDocumentsType> KTDinPresentedDocumentList = new ArrayList<CUESADPresentedDocumentsType>();
    private List<CUPrecedingDocumentType> KTDinPrecedingDocumentList = new ArrayList<CUPrecedingDocumentType>();
    private List<CUCustomsPaymentCalculationType> KTDinCustomsPaymentCalculationList = new ArrayList<CUCustomsPaymentCalculationType>();
    private List<AutomobileType> KTDinAutomobileList = new ArrayList<AutomobileType>();
    private List<KTDinGoodsOfficialMarkType> KTDinGoodsOfficialMarkList = new ArrayList<KTDinGoodsOfficialMarkType>();
    private List<ESADExciseType> ESADExciseList = new ArrayList<ESADExciseType>();
    private ProcessingGoodsDeclarationType KDTinCustomsConditions;
    private KDTinGoodsOrganizationType KDTinGoodsOrganization;
    private ESADGoodsPackagingType ESADGoodsPackaging;
    private ESADGoodsQuotaType ESADGoodsQuota;
    private ESADContainerType ESADContainer;
    private ESADCustomsProcedureType KTDinCustomsProcedure;
    private List<CUElectricalEnergyType> electricalEnergReceivedList = new ArrayList<CUElectricalEnergyType>();
    private List<CUElectricalEnergyType> electricalEnergGivenList = new ArrayList<CUElectricalEnergyType>();
    private List<SupplementaryQuantityType> supplementaryGoodsQuantity1List = new ArrayList<SupplementaryQuantityType>();
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private ChangeCodeType changeCode;

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
     * Get the 'CustomsCostMethodCode' element value. ����� ������ ����������� ���������� ���������  ����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ������, ���������� � �������� �������
     * 
     * @return value
     */
    public String getCustomsCostMethodCode() {
        return customsCostMethodCode;
    }

    /** 
     * Set the 'CustomsCostMethodCode' element value. ����� ������ ����������� ���������� ���������  ����������� � ������������ � ��������������� ������� ����������� ���������� ��������� �������, ���������� ��� ���������� ������, ���������� � �������� �������
     * 
     * @param customsCostMethodCode
     */
    public void setCustomsCostMethodCode(String customsCostMethodCode) {
        this.customsCostMethodCode = customsCostMethodCode;
    }

    /** 
     * Get the 'LanguageGoods' element value. ��� �����  �������� ������
     * 
     * @return value
     */
    public String getLanguageGoods() {
        return languageGoods;
    }

    /** 
     * Set the 'LanguageGoods' element value. ��� �����  �������� ������
     * 
     * @param languageGoods
     */
    public void setLanguageGoods(String languageGoods) {
        this.languageGoods = languageGoods;
    }

    /** 
     * Get the 'PreviousCustomsCost' element value. ���������� �������� ���������� ���������, ��.45 ������ ���������
     * 
     * @return value
     */
    public String getPreviousCustomsCost() {
        return previousCustomsCost;
    }

    /** 
     * Set the 'PreviousCustomsCost' element value. ���������� �������� ���������� ���������, ��.45 ������ ���������
     * 
     * @param previousCustomsCost
     */
    public void setPreviousCustomsCost(String previousCustomsCost) {
        this.previousCustomsCost = previousCustomsCost;
    }

    /** 
     * Get the 'KDTGoodsNumeric' element value. ���������� ����� ������ �� ���
     * 
     * @return value
     */
    public String getKDTGoodsNumeric() {
        return KDTGoodsNumeric;
    }

    /** 
     * Set the 'KDTGoodsNumeric' element value. ���������� ����� ������ �� ���
     * 
     * @param KDTGoodsNumeric
     */
    public void setKDTGoodsNumeric(String KDTGoodsNumeric) {
        this.KDTGoodsNumeric = KDTGoodsNumeric;
    }

    /** 
     * Get the list of 'KTDinPresentedDocument' element items. ���. ���������� ������. �������������� ��������� ��. 44
     * 
     * @return list
     */
    public List<CUESADPresentedDocumentsType> getKTDinPresentedDocumentList() {
        return KTDinPresentedDocumentList;
    }

    /** 
     * Set the list of 'KTDinPresentedDocument' element items. ���. ���������� ������. �������������� ��������� ��. 44
     * 
     * @param list
     */
    public void setKTDinPresentedDocumentList(
            List<CUESADPresentedDocumentsType> list) {
        KTDinPresentedDocumentList = list;
    }

    /** 
     * Get the list of 'KTDinPrecedingDocument' element items. ���. ���������� ������. �������������� ���������.
     * 
     * @return list
     */
    public List<CUPrecedingDocumentType> getKTDinPrecedingDocumentList() {
        return KTDinPrecedingDocumentList;
    }

    /** 
     * Set the list of 'KTDinPrecedingDocument' element items. ���. ���������� ������. �������������� ���������.
     * 
     * @param list
     */
    public void setKTDinPrecedingDocumentList(List<CUPrecedingDocumentType> list) {
        KTDinPrecedingDocumentList = list;
    }

    /** 
     * Get the list of 'KTDinCustomsPaymentCalculation' element items. ���. ���������� ������. ���������� ���������� ��������.
     * 
     * @return list
     */
    public List<CUCustomsPaymentCalculationType> getKTDinCustomsPaymentCalculationList() {
        return KTDinCustomsPaymentCalculationList;
    }

    /** 
     * Set the list of 'KTDinCustomsPaymentCalculation' element items. ���. ���������� ������. ���������� ���������� ��������.
     * 
     * @param list
     */
    public void setKTDinCustomsPaymentCalculationList(
            List<CUCustomsPaymentCalculationType> list) {
        KTDinCustomsPaymentCalculationList = list;
    }

    /** 
     * Get the list of 'KTDinAutomobile' element items. ���. ���������� ������. ��������  �� �����������. ��. 31
     * 
     * @return list
     */
    public List<AutomobileType> getKTDinAutomobileList() {
        return KTDinAutomobileList;
    }

    /** 
     * Set the list of 'KTDinAutomobile' element items. ���. ���������� ������. ��������  �� �����������. ��. 31
     * 
     * @param list
     */
    public void setKTDinAutomobileList(List<AutomobileType> list) {
        KTDinAutomobileList = list;
    }

    /** 
     * Get the list of 'KTDinGoodsOfficialMark' element items. ���. ���������� ������. ��������� ������� �� ������.
     * 
     * @return list
     */
    public List<KTDinGoodsOfficialMarkType> getKTDinGoodsOfficialMarkList() {
        return KTDinGoodsOfficialMarkList;
    }

    /** 
     * Set the list of 'KTDinGoodsOfficialMark' element items. ���. ���������� ������. ��������� ������� �� ������.
     * 
     * @param list
     */
    public void setKTDinGoodsOfficialMarkList(
            List<KTDinGoodsOfficialMarkType> list) {
        KTDinGoodsOfficialMarkList = list;
    }

    /** 
     * Get the list of 'ESADExcise' element items. �������� �� �������� ������
     * 
     * @return list
     */
    public List<ESADExciseType> getESADExciseList() {
        return ESADExciseList;
    }

    /** 
     * Set the list of 'ESADExcise' element items. �������� �� �������� ������
     * 
     * @param list
     */
    public void setESADExciseList(List<ESADExciseType> list) {
        ESADExciseList = list;
    }

    /** 
     * Get the 'KDTinCustomsConditions' element value. ��������, ����������� � ������, ���� �� ������������ � �������� ��������� �� ��������� ���������� �� ����������� �������������� 6 �� 31, �� 44
     * 
     * @return value
     */
    public ProcessingGoodsDeclarationType getKDTinCustomsConditions() {
        return KDTinCustomsConditions;
    }

    /** 
     * Set the 'KDTinCustomsConditions' element value. ��������, ����������� � ������, ���� �� ������������ � �������� ��������� �� ��������� ���������� �� ����������� �������������� 6 �� 31, �� 44
     * 
     * @param KDTinCustomsConditions
     */
    public void setKDTinCustomsConditions(
            ProcessingGoodsDeclarationType KDTinCustomsConditions) {
        this.KDTinCustomsConditions = KDTinCustomsConditions;
    }

    /** 
     * Get the 'KDTinGoodsOrganization' element value. �������� �� ����������� � �������� ����� ��
     * 
     * @return value
     */
    public KDTinGoodsOrganizationType getKDTinGoodsOrganization() {
        return KDTinGoodsOrganization;
    }

    /** 
     * Set the 'KDTinGoodsOrganization' element value. �������� �� ����������� � �������� ����� ��
     * 
     * @param KDTinGoodsOrganization
     */
    public void setKDTinGoodsOrganization(
            KDTinGoodsOrganizationType KDTinGoodsOrganization) {
        this.KDTinGoodsOrganization = KDTinGoodsOrganization;
    }

    /** 
     * Get the 'ESADGoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������.
     * 
     * @return value
     */
    public ESADGoodsPackagingType getESADGoodsPackaging() {
        return ESADGoodsPackaging;
    }

    /** 
     * Set the 'ESADGoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������.
     * 
     * @param ESADGoodsPackaging
     */
    public void setESADGoodsPackaging(ESADGoodsPackagingType ESADGoodsPackaging) {
        this.ESADGoodsPackaging = ESADGoodsPackaging;
    }

    /** 
     * Get the 'ESADGoodsQuota' element value. �����.
     * 
     * @return value
     */
    public ESADGoodsQuotaType getESADGoodsQuota() {
        return ESADGoodsQuota;
    }

    /** 
     * Set the 'ESADGoodsQuota' element value. �����.
     * 
     * @param ESADGoodsQuota
     */
    public void setESADGoodsQuota(ESADGoodsQuotaType ESADGoodsQuota) {
        this.ESADGoodsQuota = ESADGoodsQuota;
    }

    /** 
     * Get the 'ESADContainer' element value. �������� � �����������.
     * 
     * @return value
     */
    public ESADContainerType getESADContainer() {
        return ESADContainer;
    }

    /** 
     * Set the 'ESADContainer' element value. �������� � �����������.
     * 
     * @param ESADContainer
     */
    public void setESADContainer(ESADContainerType ESADContainer) {
        this.ESADContainer = ESADContainer;
    }

    /** 
     * Get the 'KTDinCustomsProcedure' element value. ���������.
     * 
     * @return value
     */
    public ESADCustomsProcedureType getKTDinCustomsProcedure() {
        return KTDinCustomsProcedure;
    }

    /** 
     * Set the 'KTDinCustomsProcedure' element value. ���������.
     * 
     * @param KTDinCustomsProcedure
     */
    public void setKTDinCustomsProcedure(
            ESADCustomsProcedureType KTDinCustomsProcedure) {
        this.KTDinCustomsProcedure = KTDinCustomsProcedure;
    }

    /** 
     * Get the list of 'ElectricalEnergReceived' element items. �������� � ���������� �������� �������������� �� �������� ������. ������� 9 �� 31
     * 
     * @return list
     */
    public List<CUElectricalEnergyType> getElectricalEnergReceivedList() {
        return electricalEnergReceivedList;
    }

    /** 
     * Set the list of 'ElectricalEnergReceived' element items. �������� � ���������� �������� �������������� �� �������� ������. ������� 9 �� 31
     * 
     * @param list
     */
    public void setElectricalEnergReceivedList(List<CUElectricalEnergyType> list) {
        electricalEnergReceivedList = list;
    }

    /** 
     * Get the list of 'ElectricalEnergGiven' element items. �������� � ���������� ���������� �������������� �� �������� ������. ������� 9 �� 31
     * 
     * @return list
     */
    public List<CUElectricalEnergyType> getElectricalEnergGivenList() {
        return electricalEnergGivenList;
    }

    /** 
     * Set the list of 'ElectricalEnergGiven' element items. �������� � ���������� ���������� �������������� �� �������� ������. ������� 9 �� 31
     * 
     * @param list
     */
    public void setElectricalEnergGivenList(List<CUElectricalEnergyType> list) {
        electricalEnergGivenList = list;
    }

    /** 
     * Get the list of 'SupplementaryGoodsQuantity1' element items. ���������� ������ � ������� ���������, �������� �� �������� � �������������� ������� 1 ��.31
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryGoodsQuantity1List() {
        return supplementaryGoodsQuantity1List;
    }

    /** 
     * Set the list of 'SupplementaryGoodsQuantity1' element items. ���������� ������ � ������� ���������, �������� �� �������� � �������������� ������� 1 ��.31
     * 
     * @param list
     */
    public void setSupplementaryGoodsQuantity1List(
            List<SupplementaryQuantityType> list) {
        supplementaryGoodsQuantity1List = list;
    }

    /** 
     * Get the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������.  ��.41
     * 
     * @return value
     */
    public SupplementaryQuantityType getSupplementaryGoodsQuantity() {
        return supplementaryGoodsQuantity;
    }

    /** 
     * Set the 'SupplementaryGoodsQuantity' element value. ���������� ������ � �������������� ������� ���������.  ��.41
     * 
     * @param supplementaryGoodsQuantity
     */
    public void setSupplementaryGoodsQuantity(
            SupplementaryQuantityType supplementaryGoodsQuantity) {
        this.supplementaryGoodsQuantity = supplementaryGoodsQuantity;
    }

    /** 
     * Get the 'ChangeCode' element value. ��� ��������� �� 45� ��� ������� ��������� � (���) ���������� �������� � ��������� ������
     * 
     * @return value
     */
    public ChangeCodeType getChangeCode() {
        return changeCode;
    }

    /** 
     * Set the 'ChangeCode' element value. ��� ��������� �� 45� ��� ������� ��������� � (���) ���������� �������� � ��������� ������
     * 
     * @param changeCode
     */
    public void setChangeCode(ChangeCodeType changeCode) {
        this.changeCode = changeCode;
    }
}
