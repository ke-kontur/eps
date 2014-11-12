
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� �������� ����������� ���������
 */
public class WhCustomDocumentType extends ArriveCustomsDocType
{
    private String vttCustomsCode;

    /** 
     * Get the 'VttCustomsCode' element value. ��� ������� ����������� (��� ��������) / ���������� (��� ������)
     * 
     * @return value
     */
    public String getVttCustomsCode() {
        return vttCustomsCode;
    }

    /** 
     * Set the 'VttCustomsCode' element value. ��� ������� ����������� (��� ��������) / ���������� (��� ������)
     * 
     * @param vttCustomsCode
     */
    public void setVttCustomsCode(String vttCustomsCode) {
        this.vttCustomsCode = vttCustomsCode;
    }
}
