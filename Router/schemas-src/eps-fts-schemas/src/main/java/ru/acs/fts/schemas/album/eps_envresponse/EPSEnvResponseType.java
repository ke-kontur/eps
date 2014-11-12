
package ru.acs.fts.schemas.album.eps_envresponse;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ������ ��������� �� �������.
 */
public class EPSEnvResponseType extends BaseDocType
{
    private EnvelopeDataType envData;
    private String documentModeID;

    /** 
     * Get the 'EnvData' element value. ����������� ���������
     * 
     * @return value
     */
    public EnvelopeDataType getEnvData() {
        return envData;
    }

    /** 
     * Set the 'EnvData' element value. ����������� ���������
     * 
     * @param envData
     */
    public void setEnvData(EnvelopeDataType envData) {
        this.envData = envData;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
