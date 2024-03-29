
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ������������� ������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:RepresApplicChange:5.4.3" xmlns:ns1="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConsignmentType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="ListNumeric"/>
 *     &lt;xs:element type="ns1:DocumentBaseType" name="IndividualWayBill"/>
 *     &lt;xs:element type="xs:string" name="GoodsNumeric" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="GoodsDescription" minOccurs="0" maxOccurs="4"/>
 *     &lt;xs:element type="xs:string" name="GrNumber"/>
 *     &lt;xs:element type="xs:string" name="GrDescription"/>
 *     &lt;xs:element type="xs:string" name="PreviousData" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="CorrectData"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConsignmentType1
{
    private String listNumeric;
    private DocumentBaseType individualWayBill;
    private String goodsNumeric;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String grNumber;
    private String grDescription;
    private String previousData;
    private String correctData;

    /** 
     * Get the 'ListNumeric' element value. ���������� ����� ��������������� �����������/��������� 
     * 
     * @return value
     */
    public String getListNumeric() {
        return listNumeric;
    }

    /** 
     * Set the 'ListNumeric' element value. ���������� ����� ��������������� �����������/��������� 
     * 
     * @param listNumeric
     */
    public void setListNumeric(String listNumeric) {
        this.listNumeric = listNumeric;
    }

    /** 
     * Get the 'IndividualWayBill' element value. �������� �� �������������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getIndividualWayBill() {
        return individualWayBill;
    }

    /** 
     * Set the 'IndividualWayBill' element value. �������� �� �������������� ���������
     * 
     * @param individualWayBill
     */
    public void setIndividualWayBill(DocumentBaseType individualWayBill) {
        this.individualWayBill = individualWayBill;
    }

    /** 
     * Get the 'GoodsNumeric' element value. ����� ������
     * 
     * @return value
     */
    public String getGoodsNumeric() {
        return goodsNumeric;
    }

    /** 
     * Set the 'GoodsNumeric' element value. ����� ������
     * 
     * @param goodsNumeric
     */
    public void setGoodsNumeric(String goodsNumeric) {
        this.goodsNumeric = goodsNumeric;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'GrNumber' element value. ����� �������������� �����
     * 
     * @return value
     */
    public String getGrNumber() {
        return grNumber;
    }

    /** 
     * Set the 'GrNumber' element value. ����� �������������� �����
     * 
     * @param grNumber
     */
    public void setGrNumber(String grNumber) {
        this.grNumber = grNumber;
    }

    /** 
     * Get the 'GrDescription' element value. �������� �������������� �����
     * 
     * @return value
     */
    public String getGrDescription() {
        return grDescription;
    }

    /** 
     * Set the 'GrDescription' element value. �������� �������������� �����
     * 
     * @param grDescription
     */
    public void setGrDescription(String grDescription) {
        this.grDescription = grDescription;
    }

    /** 
     * Get the 'PreviousData' element value. ���������� �������� �����
     * 
     * @return value
     */
    public String getPreviousData() {
        return previousData;
    }

    /** 
     * Set the 'PreviousData' element value. ���������� �������� �����
     * 
     * @param previousData
     */
    public void setPreviousData(String previousData) {
        this.previousData = previousData;
    }

    /** 
     * Get the 'CorrectData' element value. ����������������� �������� �����
     * 
     * @return value
     */
    public String getCorrectData() {
        return correctData;
    }

    /** 
     * Set the 'CorrectData' element value. ����������������� �������� �����
     * 
     * @param correctData
     */
    public void setCorrectData(String correctData) {
        this.correctData = correctData;
    }
}
