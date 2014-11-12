
package ru.acs.fts.schemas.album.conclusionaboutnotaccessory;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ���������� ����� ������
 */
public class ConclusionAboutNotAccessoryType extends BaseDocType
{
    private String BDRDID;
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private ConclusionType conclusion;
    private DocumentBaseType contractInfo;
    private CUOrganizationType conclusionReceiver;
    private PersonSignatureType authorizedPerson;
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the list of 'GoodsDescription' element items. ������������ � �������� ������
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. ������������ � �������� ������
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'Conclusion' element value. ����������
     * 
     * @return value
     */
    public ConclusionType getConclusion() {
        return conclusion;
    }

    /** 
     * Set the 'Conclusion' element value. ����������
     * 
     * @param conclusion
     */
    public void setConclusion(ConclusionType conclusion) {
        this.conclusion = conclusion;
    }

    /** 
     * Get the 'ContractInfo' element value. ��������� ���������
     * 
     * @return value
     */
    public DocumentBaseType getContractInfo() {
        return contractInfo;
    }

    /** 
     * Set the 'ContractInfo' element value. ��������� ���������
     * 
     * @param contractInfo
     */
    public void setContractInfo(DocumentBaseType contractInfo) {
        this.contractInfo = contractInfo;
    }

    /** 
     * Get the 'ConclusionReceiver' element value. �����������, ���������� ����������
     * 
     * @return value
     */
    public CUOrganizationType getConclusionReceiver() {
        return conclusionReceiver;
    }

    /** 
     * Set the 'ConclusionReceiver' element value. �����������, ���������� ����������
     * 
     * @param conclusionReceiver
     */
    public void setConclusionReceiver(CUOrganizationType conclusionReceiver) {
        this.conclusionReceiver = conclusionReceiver;
    }

    /** 
     * Get the 'AuthorizedPerson' element value. �������������� ����������� ����, ����������� ����������
     * 
     * @return value
     */
    public PersonSignatureType getAuthorizedPerson() {
        return authorizedPerson;
    }

    /** 
     * Set the 'AuthorizedPerson' element value. �������������� ����������� ����, ����������� ����������
     * 
     * @param authorizedPerson
     */
    public void setAuthorizedPerson(PersonSignatureType authorizedPerson) {
        this.authorizedPerson = authorizedPerson;
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
