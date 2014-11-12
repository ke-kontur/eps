
package ru.acs.fts.schemas.album.esadout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsShipmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADMainContractTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUGuaranteeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.TDGuaranteeType;

/** 
 * �������� � �������� ������
 */
public class ESADoutCUGoodsShipmentType extends CUESADGoodsShipmentType
{
    private ESADoutCUConsignorType ESADoutCUConsignor;
    private ESADoutCUConsigneeType ESADoutCUConsignee;
    private ESADoutCUFinancialAdjustingResponsiblePersonType ESADoutCUFinancialAdjustingResponsiblePerson;
    private ESADoutCUDeclarantType ESADoutCUDeclarant;
    private ESADoutCUCarrierType ESADoutCUCarrier;
    private List<ESADoutCUGoodsLocationType> ESADoutCUGoodsLocationList = new ArrayList<ESADoutCUGoodsLocationType>();
    private ESADoutCUConsigmentType ESADoutCUConsigment;
    private CUESADMainContractTermsType ESADoutCUMainContractTerms;
    private List<ESADoutCUGoodsType> ESADoutCUGoodList = new ArrayList<ESADoutCUGoodsType>();
    private ESADoutCUPaymentsType ESADoutCUPayments;
    private List<CUGuaranteeType> guaranteeList = new ArrayList<CUGuaranteeType>();
    private List<TDGuaranteeType> TDGuaranteeList = new ArrayList<TDGuaranteeType>();

    /** 
     * Get the 'ESADout_CUConsignor' element value. �������� �� ����������� �������
     * 
     * @return value
     */
    public ESADoutCUConsignorType getESADoutCUConsignor() {
        return ESADoutCUConsignor;
    }

    /** 
     * Set the 'ESADout_CUConsignor' element value. �������� �� ����������� �������
     * 
     * @param ESADoutCUConsignor
     */
    public void setESADoutCUConsignor(ESADoutCUConsignorType ESADoutCUConsignor) {
        this.ESADoutCUConsignor = ESADoutCUConsignor;
    }

    /** 
     * Get the 'ESADout_CUConsignee' element value. �������� � ���������� �������
     * 
     * @return value
     */
    public ESADoutCUConsigneeType getESADoutCUConsignee() {
        return ESADoutCUConsignee;
    }

    /** 
     * Set the 'ESADout_CUConsignee' element value. �������� � ���������� �������
     * 
     * @param ESADoutCUConsignee
     */
    public void setESADoutCUConsignee(ESADoutCUConsigneeType ESADoutCUConsignee) {
        this.ESADoutCUConsignee = ESADoutCUConsignee;
    }

    /** 
     * Get the 'ESADout_CUFinancialAdjustingResponsiblePerson' element value. ���� ������������� �� ���������� ��������������
     * 
     * @return value
     */
    public ESADoutCUFinancialAdjustingResponsiblePersonType getESADoutCUFinancialAdjustingResponsiblePerson() {
        return ESADoutCUFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'ESADout_CUFinancialAdjustingResponsiblePerson' element value. ���� ������������� �� ���������� ��������������
     * 
     * @param ESADoutCUFinancialAdjustingResponsiblePerson
     */
    public void setESADoutCUFinancialAdjustingResponsiblePerson(
            ESADoutCUFinancialAdjustingResponsiblePersonType ESADoutCUFinancialAdjustingResponsiblePerson) {
        this.ESADoutCUFinancialAdjustingResponsiblePerson = ESADoutCUFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'ESADout_CUDeclarant' element value. �������� � ���������� �������
     * 
     * @return value
     */
    public ESADoutCUDeclarantType getESADoutCUDeclarant() {
        return ESADoutCUDeclarant;
    }

    /** 
     * Set the 'ESADout_CUDeclarant' element value. �������� � ���������� �������
     * 
     * @param ESADoutCUDeclarant
     */
    public void setESADoutCUDeclarant(ESADoutCUDeclarantType ESADoutCUDeclarant) {
        this.ESADoutCUDeclarant = ESADoutCUDeclarant;
    }

    /** 
     * Get the 'ESADout_CUCarrier' element value. �������� � ����������� ��. 50 ��
     * 
     * @return value
     */
    public ESADoutCUCarrierType getESADoutCUCarrier() {
        return ESADoutCUCarrier;
    }

    /** 
     * Set the 'ESADout_CUCarrier' element value. �������� � ����������� ��. 50 ��
     * 
     * @param ESADoutCUCarrier
     */
    public void setESADoutCUCarrier(ESADoutCUCarrierType ESADoutCUCarrier) {
        this.ESADoutCUCarrier = ESADoutCUCarrier;
    }

    /** 
     * Get the list of 'ESADout_CUGoodsLocation' element items. ��������������� �������. ��. 30 ��
     * 
     * @return list
     */
    public List<ESADoutCUGoodsLocationType> getESADoutCUGoodsLocationList() {
        return ESADoutCUGoodsLocationList;
    }

    /** 
     * Set the list of 'ESADout_CUGoodsLocation' element items. ��������������� �������. ��. 30 ��
     * 
     * @param list
     */
    public void setESADoutCUGoodsLocationList(
            List<ESADoutCUGoodsLocationType> list) {
        ESADoutCUGoodsLocationList = list;
    }

    /** 
     * Get the 'ESADout_CUConsigment' element value. �������� � ��������� �������. ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29  -��/ ��. 15, 17, 18, 19, 21, 25, 26, 29 , 53, 55- ��
     * 
     * @return value
     */
    public ESADoutCUConsigmentType getESADoutCUConsigment() {
        return ESADoutCUConsigment;
    }

    /** 
     * Set the 'ESADout_CUConsigment' element value. �������� � ��������� �������. ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29  -��/ ��. 15, 17, 18, 19, 21, 25, 26, 29 , 53, 55- ��
     * 
     * @param ESADoutCUConsigment
     */
    public void setESADoutCUConsigment(
            ESADoutCUConsigmentType ESADoutCUConsigment) {
        this.ESADoutCUConsigment = ESADoutCUConsigment;
    }

    /** 
     * Get the 'ESADout_CUMainContractTerms' element value. ������� ������ ��. 11, 20, 22, 23, 24 ��
     * 
     * @return value
     */
    public CUESADMainContractTermsType getESADoutCUMainContractTerms() {
        return ESADoutCUMainContractTerms;
    }

    /** 
     * Set the 'ESADout_CUMainContractTerms' element value. ������� ������ ��. 11, 20, 22, 23, 24 ��
     * 
     * @param ESADoutCUMainContractTerms
     */
    public void setESADoutCUMainContractTerms(
            CUESADMainContractTermsType ESADoutCUMainContractTerms) {
        this.ESADoutCUMainContractTerms = ESADoutCUMainContractTerms;
    }

    /** 
     * Get the list of 'ESADout_CUGoods' element items. �������� ����� ��. 31-47
     * 
     * @return list
     */
    public List<ESADoutCUGoodsType> getESADoutCUGoodList() {
        return ESADoutCUGoodList;
    }

    /** 
     * Set the list of 'ESADout_CUGoods' element items. �������� ����� ��. 31-47
     * 
     * @param list
     */
    public void setESADoutCUGoodList(List<ESADoutCUGoodsType> list) {
        ESADoutCUGoodList = list;
    }

    /** 
     * Get the 'ESADout_CUPayments' element value. �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �
     * 
     * @return value
     */
    public ESADoutCUPaymentsType getESADoutCUPayments() {
        return ESADoutCUPayments;
    }

    /** 
     * Set the 'ESADout_CUPayments' element value. �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �
     * 
     * @param ESADoutCUPayments
     */
    public void setESADoutCUPayments(ESADoutCUPaymentsType ESADoutCUPayments) {
        this.ESADoutCUPayments = ESADoutCUPayments;
    }

    /** 
     * Get the list of 'Guarantee' element items. ��������.�� 52 � ��
     * 
     * @return list
     */
    public List<CUGuaranteeType> getGuaranteeList() {
        return guaranteeList;
    }

    /** 
     * Set the list of 'Guarantee' element items. ��������.�� 52 � ��
     * 
     * @param list
     */
    public void setGuaranteeList(List<CUGuaranteeType> list) {
        guaranteeList = list;
    }

    /** 
     * Get the list of 'TDGuarantee' element items. �������� ��� ��
     * 
     * @return list
     */
    public List<TDGuaranteeType> getTDGuaranteeList() {
        return TDGuaranteeList;
    }

    /** 
     * Set the list of 'TDGuarantee' element items. �������� ��� ��
     * 
     * @param list
     */
    public void setTDGuaranteeList(List<TDGuaranteeType> list) {
        TDGuaranteeList = list;
    }
}
