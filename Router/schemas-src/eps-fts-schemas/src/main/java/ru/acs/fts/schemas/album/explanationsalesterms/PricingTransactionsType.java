
package ru.acs.fts.schemas.album.explanationsalesterms;

import java.util.ArrayList;
import java.util.List;

/** 
 * Формирование цены сделки
 */
public class PricingTransactionsType
{
    private String priceLeve;
    private String initialOfferPriceAppropriateLevel;
    private String percentageDeviation;
    private String salePriceInitialOfferPrice;
    private String percentageDifferences;
    private String otherReasonsDifferences;
    private String commentsOtherReasonsDifferences;
    private String keepCorrespondence;
    private String grantCorrespondence;
    private List<String> reasonGrantCorrespondenceList = new ArrayList<String>();
    private String publiclyOffer;
    private DiscountType discount;
    private NonStandardSituationMarketType nonStandardSituationMarket;
    private PositionSellerType positionSeller;
    private SpecialRelationshipType specialRelationship;
    private AlignmentPricesType alignmentPrices;
    private ExpressPubliclyOfferType expressPubliclyOffer;
    private ValueFormingPriceType valueFormingPrice;

    /** 
     * Get the 'PriceLeve' element value. Признак наличия у покупателя информации об уровне рыночных цен на такого вида товары
     * 
     * @return value
     */
    public String getPriceLeve() {
        return priceLeve;
    }

    /** 
     * Set the 'PriceLeve' element value. Признак наличия у покупателя информации об уровне рыночных цен на такого вида товары
     * 
     * @param priceLeve
     */
    public void setPriceLeve(String priceLeve) {
        this.priceLeve = priceLeve;
    }

    /** 
     * Get the 'InitialOfferPriceAppropriateLevel' element value. Признак того, что первоначальная цена  предложения корреспондирует такому уровню цен
     * 
     * @return value
     */
    public String getInitialOfferPriceAppropriateLevel() {
        return initialOfferPriceAppropriateLevel;
    }

    /** 
     * Set the 'InitialOfferPriceAppropriateLevel' element value. Признак того, что первоначальная цена  предложения корреспондирует такому уровню цен
     * 
     * @param initialOfferPriceAppropriateLevel
     */
    public void setInitialOfferPriceAppropriateLevel(
            String initialOfferPriceAppropriateLevel) {
        this.initialOfferPriceAppropriateLevel = initialOfferPriceAppropriateLevel;
    }

    /** 
     * Get the 'PercentageDeviation' element value. Процент отклонения
     * 
     * @return value
     */
    public String getPercentageDeviation() {
        return percentageDeviation;
    }

    /** 
     * Set the 'PercentageDeviation' element value. Процент отклонения
     * 
     * @param percentageDeviation
     */
    public void setPercentageDeviation(String percentageDeviation) {
        this.percentageDeviation = percentageDeviation;
    }

    /** 
     * Get the 'SalePriceInitialOfferPrice' element value. Признак того, что цена сделки совпадает с первоначальной ценой предложения
     * 
     * @return value
     */
    public String getSalePriceInitialOfferPrice() {
        return salePriceInitialOfferPrice;
    }

    /** 
     * Set the 'SalePriceInitialOfferPrice' element value. Признак того, что цена сделки совпадает с первоначальной ценой предложения
     * 
     * @param salePriceInitialOfferPrice
     */
    public void setSalePriceInitialOfferPrice(String salePriceInitialOfferPrice) {
        this.salePriceInitialOfferPrice = salePriceInitialOfferPrice;
    }

    /** 
     * Get the 'PercentageDifferences' element value. Процент отличия от первоначальной цены.Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getPercentageDifferences() {
        return percentageDifferences;
    }

    /** 
     * Set the 'PercentageDifferences' element value. Процент отличия от первоначальной цены.Если значение поля: "true" - да; "false" - нет.
     * 
     * @param percentageDifferences
     */
    public void setPercentageDifferences(String percentageDifferences) {
        this.percentageDifferences = percentageDifferences;
    }

    /** 
     * Get the 'OtherReasonsDifferences' element value. Другие причины отличия
     * 
     * @return value
     */
    public String getOtherReasonsDifferences() {
        return otherReasonsDifferences;
    }

    /** 
     * Set the 'OtherReasonsDifferences' element value. Другие причины отличия
     * 
     * @param otherReasonsDifferences
     */
    public void setOtherReasonsDifferences(String otherReasonsDifferences) {
        this.otherReasonsDifferences = otherReasonsDifferences;
    }

    /** 
     * Get the 'CommentsOtherReasonsDifferences' element value. Другие причины отличия (указать подробности)
     * 
     * @return value
     */
    public String getCommentsOtherReasonsDifferences() {
        return commentsOtherReasonsDifferences;
    }

    /** 
     * Set the 'CommentsOtherReasonsDifferences' element value. Другие причины отличия (указать подробности)
     * 
     * @param commentsOtherReasonsDifferences
     */
    public void setCommentsOtherReasonsDifferences(
            String commentsOtherReasonsDifferences) {
        this.commentsOtherReasonsDifferences = commentsOtherReasonsDifferences;
    }

    /** 
     * Get the 'KeepCorrespondence' element value. Признак того, что у покупателя сохранилась переписка
     * 
     * @return value
     */
    public String getKeepCorrespondence() {
        return keepCorrespondence;
    }

    /** 
     * Set the 'KeepCorrespondence' element value. Признак того, что у покупателя сохранилась переписка
     * 
     * @param keepCorrespondence
     */
    public void setKeepCorrespondence(String keepCorrespondence) {
        this.keepCorrespondence = keepCorrespondence;
    }

    /** 
     * Get the 'GrantCorrespondence' element value. Признак возможности представления переписки  таможенным органам
     * 
     * @return value
     */
    public String getGrantCorrespondence() {
        return grantCorrespondence;
    }

    /** 
     * Set the 'GrantCorrespondence' element value. Признак возможности представления переписки  таможенным органам
     * 
     * @param grantCorrespondence
     */
    public void setGrantCorrespondence(String grantCorrespondence) {
        this.grantCorrespondence = grantCorrespondence;
    }

    /** 
     * Get the list of 'ReasonGrantCorrespondence' element items. Причина, по которой не может быть представлена переписка таможенным органам.
     * 
     * @return list
     */
    public List<String> getReasonGrantCorrespondenceList() {
        return reasonGrantCorrespondenceList;
    }

    /** 
     * Set the list of 'ReasonGrantCorrespondence' element items. Причина, по которой не может быть представлена переписка таможенным органам.
     * 
     * @param list
     */
    public void setReasonGrantCorrespondenceList(List<String> list) {
        reasonGrantCorrespondenceList = list;
    }

    /** 
     * Get the 'PubliclyOffer' element value. Признак того, что первоначальная цена предложения является публичной офертой (в терминах ст. 494 Гражданского кодекса Российской Федерации)
     * 
     * @return value
     */
    public String getPubliclyOffer() {
        return publiclyOffer;
    }

    /** 
     * Set the 'PubliclyOffer' element value. Признак того, что первоначальная цена предложения является публичной офертой (в терминах ст. 494 Гражданского кодекса Российской Федерации)
     * 
     * @param publiclyOffer
     */
    public void setPubliclyOffer(String publiclyOffer) {
        this.publiclyOffer = publiclyOffer;
    }

    /** 
     * Get the 'Discount' element value. Отличие вызвано скидкой
     * 
     * @return value
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /** 
     * Set the 'Discount' element value. Отличие вызвано скидкой
     * 
     * @param discount
     */
    public void setDiscount(DiscountType discount) {
        this.discount = discount;
    }

    /** 
     * Get the 'NonStandardSituationMarket' element value. Отличие вызвано нестандартной ситуацией на рынке
     * 
     * @return value
     */
    public NonStandardSituationMarketType getNonStandardSituationMarket() {
        return nonStandardSituationMarket;
    }

    /** 
     * Set the 'NonStandardSituationMarket' element value. Отличие вызвано нестандартной ситуацией на рынке
     * 
     * @param nonStandardSituationMarket
     */
    public void setNonStandardSituationMarket(
            NonStandardSituationMarketType nonStandardSituationMarket) {
        this.nonStandardSituationMarket = nonStandardSituationMarket;
    }

    /** 
     * Get the 'PositionSeller' element value. Отличие вызвано положением Продавца
     * 
     * @return value
     */
    public PositionSellerType getPositionSeller() {
        return positionSeller;
    }

    /** 
     * Set the 'PositionSeller' element value. Отличие вызвано положением Продавца
     * 
     * @param positionSeller
     */
    public void setPositionSeller(PositionSellerType positionSeller) {
        this.positionSeller = positionSeller;
    }

    /** 
     * Get the 'SpecialRelationship' element value. Отличие вызвано особыми отношениями Продавца и покупателя
     * 
     * @return value
     */
    public SpecialRelationshipType getSpecialRelationship() {
        return specialRelationship;
    }

    /** 
     * Set the 'SpecialRelationship' element value. Отличие вызвано особыми отношениями Продавца и покупателя
     * 
     * @param specialRelationship
     */
    public void setSpecialRelationship(
            SpecialRelationshipType specialRelationship) {
        this.specialRelationship = specialRelationship;
    }

    /** 
     * Get the 'AlignmentPrices' element value. Согласование цены сделки.
     * 
     * @return value
     */
    public AlignmentPricesType getAlignmentPrices() {
        return alignmentPrices;
    }

    /** 
     * Set the 'AlignmentPrices' element value. Согласование цены сделки.
     * 
     * @param alignmentPrices
     */
    public void setAlignmentPrices(AlignmentPricesType alignmentPrices) {
        this.alignmentPrices = alignmentPrices;
    }

    /** 
     * Get the 'ExpressPubliclyOffer' element value. Каким образом была выражена публичная оферта Продавца.
     * 
     * @return value
     */
    public ExpressPubliclyOfferType getExpressPubliclyOffer() {
        return expressPubliclyOffer;
    }

    /** 
     * Set the 'ExpressPubliclyOffer' element value. Каким образом была выражена публичная оферта Продавца.
     * 
     * @param expressPubliclyOffer
     */
    public void setExpressPubliclyOffer(
            ExpressPubliclyOfferType expressPubliclyOffer) {
        this.expressPubliclyOffer = expressPubliclyOffer;
    }

    /** 
     * Get the 'ValueFormingPrice' element value. Известно ли покупателю, исходя из какой величины формировалась цена первоначального предложения.
     * 
     * @return value
     */
    public ValueFormingPriceType getValueFormingPrice() {
        return valueFormingPrice;
    }

    /** 
     * Set the 'ValueFormingPrice' element value. Известно ли покупателю, исходя из какой величины формировалась цена первоначального предложения.
     * 
     * @param valueFormingPrice
     */
    public void setValueFormingPrice(ValueFormingPriceType valueFormingPrice) {
        this.valueFormingPrice = valueFormingPrice;
    }
}
