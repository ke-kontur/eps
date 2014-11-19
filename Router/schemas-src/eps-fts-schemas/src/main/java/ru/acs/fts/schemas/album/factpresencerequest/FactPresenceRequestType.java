
package ru.acs.fts.schemas.album.factpresencerequest;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ������ � ����� ������� ������� (� ����� ���������� ���������� ��������, ����������� ��� ���������� ����������� ��������/������ ���������� � �������������� ����������, ��������� � ����� 44)
 */
public class FactPresenceRequestType extends BaseDocType
{
    private String departureCountryCode;
    private LocalDate reqDate;
    private String reqTime;
    private CUOrganizationType consignor;
    private CUOrganizationType consignee;
    private CustomsType goodsLocationCustoms;
    private List<MarkType> markList = new ArrayList<MarkType>();
    private CustomsPersonType customsPerson;
    private CustomsType customs;
    private List<TransportMeanArriveType> transportMeanArriveList = new ArrayList<TransportMeanArriveType>();
    private List<Choice> choiceList = new ArrayList<Choice>();
    private CUOrganizationType declarant;
    private String documentModeID;

    /** 
     * Get the 'DepartureCountryCode' element value. ��� ������ �����������
     * 
     * @return value
     */
    public String getDepartureCountryCode() {
        return departureCountryCode;
    }

    /** 
     * Set the 'DepartureCountryCode' element value. ��� ������ �����������
     * 
     * @param departureCountryCode
     */
    public void setDepartureCountryCode(String departureCountryCode) {
        this.departureCountryCode = departureCountryCode;
    }

    /** 
     * Get the 'ReqDate' element value. ���� ������������ �������
     * 
     * @return value
     */
    public LocalDate getReqDate() {
        return reqDate;
    }

    /** 
     * Set the 'ReqDate' element value. ���� ������������ �������
     * 
     * @param reqDate
     */
    public void setReqDate(LocalDate reqDate) {
        this.reqDate = reqDate;
    }

    /** 
     * Get the 'ReqTime' element value. ����� ������������ �������
     * 
     * @return value
     */
    public String getReqTime() {
        return reqTime;
    }

    /** 
     * Set the 'ReqTime' element value. ����� ������������ �������
     * 
     * @param reqTime
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    /** 
     * Get the 'Consignor' element value. �����������
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. �����������
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ����������
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the 'GoodsLocationCustoms' element value. ���������� ����� ��������������� �������
     * 
     * @return value
     */
    public CustomsType getGoodsLocationCustoms() {
        return goodsLocationCustoms;
    }

    /** 
     * Set the 'GoodsLocationCustoms' element value. ���������� ����� ��������������� �������
     * 
     * @param goodsLocationCustoms
     */
    public void setGoodsLocationCustoms(CustomsType goodsLocationCustoms) {
        this.goodsLocationCustoms = goodsLocationCustoms;
    }

    /** 
     * Get the list of 'Marks' element items. ������� � ����������� �������� ����������� � ���� ����� ��������
     * 
     * @return list
     */
    public List<MarkType> getMarkList() {
        return markList;
    }

    /** 
     * Set the list of 'Marks' element items. ������� � ����������� �������� ����������� � ���� ����� ��������
     * 
     * @param list
     */
    public void setMarkList(List<MarkType> list) {
        markList = list;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. �������� � ���������� ������, �������������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. �������� � ���������� ������, �������������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the list of 'TransportMeanArrive' element items. �������� ������������� ��������
     * 
     * @return list
     */
    public List<TransportMeanArriveType> getTransportMeanArriveList() {
        return transportMeanArriveList;
    }

    /** 
     * Set the list of 'TransportMeanArrive' element items. �������� ������������� ��������
     * 
     * @param list
     */
    public void setTransportMeanArriveList(List<TransportMeanArriveType> list) {
        transportMeanArriveList = list;
    }

    /** 
     * Get the list of choice items.
     * 
     * @return list
     */
    public List<Choice> getChoiceList() {
        return choiceList;
    }

    /** 
     * Set the list of choice items.
     * 
     * @param list
     */
    public void setChoiceList(List<Choice> list) {
        choiceList = list;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ����������
     * 
     * @return value
     */
    public CUOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ����������
     * 
     * @param declarant
     */
    public void setDeclarant(CUOrganizationType declarant) {
        this.declarant = declarant;
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
    public static class Choice
    {
        private int choiceListSelect = -1;
        private static final int TRANSPORT_DOC_CHOICE = 0;
        private static final int TD_NUMBER_CHOICE = 1;
        private static final int TIRID_CHOICE = 2;
        private DocumentBaseType transportDoc;
        private GTDIDType TDNumber;
        private TIRIDType TIRID;

        private void setChoiceListSelect(int choice) {
            if (choiceListSelect == -1) {
                choiceListSelect = choice;
            } else if (choiceListSelect != choice) {
                throw new IllegalStateException(
                        "Need to call clearChoiceListSelect() before changing existing choice");
            }
        }

        /** 
         * Clear the choice selection.
         */
        public void clearChoiceListSelect() {
            choiceListSelect = -1;
        }

        /** 
         * Check if TransportDoc is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTransportDoc() {
            return choiceListSelect == TRANSPORT_DOC_CHOICE;
        }

        /** 
         * Get the 'TransportDoc' element value. ����� ������������� (�������������) ���������
         * 
         * @return value
         */
        public DocumentBaseType getTransportDoc() {
            return transportDoc;
        }

        /** 
         * Set the 'TransportDoc' element value. ����� ������������� (�������������) ���������
         * 
         * @param transportDoc
         */
        public void setTransportDoc(DocumentBaseType transportDoc) {
            setChoiceListSelect(TRANSPORT_DOC_CHOICE);
            this.transportDoc = transportDoc;
        }

        /** 
         * Check if TDNumber is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTDNumber() {
            return choiceListSelect == TD_NUMBER_CHOICE;
        }

        /** 
         * Get the 'TDNumber' element value. ����� ���������� ����������
         * 
         * @return value
         */
        public GTDIDType getTDNumber() {
            return TDNumber;
        }

        /** 
         * Set the 'TDNumber' element value. ����� ���������� ����������
         * 
         * @param TDNumber
         */
        public void setTDNumber(GTDIDType TDNumber) {
            setChoiceListSelect(TD_NUMBER_CHOICE);
            this.TDNumber = TDNumber;
        }

        /** 
         * Check if TIRID is current selection for choice.
         * 
         * @return <code>true</code> if selection, <code>false</code> if not
         */
        public boolean ifTIRID() {
            return choiceListSelect == TIRID_CHOICE;
        }

        /** 
         * Get the 'TIRID' element value. ����� ������ ���
         * 
         * @return value
         */
        public TIRIDType getTIRID() {
            return TIRID;
        }

        /** 
         * Set the 'TIRID' element value. ����� ������ ���
         * 
         * @param TIRID
         */
        public void setTIRID(TIRIDType TIRID) {
            setChoiceListSelect(TIRID_CHOICE);
            this.TIRID = TIRID;
        }
    }
}
