
package ru.acs.fts.schemas.album.ktdin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsShipmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUGuaranteeType;

/** 
 * �������� � �������� ������.
 */
public class KTDinGoodsShipmentType extends CUESADGoodsShipmentType
{
    private String previousTotalCustomsAmount;
    private KTDinConsignorType KTDinConsignor;
    private KTDinConsigneeType KTDinConsignee;
    private KTDinFinancialAdjustingResponsiblePersonType KTDinFinancialAdjustingResponsiblePerson;
    private KTDinDeclarantType KTDinDeclarant;
    private List<KTDinGoodsLocationType> KTDinGoodsLocationList = new ArrayList<KTDinGoodsLocationType>();
    private KTDinMainContractTermsType KTDinMainContractTerms;
    private KTDinConsigmentType KTDinConsigment;
    private List<KTDinGoodsType> KTDinGoodList = new ArrayList<KTDinGoodsType>();
    private List<CUGuaranteeType> guaranteeList = new ArrayList<CUGuaranteeType>();
    private KTDinPaymentsType KDTinPayments;

    /** 
     * Get the 'PreviousTotalCustomsAmount' element value. ���������� �������� ����� ���������� ���������
     * 
     * @return value
     */
    public String getPreviousTotalCustomsAmount() {
        return previousTotalCustomsAmount;
    }

    /** 
     * Set the 'PreviousTotalCustomsAmount' element value. ���������� �������� ����� ���������� ���������
     * 
     * @param previousTotalCustomsAmount
     */
    public void setPreviousTotalCustomsAmount(String previousTotalCustomsAmount) {
        this.previousTotalCustomsAmount = previousTotalCustomsAmount;
    }

    /** 
     * Get the 'KTDinConsignor' element value. ���. ���������� ������. �������� �� ����������� �������
     * 
     * @return value
     */
    public KTDinConsignorType getKTDinConsignor() {
        return KTDinConsignor;
    }

    /** 
     * Set the 'KTDinConsignor' element value. ���. ���������� ������. �������� �� ����������� �������
     * 
     * @param KTDinConsignor
     */
    public void setKTDinConsignor(KTDinConsignorType KTDinConsignor) {
        this.KTDinConsignor = KTDinConsignor;
    }

    /** 
     * Get the 'KTDinConsignee' element value. ���. ���������� ������. �������� � ���������� �������.
     * 
     * @return value
     */
    public KTDinConsigneeType getKTDinConsignee() {
        return KTDinConsignee;
    }

    /** 
     * Set the 'KTDinConsignee' element value. ���. ���������� ������. �������� � ���������� �������.
     * 
     * @param KTDinConsignee
     */
    public void setKTDinConsignee(KTDinConsigneeType KTDinConsignee) {
        this.KTDinConsignee = KTDinConsignee;
    }

    /** 
     * Get the 'KTDinFinancialAdjustingResponsiblePerson' element value. ���. ���������� ������. ���� ������������� �� ���������� ��������������.
     * 
     * @return value
     */
    public KTDinFinancialAdjustingResponsiblePersonType getKTDinFinancialAdjustingResponsiblePerson() {
        return KTDinFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'KTDinFinancialAdjustingResponsiblePerson' element value. ���. ���������� ������. ���� ������������� �� ���������� ��������������.
     * 
     * @param KTDinFinancialAdjustingResponsiblePerson
     */
    public void setKTDinFinancialAdjustingResponsiblePerson(
            KTDinFinancialAdjustingResponsiblePersonType KTDinFinancialAdjustingResponsiblePerson) {
        this.KTDinFinancialAdjustingResponsiblePerson = KTDinFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'KTDinDeclarant' element value. ���. ���������� ������. �������� � ���������� �������.
     * 
     * @return value
     */
    public KTDinDeclarantType getKTDinDeclarant() {
        return KTDinDeclarant;
    }

    /** 
     * Set the 'KTDinDeclarant' element value. ���. ���������� ������. �������� � ���������� �������.
     * 
     * @param KTDinDeclarant
     */
    public void setKTDinDeclarant(KTDinDeclarantType KTDinDeclarant) {
        this.KTDinDeclarant = KTDinDeclarant;
    }

    /** 
     * Get the list of 'KTDinGoodsLocation' element items. ���. ���������� ������. ��������������� �������. ��. 30
     * 
     * @return list
     */
    public List<KTDinGoodsLocationType> getKTDinGoodsLocationList() {
        return KTDinGoodsLocationList;
    }

    /** 
     * Set the list of 'KTDinGoodsLocation' element items. ���. ���������� ������. ��������������� �������. ��. 30
     * 
     * @param list
     */
    public void setKTDinGoodsLocationList(List<KTDinGoodsLocationType> list) {
        KTDinGoodsLocationList = list;
    }

    /** 
     * Get the 'KTDinMainContractTerms' element value. ���. ���������� ������. ������� ������. ��. 11, 20, 22, 23,  24
     * 
     * @return value
     */
    public KTDinMainContractTermsType getKTDinMainContractTerms() {
        return KTDinMainContractTerms;
    }

    /** 
     * Set the 'KTDinMainContractTerms' element value. ���. ���������� ������. ������� ������. ��. 11, 20, 22, 23,  24
     * 
     * @param KTDinMainContractTerms
     */
    public void setKTDinMainContractTerms(
            KTDinMainContractTermsType KTDinMainContractTerms) {
        this.KTDinMainContractTerms = KTDinMainContractTerms;
    }

    /** 
     * Get the 'KTDinConsigment' element value. ���. ���������� ������. �������� � ��������� ������� ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29, 53.
     * 
     * @return value
     */
    public KTDinConsigmentType getKTDinConsigment() {
        return KTDinConsigment;
    }

    /** 
     * Set the 'KTDinConsigment' element value. ���. ���������� ������. �������� � ��������� ������� ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29, 53.
     * 
     * @param KTDinConsigment
     */
    public void setKTDinConsigment(KTDinConsigmentType KTDinConsigment) {
        this.KTDinConsigment = KTDinConsigment;
    }

    /** 
     * Get the list of 'KTDinGoods' element items. �������� ����� ���. ��. 31-47
     * 
     * @return list
     */
    public List<KTDinGoodsType> getKTDinGoodList() {
        return KTDinGoodList;
    }

    /** 
     * Set the list of 'KTDinGoods' element items. �������� ����� ���. ��. 31-47
     * 
     * @param list
     */
    public void setKTDinGoodList(List<KTDinGoodsType> list) {
        KTDinGoodList = list;
    }

    /** 
     * Get the list of 'Guarantee' element items. ��������.
     * 
     * @return list
     */
    public List<CUGuaranteeType> getGuaranteeList() {
        return guaranteeList;
    }

    /** 
     * Set the list of 'Guarantee' element items. ��������.
     * 
     * @param list
     */
    public void setGuaranteeList(List<CUGuaranteeType> list) {
        guaranteeList = list;
    }

    /** 
     * Get the 'KDTinPayments' element value. �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �.
     * 
     * @return value
     */
    public KTDinPaymentsType getKDTinPayments() {
        return KDTinPayments;
    }

    /** 
     * Set the 'KDTinPayments' element value. �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �.
     * 
     * @param KDTinPayments
     */
    public void setKDTinPayments(KTDinPaymentsType KDTinPayments) {
        this.KDTinPayments = KDTinPayments;
    }
}
