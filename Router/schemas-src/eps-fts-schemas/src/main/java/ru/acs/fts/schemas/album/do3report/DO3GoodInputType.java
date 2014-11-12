
package ru.acs.fts.schemas.album.do3report;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhGoodType;

/** 
 * ����������� ��� ��� �������� ������ � ����� ������ �� ������ ��3
 */
public class DO3GoodInputType extends WhGoodType
{
    private String goodsWHNumber;
    private DO3KeepingLimitType keepingLimit;
    private DocumentBaseType transportDocument;
    private OrganizationBaseType recipient;
    private DO3DO1GoodLinkType DO1GoodLink;

    /** 
     * Get the 'GoodsWHNumber' element value. ��������� ����� ������
     * 
     * @return value
     */
    public String getGoodsWHNumber() {
        return goodsWHNumber;
    }

    /** 
     * Set the 'GoodsWHNumber' element value. ��������� ����� ������
     * 
     * @param goodsWHNumber
     */
    public void setGoodsWHNumber(String goodsWHNumber) {
        this.goodsWHNumber = goodsWHNumber;
    }

    /** 
     * Get the 'KeepingLimit' element value. �������� � ����� �������� ������
     * 
     * @return value
     */
    public DO3KeepingLimitType getKeepingLimit() {
        return keepingLimit;
    }

    /** 
     * Set the 'KeepingLimit' element value. �������� � ����� �������� ������
     * 
     * @param keepingLimit
     */
    public void setKeepingLimit(DO3KeepingLimitType keepingLimit) {
        this.keepingLimit = keepingLimit;
    }

    /** 
     * Get the 'TransportDocument' element value. ������������ ��������
     * 
     * @return value
     */
    public DocumentBaseType getTransportDocument() {
        return transportDocument;
    }

    /** 
     * Set the 'TransportDocument' element value. ������������ ��������
     * 
     * @param transportDocument
     */
    public void setTransportDocument(DocumentBaseType transportDocument) {
        this.transportDocument = transportDocument;
    }

    /** 
     * Get the 'Recipient' element value. ����������
     * 
     * @return value
     */
    public OrganizationBaseType getRecipient() {
        return recipient;
    }

    /** 
     * Set the 'Recipient' element value. ����������
     * 
     * @param recipient
     */
    public void setRecipient(OrganizationBaseType recipient) {
        this.recipient = recipient;
    }

    /** 
     * Get the 'DO1GoodLink' element value. �������� �� ����� ������ ��1,������� ������� �� �����
     * 
     * @return value
     */
    public DO3DO1GoodLinkType getDO1GoodLink() {
        return DO1GoodLink;
    }

    /** 
     * Set the 'DO1GoodLink' element value. �������� �� ����� ������ ��1,������� ������� �� �����
     * 
     * @param DO1GoodLink
     */
    public void setDO1GoodLink(DO3DO1GoodLinkType DO1GoodLink) {
        this.DO1GoodLink = DO1GoodLink;
    }
}
