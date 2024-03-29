
package ru.acs.fts.schemas.album.esadout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.AutomobileType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUCustomsPaymentCalculationType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsItemType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUElectricalEnergyType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPrecedingDocumentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUPresentedDocumentsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADContainerType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADCustomsProcedureType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADExciseType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsPackagingType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADGoodsQuotaType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ProcessingGoodsDeclarationType;

/** 
 * �������� �����. ��. 31-47
 */
public class ESADoutCUGoodsType extends CUESADGoodsItemType
{
    private String languageGoods;
    private String militaryProducts;
    private String currencyCode;
    private List<CUPresentedDocumentsType> ESADoutCUPresentedDocumentList = new ArrayList<CUPresentedDocumentsType>();
    private List<CUPrecedingDocumentType> ESADoutCUPrecedingDocumentList = new ArrayList<CUPrecedingDocumentType>();
    private List<CUCustomsPaymentCalculationType> ESADoutCUCustomsPaymentCalculationList = new ArrayList<CUCustomsPaymentCalculationType>();
    private ProcessingGoodsDeclarationType ESADoutCUCustomsConditions;
    private SupplementaryQuantityType supplementaryGoodsQuantity;
    private List<SupplementaryQuantityType> supplementaryGoodsQuantity1List = new ArrayList<SupplementaryQuantityType>();
    private ESADGoodsPackagingType ESADGoodsPackaging;
    private ESADGoodsQuotaType ESADGoodsQuota;
    private ESADContainerType ESADContainer;
    private ESADCustomsProcedureType ESADCustomsProcedure;
    private List<ESADExciseType> ESADExciseList = new ArrayList<ESADExciseType>();
    private List<CUElectricalEnergyType> electricalEnergReceivedList = new ArrayList<CUElectricalEnergyType>();
    private List<CUElectricalEnergyType> electricalEnergGivenList = new ArrayList<CUElectricalEnergyType>();
    private List<AutomobileType> goodsAutomobileList = new ArrayList<AutomobileType>();
    private ESADoutGoodsOrganizationType ESADoutGoodsOrganization;
    private SupplementaryQuantityType RBSupplementaryGoodsQuantity;

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
     * Get the 'MilitaryProducts' element value. ������� ��������� �������� ����������. true - ��, false - ���. ��.31 ��
     * 
     * @return value
     */
    public String getMilitaryProducts() {
        return militaryProducts;
    }

    /** 
     * Set the 'MilitaryProducts' element value. ������� ��������� �������� ����������. true - ��, false - ���. ��.31 ��
     * 
     * @param militaryProducts
     */
    public void setMilitaryProducts(String militaryProducts) {
        this.militaryProducts = militaryProducts;
    }

    /** 
     * Get the 'CurrencyCode' element value. ��� ������ ��������� ������ (����������� ��� ��)
     * 
     * @return value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** 
     * Set the 'CurrencyCode' element value. ��� ������ ��������� ������ (����������� ��� ��)
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /** 
     * Get the list of 'ESADout_CUPresentedDocument' element items. �������������� ���������. ��. 44
     * 
     * @return list
     */
    public List<CUPresentedDocumentsType> getESADoutCUPresentedDocumentList() {
        return ESADoutCUPresentedDocumentList;
    }

    /** 
     * Set the list of 'ESADout_CUPresentedDocument' element items. �������������� ���������. ��. 44
     * 
     * @param list
     */
    public void setESADoutCUPresentedDocumentList(
            List<CUPresentedDocumentsType> list) {
        ESADoutCUPresentedDocumentList = list;
    }

    /** 
     * Get the list of 'ESADout_CUPrecedingDocument' element items. �������������� ���������. ��. 40
     * 
     * @return list
     */
    public List<CUPrecedingDocumentType> getESADoutCUPrecedingDocumentList() {
        return ESADoutCUPrecedingDocumentList;
    }

    /** 
     * Set the list of 'ESADout_CUPrecedingDocument' element items. �������������� ���������. ��. 40
     * 
     * @param list
     */
    public void setESADoutCUPrecedingDocumentList(
            List<CUPrecedingDocumentType> list) {
        ESADoutCUPrecedingDocumentList = list;
    }

    /** 
     * Get the list of 'ESADout_CUCustomsPaymentCalculation' element items.  ���������� ���������� ��������
     * 
     * @return list
     */
    public List<CUCustomsPaymentCalculationType> getESADoutCUCustomsPaymentCalculationList() {
        return ESADoutCUCustomsPaymentCalculationList;
    }

    /** 
     * Set the list of 'ESADout_CUCustomsPaymentCalculation' element items.  ���������� ���������� ��������
     * 
     * @param list
     */
    public void setESADoutCUCustomsPaymentCalculationList(
            List<CUCustomsPaymentCalculationType> list) {
        ESADoutCUCustomsPaymentCalculationList = list;
    }

    /** 
     * Get the 'ESADout_CUCustomsConditions' element value. ��������, ����������� � ������, ���� �� ������������ � �������� ��������� �� ��������� ���������� �� ����������� ������� (������� 6 �� 31, �� 44)
     * 
     * @return value
     */
    public ProcessingGoodsDeclarationType getESADoutCUCustomsConditions() {
        return ESADoutCUCustomsConditions;
    }

    /** 
     * Set the 'ESADout_CUCustomsConditions' element value. ��������, ����������� � ������, ���� �� ������������ � �������� ��������� �� ��������� ���������� �� ����������� ������� (������� 6 �� 31, �� 44)
     * 
     * @param ESADoutCUCustomsConditions
     */
    public void setESADoutCUCustomsConditions(
            ProcessingGoodsDeclarationType ESADoutCUCustomsConditions) {
        this.ESADoutCUCustomsConditions = ESADoutCUCustomsConditions;
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
     * Get the list of 'SupplementaryGoodsQuantity1' element items. ���������� ������ � ������� ���������, �������� �� �������� � �������������� (������� 1 ��.31)
     * 
     * @return list
     */
    public List<SupplementaryQuantityType> getSupplementaryGoodsQuantity1List() {
        return supplementaryGoodsQuantity1List;
    }

    /** 
     * Set the list of 'SupplementaryGoodsQuantity1' element items. ���������� ������ � ������� ���������, �������� �� �������� � �������������� (������� 1 ��.31)
     * 
     * @param list
     */
    public void setSupplementaryGoodsQuantity1List(
            List<SupplementaryQuantityType> list) {
        supplementaryGoodsQuantity1List = list;
    }

    /** 
     * Get the 'ESADGoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������
     * 
     * @return value
     */
    public ESADGoodsPackagingType getESADGoodsPackaging() {
        return ESADGoodsPackaging;
    }

    /** 
     * Set the 'ESADGoodsPackaging' element value. �������� � �������� ������, �������� � �������� �������
     * 
     * @param ESADGoodsPackaging
     */
    public void setESADGoodsPackaging(ESADGoodsPackagingType ESADGoodsPackaging) {
        this.ESADGoodsPackaging = ESADGoodsPackaging;
    }

    /** 
     * Get the 'ESADGoodsQuota' element value. �����.�� 39 � ��
     * 
     * @return value
     */
    public ESADGoodsQuotaType getESADGoodsQuota() {
        return ESADGoodsQuota;
    }

    /** 
     * Set the 'ESADGoodsQuota' element value. �����.�� 39 � ��
     * 
     * @param ESADGoodsQuota
     */
    public void setESADGoodsQuota(ESADGoodsQuotaType ESADGoodsQuota) {
        this.ESADGoodsQuota = ESADGoodsQuota;
    }

    /** 
     * Get the 'ESADContainer' element value. �������� � ����������� (������� 3 �� 31)
     * 
     * @return value
     */
    public ESADContainerType getESADContainer() {
        return ESADContainer;
    }

    /** 
     * Set the 'ESADContainer' element value. �������� � ����������� (������� 3 �� 31)
     * 
     * @param ESADContainer
     */
    public void setESADContainer(ESADContainerType ESADContainer) {
        this.ESADContainer = ESADContainer;
    }

    /** 
     * Get the 'ESADCustomsProcedure' element value. ���������.�� 37
     * 
     * @return value
     */
    public ESADCustomsProcedureType getESADCustomsProcedure() {
        return ESADCustomsProcedure;
    }

    /** 
     * Set the 'ESADCustomsProcedure' element value. ���������.�� 37
     * 
     * @param ESADCustomsProcedure
     */
    public void setESADCustomsProcedure(
            ESADCustomsProcedureType ESADCustomsProcedure) {
        this.ESADCustomsProcedure = ESADCustomsProcedure;
    }

    /** 
     * Get the list of 'ESADExcise' element items. �������� �� �������� ������ (������� 4 �� 31)
     * 
     * @return list
     */
    public List<ESADExciseType> getESADExciseList() {
        return ESADExciseList;
    }

    /** 
     * Set the list of 'ESADExcise' element items. �������� �� �������� ������ (������� 4 �� 31)
     * 
     * @param list
     */
    public void setESADExciseList(List<ESADExciseType> list) {
        ESADExciseList = list;
    }

    /** 
     * Get the list of 'ElectricalEnergReceived' element items. �������� � ���������� �������� �������������� �� �������� ������ (������� 9 �� 31)
     * 
     * @return list
     */
    public List<CUElectricalEnergyType> getElectricalEnergReceivedList() {
        return electricalEnergReceivedList;
    }

    /** 
     * Set the list of 'ElectricalEnergReceived' element items. �������� � ���������� �������� �������������� �� �������� ������ (������� 9 �� 31)
     * 
     * @param list
     */
    public void setElectricalEnergReceivedList(List<CUElectricalEnergyType> list) {
        electricalEnergReceivedList = list;
    }

    /** 
     * Get the list of 'ElectricalEnergGiven' element items. �������� � ���������� ���������� �������������� �� �������� ������ (������� 9 �� 31)
     * 
     * @return list
     */
    public List<CUElectricalEnergyType> getElectricalEnergGivenList() {
        return electricalEnergGivenList;
    }

    /** 
     * Set the list of 'ElectricalEnergGiven' element items. �������� � ���������� ���������� �������������� �� �������� ������ (������� 9 �� 31)
     * 
     * @param list
     */
    public void setElectricalEnergGivenList(List<CUElectricalEnergyType> list) {
        electricalEnergGivenList = list;
    }

    /** 
     * Get the list of 'GoodsAutomobile' element items. �������� �� �����������. ��. 31
     * 
     * @return list
     */
    public List<AutomobileType> getGoodsAutomobileList() {
        return goodsAutomobileList;
    }

    /** 
     * Set the list of 'GoodsAutomobile' element items. �������� �� �����������. ��. 31
     * 
     * @param list
     */
    public void setGoodsAutomobileList(List<AutomobileType> list) {
        goodsAutomobileList = list;
    }

    /** 
     * Get the 'ESADoutGoodsOrganization' element value. �������� �� ����������� � �������� ����� ��
     * 
     * @return value
     */
    public ESADoutGoodsOrganizationType getESADoutGoodsOrganization() {
        return ESADoutGoodsOrganization;
    }

    /** 
     * Set the 'ESADoutGoodsOrganization' element value. �������� �� ����������� � �������� ����� ��
     * 
     * @param ESADoutGoodsOrganization
     */
    public void setESADoutGoodsOrganization(
            ESADoutGoodsOrganizationType ESADoutGoodsOrganization) {
        this.ESADoutGoodsOrganization = ESADoutGoodsOrganization;
    }

    /** 
     * Get the 'RBSupplementaryGoodsQuantity' element value. ���������� ������ ����������� ��� ��������� ����������� � ��������� ���������� ���� ��� ��
     * 
     * @return value
     */
    public SupplementaryQuantityType getRBSupplementaryGoodsQuantity() {
        return RBSupplementaryGoodsQuantity;
    }

    /** 
     * Set the 'RBSupplementaryGoodsQuantity' element value. ���������� ������ ����������� ��� ��������� ����������� � ��������� ���������� ���� ��� ��
     * 
     * @param RBSupplementaryGoodsQuantity
     */
    public void setRBSupplementaryGoodsQuantity(
            SupplementaryQuantityType RBSupplementaryGoodsQuantity) {
        this.RBSupplementaryGoodsQuantity = RBSupplementaryGoodsQuantity;
    }
}
