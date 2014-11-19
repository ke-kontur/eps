
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���, ����������� �������������� ��������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MeasureInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="MeasureAttributeCode"/>
 *     &lt;xs:element type="xs:string" name="MeasureAttributeValue" maxOccurs="unbounded"/>
 *     &lt;xs:element type="xs:string" name="MeasureAttributeNecessary"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MeasureInfoType
{
    private String measureAttributeCode;
    private List<String> measureAttributeValueList = new ArrayList<String>();
    private String measureAttributeNecessary;

    /** 
     * Get the 'MeasureAttributeCode' element value. ��� �������������� ��������/�������. ��� �������� ����������� � ������������ �� ���������� �������������� "������������� ����������� �������� �������" - rskxdosm.dbf.
     * 
     * @return value
     */
    public String getMeasureAttributeCode() {
        return measureAttributeCode;
    }

    /** 
     * Set the 'MeasureAttributeCode' element value. ��� �������������� ��������/�������. ��� �������� ����������� � ������������ �� ���������� �������������� "������������� ����������� �������� �������" - rskxdosm.dbf.
     * 
     * @param measureAttributeCode
     */
    public void setMeasureAttributeCode(String measureAttributeCode) {
        this.measureAttributeCode = measureAttributeCode;
    }

    /** 
     * Get the list of 'MeasureAttributeValue' element items. �������� �������������� ��������/�������. ��� �������� ����������� � ������������ �� ���������� �������������� "���������� �������� ������������� ����������� �������� �������" - rskzdosm.dbf.
     * 
     * @return list
     */
    public List<String> getMeasureAttributeValueList() {
        return measureAttributeValueList;
    }

    /** 
     * Set the list of 'MeasureAttributeValue' element items. �������� �������������� ��������/�������. ��� �������� ����������� � ������������ �� ���������� �������������� "���������� �������� ������������� ����������� �������� �������" - rskzdosm.dbf.
     * 
     * @param list
     */
    public void setMeasureAttributeValueList(List<String> list) {
        measureAttributeValueList = list;
    }

    /** 
     * Get the 'MeasureAttributeNecessary' element value. �������, ������������ ����������� ������ �������� �������������� ����������� ��������. 0 - �������� �������� �������� ������������� ����������� ��������, 1 - ����������� ������ ����������� (������� ����������� � ������������ �� ���������� �������������, ������������� �������� �����)
     * 
     * @return value
     */
    public String getMeasureAttributeNecessary() {
        return measureAttributeNecessary;
    }

    /** 
     * Set the 'MeasureAttributeNecessary' element value. �������, ������������ ����������� ������ �������� �������������� ����������� ��������. 0 - �������� �������� �������� ������������� ����������� ��������, 1 - ����������� ������ ����������� (������� ����������� � ������������ �� ���������� �������������, ������������� �������� �����)
     * 
     * @param measureAttributeNecessary
     */
    public void setMeasureAttributeNecessary(String measureAttributeNecessary) {
        this.measureAttributeNecessary = measureAttributeNecessary;
    }
}
