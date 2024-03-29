
package ru.acs.fts.schemas.album.cmr;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.DocumentType;

/** 
 * ������������ ���������
 */
public class CMRType extends BaseDocType
{
    private String languageCode;
    private String carrierNotice;
    private String goodsQuantity;
    private String goodsCost;
    private String stampSign;
    private RegistrationDocumentType registrationDocument;
    private CMRConsignorType consignor;
    private OrganizationType consignee;
    private CMRCarrierType carrier;
    private AddressType deliveryPlace;
    private CarrierType nextCarrier;
    private List<DocumentType> enclosedDocumentList = new ArrayList<DocumentType>();
    private List<CMRGoodsType> CMRGoodList = new ArrayList<CMRGoodsType>();
    private ConsigneeCustomsType consigneeCustoms;
    private CMRDeliveryTermsType deliveryTerms;
    private CMRTransportType CMRTransport;
    private TakingCargoType takingCargo;
    private int choiceSelect = -1;
    private static final int CMR_GOODS_WEIGHT_CHOICE = 0;
    private static final int CMR_SUPPLEMENTARY_QUANTITY_CHOICE = 1;
    private CMRGoodsWeightType CMRGoodsWeight;
    private SupplementaryQuantityType CMRSupplementaryQuantity;
    private CMRTransportCostType CMRTransportCost;
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'LanguageCode' element value. ��� ����� ���������
     * 
     * @return value
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /** 
     * Set the 'LanguageCode' element value. ��� ����� ���������
     * 
     * @param languageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /** 
     * Get the 'CarrierNotice' element value. �������� � ��������� ����������� (��.18)
     * 
     * @return value
     */
    public String getCarrierNotice() {
        return carrierNotice;
    }

    /** 
     * Set the 'CarrierNotice' element value. �������� � ��������� ����������� (��.18)
     * 
     * @param carrierNotice
     */
    public void setCarrierNotice(String carrierNotice) {
        this.carrierNotice = carrierNotice;
    }

    /** 
     * Get the 'GoodsQuantity' element value. ����� ���������� ������������ ����� 
     * 
     * @return value
     */
    public String getGoodsQuantity() {
        return goodsQuantity;
    }

    /** 
     * Set the 'GoodsQuantity' element value. ����� ���������� ������������ ����� 
     * 
     * @param goodsQuantity
     */
    public void setGoodsQuantity(String goodsQuantity) {
        this.goodsQuantity = goodsQuantity;
    }

    /** 
     * Get the 'GoodsCost' element value. ����������� ��������� �����
     * 
     * @return value
     */
    public String getGoodsCost() {
        return goodsCost;
    }

    /** 
     * Set the 'GoodsCost' element value. ����������� ��������� �����
     * 
     * @param goodsCost
     */
    public void setGoodsCost(String goodsCost) {
        this.goodsCost = goodsCost;
    }

    /** 
     * Get the 'StampSign' element value. ������� ����������� ������
     * 
     * @return value
     */
    public String getStampSign() {
        return stampSign;
    }

    /** 
     * Set the 'StampSign' element value. ������� ����������� ������
     * 
     * @param stampSign
     */
    public void setStampSign(String stampSign) {
        this.stampSign = stampSign;
    }

    /** 
     * Get the 'RegistrationDocument' element value. �������� � ����������� ���������
     * 
     * @return value
     */
    public RegistrationDocumentType getRegistrationDocument() {
        return registrationDocument;
    }

    /** 
     * Set the 'RegistrationDocument' element value. �������� � ����������� ���������
     * 
     * @param registrationDocument
     */
    public void setRegistrationDocument(
            RegistrationDocumentType registrationDocument) {
        this.registrationDocument = registrationDocument;
    }

    /** 
     * Get the 'Consignor' element value. �������� � ���������������� (��.1)
     * 
     * @return value
     */
    public CMRConsignorType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �������� � ���������������� (��.1)
     * 
     * @param consignor
     */
    public void setConsignor(CMRConsignorType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. �������� � ��������������� (��.2)
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. �������� � ��������������� (��.2)
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Carrier' element value. �������� � ����������� (��.16)
     * 
     * @return value
     */
    public CMRCarrierType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. �������� � ����������� (��.16)
     * 
     * @param carrier
     */
    public void setCarrier(CMRCarrierType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'DeliveryPlace' element value. ������. ����� ��������.
     * 
     * @return value
     */
    public AddressType getDeliveryPlace() {
        return deliveryPlace;
    }

    /** 
     * Set the 'DeliveryPlace' element value. ������. ����� ��������.
     * 
     * @param deliveryPlace
     */
    public void setDeliveryPlace(AddressType deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    /** 
     * Get the 'NextCarrier' element value. �������� � ����������� ����������� (��.17)
     * 
     * @return value
     */
    public CarrierType getNextCarrier() {
        return nextCarrier;
    }

    /** 
     * Set the 'NextCarrier' element value. �������� � ����������� ����������� (��.17)
     * 
     * @param nextCarrier
     */
    public void setNextCarrier(CarrierType nextCarrier) {
        this.nextCarrier = nextCarrier;
    }

    /** 
     * Get the list of 'EnclosedDocument' element items. �������� ����������� ���������� � ��������� CMR (��.5)
     * 
     * @return list
     */
    public List<DocumentType> getEnclosedDocumentList() {
        return enclosedDocumentList;
    }

    /** 
     * Set the list of 'EnclosedDocument' element items. �������� ����������� ���������� � ��������� CMR (��.5)
     * 
     * @param list
     */
    public void setEnclosedDocumentList(List<DocumentType> list) {
        enclosedDocumentList = list;
    }

    /** 
     * Get the list of 'CMRGoods' element items. �������� � ������� (��.6,7,9,10,11,12)
     * 
     * @return list
     */
    public List<CMRGoodsType> getCMRGoodList() {
        return CMRGoodList;
    }

    /** 
     * Set the list of 'CMRGoods' element items. �������� � ������� (��.6,7,9,10,11,12)
     * 
     * @param list
     */
    public void setCMRGoodList(List<CMRGoodsType> list) {
        CMRGoodList = list;
    }

    /** 
     * Get the 'ConsigneeCustoms' element value. �������� � ���������� ������ ���������� 
     * 
     * @return value
     */
    public ConsigneeCustomsType getConsigneeCustoms() {
        return consigneeCustoms;
    }

    /** 
     * Set the 'ConsigneeCustoms' element value. �������� � ���������� ������ ���������� 
     * 
     * @param consigneeCustoms
     */
    public void setConsigneeCustoms(ConsigneeCustomsType consigneeCustoms) {
        this.consigneeCustoms = consigneeCustoms;
    }

    /** 
     * Get the 'DeliveryTerms' element value. �������� ������� �������� CMR 
     * 
     * @return value
     */
    public CMRDeliveryTermsType getDeliveryTerms() {
        return deliveryTerms;
    }

    /** 
     * Set the 'DeliveryTerms' element value. �������� ������� �������� CMR 
     * 
     * @param deliveryTerms
     */
    public void setDeliveryTerms(CMRDeliveryTermsType deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
    }

    /** 
     * Get the 'CMRTransport' element value. ������� ��������������� (��.14,15,20,25,26)
     * 
     * @return value
     */
    public CMRTransportType getCMRTransport() {
        return CMRTransport;
    }

    /** 
     * Set the 'CMRTransport' element value. ������� ��������������� (��.14,15,20,25,26)
     * 
     * @param CMRTransport
     */
    public void setCMRTransport(CMRTransportType CMRTransport) {
        this.CMRTransport = CMRTransport;
    }

    /** 
     * Get the 'TakingCargo' element value. ���������� � �������� ����� � ���������
     * 
     * @return value
     */
    public TakingCargoType getTakingCargo() {
        return takingCargo;
    }

    /** 
     * Set the 'TakingCargo' element value. ���������� � �������� ����� � ���������
     * 
     * @param takingCargo
     */
    public void setTakingCargo(TakingCargoType takingCargo) {
        this.takingCargo = takingCargo;
    }

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if CMRGoodsWeight is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCMRGoodsWeight() {
        return choiceSelect == CMR_GOODS_WEIGHT_CHOICE;
    }

    /** 
     * Get the 'CMRGoodsWeight' element value. ����� ��� (��. 11)
     * 
     * @return value
     */
    public CMRGoodsWeightType getCMRGoodsWeight() {
        return CMRGoodsWeight;
    }

    /** 
     * Set the 'CMRGoodsWeight' element value. ����� ��� (��. 11)
     * 
     * @param CMRGoodsWeight
     */
    public void setCMRGoodsWeight(CMRGoodsWeightType CMRGoodsWeight) {
        setChoiceSelect(CMR_GOODS_WEIGHT_CHOICE);
        this.CMRGoodsWeight = CMRGoodsWeight;
    }

    /** 
     * Check if CMRSupplementaryQuantity is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCMRSupplementaryQuantity() {
        return choiceSelect == CMR_SUPPLEMENTARY_QUANTITY_CHOICE;
    }

    /** 
     * Get the 'CMR_SupplementaryQuantity' element value. ���������� �����, ���������� � �������������� �������� ���������.
     * 
     * @return value
     */
    public SupplementaryQuantityType getCMRSupplementaryQuantity() {
        return CMRSupplementaryQuantity;
    }

    /** 
     * Set the 'CMR_SupplementaryQuantity' element value. ���������� �����, ���������� � �������������� �������� ���������.
     * 
     * @param CMRSupplementaryQuantity
     */
    public void setCMRSupplementaryQuantity(
            SupplementaryQuantityType CMRSupplementaryQuantity) {
        setChoiceSelect(CMR_SUPPLEMENTARY_QUANTITY_CHOICE);
        this.CMRSupplementaryQuantity = CMRSupplementaryQuantity;
    }

    /** 
     * Get the 'CMRTransportCost' element value. ���������� � ��������, ��������� � ���������� ����� (������������ ��� ���������� ����� 19).
     * 
     * @return value
     */
    public CMRTransportCostType getCMRTransportCost() {
        return CMRTransportCost;
    }

    /** 
     * Set the 'CMRTransportCost' element value. ���������� � ��������, ��������� � ���������� ����� (������������ ��� ���������� ����� 19).
     * 
     * @param CMRTransportCost
     */
    public void setCMRTransportCost(CMRTransportCostType CMRTransportCost) {
        this.CMRTransportCost = CMRTransportCost;
    }

    /** 
     * Get the 'Mark' element value. ������� � ����������� �������� ����������� � ���� ����� ���������������� ��������.
     * 
     * @return value
     */
    public MarkType getMark() {
        return mark;
    }

    /** 
     * Set the 'Mark' element value. ������� � ����������� �������� ����������� � ���� ����� ���������������� ��������.
     * 
     * @param mark
     */
    public void setMark(MarkType mark) {
        this.mark = mark;
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
