
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

import org.joda.time.DateTime;
import ru.acs.fts.schemas.aud.commonaggregatetypescust.BaseDocType;

/** 
 * ������� ����� ��� ���� ��������������� ���������� ���.
 */
public class AUDBaseEnvelopeType extends BaseDocType
{
    private DateTime documentDateTime;
    private boolean testDocumentIndicator;

    /** 
     * Get the 'DocumentDateTime' element value. ���� � ����� �������� ���������������� ��������� (�������, ������). �������� ������ ���� ������������ � ��������� �������� (�������� ���������� ������� ������������ ���������� �������).
     * 
     * @return value
     */
    public DateTime getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. ���� � ����� �������� ���������������� ��������� (�������, ������). �������� ������ ���� ������������ � ��������� �������� (�������� ���������� ������� ������������ ���������� �������).
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(DateTime documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'TestDocumentIndicator' element value. ������� ����, ��� ��������������� �������� �������� ��������.
     * 
     * @return value
     */
    public boolean isTestDocumentIndicator() {
        return testDocumentIndicator;
    }

    /** 
     * Set the 'TestDocumentIndicator' element value. ������� ����, ��� ��������������� �������� �������� ��������.
     * 
     * @param testDocumentIndicator
     */
    public void setTestDocumentIndicator(boolean testDocumentIndicator) {
        this.testDocumentIndicator = testDocumentIndicator;
    }
}
