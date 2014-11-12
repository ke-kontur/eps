
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * ���������� � ������ ���� ����������, ������� �������� �������� ������������� (��� ������������ ����������) � �������� ����������.
 */
public class AUDDocumentKindVersionInfoType
{
    private String appliedDocumentKindVersionId;
    private List<AUDDocumentAttributeInfoType> documentAttributeInfoList = new ArrayList<AUDDocumentAttributeInfoType>();
    private List<AUDRepresentationKindCommonInfoType> representationKindCommonInfoList = new ArrayList<AUDRepresentationKindCommonInfoType>();

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
     * Get the list of 'DocumentAttributeInfo' element items. ������. ���������� � ��������� ���������.
     * 
     * @return list
     */
    public List<AUDDocumentAttributeInfoType> getDocumentAttributeInfoList() {
        return documentAttributeInfoList;
    }

    /** 
     * Set the list of 'DocumentAttributeInfo' element items. ������. ���������� � ��������� ���������.
     * 
     * @param list
     */
    public void setDocumentAttributeInfoList(
            List<AUDDocumentAttributeInfoType> list) {
        documentAttributeInfoList = list;
    }

    /** 
     * Get the list of 'RepresentationKindCommonInfo' element items. ���������� � ���� ������������� (��� ������������ ���������).
     * 
     * @return list
     */
    public List<AUDRepresentationKindCommonInfoType> getRepresentationKindCommonInfoList() {
        return representationKindCommonInfoList;
    }

    /** 
     * Set the list of 'RepresentationKindCommonInfo' element items. ���������� � ���� ������������� (��� ������������ ���������).
     * 
     * @param list
     */
    public void setRepresentationKindCommonInfoList(
            List<AUDRepresentationKindCommonInfoType> list) {
        representationKindCommonInfoList = list;
    }
}
