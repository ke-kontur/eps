
package ru.acs.fts.schemas.album.esadin;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADGoodsShipmentType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADMainContractTermsType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUGuaranteeType;

/** 
 * ДТ и ТД. Внутренний формат. Сведения о товарной партии.
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
     * Get the 'ESADinConsignor' element value. ДТ и ТД. Внутренний формат. Сведения об отправителе товаров
     * 
     * @return value
     */
    public ESADinConsignorType getESADinConsignor() {
        return ESADinConsignor;
    }

    /** 
     * Set the 'ESADinConsignor' element value. ДТ и ТД. Внутренний формат. Сведения об отправителе товаров
     * 
     * @param ESADinConsignor
     */
    public void setESADinConsignor(ESADinConsignorType ESADinConsignor) {
        this.ESADinConsignor = ESADinConsignor;
    }

    /** 
     * Get the 'ESADinConsignee' element value. ДТ и ТД. Внутренний формат. Сведения о получателе товаров.
     * 
     * @return value
     */
    public ESADinConsigneeType getESADinConsignee() {
        return ESADinConsignee;
    }

    /** 
     * Set the 'ESADinConsignee' element value. ДТ и ТД. Внутренний формат. Сведения о получателе товаров.
     * 
     * @param ESADinConsignee
     */
    public void setESADinConsignee(ESADinConsigneeType ESADinConsignee) {
        this.ESADinConsignee = ESADinConsignee;
    }

    /** 
     * Get the 'ESADinFinancialAdjustingResponsiblePerson' element value. ДТ и ТД. Внутренний формат. Лицо ответственное за финансовое урегулирование.
     * 
     * @return value
     */
    public ESADinFinancialAdjustingResponsiblePersonType getESADinFinancialAdjustingResponsiblePerson() {
        return ESADinFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Set the 'ESADinFinancialAdjustingResponsiblePerson' element value. ДТ и ТД. Внутренний формат. Лицо ответственное за финансовое урегулирование.
     * 
     * @param ESADinFinancialAdjustingResponsiblePerson
     */
    public void setESADinFinancialAdjustingResponsiblePerson(
            ESADinFinancialAdjustingResponsiblePersonType ESADinFinancialAdjustingResponsiblePerson) {
        this.ESADinFinancialAdjustingResponsiblePerson = ESADinFinancialAdjustingResponsiblePerson;
    }

    /** 
     * Get the 'ESADinDeclarant' element value. ДТ и ТД. Внутренний формат. Сведения о декларанте товаров.
     * 
     * @return value
     */
    public ESADinDeclarantType getESADinDeclarant() {
        return ESADinDeclarant;
    }

    /** 
     * Set the 'ESADinDeclarant' element value. ДТ и ТД. Внутренний формат. Сведения о декларанте товаров.
     * 
     * @param ESADinDeclarant
     */
    public void setESADinDeclarant(ESADinDeclarantType ESADinDeclarant) {
        this.ESADinDeclarant = ESADinDeclarant;
    }

    /** 
     * Get the list of 'ESADinGoodsLocation' element items. ДТ и ТД. Внутренний формат. Местонахождение товаров. Гр. 30 
     * 
     * @return list
     */
    public List<ESADinGoodsLocationType> getESADinGoodsLocationList() {
        return ESADinGoodsLocationList;
    }

    /** 
     * Set the list of 'ESADinGoodsLocation' element items. ДТ и ТД. Внутренний формат. Местонахождение товаров. Гр. 30 
     * 
     * @param list
     */
    public void setESADinGoodsLocationList(List<ESADinGoodsLocationType> list) {
        ESADinGoodsLocationList = list;
    }

    /** 
     * Get the 'ESADinConsigment' element value. ДТ и ТД. Внутренний формат. Сведения о перевозке товаров гр. 15, 15а, 17,17а, 18, 19, 21, 25, 26, 29.
     * 
     * @return value
     */
    public ESADinConsigmentType getESADinConsigment() {
        return ESADinConsigment;
    }

    /** 
     * Set the 'ESADinConsigment' element value. ДТ и ТД. Внутренний формат. Сведения о перевозке товаров гр. 15, 15а, 17,17а, 18, 19, 21, 25, 26, 29.
     * 
     * @param ESADinConsigment
     */
    public void setESADinConsigment(ESADinConsigmentType ESADinConsigment) {
        this.ESADinConsigment = ESADinConsigment;
    }

    /** 
     * Get the 'ESADinMainContractTerms' element value. ДТ. Внутренний формат. Условия сделки ДТ. Гр. 11, 20, 22, 23, 24.
     * 
     * @return value
     */
    public CUESADMainContractTermsType getESADinMainContractTerms() {
        return ESADinMainContractTerms;
    }

    /** 
     * Set the 'ESADinMainContractTerms' element value. ДТ. Внутренний формат. Условия сделки ДТ. Гр. 11, 20, 22, 23, 24.
     * 
     * @param ESADinMainContractTerms
     */
    public void setESADinMainContractTerms(
            CUESADMainContractTermsType ESADinMainContractTerms) {
        this.ESADinMainContractTerms = ESADinMainContractTerms;
    }

    /** 
     * Get the list of 'ESADinGoods' element items. ДТ и ТД. Внутренний формат. Товарная часть ДТ. Гр. 31-47.
     * 
     * @return list
     */
    public List<ESADinGoodsType> getESADinGoodList() {
        return ESADinGoodList;
    }

    /** 
     * Set the list of 'ESADinGoods' element items. ДТ и ТД. Внутренний формат. Товарная часть ДТ. Гр. 31-47.
     * 
     * @param list
     */
    public void setESADinGoodList(List<ESADinGoodsType> list) {
        ESADinGoodList = list;
    }

    /** 
     * Get the 'ESADinPayments' element value. ДТ и ТД. Внутренний формат. Сведения об уплачиваемых платежах, платежных поручениях, отсрочке платежей. Гр. 48, В.
     * 
     * @return value
     */
    public ESADinPaymentsType getESADinPayments() {
        return ESADinPayments;
    }

    /** 
     * Set the 'ESADinPayments' element value. ДТ и ТД. Внутренний формат. Сведения об уплачиваемых платежах, платежных поручениях, отсрочке платежей. Гр. 48, В.
     * 
     * @param ESADinPayments
     */
    public void setESADinPayments(ESADinPaymentsType ESADinPayments) {
        this.ESADinPayments = ESADinPayments;
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
}
