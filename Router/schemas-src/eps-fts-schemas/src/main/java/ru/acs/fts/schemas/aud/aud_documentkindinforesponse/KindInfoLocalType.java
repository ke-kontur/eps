
package ru.acs.fts.schemas.aud.aud_documentkindinforesponse;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentAttributeInfoType;
import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDDocumentKindVersionInfoType;

public class KindInfoLocalType
{
    private String appliedDocumentKindId;
    private String description;
    private List<AUDDocumentKindVersionInfoType> documentKindVersionInfoList = new ArrayList<AUDDocumentKindVersionInfoType>();
    private List<AUDDocumentAttributeInfoType> documentCommonAttributeList = new ArrayList<AUDDocumentAttributeInfoType>();

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
     * Get the 'Description' element value. ��������  ���� ���������.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. ��������  ���� ���������.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the list of 'DocumentKindVersionInfo' element items. ���������� � ������ ���� ����������.
     * 
     * @return list
     */
    public List<AUDDocumentKindVersionInfoType> getDocumentKindVersionInfoList() {
        return documentKindVersionInfoList;
    }

    /** 
     * Set the list of 'DocumentKindVersionInfo' element items. ���������� � ������ ���� ����������.
     * 
     * @param list
     */
    public void setDocumentKindVersionInfoList(
            List<AUDDocumentKindVersionInfoType> list) {
        documentKindVersionInfoList = list;
    }

    /** 
     * Get the list of 'DocumentCommonAttribute' element items. ���������� � ��������� ���������
     * 
     * @return list
     */
    public List<AUDDocumentAttributeInfoType> getDocumentCommonAttributeList() {
        return documentCommonAttributeList;
    }

    /** 
     * Set the list of 'DocumentCommonAttribute' element items. ���������� � ��������� ���������
     * 
     * @param list
     */
    public void setDocumentCommonAttributeList(
            List<AUDDocumentAttributeInfoType> list) {
        documentCommonAttributeList = list;
    }
}
