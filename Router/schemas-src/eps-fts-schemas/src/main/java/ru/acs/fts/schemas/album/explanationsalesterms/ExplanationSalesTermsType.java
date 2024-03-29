
package ru.acs.fts.schemas.album.explanationsalesterms;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������� �� �������� �������, ������� ����� �������� �� ���� ������.
 */
public class ExplanationSalesTermsType extends BaseDocType
{
    private List<String> commentList = new ArrayList<String>();
    private HistoryCooperationType historyCooperation;
    private ChoiceOrderGoodsType choiceOrderGoods;
    private PricingTransactionsType pricingTransactions;
    private InfoContractDeliveryTermsType infoContractDeliveryTerms;
    private SaleGoodsDomesticMarketType saleGoodsDomesticMarket;
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the list of 'Comments' element items. �������������� ������
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. �������������� ������
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'HistoryCooperation' element value. ������� �������������� �������� � ����������
     * 
     * @return value
     */
    public HistoryCooperationType getHistoryCooperation() {
        return historyCooperation;
    }

    /** 
     * Set the 'HistoryCooperation' element value. ������� �������������� �������� � ����������
     * 
     * @param historyCooperation
     */
    public void setHistoryCooperation(HistoryCooperationType historyCooperation) {
        this.historyCooperation = historyCooperation;
    }

    /** 
     * Get the 'ChoiceOrderGoods' element value. ����� � ����� ������
     * 
     * @return value
     */
    public ChoiceOrderGoodsType getChoiceOrderGoods() {
        return choiceOrderGoods;
    }

    /** 
     * Set the 'ChoiceOrderGoods' element value. ����� � ����� ������
     * 
     * @param choiceOrderGoods
     */
    public void setChoiceOrderGoods(ChoiceOrderGoodsType choiceOrderGoods) {
        this.choiceOrderGoods = choiceOrderGoods;
    }

    /** 
     * Get the 'PricingTransactions' element value. ������������ ���� ������
     * 
     * @return value
     */
    public PricingTransactionsType getPricingTransactions() {
        return pricingTransactions;
    }

    /** 
     * Set the 'PricingTransactions' element value. ������������ ���� ������
     * 
     * @param pricingTransactions
     */
    public void setPricingTransactions(
            PricingTransactionsType pricingTransactions) {
        this.pricingTransactions = pricingTransactions;
    }

    /** 
     * Get the 'InfoContractDeliveryTerms' element value. �������� � �������� � �������� ��������
     * 
     * @return value
     */
    public InfoContractDeliveryTermsType getInfoContractDeliveryTerms() {
        return infoContractDeliveryTerms;
    }

    /** 
     * Set the 'InfoContractDeliveryTerms' element value. �������� � �������� � �������� ��������
     * 
     * @param infoContractDeliveryTerms
     */
    public void setInfoContractDeliveryTerms(
            InfoContractDeliveryTermsType infoContractDeliveryTerms) {
        this.infoContractDeliveryTerms = infoContractDeliveryTerms;
    }

    /** 
     * Get the 'SaleGoodsDomesticMarket' element value. ���������� ������� �� ���������� �����
     * 
     * @return value
     */
    public SaleGoodsDomesticMarketType getSaleGoodsDomesticMarket() {
        return saleGoodsDomesticMarket;
    }

    /** 
     * Set the 'SaleGoodsDomesticMarket' element value. ���������� ������� �� ���������� �����
     * 
     * @param saleGoodsDomesticMarket
     */
    public void setSaleGoodsDomesticMarket(
            SaleGoodsDomesticMarketType saleGoodsDomesticMarket) {
        this.saleGoodsDomesticMarket = saleGoodsDomesticMarket;
    }

    /** 
     * Get the 'PersonSignature' element value. �������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. �������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
