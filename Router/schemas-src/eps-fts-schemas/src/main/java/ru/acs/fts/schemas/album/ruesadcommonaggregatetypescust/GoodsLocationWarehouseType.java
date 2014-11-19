
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * �� � ��. �������� � ��������������� �������. �������� � ���������� ������.
 */
public class GoodsLocationWarehouseType
{
    private String documentModeCode;
    private String certificateNumber;

    /** 
     * Get the 'DocumentModeCode' element value. ��� ���������. 1- �������� 2 - �������������.
     * 
     * @return value
     */
    public String getDocumentModeCode() {
        return documentModeCode;
    }

    /** 
     * Set the 'DocumentModeCode' element value. ��� ���������. 1- �������� 2 - �������������.
     * 
     * @param documentModeCode
     */
    public void setDocumentModeCode(String documentModeCode) {
        this.documentModeCode = documentModeCode;
    }

    /** 
     * Get the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ / ����� �������� 
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ / ����� �������� 
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }
}
