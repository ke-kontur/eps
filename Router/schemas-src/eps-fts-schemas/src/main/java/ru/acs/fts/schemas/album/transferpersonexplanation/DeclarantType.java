
package ru.acs.fts.schemas.album.transferpersonexplanation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ��������� ��� ���� ����, ������� ��������� � ����������� ������� � ������������ ������� ����� ���������� ������� ���������� ���������
 */
public class DeclarantType extends OrganizationBaseType
{
    private DocumentBaseType declContract;

    /** 
     * Get the 'DeclContract' element value. �������� � �������� ���������� (����)
     * 
     * @return value
     */
    public DocumentBaseType getDeclContract() {
        return declContract;
    }

    /** 
     * Set the 'DeclContract' element value. �������� � �������� ���������� (����)
     * 
     * @param declContract
     */
    public void setDeclContract(DocumentBaseType declContract) {
        this.declContract = declContract;
    }
}
