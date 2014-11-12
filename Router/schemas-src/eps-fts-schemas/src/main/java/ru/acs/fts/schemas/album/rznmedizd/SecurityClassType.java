
package ru.acs.fts.schemas.album.rznmedizd;

/** 
 * Класс безопасности
 */
public class SecurityClassType
{
    private String classId;
    private String name;

    /** 
     * Get the 'ClassId' element value. Внутренний идентификатор класса
     * 
     * @return value
     */
    public String getClassId() {
        return classId;
    }

    /** 
     * Set the 'ClassId' element value. Внутренний идентификатор класса
     * 
     * @param classId
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /** 
     * Get the 'Name' element value. Наименование
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
