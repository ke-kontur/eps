
package ru.acs.fts.schemas.aud.aud_putdocumentrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentInfoWithVersionRefType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedDocumentWithBodyType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAppliedPacketInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ������ �� ���������� ���������� �� ��������.
 */
public class AUDPutDocumentRequestType extends AUDBaseEnvelopeType
{
    private String prevVersionArchiveDocumentId;
    private String refArchivePacketId;
    private String customsCode;
    private String refExtArchivePacketId;
    private String refExtArchiveDocumentId;
    private AUDAppliedDocumentWithBodyType appliedDocumentWithBody;
    private AUDAppliedPacketInfoType appliedPacketInfo;
    private List<AUDAppliedDocumentInfoWithVersionRefType> embeddedDocumentAppliedInfoList = new ArrayList<AUDAppliedDocumentInfoWithVersionRefType>();
    private String documentModeID;

    /** 
     * Get the 'PrevVersionArchiveDocumentId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� ����������� �� �������� �������� ������������ ����� ����� (���������) ������ ��� ��������� ���������.
     * 
     * @return value
     */
    public String getPrevVersionArchiveDocumentId() {
        return prevVersionArchiveDocumentId;
    }

    /** 
     * Set the 'PrevVersionArchiveDocumentId' element value. �������� ������������� ��������� ������� ������. ����������� � ������, ���� ����������� �� �������� �������� ������������ ����� ����� (���������) ������ ��� ��������� ���������.
     * 
     * @param prevVersionArchiveDocumentId
     */
    public void setPrevVersionArchiveDocumentId(
            String prevVersionArchiveDocumentId) {
        this.prevVersionArchiveDocumentId = prevVersionArchiveDocumentId;
    }

    /** 
     * Get the 'RefArchivePacketId' element value. �������� ������������� ������ ����������. ����������� � ������, ���� ��������� ��������� ��������� ��� ������������� � ������ ������ (��������� ��� ��������� ��� �������), � �� ������� � ������ ����� ����� ����������.
     * 
     * @return value
     */
    public String getRefArchivePacketId() {
        return refArchivePacketId;
    }

    /** 
     * Set the 'RefArchivePacketId' element value. �������� ������������� ������ ����������. ����������� � ������, ���� ��������� ��������� ��������� ��� ������������� � ������ ������ (��������� ��� ��������� ��� �������), � �� ������� � ������ ����� ����� ����������.
     * 
     * @param refArchivePacketId
     */
    public void setRefArchivePacketId(String refArchivePacketId) {
        this.refArchivePacketId = refArchivePacketId;
    }

    /** 
     * Get the 'CustomsCode' element value. ��� ����������� ������, � �������� ��������� ��������. ����������� � ������, ���� ���������� ������� �������� ������ ������ ���� "�������� ������" � ���������, ����� ����������� �� �������� �������� ��������� � ������������� ����������� ������.
     * 
     * @return value
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /** 
     * Set the 'CustomsCode' element value. ��� ����������� ������, � �������� ��������� ��������. ����������� � ������, ���� ���������� ������� �������� ������ ������ ���� "�������� ������" � ���������, ����� ����������� �� �������� �������� ��������� � ������������� ����������� ������.
     * 
     * @param customsCode
     */
    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    /** 
     * Get the 'RefExtArchivePacketId' element value. ��������� �������� ������������� ������ ����������. ����������� � ������, ���� �������� ����� ��� �������� � ������ ������  ����������
     * 
     * @return value
     */
    public String getRefExtArchivePacketId() {
        return refExtArchivePacketId;
    }

    /** 
     * Set the 'RefExtArchivePacketId' element value. ��������� �������� ������������� ������ ����������. ����������� � ������, ���� �������� ����� ��� �������� � ������ ������  ����������
     * 
     * @param refExtArchivePacketId
     */
    public void setRefExtArchivePacketId(String refExtArchivePacketId) {
        this.refExtArchivePacketId = refExtArchivePacketId;
    }

    /** 
     * Get the 'RefExtArchiveDocumentId' element value. ��������� �������� ������������� ���������. ����������� � ������, ���� �������� ����� ��� �������� � ������ ������  ����������
     * 
     * @return value
     */
    public String getRefExtArchiveDocumentId() {
        return refExtArchiveDocumentId;
    }

    /** 
     * Set the 'RefExtArchiveDocumentId' element value. ��������� �������� ������������� ���������. ����������� � ������, ���� �������� ����� ��� �������� � ������ ������  ����������
     * 
     * @param refExtArchiveDocumentId
     */
    public void setRefExtArchiveDocumentId(String refExtArchiveDocumentId) {
        this.refExtArchiveDocumentId = refExtArchiveDocumentId;
    }

    /** 
     * Get the 'AppliedDocumentWithBody' element value. ������������ �� �������� ���������� ��������: ���������� � ��������� � ���� ���������.
     * 
     * @return value
     */
    public AUDAppliedDocumentWithBodyType getAppliedDocumentWithBody() {
        return appliedDocumentWithBody;
    }

    /** 
     * Set the 'AppliedDocumentWithBody' element value. ������������ �� �������� ���������� ��������: ���������� � ��������� � ���� ���������.
     * 
     * @param appliedDocumentWithBody
     */
    public void setAppliedDocumentWithBody(
            AUDAppliedDocumentWithBodyType appliedDocumentWithBody) {
        this.appliedDocumentWithBody = appliedDocumentWithBody;
    }

    /** 
     * Get the 'AppliedPacketInfo' element value. ���������� ���������� ������� � ������ ����������.
     * 
     * @return value
     */
    public AUDAppliedPacketInfoType getAppliedPacketInfo() {
        return appliedPacketInfo;
    }

    /** 
     * Set the 'AppliedPacketInfo' element value. ���������� ���������� ������� � ������ ����������.
     * 
     * @param appliedPacketInfo
     */
    public void setAppliedPacketInfo(AUDAppliedPacketInfoType appliedPacketInfo) {
        this.appliedPacketInfo = appliedPacketInfo;
    }

    /** 
     * Get the list of 'EmbeddedDocumentAppliedInfo' element items. ���������� � ���������� ���������, ��������� � ������������ �� �������� ��������-���������. ����������� ����������� � ��� � ������ � ��� ������, ���� ������������ �� �������� � ����� �������� ������������ ����� ��������-��������� ('ED_Container'). ����������� ��� ������� ���������, ���������� � ��������-���������.
     * 
     * @return list
     */
    public List<AUDAppliedDocumentInfoWithVersionRefType> getEmbeddedDocumentAppliedInfoList() {
        return embeddedDocumentAppliedInfoList;
    }

    /** 
     * Set the list of 'EmbeddedDocumentAppliedInfo' element items. ���������� � ���������� ���������, ��������� � ������������ �� �������� ��������-���������. ����������� ����������� � ��� � ������ � ��� ������, ���� ������������ �� �������� � ����� �������� ������������ ����� ��������-��������� ('ED_Container'). ����������� ��� ������� ���������, ���������� � ��������-���������.
     * 
     * @param list
     */
    public void setEmbeddedDocumentAppliedInfoList(
            List<AUDAppliedDocumentInfoWithVersionRefType> list) {
        embeddedDocumentAppliedInfoList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
