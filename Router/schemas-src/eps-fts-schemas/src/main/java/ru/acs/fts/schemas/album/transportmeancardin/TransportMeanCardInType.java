
package ru.acs.fts.schemas.album.transportmeancardin;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.ESADTransportMeanCardType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportManufacturerType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportOwnerType;

/** 
 * �������� ������������� ��������. ���������� ������
 */
public class TransportMeanCardInType extends BaseDocType
{
    private String GTDDocumentID;
    private TransportOwnerType transportOwner;
    private TransportManufacturerType transportManufacturer;
    private TransportCardOfficialMarkType transportCardOfficialMark;
    private TransportCardTechMarkType transportCardTechMark;
    private ESADTransportMeanCardType ESADTransportMeanCard;
    private DocumentBaseType document;
    private GTDIDType cardNumber;
    private String documentModeID;

    /** 
     * Get the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� �������� �� ��.
     * 
     * @return value
     */
    public String getGTDDocumentID() {
        return GTDDocumentID;
    }

    /** 
     * Set the 'GTDDocumentID' element value. ���������� ������������� ��.  ������������ ��� �������� � �� ��� ������������� �������� �� ��.
     * 
     * @param GTDDocumentID
     */
    public void setGTDDocumentID(String GTDDocumentID) {
        this.GTDDocumentID = GTDDocumentID;
    }

    /** 
     * Get the 'TransportOwner' element value. �������� ��. ���  ���������� ��� ����������� �������, ���, ��������, ��� ����������� - ������������.
     * 
     * @return value
     */
    public TransportOwnerType getTransportOwner() {
        return transportOwner;
    }

    /** 
     * Set the 'TransportOwner' element value. �������� ��. ���  ���������� ��� ����������� �������, ���, ��������, ��� ����������� - ������������.
     * 
     * @param transportOwner
     */
    public void setTransportOwner(TransportOwnerType transportOwner) {
        this.transportOwner = transportOwner;
    }

    /** 
     * Get the 'TransportManufacturer' element value. ������������ ������������� ��������.
     * 
     * @return value
     */
    public TransportManufacturerType getTransportManufacturer() {
        return transportManufacturer;
    }

    /** 
     * Set the 'TransportManufacturer' element value. ������������ ������������� ��������.
     * 
     * @param transportManufacturer
     */
    public void setTransportManufacturer(
            TransportManufacturerType transportManufacturer) {
        this.transportManufacturer = transportManufacturer;
    }

    /** 
     * Get the 'TransportCardOfficialMark' element value. �������� ��. ���������� ������. ������� ����������� ������.
     * 
     * @return value
     */
    public TransportCardOfficialMarkType getTransportCardOfficialMark() {
        return transportCardOfficialMark;
    }

    /** 
     * Set the 'TransportCardOfficialMark' element value. �������� ��. ���������� ������. ������� ����������� ������.
     * 
     * @param transportCardOfficialMark
     */
    public void setTransportCardOfficialMark(
            TransportCardOfficialMarkType transportCardOfficialMark) {
        this.transportCardOfficialMark = transportCardOfficialMark;
    }

    /** 
     * Get the 'TransportCardTechMark' element value. �������� ��. ���������� ������. ��������������� �������.
     * 
     * @return value
     */
    public TransportCardTechMarkType getTransportCardTechMark() {
        return transportCardTechMark;
    }

    /** 
     * Set the 'TransportCardTechMark' element value. �������� ��. ���������� ������. ��������������� �������.
     * 
     * @param transportCardTechMark
     */
    public void setTransportCardTechMark(
            TransportCardTechMarkType transportCardTechMark) {
        this.transportCardTechMark = transportCardTechMark;
    }

    /** 
     * Get the 'ESADTransportMeanCard' element value. �������� ������������� ��������. �������� � ������������ ��������.
     * 
     * @return value
     */
    public ESADTransportMeanCardType getESADTransportMeanCard() {
        return ESADTransportMeanCard;
    }

    /** 
     * Set the 'ESADTransportMeanCard' element value. �������� ������������� ��������. �������� � ������������ ��������.
     * 
     * @param ESADTransportMeanCard
     */
    public void setESADTransportMeanCard(
            ESADTransportMeanCardType ESADTransportMeanCard) {
        this.ESADTransportMeanCard = ESADTransportMeanCard;
    }

    /** 
     * Get the 'Document' element value. ������������,����� � ���� ��������� (��, ���, ���� ��������)
     * 
     * @return value
     */
    public DocumentBaseType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. ������������,����� � ���� ��������� (��, ���, ���� ��������)
     * 
     * @param document
     */
    public void setDocument(DocumentBaseType document) {
        this.document = document;
    }

    /** 
     * Get the 'CardNumber' element value. ������� ����� �������� (������ ���������� ������� ������ ��).
     * 
     * @return value
     */
    public GTDIDType getCardNumber() {
        return cardNumber;
    }

    /** 
     * Set the 'CardNumber' element value. ������� ����� �������� (������ ���������� ������� ������ ��).
     * 
     * @param cardNumber
     */
    public void setCardNumber(GTDIDType cardNumber) {
        this.cardNumber = cardNumber;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������.
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
