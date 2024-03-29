
package ru.acs.fts.schemas.album.inspectionreqres;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ������� ��������������� ����� ����� �������
 */
public class RequirementType
{
    private String type;
    private String description;
    private DocumentBaseType document;

    /** 
     * Get the 'Type' element value. ��� �������: 1 - ������������� ����������; 2 - ������������� ���������� �����������-������������; 3 - �������������� ������� ����������; 4 - ������� ����������� ������������� ������� � �������� �������; 5 - ������� ��������� ��������������� �������� � ������������ ������������� ������� � �������� ������� ����������� � ������������������� �������, �������� ��� ������������� �����������; 6 - ������� ���������, ��������������� ������������ � ��������� ���� ����� ���� ����� �������� � ��� ��� �� ����������, ��������� ������ ���������������� ���������
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. ��� �������: 1 - ������������� ����������; 2 - ������������� ���������� �����������-������������; 3 - �������������� ������� ����������; 4 - ������� ����������� ������������� ������� � �������� �������; 5 - ������� ��������� ��������������� �������� � ������������ ������������� ������� � �������� ������� ����������� � ������������������� �������, �������� ��� ������������� �����������; 6 - ������� ���������, ��������������� ������������ � ��������� ���� ����� ���� ����� �������� � ��� ��� �� ����������, ��������� ������ ���������������� ���������
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'Description' element value. �������
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. �������
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'Document' element value. ��������
     * 
     * @return value
     */
    public DocumentBaseType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. ��������
     * 
     * @param document
     */
    public void setDocument(DocumentBaseType document) {
        this.document = document;
    }
}
