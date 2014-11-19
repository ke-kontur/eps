
package ru.acs.fts.schemas.album.certificatepreciousmetal;

/** 
 * Лаборатория
 */
public class LaboratoryType
{
    private String nameLaboratory;
    private String registrationNumberAIL;

    /** 
     * Get the 'NameLaboratory' element value. Наименование лаборатории
     * 
     * @return value
     */
    public String getNameLaboratory() {
        return nameLaboratory;
    }

    /** 
     * Set the 'NameLaboratory' element value. Наименование лаборатории
     * 
     * @param nameLaboratory
     */
    public void setNameLaboratory(String nameLaboratory) {
        this.nameLaboratory = nameLaboratory;
    }

    /** 
     * Get the 'RegistrationNumberAIL' element value. Регистрационный номер АИЛ в Госреестре
     * 
     * @return value
     */
    public String getRegistrationNumberAIL() {
        return registrationNumberAIL;
    }

    /** 
     * Set the 'RegistrationNumberAIL' element value. Регистрационный номер АИЛ в Госреестре
     * 
     * @param registrationNumberAIL
     */
    public void setRegistrationNumberAIL(String registrationNumberAIL) {
        this.registrationNumberAIL = registrationNumberAIL;
    }
}
