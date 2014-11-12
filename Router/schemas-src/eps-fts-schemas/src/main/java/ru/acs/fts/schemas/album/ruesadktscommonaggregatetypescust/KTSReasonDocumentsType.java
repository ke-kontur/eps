
package ru.acs.fts.schemas.album.ruesadktscommonaggregatetypescust;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.PresentedDocumentType;

/** 
 * Документы таможенных проверок на основе которых заполняется КТС, пояснения декларанта о технических ошибках ДТ.
 */
public class KTSReasonDocumentsType extends PresentedDocumentType
{
    private String presentedDocumentModeCode;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }
}
