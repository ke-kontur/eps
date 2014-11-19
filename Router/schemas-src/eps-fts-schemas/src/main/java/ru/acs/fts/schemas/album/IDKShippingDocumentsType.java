
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * �������� � ���������������������� ����������
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKShippingDocumentsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="DocumentType" minOccurs="0"/>
 *     &lt;xs:element type="ns1:IDKTIRInfoType" name="TIR_Carnet" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="CarnetATA" minOccurs="0"/>
 *     &lt;xs:element type="ns:GTDIDType" name="DTID" minOccurs="0"/>
 *     &lt;xs:element type="ns:DocumentBaseType" name="Document" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKShippingDocumentsType
{
    private String documentType;
    private IDKTIRInfoType TIRCarnet;
    private String carnetATA;
    private GTDIDType DTID;
    private List<DocumentBaseType> documentList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the 'DocumentType' element value. ��� ���������.  1 - ���, 2 - ������-���, 3 - ��
     * 
     * @return value
     */
    public String getDocumentType() {
        return documentType;
    }

    /** 
     * Set the 'DocumentType' element value. ��� ���������.  1 - ���, 2 - ������-���, 3 - ��
     * 
     * @param documentType
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /** 
     * Get the 'TIR_Carnet' element value. ����� ������ ���
     * 
     * @return value
     */
    public IDKTIRInfoType getTIRCarnet() {
        return TIRCarnet;
    }

    /** 
     * Set the 'TIR_Carnet' element value. ����� ������ ���
     * 
     * @param TIRCarnet
     */
    public void setTIRCarnet(IDKTIRInfoType TIRCarnet) {
        this.TIRCarnet = TIRCarnet;
    }

    /** 
     * Get the 'CarnetATA' element value. ����� ������-���
     * 
     * @return value
     */
    public String getCarnetATA() {
        return carnetATA;
    }

    /** 
     * Set the 'CarnetATA' element value. ����� ������-���
     * 
     * @param carnetATA
     */
    public void setCarnetATA(String carnetATA) {
        this.carnetATA = carnetATA;
    }

    /** 
     * Get the 'DTID' element value. ����� ��/��
     * 
     * @return value
     */
    public GTDIDType getDTID() {
        return DTID;
    }

    /** 
     * Set the 'DTID' element value. ����� ��/��
     * 
     * @param DTID
     */
    public void setDTID(GTDIDType DTID) {
        this.DTID = DTID;
    }

    /** 
     * Get the list of 'Document' element items. ������ ���������
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentList() {
        return documentList;
    }

    /** 
     * Set the list of 'Document' element items. ������ ���������
     * 
     * @param list
     */
    public void setDocumentList(List<DocumentBaseType> list) {
        documentList = list;
    }
}
