
package ru.acs.fts.schemas.album.explanationsalesterms;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������������ ���� ������
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
     * Get the 'PriceLeve' element value. ������� ������� � ���������� ���������� �� ������ �������� ��� �� ������ ���� ������
     * 
     * @return value
     */
    public String getPriceLeve() {
        return priceLeve;
    }

    /** 
     * Set the 'PriceLeve' element value. ������� ������� � ���������� ���������� �� ������ �������� ��� �� ������ ���� ������
     * 
     * @param priceLeve
     */
    public void setPriceLeve(String priceLeve) {
        this.priceLeve = priceLeve;
    }

    /** 
     * Get the 'InitialOfferPriceAppropriateLevel' element value. ������� ����, ��� �������������� ����  ����������� ��������������� ������ ������ ���
     * 
     * @return value
     */
    public String getInitialOfferPriceAppropriateLevel() {
        return initialOfferPriceAppropriateLevel;
    }

    /** 
     * Set the 'InitialOfferPriceAppropriateLevel' element value. ������� ����, ��� �������������� ����  ����������� ��������������� ������ ������ ���
     * 
     * @param initialOfferPriceAppropriateLevel
     */
    public void setInitialOfferPriceAppropriateLevel(
            String initialOfferPriceAppropriateLevel) {
        this.initialOfferPriceAppropriateLevel = initialOfferPriceAppropriateLevel;
    }

    /** 
     * Get the 'PercentageDeviation' element value. ������� ����������
     * 
     * @return value
     */
    public String getPercentageDeviation() {
        return percentageDeviation;
    }

    /** 
     * Set the 'PercentageDeviation' element value. ������� ����������
     * 
     * @param percentageDeviation
     */
    public void setPercentageDeviation(String percentageDeviation) {
        this.percentageDeviation = percentageDeviation;
    }

    /** 
     * Get the 'SalePriceInitialOfferPrice' element value. ������� ����, ��� ���� ������ ��������� � �������������� ����� �����������
     * 
     * @return value
     */
    public String getSalePriceInitialOfferPrice() {
        return salePriceInitialOfferPrice;
    }

    /** 
     * Set the 'SalePriceInitialOfferPrice' element value. ������� ����, ��� ���� ������ ��������� � �������������� ����� �����������
     * 
     * @param salePriceInitialOfferPrice
     */
    public void setSalePriceInitialOfferPrice(String salePriceInitialOfferPrice) {
        this.salePriceInitialOfferPrice = salePriceInitialOfferPrice;
    }

    /** 
     * Get the 'PercentageDifferences' element value. ������� ������� �� �������������� ����.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @return value
     */
    public String getPercentageDifferences() {
        return percentageDifferences;
    }

    /** 
     * Set the 'PercentageDifferences' element value. ������� ������� �� �������������� ����.���� �������� ����: "true" - ��; "false" - ���.
     * 
     * @param percentageDifferences
     */
    public void setPercentageDifferences(String percentageDifferences) {
        this.percentageDifferences = percentageDifferences;
    }

    /** 
     * Get the 'OtherReasonsDifferences' element value. ������ ������� �������
     * 
     * @return value
     */
    public String getOtherReasonsDifferences() {
        return otherReasonsDifferences;
    }

    /** 
     * Set the 'OtherReasonsDifferences' element value. ������ ������� �������
     * 
     * @param otherReasonsDifferences
     */
    public void setOtherReasonsDifferences(String otherReasonsDifferences) {
        this.otherReasonsDifferences = otherReasonsDifferences;
    }

    /** 
     * Get the 'CommentsOtherReasonsDifferences' element value. ������ ������� ������� (������� �����������)
     * 
     * @return value
     */
    public String getCommentsOtherReasonsDifferences() {
        return commentsOtherReasonsDifferences;
    }

    /** 
     * Set the 'CommentsOtherReasonsDifferences' element value. ������ ������� ������� (������� �����������)
     * 
     * @param commentsOtherReasonsDifferences
     */
    public void setCommentsOtherReasonsDifferences(
            String commentsOtherReasonsDifferences) {
        this.commentsOtherReasonsDifferences = commentsOtherReasonsDifferences;
    }

    /** 
     * Get the 'KeepCorrespondence' element value. ������� ����, ��� � ���������� ����������� ���������
     * 
     * @return value
     */
    public String getKeepCorrespondence() {
        return keepCorrespondence;
    }

    /** 
     * Set the 'KeepCorrespondence' element value. ������� ����, ��� � ���������� ����������� ���������
     * 
     * @param keepCorrespondence
     */
    public void setKeepCorrespondence(String keepCorrespondence) {
        this.keepCorrespondence = keepCorrespondence;
    }

    /** 
     * Get the 'GrantCorrespondence' element value. ������� ����������� ������������� ���������  ���������� �������
     * 
     * @return value
     */
    public String getGrantCorrespondence() {
        return grantCorrespondence;
    }

    /** 
     * Set the 'GrantCorrespondence' element value. ������� ����������� ������������� ���������  ���������� �������
     * 
     * @param grantCorrespondence
     */
    public void setGrantCorrespondence(String grantCorrespondence) {
        this.grantCorrespondence = grantCorrespondence;
    }

    /** 
     * Get the list of 'ReasonGrantCorrespondence' element items. �������, �� ������� �� ����� ���� ������������ ��������� ���������� �������.
     * 
     * @return list
     */
    public List<String> getReasonGrantCorrespondenceList() {
        return reasonGrantCorrespondenceList;
    }

    /** 
     * Set the list of 'ReasonGrantCorrespondence' element items. �������, �� ������� �� ����� ���� ������������ ��������� ���������� �������.
     * 
     * @param list
     */
    public void setReasonGrantCorrespondenceList(List<String> list) {
        reasonGrantCorrespondenceList = list;
    }

    /** 
     * Get the 'PubliclyOffer' element value. ������� ����, ��� �������������� ���� ����������� �������� ��������� ������� (� �������� ��. 494 ������������ ������� ���������� ���������)
     * 
     * @return value
     */
    public String getPubliclyOffer() {
        return publiclyOffer;
    }

    /** 
     * Set the 'PubliclyOffer' element value. ������� ����, ��� �������������� ���� ����������� �������� ��������� ������� (� �������� ��. 494 ������������ ������� ���������� ���������)
     * 
     * @param publiclyOffer
     */
    public void setPubliclyOffer(String publiclyOffer) {
        this.publiclyOffer = publiclyOffer;
    }

    /** 
     * Get the 'Discount' element value. ������� ������� �������
     * 
     * @return value
     */
    public DiscountType getDiscount() {
        return discount;
    }

    /** 
     * Set the 'Discount' element value. ������� ������� �������
     * 
     * @param discount
     */
    public void setDiscount(DiscountType discount) {
        this.discount = discount;
    }

    /** 
     * Get the 'NonStandardSituationMarket' element value. ������� ������� ������������� ��������� �� �����
     * 
     * @return value
     */
    public NonStandardSituationMarketType getNonStandardSituationMarket() {
        return nonStandardSituationMarket;
    }

    /** 
     * Set the 'NonStandardSituationMarket' element value. ������� ������� ������������� ��������� �� �����
     * 
     * @param nonStandardSituationMarket
     */
    public void setNonStandardSituationMarket(
            NonStandardSituationMarketType nonStandardSituationMarket) {
        this.nonStandardSituationMarket = nonStandardSituationMarket;
    }

    /** 
     * Get the 'PositionSeller' element value. ������� ������� ���������� ��������
     * 
     * @return value
     */
    public PositionSellerType getPositionSeller() {
        return positionSeller;
    }

    /** 
     * Set the 'PositionSeller' element value. ������� ������� ���������� ��������
     * 
     * @param positionSeller
     */
    public void setPositionSeller(PositionSellerType positionSeller) {
        this.positionSeller = positionSeller;
    }

    /** 
     * Get the 'SpecialRelationship' element value. ������� ������� ������� ����������� �������� � ����������
     * 
     * @return value
     */
    public SpecialRelationshipType getSpecialRelationship() {
        return specialRelationship;
    }

    /** 
     * Set the 'SpecialRelationship' element value. ������� ������� ������� ����������� �������� � ����������
     * 
     * @param specialRelationship
     */
    public void setSpecialRelationship(
            SpecialRelationshipType specialRelationship) {
        this.specialRelationship = specialRelationship;
    }

    /** 
     * Get the 'AlignmentPrices' element value. ������������ ���� ������.
     * 
     * @return value
     */
    public AlignmentPricesType getAlignmentPrices() {
        return alignmentPrices;
    }

    /** 
     * Set the 'AlignmentPrices' element value. ������������ ���� ������.
     * 
     * @param alignmentPrices
     */
    public void setAlignmentPrices(AlignmentPricesType alignmentPrices) {
        this.alignmentPrices = alignmentPrices;
    }

    /** 
     * Get the 'ExpressPubliclyOffer' element value. ����� ������� ���� �������� ��������� ������ ��������.
     * 
     * @return value
     */
    public ExpressPubliclyOfferType getExpressPubliclyOffer() {
        return expressPubliclyOffer;
    }

    /** 
     * Set the 'ExpressPubliclyOffer' element value. ����� ������� ���� �������� ��������� ������ ��������.
     * 
     * @param expressPubliclyOffer
     */
    public void setExpressPubliclyOffer(
            ExpressPubliclyOfferType expressPubliclyOffer) {
        this.expressPubliclyOffer = expressPubliclyOffer;
    }

    /** 
     * Get the 'ValueFormingPrice' element value. �������� �� ����������, ������ �� ����� �������� ������������� ���� ��������������� �����������.
     * 
     * @return value
     */
    public ValueFormingPriceType getValueFormingPrice() {
        return valueFormingPrice;
    }

    /** 
     * Set the 'ValueFormingPrice' element value. �������� �� ����������, ������ �� ����� �������� ������������� ���� ��������������� �����������.
     * 
     * @param valueFormingPrice
     */
    public void setValueFormingPrice(ValueFormingPriceType valueFormingPrice) {
        this.valueFormingPrice = valueFormingPrice;
    }
}
