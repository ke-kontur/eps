
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������������� ��������.
 */
public class PresentedDocumentType extends DocumentBaseType
{
    private LocalDate documentBeginActionsDate;
    private LocalDate documentEndActionsDate;
    private String organizationName;
    private LocalDate presentingLackingDate;

    /** 
     * Get the 'DocumentBeginActionsDate' element value. ���� ������ �������� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentBeginActionsDate() {
        return documentBeginActionsDate;
    }

    /** 
     * Set the 'DocumentBeginActionsDate' element value. ���� ������ �������� ���������
     * 
     * @param documentBeginActionsDate
     */
    public void setDocumentBeginActionsDate(LocalDate documentBeginActionsDate) {
        this.documentBeginActionsDate = documentBeginActionsDate;
    }

    /** 
     * Get the 'DocumentEndActionsDate' element value. ���� ��������� �������� ���������
     * 
     * @return value
     */
    public LocalDate getDocumentEndActionsDate() {
        return documentEndActionsDate;
    }

    /** 
     * Set the 'DocumentEndActionsDate' element value. ���� ��������� �������� ���������
     * 
     * @param documentEndActionsDate
     */
    public void setDocumentEndActionsDate(LocalDate documentEndActionsDate) {
        this.documentEndActionsDate = documentEndActionsDate;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ ������, ��������� ��������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ ������, ��������� ��������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'PresentingLackingDate' element value. ���� ������������� ������������ ��������� / ��������
     * 
     * @return value
     */
    public LocalDate getPresentingLackingDate() {
        return presentingLackingDate;
    }

    /** 
     * Set the 'PresentingLackingDate' element value. ���� ������������� ������������ ��������� / ��������
     * 
     * @param presentingLackingDate
     */
    public void setPresentingLackingDate(LocalDate presentingLackingDate) {
        this.presentingLackingDate = presentingLackingDate;
    }
}
