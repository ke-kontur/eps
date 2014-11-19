
package ru.acs.fts.schemas.album.declarationconformity;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� ���������
 */
public class DocumentType extends DocumentBaseType
{
    private String modeCode;

    /** 
     * Get the 'ModeCode' element value. ��� ���������
     * 
     * @return value
     */
    public String getModeCode() {
        return modeCode;
    }

    /** 
     * Set the 'ModeCode' element value. ��� ���������
     * 
     * @param modeCode
     */
    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }
}
