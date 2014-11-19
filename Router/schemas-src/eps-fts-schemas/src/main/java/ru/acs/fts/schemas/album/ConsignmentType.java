
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���, ����������� ������, �� ������� ������� ��/���
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConsignmentType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="ConsigmentNumber"/>
 *     &lt;xs:element type="ns:ProfileRefType" name="ProfileRef" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:GoodsType" name="Goods" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConsignmentType
{
    private String consigmentNumber;
    private List<ProfileRefType> profileRefList = new ArrayList<ProfileRefType>();
    private List<GoodsType> goodList = new ArrayList<GoodsType>();

    /** 
     * Get the 'ConsigmentNumber' element value. ���������� ����� �������� ������. ����������: ��� �������� ��������-������ ����������� ���������� ����� ������ �� ���������-�������; ��� ��, ��� ������ ����� 1.
     * 
     * @return value
     */
    public String getConsigmentNumber() {
        return consigmentNumber;
    }

    /** 
     * Set the 'ConsigmentNumber' element value. ���������� ����� �������� ������. ����������: ��� �������� ��������-������ ����������� ���������� ����� ������ �� ���������-�������; ��� ��, ��� ������ ����� 1.
     * 
     * @param consigmentNumber
     */
    public void setConsigmentNumber(String consigmentNumber) {
        this.consigmentNumber = consigmentNumber;
    }

    /** 
     * Get the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� ���������� �������� ������
     * 
     * @return list
     */
    public List<ProfileRefType> getProfileRefList() {
        return profileRefList;
    }

    /** 
     * Set the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� ���������� �������� ������
     * 
     * @param list
     */
    public void setProfileRefList(List<ProfileRefType> list) {
        profileRefList = list;
    }

    /** 
     * Get the list of 'Goods' element items. ������, �� ������� �������� �����
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. ������, �� ������� �������� �����
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }
}
