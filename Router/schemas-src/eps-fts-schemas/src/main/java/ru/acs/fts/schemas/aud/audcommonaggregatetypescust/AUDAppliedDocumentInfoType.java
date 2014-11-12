
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ���������� � ��������� �� ���������� �������.
 */
public class AUDAppliedDocumentInfoType extends AUDAppliedDocumentIdType
{
    private String description;
    private AUDDocumentKindVersionIdInfoOptType documentKindVersionIdInfoOpt;

    /** 
     * Get the 'Description' element value. �������� ���������.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. �������� ���������.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'DocumentKindVersionIdInfoOpt' element value. ���������� ��� ������������� ������ ���� ���������.
     * 
     * @return value
     */
    public AUDDocumentKindVersionIdInfoOptType getDocumentKindVersionIdInfoOpt() {
        return documentKindVersionIdInfoOpt;
    }

    /** 
     * Set the 'DocumentKindVersionIdInfoOpt' element value. ���������� ��� ������������� ������ ���� ���������.
     * 
     * @param documentKindVersionIdInfoOpt
     */
    public void setDocumentKindVersionIdInfoOpt(
            AUDDocumentKindVersionIdInfoOptType documentKindVersionIdInfoOpt) {
        this.documentKindVersionIdInfoOpt = documentKindVersionIdInfoOpt;
    }
}
