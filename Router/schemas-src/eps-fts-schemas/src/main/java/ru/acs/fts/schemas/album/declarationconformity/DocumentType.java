
package ru.acs.fts.schemas.album.declarationconformity;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Описание документа
 */
public class DocumentType extends DocumentBaseType
{
    private String modeCode;

    /** 
     * Get the 'ModeCode' element value. Вид документа
     * 
     * @return value
     */
    public String getModeCode() {
        return modeCode;
    }

    /** 
     * Set the 'ModeCode' element value. Вид документа
     * 
     * @param modeCode
     */
    public void setModeCode(String modeCode) {
        this.modeCode = modeCode;
    }
}
