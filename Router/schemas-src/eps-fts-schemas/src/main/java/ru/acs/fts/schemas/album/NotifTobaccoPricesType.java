
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����������� � ��������� ����� �� �������� �������, �������� � ��
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:ExchangeDocuments:NotifTobaccoPrices:5.4.5" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NotifTobaccoPricesType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:date" name="NewPriceStartDate"/>
 *         &lt;xs:element type="ns:CustomsType" name="Customs" minOccurs="0"/>
 *         &lt;xs:element type="ns1:TaxPayerType" name="TaxPayer"/>
 *         &lt;xs:element type="ns:PersonSignatureType" name="ChiefSignature"/>
 *         &lt;xs:element type="ns1:GoodsType" name="Goods" maxOccurs="unbounded"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1004117E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NotifTobaccoPricesType extends BaseDocType
{
    private LocalDate newPriceStartDate;
    private CustomsType customs;
    private TaxPayerType taxPayer;
    private PersonSignatureType chiefSignature;
    private List<GoodsType1> goodList = new ArrayList<GoodsType1>();
    private String documentModeID;

    /** 
     * Get the 'NewPriceStartDate' element value. ���� ������������ ���������� ��������� ��� �� �������� �������
     * 
     * @return value
     */
    public LocalDate getNewPriceStartDate() {
        return newPriceStartDate;
    }

    /** 
     * Set the 'NewPriceStartDate' element value. ���� ������������ ���������� ��������� ��� �� �������� �������
     * 
     * @param newPriceStartDate
     */
    public void setNewPriceStartDate(LocalDate newPriceStartDate) {
        this.newPriceStartDate = newPriceStartDate;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'TaxPayer' element value. �������� � �����������������
     * 
     * @return value
     */
    public TaxPayerType getTaxPayer() {
        return taxPayer;
    }

    /** 
     * Set the 'TaxPayer' element value. �������� � �����������������
     * 
     * @param taxPayer
     */
    public void setTaxPayer(TaxPayerType taxPayer) {
        this.taxPayer = taxPayer;
    }

    /** 
     * Get the 'ChiefSignature' element value. ������������ ����������� (�������������� ���������������)
     * 
     * @return value
     */
    public PersonSignatureType getChiefSignature() {
        return chiefSignature;
    }

    /** 
     * Set the 'ChiefSignature' element value. ������������ ����������� (�������������� ���������������)
     * 
     * @param chiefSignature
     */
    public void setChiefSignature(PersonSignatureType chiefSignature) {
        this.chiefSignature = chiefSignature;
    }

    /** 
     * Get the list of 'Goods' element items. �������� � �������
     * 
     * @return list
     */
    public List<GoodsType1> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �������� � �������
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType1> list) {
        goodList = list;
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
