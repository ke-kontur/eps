
package ru.acs.fts.schemas.album.filleddtinfo;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Oтвет на уведомление о дублировании ДТ/Обязательства на подачу ДТ
 */
public class FilledDTInfoType extends BaseDocType
{
    private String declarationID;
    private String signDouble;
    private List<String> commentList = new ArrayList<String>();
    private String documentModeID;

    /** 
     * Get the 'DeclarationID' element value. Уникальный идентификатор ДТ/Обязательства на подачу ДТ, по которой(ому) найдено совпадение.
     * 
     * @return value
     */
    public String getDeclarationID() {
        return declarationID;
    }

    /** 
     * Set the 'DeclarationID' element value. Уникальный идентификатор ДТ/Обязательства на подачу ДТ, по которой(ому) найдено совпадение.
     * 
     * @param declarationID
     */
    public void setDeclarationID(String declarationID) {
        this.declarationID = declarationID;
    }

    /** 
     * Get the 'SignDouble' element value. Признак дублирования документа
     * 
     * @return value
     */
    public String getSignDouble() {
        return signDouble;
    }

    /** 
     * Set the 'SignDouble' element value. Признак дублирования документа
     * 
     * @param signDouble
     */
    public void setSignDouble(String signDouble) {
        this.signDouble = signDouble;
    }

    /** 
     * Get the list of 'Comments' element items. Комментарии
     * 
     * @return list
     */
    public List<String> getCommentList() {
        return commentList;
    }

    /** 
     * Set the list of 'Comments' element items. Комментарии
     * 
     * @param list
     */
    public void setCommentList(List<String> list) {
        commentList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
