
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Документы, по которым перевозятся товары (ДТ, книжка МДП, транспортные (перевозочные) документы, коммерческие документы, таможенные документы)
 */
public class AccDocsType extends DocumentBaseType
{
    private String presentedDocumentModeCode;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. Код вида документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. Код вида документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }
}
