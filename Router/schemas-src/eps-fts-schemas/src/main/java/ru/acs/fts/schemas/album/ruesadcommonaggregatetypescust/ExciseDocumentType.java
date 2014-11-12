
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Квитанция на получение акцизных марок / документ в соответствии с которым товары не подлежат маркировке. Гр. 44 п.8.
 */
public class ExciseDocumentType extends PresentedDocumentType
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
