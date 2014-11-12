
package ru.acs.fts.schemas.album.guaranteeunacceptancenotif;

/** 
 * Причина невозможности принятия обеспечения. Элемент Name может принимать следующие значения: DOC_NOT_FOUND - документ не найден в БД АС Обеспечение; DOC_EXPIRED - наступил срок, указанный в документе обеспечения, по истечении которого невозможно использование дополнения; FALSE_INFO - несоответствие сведений из документа обеспечения сведениям в ТД; LACK_OF_FUNDS - недостаточность суммы обеспечения; NO_FREE_FUNDS - отсутствие свободного остатка ден. средств; TECH_PROBLEM - наличие технических проблем
 */
public class ReasonType
{
    private String name;
    private String comment;

    /** 
     * Get the 'Name' element value. Описание
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Описание
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'Comment' element value. Комментарий
     * 
     * @return value
     */
    public String getComment() {
        return comment;
    }

    /** 
     * Set the 'Comment' element value. Комментарий
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
