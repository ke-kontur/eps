
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * Цель досмотра
 */
public class AimInspectionType
{
    private String identifierGood;
    private String chooseControl;
    private String others;
    private String otherComments;

    /** 
     * Get the 'IdentifierGood' element value. Идентификация товаров. Если значение "true" - да; "false" - нет
     * 
     * @return value
     */
    public String getIdentifierGood() {
        return identifierGood;
    }

    /** 
     * Set the 'IdentifierGood' element value. Идентификация товаров. Если значение "true" - да; "false" - нет
     * 
     * @param identifierGood
     */
    public void setIdentifierGood(String identifierGood) {
        this.identifierGood = identifierGood;
    }

    /** 
     * Get the 'ChooseControl' element value. Выборочная проверка.Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getChooseControl() {
        return chooseControl;
    }

    /** 
     * Set the 'ChooseControl' element value. Выборочная проверка.Если значение поля: "true" - да; "false" - нет.
     * 
     * @param chooseControl
     */
    public void setChooseControl(String chooseControl) {
        this.chooseControl = chooseControl;
    }

    /** 
     * Get the 'Others' element value. Прочее.Если значение поля: "true" - да; "false" - нет.
     * 
     * @return value
     */
    public String getOthers() {
        return others;
    }

    /** 
     * Set the 'Others' element value. Прочее.Если значение поля: "true" - да; "false" - нет.
     * 
     * @param others
     */
    public void setOthers(String others) {
        this.others = others;
    }

    /** 
     * Get the 'OtherComments' element value. Прочее(указать)
     * 
     * @return value
     */
    public String getOtherComments() {
        return otherComments;
    }

    /** 
     * Set the 'OtherComments' element value. Прочее(указать)
     * 
     * @param otherComments
     */
    public void setOtherComments(String otherComments) {
        this.otherComments = otherComments;
    }
}
