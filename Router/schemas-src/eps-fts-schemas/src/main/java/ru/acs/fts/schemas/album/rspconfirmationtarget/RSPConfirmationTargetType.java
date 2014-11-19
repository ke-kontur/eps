
package ru.acs.fts.schemas.album.rspconfirmationtarget;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������������� � ������� ���������� ������� �������� � ������ �������������� �������������� �� � ������� ������������ � ������������� ������������ ������������, � ��� ����� �������� ����� �� ������� ����������� ���������
 */
public class RSPConfirmationTargetType extends BaseDocType
{
    private String BDRDID;
    private String departureCountry;
    private String originCountry;
    private String additionalInfo;
    private String goodsValue;
    private String contractCurrency;
    private String statisticalGoodsValue;
    private ConfirmationType confirmation;
    private DocumentBaseType agreement;
    private DocumentBaseType contract;
    private ParticipantType recipinet;
    private ParticipantType seller;
    private AuthorizedPersonType authorizedPerson;
    private List<GoodsDescriptionType> goodsDescriptionList = new ArrayList<GoodsDescriptionType>();
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DepartureCountry' element value. ������ �����������
     * 
     * @return value
     */
    public String getDepartureCountry() {
        return departureCountry;
    }

    /** 
     * Set the 'DepartureCountry' element value. ������ �����������
     * 
     * @param departureCountry
     */
    public void setDepartureCountry(String departureCountry) {
        this.departureCountry = departureCountry;
    }

    /** 
     * Get the 'OriginCountry' element value. ������ �������������
     * 
     * @return value
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. ������ �������������
     * 
     * @param originCountry
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /** 
     * Get the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @return value
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. �������������� ����������
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the 'GoodsValue' element value. ��������� ������ � ������ ���������
     * 
     * @return value
     */
    public String getGoodsValue() {
        return goodsValue;
    }

    /** 
     * Set the 'GoodsValue' element value. ��������� ������ � ������ ���������
     * 
     * @param goodsValue
     */
    public void setGoodsValue(String goodsValue) {
        this.goodsValue = goodsValue;
    }

    /** 
     * Get the 'ContractCurrency' element value. ������ ���������
     * 
     * @return value
     */
    public String getContractCurrency() {
        return contractCurrency;
    }

    /** 
     * Set the 'ContractCurrency' element value. ������ ���������
     * 
     * @param contractCurrency
     */
    public void setContractCurrency(String contractCurrency) {
        this.contractCurrency = contractCurrency;
    }

    /** 
     * Get the 'StatisticalGoodsValue' element value. �������������� ��������� ������ (USD)
     * 
     * @return value
     */
    public String getStatisticalGoodsValue() {
        return statisticalGoodsValue;
    }

    /** 
     * Set the 'StatisticalGoodsValue' element value. �������������� ��������� ������ (USD)
     * 
     * @param statisticalGoodsValue
     */
    public void setStatisticalGoodsValue(String statisticalGoodsValue) {
        this.statisticalGoodsValue = statisticalGoodsValue;
    }

    /** 
     * Get the 'Confirmation' element value. �������������
     * 
     * @return value
     */
    public ConfirmationType getConfirmation() {
        return confirmation;
    }

    /** 
     * Set the 'Confirmation' element value. �������������
     * 
     * @param confirmation
     */
    public void setConfirmation(ConfirmationType confirmation) {
        this.confirmation = confirmation;
    }

    /** 
     * Get the 'Agreement' element value. �������� � ������������� ���������� (��������), � ������ �������� �������� ������
     * 
     * @return value
     */
    public DocumentBaseType getAgreement() {
        return agreement;
    }

    /** 
     * Set the 'Agreement' element value. �������� � ������������� ���������� (��������), � ������ �������� �������� ������
     * 
     * @param agreement
     */
    public void setAgreement(DocumentBaseType agreement) {
        this.agreement = agreement;
    }

    /** 
     * Get the 'Contract' element value. ��������
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ��������
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'Recipinet' element value. �������� � ���������� ������� (����������)
     * 
     * @return value
     */
    public ParticipantType getRecipinet() {
        return recipinet;
    }

    /** 
     * Set the 'Recipinet' element value. �������� � ���������� ������� (����������)
     * 
     * @param recipinet
     */
    public void setRecipinet(ParticipantType recipinet) {
        this.recipinet = recipinet;
    }

    /** 
     * Get the 'Seller' element value. �������� � ��������
     * 
     * @return value
     */
    public ParticipantType getSeller() {
        return seller;
    }

    /** 
     * Set the 'Seller' element value. �������� � ��������
     * 
     * @param seller
     */
    public void setSeller(ParticipantType seller) {
        this.seller = seller;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����
     * 
     * @return value
     */
    public AuthorizedPersonType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(AuthorizedPersonType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. �������� �������
     * 
     * @return list
     */
    public List<GoodsDescriptionType> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. �������� �������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<GoodsDescriptionType> list) {
        goodsDescriptionList = list;
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
