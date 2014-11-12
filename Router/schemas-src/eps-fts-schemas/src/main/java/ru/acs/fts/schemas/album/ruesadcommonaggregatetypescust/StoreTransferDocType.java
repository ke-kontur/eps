
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * �������� ����������� ��� ����������� ��������
 */
public class StoreTransferDocType
{
    private String transferImportCode;
    private String transferExportCode;

    /** 
     * Get the 'TransferImportCode' element value. ��������, �����������  ��� ��������� ������� ��� ���������� ����� ����������� �������� (����)  ���� ����������� ��������: 41 - ���������������� �������  42 - ��������������� ������� 43 - ����������� �������.
     * 
     * @return value
     */
    public String getTransferImportCode() {
        return transferImportCode;
    }

    /** 
     * Set the 'TransferImportCode' element value. ��������, �����������  ��� ��������� ������� ��� ���������� ����� ����������� �������� (����)  ���� ����������� ��������: 41 - ���������������� �������  42 - ��������������� ������� 43 - ����������� �������.
     * 
     * @param transferImportCode
     */
    public void setTransferImportCode(String transferImportCode) {
        this.transferImportCode = transferImportCode;
    }

    /** 
     * Get the 'TransferExportCode' element value. ��������, ����������� ��� ��������� ������� ��� ���������� ����� ����������� �������� (�����) ���� ����������� ��������:  41 - ���������������� �������  42 - ��������������� ������� 43 - ����������� �������
     * 
     * @return value
     */
    public String getTransferExportCode() {
        return transferExportCode;
    }

    /** 
     * Set the 'TransferExportCode' element value. ��������, ����������� ��� ��������� ������� ��� ���������� ����� ����������� �������� (�����) ���� ����������� ��������:  41 - ���������������� �������  42 - ��������������� ������� 43 - ����������� �������
     * 
     * @param transferExportCode
     */
    public void setTransferExportCode(String transferExportCode) {
        this.transferExportCode = transferExportCode;
    }
}
