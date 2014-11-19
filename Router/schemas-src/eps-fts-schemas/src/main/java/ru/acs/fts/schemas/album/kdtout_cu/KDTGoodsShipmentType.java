
package ru.acs.fts.schemas.album.kdtout_cu;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsShipmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADMainContractTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUGuaranteeType;

/** 
 * �������� � �������� ������
 */
public class KDTGoodsShipmentType extends CUESADGoodsShipmentType
{
    private String previousTotalCustomsAmount;
    private KDTConsignorType KTDoutConsignor;
    private KDTConsigneeType KTDoutConsignee;
    private KDTFinancialAdjustingResponsiblePersonType KTDoutFinancialAdjustingResponsiblePerson;
    private KDTDeclarantType KTDoutDeclarant;
    private List<KDTGoodsLocationType> KDTGoodsLocationList = new ArrayList<KDTGoodsLocationType>();
    private KDTConsigmentType KTDoutConsigment;
    private CUESADMainContractTermsType KDToutMainContractTerms;
    private List<KDToutGoodsType> KDToutGoodList = new ArrayList<KDToutGoodsType>();
    private KTDoutPaymentsType KDToutPayments;
    private List<CUGuaranteeType> guaranteeList = new ArrayList<CUGuaranteeType>();

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
     * Get the 'KTDoutConsignor' element value. �������� �� ����������� �������
     * 
     * @return value
     */
    public KDTConsignorType getKTDoutConsignor() {
        return KTDoutConsignor;
    }

    /** 
     * Set the 'KTDoutConsignor' element value. �������� �� ����������� �������
     * 
     * @param KTDoutConsignor
     */
    public void setKTDoutConsignor(KDTConsignorType KTDoutConsignor) {
        this.KTDoutConsignor = KTDoutConsignor;
    }

    /** 
     * Get the 'KTDoutConsignee' element value. �������� � ���������� �������
     * 
     * @return value
     */
    public KDTConsigneeType getKTDoutConsignee() {
        return KTDoutConsignee;
    }

    /** 
     * Set the 'KTDoutConsignee' element value. �������� � ���������� �������
     * 
     * @param KTDoutConsignee
     */
    public void setKTDoutConsignee(KDTConsigneeType KTDoutConsignee) {
        this.KTDoutConsignee = KTDoutConsignee;
    }

    /** 
     * Get the 'KTDoutFinancialAdjustingResponsiblePerson' element value. ���� ������������� �� ���������� ��������������
     * 
     * @return value
     */
    public KDTFinancialAdjustingResponsiblePersonType getKTDoutFinancialAdjustingResponsiblePerson() {
        return KTDoutFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'KTDoutFinancialAdjustingResponsiblePerson' element value. ���� ������������� �� ���������� ��������������
     * 
     * @param KTDoutFinancialAdjustingResponsiblePerson
     */
    public void setKTDoutFinancialAdjustingResponsiblePerson(
            KDTFinancialAdjustingResponsiblePersonType KTDoutFinancialAdjustingResponsiblePerson) {
        this.KTDoutFinancialAdjustingResponsiblePerson = KTDoutFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'KTDoutDeclarant' element value. �������� � ����������
     * 
     * @return value
     */
    public KDTDeclarantType getKTDoutDeclarant() {
        return KTDoutDeclarant;
    }

    /** 
     * Set the 'KTDoutDeclarant' element value. �������� � ����������
     * 
     * @param KTDoutDeclarant
     */
    public void setKTDoutDeclarant(KDTDeclarantType KTDoutDeclarant) {
        this.KTDoutDeclarant = KTDoutDeclarant;
    }

    /** 
     * Get the list of 'KDTGoodsLocation' element items. ��������������� �������. ��. 30 ��
     * 
     * @return list
     */
    public List<KDTGoodsLocationType> getKDTGoodsLocationList() {
        return KDTGoodsLocationList;
    }

    /** 
     * Set the list of 'KDTGoodsLocation' element items. ��������������� �������. ��. 30 ��
     * 
     * @param list
     */
    public void setKDTGoodsLocationList(List<KDTGoodsLocationType> list) {
        KDTGoodsLocationList = list;
    }

    /** 
     * Get the 'KTDoutConsigment' element value. �������� � ��������� �������. ��. 15, 15�, 17, 17�, 18, 19, 21, 25, 26, 29
     * 
     * @return value
     */
    public KDTConsigmentType getKTDoutConsigment() {
        return KTDoutConsigment;
    }

    /** 
     * Set the 'KTDoutConsigment' element value. �������� � ��������� �������. ��. 15, 15�, 17, 17�, 18, 19, 21, 25, 26, 29
     * 
     * @param KTDoutConsigment
     */
    public void setKTDoutConsigment(KDTConsigmentType KTDoutConsigment) {
        this.KTDoutConsigment = KTDoutConsigment;
    }

    /** 
     * Get the 'KDToutMainContractTerms' element value. ������� ������. ��. 11, 20, 22, 23, 24
     * 
     * @return value
     */
    public CUESADMainContractTermsType getKDToutMainContractTerms() {
        return KDToutMainContractTerms;
    }

    /** 
     * Set the 'KDToutMainContractTerms' element value. ������� ������. ��. 11, 20, 22, 23, 24
     * 
     * @param KDToutMainContractTerms
     */
    public void setKDToutMainContractTerms(
            CUESADMainContractTermsType KDToutMainContractTerms) {
        this.KDToutMainContractTerms = KDToutMainContractTerms;
    }

    /** 
     * Get the list of 'KDToutGoods' element items. �������� ����� ���. ��. 31-47
     * 
     * @return list
     */
    public List<KDToutGoodsType> getKDToutGoodList() {
        return KDToutGoodList;
    }

    /** 
     * Set the list of 'KDToutGoods' element items. �������� ����� ���. ��. 31-47
     * 
     * @param list
     */
    public void setKDToutGoodList(List<KDToutGoodsType> list) {
        KDToutGoodList = list;
    }

    /** 
     * Get the 'KDToutPayments' element value. �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �
     * 
     * @return value
     */
    public KTDoutPaymentsType getKDToutPayments() {
        return KDToutPayments;
    }

    /** 
     * Set the 'KDToutPayments' element value. �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �
     * 
     * @param KDToutPayments
     */
    public void setKDToutPayments(KTDoutPaymentsType KDToutPayments) {
        this.KDToutPayments = KDToutPayments;
    }

    /** 
     * Get the list of 'Guarantee' element items. ��������
     * 
     * @return list
     */
    public List<CUGuaranteeType> getGuaranteeList() {
        return guaranteeList;
    }

    /** 
     * Set the list of 'Guarantee' element items. ��������
     * 
     * @param list
     */
    public void setGuaranteeList(List<CUGuaranteeType> list) {
        guaranteeList = list;
    }
}
