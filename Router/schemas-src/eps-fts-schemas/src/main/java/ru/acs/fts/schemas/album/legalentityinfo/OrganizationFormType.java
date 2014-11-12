
package ru.acs.fts.schemas.album.legalentityinfo;

/** 
 * Сведения об организационно-правовой форме
 */
public class OrganizationFormType
{
    private String classifierName;
    private String classifierCode;
    private String formName;

    /** 
     * Get the 'ClassifierName' element value. Наименование классификатора по которому введены сведения об организационно-правовой форме: ОКОПФ, КОПФ
     * 
     * @return value
     */
    public String getClassifierName() {
        return classifierName;
    }

    /** 
     * Set the 'ClassifierName' element value. Наименование классификатора по которому введены сведения об организационно-правовой форме: ОКОПФ, КОПФ
     * 
     * @param classifierName
     */
    public void setClassifierName(String classifierName) {
        this.classifierName = classifierName;
    }

    /** 
     * Get the 'ClassifierCode' element value. Код по выбранному классификатору
     * 
     * @return value
     */
    public String getClassifierCode() {
        return classifierCode;
    }

    /** 
     * Set the 'ClassifierCode' element value. Код по выбранному классификатору
     * 
     * @param classifierCode
     */
    public void setClassifierCode(String classifierCode) {
        this.classifierCode = classifierCode;
    }

    /** 
     * Get the 'FormName' element value. Полное наименование организационно-правовой формы
     * 
     * @return value
     */
    public String getFormName() {
        return formName;
    }

    /** 
     * Set the 'FormName' element value. Полное наименование организационно-правовой формы
     * 
     * @param formName
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }
}
