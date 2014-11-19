
package ru.acs.fts.schemas.album.mpo_declaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * ��������
 */
public class ImporterType extends OrganizationType
{
    private String importerIndex;
    private String VATNumber;

    /** 
     * Get the 'ImporterIndex' element value. ������ ���������
     * 
     * @return value
     */
    public String getImporterIndex() {
        return importerIndex;
    }

    /** 
     * Set the 'ImporterIndex' element value. ������ ���������
     * 
     * @param importerIndex
     */
    public void setImporterIndex(String importerIndex) {
        this.importerIndex = importerIndex;
    }

    /** 
     * Get the 'VAT_Number' element value. ����� ���
     * 
     * @return value
     */
    public String getVATNumber() {
        return VATNumber;
    }

    /** 
     * Set the 'VAT_Number' element value. ����� ���
     * 
     * @param VATNumber
     */
    public void setVATNumber(String VATNumber) {
        this.VATNumber = VATNumber;
    }
}
