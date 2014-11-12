
package ru.acs.fts.schemas.album.ktdin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsShipmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUGuaranteeType;

/** 
 * Сведения о товарной партии.
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
     * Get the 'PreviousTotalCustomsAmount' element value. Предыдущее значение общей таможенной стоимости
     * 
     * @return value
     */
    public String getPreviousTotalCustomsAmount() {
        return previousTotalCustomsAmount;
    }

    /** 
     * Set the 'PreviousTotalCustomsAmount' element value. Предыдущее значение общей таможенной стоимости
     * 
     * @param previousTotalCustomsAmount
     */
    public void setPreviousTotalCustomsAmount(String previousTotalCustomsAmount) {
        this.previousTotalCustomsAmount = previousTotalCustomsAmount;
    }

    /** 
     * Get the 'KTDinConsignor' element value. КДТ. Внутренний формат. Сведения об отправителе товаров
     * 
     * @return value
     */
    public KTDinConsignorType getKTDinConsignor() {
        return KTDinConsignor;
    }

    /** 
     * Set the 'KTDinConsignor' element value. КДТ. Внутренний формат. Сведения об отправителе товаров
     * 
     * @param KTDinConsignor
     */
    public void setKTDinConsignor(KTDinConsignorType KTDinConsignor) {
        this.KTDinConsignor = KTDinConsignor;
    }

    /** 
     * Get the 'KTDinConsignee' element value. КТД. Внутренний формат. Сведения о получателе товаров.
     * 
     * @return value
     */
    public KTDinConsigneeType getKTDinConsignee() {
        return KTDinConsignee;
    }

    /** 
     * Set the 'KTDinConsignee' element value. КТД. Внутренний формат. Сведения о получателе товаров.
     * 
     * @param KTDinConsignee
     */
    public void setKTDinConsignee(KTDinConsigneeType KTDinConsignee) {
        this.KTDinConsignee = KTDinConsignee;
    }

    /** 
     * Get the 'KTDinFinancialAdjustingResponsiblePerson' element value. КТД. Внутренний формат. Лицо ответственное за финансовое урегулирование.
     * 
     * @return value
     */
    public KTDinFinancialAdjustingResponsiblePersonType getKTDinFinancialAdjustingResponsiblePerson() {
        return KTDinFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'KTDinFinancialAdjustingResponsiblePerson' element value. КТД. Внутренний формат. Лицо ответственное за финансовое урегулирование.
     * 
     * @param KTDinFinancialAdjustingResponsiblePerson
     */
    public void setKTDinFinancialAdjustingResponsiblePerson(
            KTDinFinancialAdjustingResponsiblePersonType KTDinFinancialAdjustingResponsiblePerson) {
        this.KTDinFinancialAdjustingResponsiblePerson = KTDinFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'KTDinDeclarant' element value. КДТ. Внутренний формат. Сведения о декларанте товаров.
     * 
     * @return value
     */
    public KTDinDeclarantType getKTDinDeclarant() {
        return KTDinDeclarant;
    }

    /** 
     * Set the 'KTDinDeclarant' element value. КДТ. Внутренний формат. Сведения о декларанте товаров.
     * 
     * @param KTDinDeclarant
     */
    public void setKTDinDeclarant(KTDinDeclarantType KTDinDeclarant) {
        this.KTDinDeclarant = KTDinDeclarant;
    }

    /** 
     * Get the list of 'KTDinGoodsLocation' element items. КДТ. Внутренний формат. Местонахождение товаров. Гр. 30
     * 
     * @return list
     */
    public List<KTDinGoodsLocationType> getKTDinGoodsLocationList() {
        return KTDinGoodsLocationList;
    }

    /** 
     * Set the list of 'KTDinGoodsLocation' element items. КДТ. Внутренний формат. Местонахождение товаров. Гр. 30
     * 
     * @param list
     */
    public void setKTDinGoodsLocationList(List<KTDinGoodsLocationType> list) {
        KTDinGoodsLocationList = list;
    }

    /** 
     * Get the 'KTDinMainContractTerms' element value. КДТ. Внутренний формат. Условия сделки. Гр. 11, 20, 22, 23,  24
     * 
     * @return value
     */
    public KTDinMainContractTermsType getKTDinMainContractTerms() {
        return KTDinMainContractTerms;
    }

    /** 
     * Set the 'KTDinMainContractTerms' element value. КДТ. Внутренний формат. Условия сделки. Гр. 11, 20, 22, 23,  24
     * 
     * @param KTDinMainContractTerms
     */
    public void setKTDinMainContractTerms(
            KTDinMainContractTermsType KTDinMainContractTerms) {
        this.KTDinMainContractTerms = KTDinMainContractTerms;
    }

    /** 
     * Get the 'KTDinConsigment' element value. КДТ. Внутренний формат. Сведения о перевозке товаров гр. 15, 15а, 17,17а, 18, 19, 21, 25, 26, 29, 53.
     * 
     * @return value
     */
    public KTDinConsigmentType getKTDinConsigment() {
        return KTDinConsigment;
    }

    /** 
     * Set the 'KTDinConsigment' element value. КДТ. Внутренний формат. Сведения о перевозке товаров гр. 15, 15а, 17,17а, 18, 19, 21, 25, 26, 29, 53.
     * 
     * @param KTDinConsigment
     */
    public void setKTDinConsigment(KTDinConsigmentType KTDinConsigment) {
        this.KTDinConsigment = KTDinConsigment;
    }

    /** 
     * Get the list of 'KTDinGoods' element items. Товарная часть КДТ. Гр. 31-47
     * 
     * @return list
     */
    public List<KTDinGoodsType> getKTDinGoodList() {
        return KTDinGoodList;
    }

    /** 
     * Set the list of 'KTDinGoods' element items. Товарная часть КДТ. Гр. 31-47
     * 
     * @param list
     */
    public void setKTDinGoodList(List<KTDinGoodsType> list) {
        KTDinGoodList = list;
    }

    /** 
     * Get the list of 'Guarantee' element items. Гарантия.
     * 
     * @return list
     */
    public List<CUGuaranteeType> getGuaranteeList() {
        return guaranteeList;
    }

    /** 
     * Set the list of 'Guarantee' element items. Гарантия.
     * 
     * @param list
     */
    public void setGuaranteeList(List<CUGuaranteeType> list) {
        guaranteeList = list;
    }

    /** 
     * Get the 'KDTinPayments' element value. Сведения об уплачиваемых платежах, платежных поручениях, отсрочке платежей. Гр. 48, В.
     * 
     * @return value
     */
    public KTDinPaymentsType getKDTinPayments() {
        return KDTinPayments;
    }

    /** 
     * Set the 'KDTinPayments' element value. Сведения об уплачиваемых платежах, платежных поручениях, отсрочке платежей. Гр. 48, В.
     * 
     * @param KDTinPayments
     */
    public void setKDTinPayments(KTDinPaymentsType KDTinPayments) {
        this.KDTinPayments = KDTinPayments;
    }
}
