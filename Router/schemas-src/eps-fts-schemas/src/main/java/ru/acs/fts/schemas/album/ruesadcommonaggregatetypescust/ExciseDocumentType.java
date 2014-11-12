
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 *  витанци€ на получение акцизных марок / документ в соответствии с которым товары не подлежат маркировке. √р. 44 п.8.
 */
public class ExciseDocumentType extends PresentedDocumentType
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
