
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;

/** 
 * ������ ���������
 */
public class DocRequestType
{
    private String reqSign;
    private String describeContract;
    private IdentityCardType identityDoc;
    private List<EstateObjectType> objectList = new ArrayList<EstateObjectType>();
    private DocumentBaseType documentDetails;

    /** 
     * Get the 'ReqSign' element value. �������: 1 - ������ ����� ��������� (����������� ��� (������������) � ��������� �������� (������)); 2 - ������� � ���������� �������������������� ����������
     * 
     * @return value
     */
    public String getReqSign() {
        return reqSign;
    }

    /** 
     * Set the 'ReqSign' element value. �������: 1 - ������ ����� ��������� (����������� ��� (������������) � ��������� �������� (������)); 2 - ������� � ���������� �������������������� ����������
     * 
     * @param reqSign
     */
    public void setReqSign(String reqSign) {
        this.reqSign = reqSign;
    }

    /** 
     * Get the 'DescribeContract' element value. ���������, ������������ ���������
     * 
     * @return value
     */
    public String getDescribeContract() {
        return describeContract;
    }

    /** 
     * Set the 'DescribeContract' element value. ���������, ������������ ���������
     * 
     * @param describeContract
     */
    public void setDescribeContract(String describeContract) {
        this.describeContract = describeContract;
    }

    /** 
     * Get the 'IdentityDoc' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityDoc() {
        return identityDoc;
    }

    /** 
     * Set the 'IdentityDoc' element value. ��������, �������������� ��������
     * 
     * @param identityDoc
     */
    public void setIdentityDoc(IdentityCardType identityDoc) {
        this.identityDoc = identityDoc;
    }

    /** 
     * Get the list of 'Object' element items. ������
     * 
     * @return list
     */
    public List<EstateObjectType> getObjectList() {
        return objectList;
    }

    /** 
     * Set the list of 'Object' element items. ������
     * 
     * @param list
     */
    public void setObjectList(List<EstateObjectType> list) {
        objectList = list;
    }

    /** 
     * Get the 'DocumentDetails' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getDocumentDetails() {
        return documentDetails;
    }

    /** 
     * Set the 'DocumentDetails' element value. ��������� ���������
     * 
     * @param documentDetails
     */
    public void setDocumentDetails(DocumentBaseType documentDetails) {
        this.documentDetails = documentDetails;
    }
}
