
package ru.acs.fts.schemas.album;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:DTRevealedRisks:5.4.4" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NFIInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="NFICode"/>
 *     &lt;xs:element type="xs:string" name="NFIHash"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NFIInfoType
{
    private String NFICode;
    private String NFIHash;

    /** 
     * Get the 'NFICode' element value. ��� ���������� ��� ������. ����������.
    ��������� ��������:
    0100 � ������. ���������� �� ������ �������� ��Ļ
    0200 � ������. ���������� �� ������ ������� �������
    0300 � ������. ���������� �� ������ ��������
    0400 � ������. ���������� �� ������ ��������-��������
    0500 � ������. ���������� �� ������ ��������-�����������
    0600 � ������. ���������� �� ������ ������������� ��������
    0700 � ������. ���������� � ����� � ������� �����

     * 
     * @return value
     */
    public String getNFICode() {
        return NFICode;
    }

    /** 
     * Set the 'NFICode' element value. ��� ���������� ��� ������. ����������.
    ��������� ��������:
    0100 � ������. ���������� �� ������ �������� ��Ļ
    0200 � ������. ���������� �� ������ ������� �������
    0300 � ������. ���������� �� ������ ��������
    0400 � ������. ���������� �� ������ ��������-��������
    0500 � ������. ���������� �� ������ ��������-�����������
    0600 � ������. ���������� �� ������ ������������� ��������
    0700 � ������. ���������� � ����� � ������� �����

     * 
     * @param NFICode
     */
    public void setNFICode(String NFICode) {
        this.NFICode = NFICode;
    }

    /** 
     * Get the 'NFIHash' element value. ���-����� ��� ������. ����������
     * 
     * @return value
     */
    public String getNFIHash() {
        return NFIHash;
    }

    /** 
     * Set the 'NFIHash' element value. ���-����� ��� ������. ����������
     * 
     * @param NFIHash
     */
    public void setNFIHash(String NFIHash) {
        this.NFIHash = NFIHash;
    }
}
