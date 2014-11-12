
package ru.acs.fts.schemas.album.transitinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������-������������ ���������.
 */
public class ConsigmentType extends ProducedDocumentType
{
    private String sequence;
    private String customsInvoiceNumber;
    private CUOrganizationType consignor;
    private CUOrganizationType consignee;
    private List<TransitGoodsType> goodsItemList = new ArrayList<TransitGoodsType>();
    private List<ProducedDocumentType> producedDocumentList = new ArrayList<ProducedDocumentType>();

    /** 
     * Get the 'Sequence' element value. ���������� ����� ���������.
     * 
     * @return value
     */
    public String getSequence() {
        return sequence;
    }

    /** 
     * Set the 'Sequence' element value. ���������� ����� ���������.
     * 
     * @param sequence
     */
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    /** 
     * Get the 'CustomsInvoiceNumber' element value. ���������� ����� ���������.
     * 
     * @return value
     */
    public String getCustomsInvoiceNumber() {
        return customsInvoiceNumber;
    }

    /** 
     * Set the 'CustomsInvoiceNumber' element value. ���������� ����� ���������.
     * 
     * @param customsInvoiceNumber
     */
    public void setCustomsInvoiceNumber(String customsInvoiceNumber) {
        this.customsInvoiceNumber = customsInvoiceNumber;
    }

    /** 
     * Get the 'Consignor' element value. ����������������
     * 
     * @return value
     */
    public CUOrganizationType getConsignor() {
        return consignor;
    }

    /** 
     * Set the 'Consignor' element value. ����������������
     * 
     * @param consignor
     */
    public void setConsignor(CUOrganizationType consignor) {
        this.consignor = consignor;
    }

    /** 
     * Get the 'Consignee' element value. ���������������
     * 
     * @return value
     */
    public CUOrganizationType getConsignee() {
        return consignee;
    }

    /** 
     * Set the 'Consignee' element value. ���������������
     * 
     * @param consignee
     */
    public void setConsignee(CUOrganizationType consignee) {
        this.consignee = consignee;
    }

    /** 
     * Get the list of 'GoodsItem' element items. �������� ������
     * 
     * @return list
     */
    public List<TransitGoodsType> getGoodsItemList() {
        return goodsItemList;
    }

    /** 
     * Set the list of 'GoodsItem' element items. �������� ������
     * 
     * @param list
     */
    public void setGoodsItemList(List<TransitGoodsType> list) {
        goodsItemList = list;
    }

    /** 
     * Get the list of 'ProducedDocument' element items. �������������� ��������� (�����������).
     * 
     * @return list
     */
    public List<ProducedDocumentType> getProducedDocumentList() {
        return producedDocumentList;
    }

    /** 
     * Set the list of 'ProducedDocument' element items. �������������� ��������� (�����������).
     * 
     * @param list
     */
    public void setProducedDocumentList(List<ProducedDocumentType> list) {
        producedDocumentList = list;
    }
}
