
package ru.acs.fts.schemas.album.gtdobligation;

/** 
 * Таможенная процедура
 */
public class CustomsProcedureType
{
    private String mainCustomsModeCode;
    private String declarationKind;

    /** 
     * Get the 'MainCustomsModeCode' element value. Код заявляемой таможенной процедуры в соответствии с классификатором видов таможенных  процедур.
     * 
     * @return value
     */
    public String getMainCustomsModeCode() {
        return mainCustomsModeCode;
    }

    /** 
     * Set the 'MainCustomsModeCode' element value. Код заявляемой таможенной процедуры в соответствии с классификатором видов таможенных  процедур.
     * 
     * @param mainCustomsModeCode
     */
    public void setMainCustomsModeCode(String mainCustomsModeCode) {
        this.mainCustomsModeCode = mainCustomsModeCode;
    }

    /** 
     * Get the 'DeclarationKind' element value. Код особенности декларирования товаров по Классификатору особенностей таможенного декларирования товаров.
     * 
     * @return value
     */
    public String getDeclarationKind() {
        return declarationKind;
    }

    /** 
     * Set the 'DeclarationKind' element value. Код особенности декларирования товаров по Классификатору особенностей таможенного декларирования товаров.
     * 
     * @param declarationKind
     */
    public void setDeclarationKind(String declarationKind) {
        this.declarationKind = declarationKind;
    }
}
