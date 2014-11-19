
package ru.acs.fts.schemas.album.goodsarrivereq;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * “ранспортные и перевозочные документы
 */
public class PresentDocumentType extends DocumentBaseType
{
    private String presentedDocumentModeCode;

    /** 
     * Get the 'PresentedDocumentModeCode' element value.  од вида представл€емого документа. «аполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value.  од вида представл€емого документа. «аполн€етс€ в соответствии с классификатором видов документов, используемых при за€влении сведений в графе 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }
}
