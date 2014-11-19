
package ru.acs.fts.schemas.album.billoflading;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.VesselType;

/** 
 * ����������
 */
public class BillofLadingType extends BaseDocType
{
    private String languageCode;
    private String copyNumber;
    private String clause;
    private String BOLDescription;
    private String PIRegID;
    private RegistrationDocumentType registrationDocument;
    private VesselType vessel;
    private PortLoadType loading;
    private PortLoadType unloading;
    private OrganizationType carrier;
    private OrganizationType consignee;
    private OrganizationType consignor;
    private FreightType freight;
    private DestinationType destination;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private PersonNamePostTypeType documentSignature;
    private ReceiptOrDeliveryPlaceType placeOfDelivery;
    private ReceiptOrDeliveryPlaceType placeOfReceipt;
    private MarkType mark;
    private String documentModeID;

    /** 
     * Get the 'LanguageCode' element value. ��� ����� �����������
     * 
     * @return value
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /** 
     * Set the 'LanguageCode' element value. ��� ����� �����������
     * 
     * @param languageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /** 
     * Get the 'CopyNumber' element value. ����� ������������ ����������� �����������, ����������� ���� �� ������ ��� ����.
     * 
     * @return value
     */
    public String getCopyNumber() {
        return copyNumber;
    }

    /** 
     * Set the 'CopyNumber' element value. ����� ������������ ����������� �����������, ����������� ���� �� ������ ��� ����.
     * 
     * @param copyNumber
     */
    public void setCopyNumber(String copyNumber) {
        this.copyNumber = copyNumber;
    }

    /** 
     * Get the 'Clause' element value. ������ �������� � ��������������� ������� � ���, ��� ���� ������ ��� ����� ������������ �� ������
     * 
     * @return value
     */
    public String getClause() {
        return clause;
    }

    /** 
     * Set the 'Clause' element value. ������ �������� � ��������������� ������� � ���, ��� ���� ������ ��� ����� ������������ �� ������
     * 
     * @param clause
     */
    public void setClause(String clause) {
        this.clause = clause;
    }

    /** 
     * Get the 'BOLDescription' element value. ��� ����������� (������� ����������) ��� ��������, ��� ���������� ����� "������� �����������", ���� ������������ ���������� � ���������, ��� ���������� ����� "������� ����������" (�������� ����������), ��� ��������, ��� ���������� ����� �� ������������ (���������� �� ������������); ���� � �������� ����������� �� �������, ��� �� ��������� "������� ����������", �� �� ��������� ������������ "������� �����������"
     * 
     * @return value
     */
    public String getBOLDescription() {
        return BOLDescription;
    }

    /** 
     * Set the 'BOLDescription' element value. ��� ����������� (������� ����������) ��� ��������, ��� ���������� ����� "������� �����������", ���� ������������ ���������� � ���������, ��� ���������� ����� "������� ����������" (�������� ����������), ��� ��������, ��� ���������� ����� �� ������������ (���������� �� ������������); ���� � �������� ����������� �� �������, ��� �� ��������� "������� ����������", �� �� ��������� ������������ "������� �����������"
     * 
     * @param BOLDescription
     */
    public void setBOLDescription(String BOLDescription) {
        this.BOLDescription = BOLDescription;
    }

    /** 
     * Get the 'PI_RegID' element value. ��������������� ������������� ��������������� ����������
     * 
     * @return value
     */
    public String getPIRegID() {
        return PIRegID;
    }

    /** 
     * Set the 'PI_RegID' element value. ��������������� ������������� ��������������� ����������
     * 
     * @param PIRegID
     */
    public void setPIRegID(String PIRegID) {
        this.PIRegID = PIRegID;
    }

    /** 
     * Get the 'RegistrationDocument' element value. ���������� � ����������� �����������
     * 
     * @return value
     */
    public RegistrationDocumentType getRegistrationDocument() {
        return registrationDocument;
    }

    /** 
     * Set the 'RegistrationDocument' element value. ���������� � ����������� �����������
     * 
     * @param registrationDocument
     */
    public void setRegistrationDocument(
            RegistrationDocumentType registrationDocument) {
        this.registrationDocument = registrationDocument;
    }

    /** 
     * Get the 'Vessel' element value. ��������� �����
     * 
     * @return value
     */
    public VesselType getVessel() {
        return vessel;
    }

    /** 
     * Set the 'Vessel' element value. ��������� �����
     * 
     * @param vessel
     */
    public void setVessel(VesselType vessel) {
        this.vessel = vessel;
    }

    /** 
     * Get the 'Loading' element value. ���������� � �������� �����
     * 
     * @return value
     */
    public PortLoadType getLoading() {
        return loading;
    }

    /** 
     * Set the 'Loading' element value. ���������� � �������� �����
     * 
     * @param loading
     */
    public void setLoading(PortLoadType loading) {
        this.loading = loading;
    }

    /** 
     * Get the 'Unloading' element value. ���������� � ��������� �����
     * 
     * @return value
     */
    public PortLoadType getUnloading() {
        return unloading;
    }

    /** 
     * Set the 'Unloading' element value. ���������� � ��������� �����
     * 
     * @param unloading
     */
    public void setUnloading(PortLoadType unloading) {
        this.unloading = unloading;
    }

    /** 
     * Get the 'Carrier' element value. ���������� � �����������
     * 
     * @return value
     */
    public OrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ���������� � �����������
     * 
     * @param carrier
     */
    public void setCarrier(OrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'Consignee' element value. ���������� � ����������
     * 
     * @return value
     */
    public OrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������� � ����������
     * 
     * @param consignee
     */
    public void setConsignee(OrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'Consignor' element value. ���������� �� �����������
     * 
     * @return value
     */
    public OrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ���������� �� �����������
     * 
     * @param consignor
     */
    public void setConsignor(OrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Freight' element value. ���������� � ��������, ������������� ����������� 
     * 
     * @return value
     */
    public FreightType getFreight() {
        return freight;
    }

    /** 
     * Set the 'Freight' element value. ���������� � ��������, ������������� ����������� 
     * 
     * @param freight
     */
    public void setFreight(FreightType freight) {
        this.freight = freight;
    }

    /** 
     * Get the 'Destination' element value. ����� ���������� ����� ����, ��� ������� �������, ����� ���������� ��� ����������� ����� 
     * 
     * @return value
     */
    public DestinationType getDestination() {
        return destination;
    }

    /** 
     * Set the 'Destination' element value. ����� ���������� ����� ����, ��� ������� �������, ����� ���������� ��� ����������� ����� 
     * 
     * @param destination
     */
    public void setDestination(DestinationType destination) {
        this.destination = destination;
    }

    /** 
     * Get the list of 'Goods' element items. �������� �����.
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� �����.
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'DocumentSignature' element value. ������� ��������� ���������, ������� ������� ��� �����-���� ������ �����, ���������� ������� �������������� �� �� ���������
     * 
     * @return value
     */
    public PersonNamePostTypeType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. ������� ��������� ���������, ������� ������� ��� �����-���� ������ �����, ���������� ������� �������������� �� �� ���������
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonNamePostTypeType documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the 'PlaceOfDelivery' element value. ����� ��������. �����, �� �������� ��������� ���������� �������� ������ ����������. ���� ��������� �� ������������� ����, �� ����������� ����� ���������� ��������� ������ ��������
     * 
     * @return value
     */
    public ReceiptOrDeliveryPlaceType getPlaceOfDelivery() {
        return placeOfDelivery;
    }

    /** 
     * Set the 'PlaceOfDelivery' element value. ����� ��������. �����, �� �������� ��������� ���������� �������� ������ ����������. ���� ��������� �� ������������� ����, �� ����������� ����� ���������� ��������� ������ ��������
     * 
     * @param placeOfDelivery
     */
    public void setPlaceOfDelivery(ReceiptOrDeliveryPlaceType placeOfDelivery) {
        this.placeOfDelivery = placeOfDelivery;
    }

    /** 
     * Get the 'PlaceOfReceipt' element value. ����� ��������� ����� ������������
     * 
     * @return value
     */
    public ReceiptOrDeliveryPlaceType getPlaceOfReceipt() {
        return placeOfReceipt;
    }

    /** 
     * Set the 'PlaceOfReceipt' element value. ����� ��������� ����� ������������
     * 
     * @param placeOfReceipt
     */
    public void setPlaceOfReceipt(ReceiptOrDeliveryPlaceType placeOfReceipt) {
        this.placeOfReceipt = placeOfReceipt;
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
