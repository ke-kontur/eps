
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���, ����������� ��������, �� ������� ������� ��/���
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DocumentType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:ProfileRefType" name="ProfileRef" minOccurs="0" maxOccurs="unbounded"/>
 *     &lt;xs:element type="ns:ConsignmentType" name="Consigment" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DocumentType
{
    private List<ProfileRefType> profileRefList = new ArrayList<ProfileRefType>();
    private List<ConsignmentType> consigmentList = new ArrayList<ConsignmentType>();

    /** 
     * Get the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� �������� � ����� (�.�. �� ��� ������ �������). ����������: �� ����������� ��� �� � ���.
     * 
     * @return list
     */
    public List<ProfileRefType> getProfileRefList() {
        return profileRefList;
    }

    /** 
     * Set the list of 'ProfileRef' element items. ������ �� ��/���, ������� ��������� �� �������� � ����� (�.�. �� ��� ������ �������). ����������: �� ����������� ��� �� � ���.
     * 
     * @param list
     */
    public void setProfileRefList(List<ProfileRefType> list) {
        profileRefList = list;
    }

    /** 
     * Get the list of 'Consigment' element items. ������ ������, �� ������� �������� ��/���. ����������: ��� �� � ��� ������ ������ 1 �������.
     * 
     * @return list
     */
    public List<ConsignmentType> getConsigmentList() {
        return consigmentList;
    }

    /** 
     * Set the list of 'Consigment' element items. ������ ������, �� ������� �������� ��/���. ����������: ��� �� � ��� ������ ������ 1 �������.
     * 
     * @param list
     */
    public void setConsigmentList(List<ConsignmentType> list) {
        consigmentList = list;
    }
}
