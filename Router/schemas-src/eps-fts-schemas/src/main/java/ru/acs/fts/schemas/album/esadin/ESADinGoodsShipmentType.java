
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsShipmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADMainContractTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUGuaranteeType;

/** 
 * �� � ��. ���������� ������. �������� � �������� ������.
 */
public class ESADinGoodsShipmentType extends CUESADGoodsShipmentType
{
    private ESADinConsignorType ESADinConsignor;
    private ESADinConsigneeType ESADinConsignee;
    private ESADinFinancialAdjustingResponsiblePersonType ESADinFinancialAdjustingResponsiblePerson;
    private ESADinDeclarantType ESADinDeclarant;
    private List<ESADinGoodsLocationType> ESADinGoodsLocationList = new ArrayList<ESADinGoodsLocationType>();
    private ESADinConsigmentType ESADinConsigment;
    private CUESADMainContractTermsType ESADinMainContractTerms;
    private List<ESADinGoodsType> ESADinGoodList = new ArrayList<ESADinGoodsType>();
    private ESADinPaymentsType ESADinPayments;
    private List<CUGuaranteeType> guaranteeList = new ArrayList<CUGuaranteeType>();

    /** 
     * Get the 'ESADinConsignor' element value. �� � ��. ���������� ������. �������� �� ����������� �������
     * 
     * @return value
     */
    public ESADinConsignorType getESADinConsignor() {
        return ESADinConsignor;
    }

    /** 
     * Set the 'ESADinConsignor' element value. �� � ��. ���������� ������. �������� �� ����������� �������
     * 
     * @param ESADinConsignor
     */
    public void setESADinConsignor(ESADinConsignorType ESADinConsignor) {
        this.ESADinConsignor = ESADinConsignor;
    }

    /** 
     * Get the 'ESADinConsignee' element value. �� � ��. ���������� ������. �������� � ���������� �������.
     * 
     * @return value
     */
    public ESADinConsigneeType getESADinConsignee() {
        return ESADinConsignee;
    }

    /** 
     * Set the 'ESADinConsignee' element value. �� � ��. ���������� ������. �������� � ���������� �������.
     * 
     * @param ESADinConsignee
     */
    public void setESADinConsignee(ESADinConsigneeType ESADinConsignee) {
        this.ESADinConsignee = ESADinConsignee;
    }

    /** 
     * Get the 'ESADinFinancialAdjustingResponsiblePerson' element value. �� � ��. ���������� ������. ���� ������������� �� ���������� ��������������.
     * 
     * @return value
     */
    public ESADinFinancialAdjustingResponsiblePersonType getESADinFinancialAdjustingResponsiblePerson() {
        return ESADinFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'ESADinFinancialAdjustingResponsiblePerson' element value. �� � ��. ���������� ������. ���� ������������� �� ���������� ��������������.
     * 
     * @param ESADinFinancialAdjustingResponsiblePerson
     */
    public void setESADinFinancialAdjustingResponsiblePerson(
            ESADinFinancialAdjustingResponsiblePersonType ESADinFinancialAdjustingResponsiblePerson) {
        this.ESADinFinancialAdjustingResponsiblePerson = ESADinFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'ESADinDeclarant' element value. �� � ��. ���������� ������. �������� � ���������� �������.
     * 
     * @return value
     */
    public ESADinDeclarantType getESADinDeclarant() {
        return ESADinDeclarant;
    }

    /** 
     * Set the 'ESADinDeclarant' element value. �� � ��. ���������� ������. �������� � ���������� �������.
     * 
     * @param ESADinDeclarant
     */
    public void setESADinDeclarant(ESADinDeclarantType ESADinDeclarant) {
        this.ESADinDeclarant = ESADinDeclarant;
    }

    /** 
     * Get the list of 'ESADinGoodsLocation' element items. �� � ��. ���������� ������. ��������������� �������. ��. 30 
     * 
     * @return list
     */
    public List<ESADinGoodsLocationType> getESADinGoodsLocationList() {
        return ESADinGoodsLocationList;
    }

    /** 
     * Set the list of 'ESADinGoodsLocation' element items. �� � ��. ���������� ������. ��������������� �������. ��. 30 
     * 
     * @param list
     */
    public void setESADinGoodsLocationList(List<ESADinGoodsLocationType> list) {
        ESADinGoodsLocationList = list;
    }

    /** 
     * Get the 'ESADinConsigment' element value. �� � ��. ���������� ������. �������� � ��������� ������� ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29.
     * 
     * @return value
     */
    public ESADinConsigmentType getESADinConsigment() {
        return ESADinConsigment;
    }

    /** 
     * Set the 'ESADinConsigment' element value. �� � ��. ���������� ������. �������� � ��������� ������� ��. 15, 15�, 17,17�, 18, 19, 21, 25, 26, 29.
     * 
     * @param ESADinConsigment
     */
    public void setESADinConsigment(ESADinConsigmentType ESADinConsigment) {
        this.ESADinConsigment = ESADinConsigment;
    }

    /** 
     * Get the 'ESADinMainContractTerms' element value. ��. ���������� ������. ������� ������ ��. ��. 11, 20, 22, 23, 24.
     * 
     * @return value
     */
    public CUESADMainContractTermsType getESADinMainContractTerms() {
        return ESADinMainContractTerms;
    }

    /** 
     * Set the 'ESADinMainContractTerms' element value. ��. ���������� ������. ������� ������ ��. ��. 11, 20, 22, 23, 24.
     * 
     * @param ESADinMainContractTerms
     */
    public void setESADinMainContractTerms(
            CUESADMainContractTermsType ESADinMainContractTerms) {
        this.ESADinMainContractTerms = ESADinMainContractTerms;
    }

    /** 
     * Get the list of 'ESADinGoods' element items. �� � ��. ���������� ������. �������� ����� ��. ��. 31-47.
     * 
     * @return list
     */
    public List<ESADinGoodsType> getESADinGoodList() {
        return ESADinGoodList;
    }

    /** 
     * Set the list of 'ESADinGoods' element items. �� � ��. ���������� ������. �������� ����� ��. ��. 31-47.
     * 
     * @param list
     */
    public void setESADinGoodList(List<ESADinGoodsType> list) {
        ESADinGoodList = list;
    }

    /** 
     * Get the 'ESADinPayments' element value. �� � ��. ���������� ������. �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �.
     * 
     * @return value
     */
    public ESADinPaymentsType getESADinPayments() {
        return ESADinPayments;
    }

    /** 
     * Set the 'ESADinPayments' element value. �� � ��. ���������� ������. �������� �� ������������ ��������, ��������� ����������, �������� ��������. ��. 48, �.
     * 
     * @param ESADinPayments
     */
    public void setESADinPayments(ESADinPaymentsType ESADinPayments) {
        this.ESADinPayments = ESADinPayments;
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
}
