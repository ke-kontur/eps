
package ru.acs.fts.schemas.aud.aud_getdocumentrequest;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDAttributeFilterParamsType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDTFilterType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDStringFilterParamsType;

/** 
 * ��������� ������� �� ��������� ���������. ������ ���� ������ ��� ������� ���������� (������������� ���� � ������������� ������ ����), ������� ���������� �������� ��������� ����������, �� ������� ����� ���� ������� ������.
 */
public class DocumentAttributesFilterType
{
    private String appliedDocumentKindId;
    private String appliedDocumentKindVersionId;
    private List<AUDAttributeFilterParamsType> attributeFilterParamList = new ArrayList<AUDAttributeFilterParamsType>();
    private AUDDTFilterType appliedGTDID;
    private AUDStringFilterParamsType appliedPacketID;

    /** 
     * Get the 'AppliedDocumentKindId' element value. ������������� ���� ���������� ����������. �������� ������ ���� ����� �������� �������� 'DocumentModeID' ("������������� ���� ���������. ��� ��������� � ������� ��������.") ����������� ���������.
     * 
     * @return value
     */
    public String getAppliedDocumentKindId() {
        return appliedDocumentKindId;
    }

    /** 
     * Set the 'AppliedDocumentKindId' element value. ������������� ���� ���������� ����������. �������� ������ ���� ����� �������� �������� 'DocumentModeID' ("������������� ���� ���������. ��� ��������� � ������� ��������.") ����������� ���������.
     * 
     * @param appliedDocumentKindId
     */
    public void setAppliedDocumentKindId(String appliedDocumentKindId) {
        this.appliedDocumentKindId = appliedDocumentKindId;
    }

    /** 
     * Get the 'AppliedDocumentKindVersionId' element value. ������������� ������ ���� ���������� ����������. �������� ������ ���� ����� �������������� ������������ ���� XML ����������� ��������� (��������� �������� ���������).
     * 
     * @return value
     */
    public String getAppliedDocumentKindVersionId() {
        return appliedDocumentKindVersionId;
    }

    /** 
     * Set the 'AppliedDocumentKindVersionId' element value. ������������� ������ ���� ���������� ����������. �������� ������ ���� ����� �������������� ������������ ���� XML ����������� ��������� (��������� �������� ���������).
     * 
     * @param appliedDocumentKindVersionId
     */
    public void setAppliedDocumentKindVersionId(
            String appliedDocumentKindVersionId) {
        this.appliedDocumentKindVersionId = appliedDocumentKindVersionId;
    }

    /** 
     * Get the list of 'AttributeFilterParams' element items. ��������� ������� �� �������� ���������.
     * 
     * @return list
     */
    public List<AUDAttributeFilterParamsType> getAttributeFilterParamList() {
        return attributeFilterParamList;
    }

    /** 
     * Set the list of 'AttributeFilterParams' element items. ��������� ������� �� �������� ���������.
     * 
     * @param list
     */
    public void setAttributeFilterParamList(
            List<AUDAttributeFilterParamsType> list) {
        attributeFilterParamList = list;
    }

    /** 
     * Get the 'AppliedGTDID' element value. ��������������� ����� ��
     * 
     * @return value
     */
    public AUDDTFilterType getAppliedGTDID() {
        return appliedGTDID;
    }

    /** 
     * Set the 'AppliedGTDID' element value. ��������������� ����� ��
     * 
     * @param appliedGTDID
     */
    public void setAppliedGTDID(AUDDTFilterType appliedGTDID) {
        this.appliedGTDID = appliedGTDID;
    }

    /** 
     * Get the 'AppliedPacketID' element value. ��������� ������� �� ���������� ������������� ������. �������� ���� "string" (������). ���������� ���������: empty, not_empty, equal, not_equal, like.
     * 
     * @return value
     */
    public AUDStringFilterParamsType getAppliedPacketID() {
        return appliedPacketID;
    }

    /** 
     * Set the 'AppliedPacketID' element value. ��������� ������� �� ���������� ������������� ������. �������� ���� "string" (������). ���������� ���������: empty, not_empty, equal, not_equal, like.
     * 
     * @param appliedPacketID
     */
    public void setAppliedPacketID(AUDStringFilterParamsType appliedPacketID) {
        this.appliedPacketID = appliedPacketID;
    }
}
