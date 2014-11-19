
package ru.acs.fts.schemas.album;

/** 
 * �������� �� �����������/����������/����, ���. �� ���. ���/����������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OrganizationInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="OrganizationName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="OGRN" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="INN" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="KPP" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="ITN" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="OKATO" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OrganizationInfoType
{
    private String organizationName;
    private String OGRN;
    private String INN;
    private String KPP;
    private String ITN;
    private String OKATO;

    /** 
     * Get the 'OrganizationName' element value. ������������ ����������� / ��� ����������� ����
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ����������� / ��� ����������� ����
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'OGRN' element value. ����/������. �������� ��������������� ��������������� �����.
     * 
     * @return value
     */
    public String getOGRN() {
        return OGRN;
    }

    /** 
     * Set the 'OGRN' element value. ����/������. �������� ��������������� ��������������� �����.
     * 
     * @param OGRN
     */
    public void setOGRN(String OGRN) {
        this.OGRN = OGRN;
    }

    /** 
     * Get the 'INN' element value. ��� - �������������� ����� �����������������.
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ��� - �������������� ����� �����������������.
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. ��� - ��� ������� ���������� �� ����.
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. ��� - ��� ������� ���������� �� ����.
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    /** 
     * Get the 'ITN' element value. ���
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ���
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }

    /** 
     * Get the 'OKATO' element value. ��� ����� (����������� ������������� � ������������ � �������� ��� ������ �� 10.10.2007 �. � 1246)
     * 
     * @return value
     */
    public String getOKATO() {
        return OKATO;
    }

    /** 
     * Set the 'OKATO' element value. ��� ����� (����������� ������������� � ������������ � �������� ��� ������ �� 10.10.2007 �. � 1246)
     * 
     * @param OKATO
     */
    public void setOKATO(String OKATO) {
        this.OKATO = OKATO;
    }
}
